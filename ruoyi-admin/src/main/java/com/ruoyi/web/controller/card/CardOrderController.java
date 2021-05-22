package com.ruoyi.web.controller.card;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.card.CardBrand;
import com.ruoyi.system.domain.card.CardOrder;
import com.ruoyi.system.domain.card.CardOrderGoodsItem;
import com.ruoyi.system.service.card.ICardBrandService;
import com.ruoyi.system.service.card.ICardOrderGoodsItemService;
import com.ruoyi.system.service.card.ICardOrderService;
import com.ruoyi.web.controller.send.email.SendEmailUtils;
import com.ruoyi.web.controller.send.message.SendMessageUlit;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【订单】Controller
 * 
 * @author dxs
 * @date 2020-12-27
 */
@Controller
@RequestMapping("/system/card/order")
public class CardOrderController extends BaseController
{

    private static final Logger log = LoggerFactory.getLogger(CardOrderController.class);


    private String prefix = "system/card/order";

    @Autowired
    private ICardOrderService cardOrderService;

    @Autowired
    private ICardBrandService cardBrandService;

    @Autowired
    private ICardOrderGoodsItemService iCardOrderGoodsItemService;

    @RequiresPermissions("system:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CardOrder cardOrder)
    {
        startPage();
        List<CardOrder> list = cardOrderService.selectCardOrderList(cardOrder);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:order:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CardOrder cardOrder)
    {
        List<CardOrder> list = cardOrderService.selectCardOrderList(cardOrder);
        ExcelUtil<CardOrder> util = new ExcelUtil<CardOrder>(CardOrder.class);
        return util.exportExcel(list, "order");
    }


    /**
     * 详情【订单】
     */
    @GetMapping("/details/{orderId}")
    public String details(@PathVariable("orderId") String orderId, ModelMap mmap)
    {
        CardOrder cardOrder = cardOrderService.selectCardOrderById(orderId);
        List<CardOrderGoodsItem> cardOrderGoodsItemList = iCardOrderGoodsItemService.selectByOrderId(orderId);
        mmap.put("cardOrder", cardOrder);
        mmap.put("cardOrderItemList", cardOrderGoodsItemList);
        return prefix + "/details";
    }

    /**
     * 上传卡密【订单】
     */
    @GetMapping("/cipher/{id}")
    public String cipher(@PathVariable("id") String id, ModelMap mmap)
    {
        CardOrderGoodsItem cardOrderGoodsItem = iCardOrderGoodsItemService.selectCardOrderGoodsItemById(id);
        CardOrder cardOrder = cardOrderService.selectCardOrderById(cardOrderGoodsItem.getOrderId());
        mmap.put("cardOrder", cardOrder);
        mmap.put("cardOrderGoodsItem", cardOrderGoodsItem);
        return prefix + "/cipher";
    }

    /**
     * 上传卡密提交
     */
    @RequiresPermissions("system:order:cipher")
    @Log(title = "【上传卡密提交】", businessType = BusinessType.UPDATE)
    @PostMapping("/cipher")
    @ResponseBody
    public AjaxResult cipher(CardOrderGoodsItem cardOrderGoodsItem)
    {

        return toAjax(iCardOrderGoodsItemService.updateCardOrderGoodsItem(cardOrderGoodsItem));
    }

    /**
     * 校验卡密
     */
    @PostMapping("/checkCardCipherUnique")
    @ResponseBody
    public String checkCardCipherUnique(CardOrderGoodsItem cardOrderGoodsItem)
    {
        //品牌+面值+卡密是不能有重复的，在发货的时候判断
        List<CardOrderGoodsItem> cardOrderGoodsItemList1 =  iCardOrderGoodsItemService.selectCardOrderGoodsItemList(cardOrderGoodsItem);
        if(cardOrderGoodsItemList1.size()>0){
            return "1";
        }
        return "0";
    }

    /**
     * 批量订单自动发货
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "【订单发货】", businessType = BusinessType.UPDATE)
    @PostMapping("/autoDelivery")
    @ResponseBody
    public AjaxResult autoDelivery(CardOrder cardOrder)
    {
        List<CardOrderGoodsItem> cardOrderGoodsItem1 = iCardOrderGoodsItemService.selectByOrderId(cardOrder.getOrderId());
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        int cardCipherByNull = cardOrderGoodsItem1.stream().filter(x->x.getCardCipher()==null).collect(Collectors.toList()).size();
        int barCodeByNull = cardOrderGoodsItem1.stream().filter(x->x.getBarCode()==null).collect(Collectors.toList()).size();
        if(cardCipherByNull>0||barCodeByNull>0){
            return error("发货失败！");
        }
        for (CardOrderGoodsItem item:cardOrderGoodsItem1) {
            item.setDeliveryTime(new Date());
            item.setStatus(Long.parseLong("20"));
            iCardOrderGoodsItemService.updateCardOrderGoodsItem(item);
            list.add(item.getCardCipher());
            list2.add("http://139.196.44.166:9898/"+item.getBarCode());
        };
        cardOrder.setStatus(Long.parseLong("20"));
        cardOrderService.updateCardOrder(cardOrder);
        //发送短信或邮箱
        CardOrder cardOrder1 = cardOrderService.selectCardOrderById(cardOrder.getOrderId());
        String str = StringUtils.join(list.toArray(), "，");
        //String str2 = StringUtils.join(list2.toArray(), ",\n");
        sendMessage(str,list2,cardOrder1);
        return success();
    }

    /**
     * 批量订单手动发货
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "【订单发货】", businessType = BusinessType.UPDATE)
    @PostMapping("/manualDelivery")
    @ResponseBody
    public AjaxResult manualDelivery(CardOrder cardOrder)
    {
        List<CardOrderGoodsItem> cardOrderGoodsItem1 = iCardOrderGoodsItemService.selectByOrderId(cardOrder.getOrderId());
        for (CardOrderGoodsItem item:cardOrderGoodsItem1) {
            item.setDeliveryTime(new Date());
            item.setStatus(Long.parseLong("20"));
            iCardOrderGoodsItemService.updateCardOrderGoodsItem(item);
        };
        cardOrder.setStatus(Long.parseLong("20"));
        cardOrderService.updateCardOrder(cardOrder);
        return success();
    }


    /**
     * 订单发货
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "【订单发货】", businessType = BusinessType.UPDATE)
    @PostMapping("/delivery")
    @ResponseBody
    public AjaxResult delivery(CardOrderGoodsItem cardOrderGoodsItem)
    {
        //品牌+面值+卡密是不能有重复的，在发货的时候判断
        CardOrder cardOrder = cardOrderService.selectCardOrderById(cardOrderGoodsItem.getOrderId());
        CardBrand cardBrand = cardBrandService.selectCardBrandById(cardOrder.getBrandId());
        CardOrderGoodsItem cardOrderGoodsItem1 = iCardOrderGoodsItemService.selectCardOrderGoodsItemById(cardOrderGoodsItem.getId());
        List<CardOrderGoodsItem> cardOrderGoodsItemList1 =  iCardOrderGoodsItemService.selectCardOrderGoodsItemList(cardOrderGoodsItem1);
        if(cardOrderGoodsItemList1.size()>1){
            return error("卡密已存在，请勿重复操作！");
        }

        cardOrderGoodsItem.setDeliveryTime(new Date());
        int rows  = iCardOrderGoodsItemService.updateCardOrderGoodsItem(cardOrderGoodsItem);
        if(cardOrder.isPay()){
            List<CardOrderGoodsItem>  cardOrderGoodsItemList  = iCardOrderGoodsItemService.selectByOrderId(cardOrder.getOrderId());
            //查询是否存在未发货
            int notDelivery =  cardOrderGoodsItemList.stream().filter(x->x.getStatus()==10).collect(Collectors.toList()).size();
            if(notDelivery==0){
                cardOrder.setStatus(Long.parseLong("20"));
                cardOrderService.updateCardOrder(cardOrder);
            }
        };
        //发送短信或邮箱
        //sendMessage(cardBrand,cardOrderGoodsItem1,cardOrder);
        return toAjax(rows);
    }



    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:order:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cardOrderService.deleteCardOrderByIds(ids));
    }

    private void sendMessage(String cardCiphers,List<String> barCodes, CardOrder cardOrder) {
        //配送方式(10:邮箱/20:手机号)
        if(cardOrder.getDeliveryType()==20){
            log.info("开始发送短信");
            SendMessageUlit.send(
                    "【速买通礼品卡】您下单的"+cardOrder.getDiscountName()+"的秘钥为："+cardCiphers+"，请妥善保管，防止泄露和丢失。您还可以在益钱网折扣卡订单中查看。"
                    ,cardOrder.getDeliveryInfo()
            );
        }else if (cardOrder.getDeliveryType()==10){

            log.info("开始发送邮箱");
            String imageUrl = "http://139.196.44.166:9898/";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String html = "\n" +
                    "<table width=\"750\" align=\"center\" border=\"0\" cellspacing=\"2\" cellpadding=\"0\"\n" +
                    "       style=\"line-height:24px; font-family:宋体; font-size:14px;\">\n" +
                    "\n" +
                    "\n" +
                    "    <tr>\n" +
                    "        <td></td>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <td style=\"padding:6px 36px 6px 36px;\">\n" +
                    "            订单号："+cardOrder.getOrderId()+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 购买时间："+simpleDateFormat.format(cardOrder.getPayTime())+"\n" +
                    "        </td>\n" +
                    "    </tr>\n" +
                    "    <tr>\n" +
                    "        <td>\n" +
                    "            <div style=\"display: flex ;flex-direction: column;margin-left: 37px;\">\n" +
                    "                <div style=\"display:flex; flex-direction: column;\">\n" +
                    "                    <h2>请自行查看电子卡：</h2>\n";
                    for (String str: barCodes) {
                        html += "                    <span>"+str+"</span>\n";
                    }
                    html += "                </div>\n" +
                    "            </div>\n" +
                    "        </td>\n" +
                    "    </tr>\n" +
                            "    <tr>\n" +
                            "        <td  style=\"padding:6px 36px 6px 36px;\">\n" +
                            "            <strong>注意事项</strong></td>\n" +
                            "    </tr>\n" +
                            "    <tr style=\"margin-top: 20px;\">\n" +
                            "        <td style=\"padding:6px 36px 6px 36px;\">（1）折扣卡均为电子卡，无实物，下单后系统自动发货；\n" +
                            "            <br>（2）电子折扣卡收货成功后，无法退款；\n" +
                            "            <br>（3）万一丢失或被盗，电子卡将不予退款或不予任何赔偿，请妥善保管；\n" +
                            "            <br>（4）无法将其换成其面值现金，该卡不支持退款；\n" +
                            "            <br>（5）折扣卡不得二次销售，一经发现将违规处理。\n" +
                            "        </td>\n" +
                            "    </tr>\n" +
                            "\n" +
                            "    <tr >\n" +
                            "        <td>\n" +
                            " <div style=\"display: flex;flex-direction: row;margin-top: 50px; justify-content:space-around;\">\n" +
                            "               <img src=\"https://static.cnyto.me/ueditor/7f/f0/3ecb88409d2423a1744045ba4cb5091.png\">\n" +
                            "            </div>"+
                            "        </td>\n" +
                            "    </tr>\n" +
                            "\n" +
                            "    </tbody>\n" +
                            "</table>";
            SendEmailUtils.SendHtml(cardOrder.getDeliveryInfo(),html,"【速买通礼品卡】礼品卡密钥");

        }
    }
}
