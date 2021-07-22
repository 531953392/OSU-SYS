package com.ruoyi.web.controller.osuApplet;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.hutool.core.comparator.CompareUtil;
import com.google.common.collect.Lists;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.osu.AppEnrollList;
import com.ruoyi.system.domain.osu.AppEnrollUser;
import com.ruoyi.system.service.osu.IAppEnrollListService;
import com.ruoyi.system.service.osu.IAppEnrollUserService;
import com.ruoyi.web.controller.demo.domain.EnrolUserVo;
import com.ruoyi.web.controller.excle.SheetMerge;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 【报名题目】Controller
 * 
 * @author dxs
 * @date 2021-05-31
 */
@Controller
@RequestMapping("/system/enrollUser")
public class AppEnrollUserController extends BaseController
{
    private String prefix = "system/osu/enrollUser";

    @Autowired
    private IAppEnrollUserService iAppEnrollService;

    @Autowired
    private IAppEnrollListService iAppEnrollService1;


    @GetMapping()
    public String info(ModelMap map)
    {
        List<AppEnrollList> appEnrollLists =  iAppEnrollService1.selectAppEnrollList(new AppEnrollList());
        map.put("appEnroll",appEnrollLists.get(0));
        map.put("appEnrollList", appEnrollLists);
        return prefix + "/enrollUser";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppEnrollUser appEnroll)
    {
        startPage();
        List<AppEnrollUser> list = iAppEnrollService.selectAppEnrollList(appEnroll);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @RequestMapping("/export")
    //@ResponseBody
    public AjaxResult export(HttpServletResponse response, AppEnrollUser appEnroll, String enroll_id)
    {
        List<AppEnrollUser> list = iAppEnrollService.selectAppEnrollList(appEnroll);
        response.setContentType("application/binary;charset=UTF-8");
        //Map<String, List<AppEnrollUser>> map = list.stream().sorted(Comparator.comparing( (b)->b.getId() )).collect(Collectors.groupingBy((a) -> a.getUser_id()));
        List<EnrolUserVo> lists = new ArrayList<>();
        for (AppEnrollUser entryMap : list) {
            EnrolUserVo enrolUserVo = new EnrolUserVo(entryMap.getUser_id(),entryMap.getUser_name(),entryMap.getEnroll_title(),entryMap.getEnroll_value());
            lists.add(enrolUserVo);
        }
        SheetMerge<EnrolUserVo> sheetMerge = new SheetMerge(lists);
        sheetMerge.range("报名用户数据", EnrolUserVo::getValue1, (a, b) -> CompareUtil.compare(a, b), new int[]{0}, 1);
        sheetMerge.range("报名用户数据", EnrolUserVo::getValue2, (a, b) -> CompareUtil.compare(a, b), new int[]{1}, 1);
        ExportParams exportParams = new ExportParams();
        exportParams.setSheetName("报名用户数据");
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, EnrolUserVo.class, lists);
        sheetMerge.merge(workbook);
        try{
            ServletOutputStream out=response.getOutputStream();
            try {
                String fileName = "报名用户数据";
                response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName+".xls", "UTF-8"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            workbook.write(out);
            out.flush();
            out.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return AjaxResult.success();
    }



}
