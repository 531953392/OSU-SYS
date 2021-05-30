package com.ruoyi.web.controller.common;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.uuid.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

@Controller
public class OssCommonController {
    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/ossFile/upload")
    @ResponseBody
    public AjaxResult upload(MultipartFile file) {
        String filename = file.getResource().getFilename();
        //这里文件名用了uuid 防止重复，可以根据自己的需要来写
        String name = UUID.randomUUID() + filename.substring(filename.lastIndexOf("."), filename.length());
        name = name.replace("-", "");
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("上传失败");
        }
        AliOssCloudUtil util = new AliOssCloudUtil();
        //上传成功返回完整路径的url
        String url = util.uploadFile2OSS(inputStream, name);
        AjaxResult ajax = AjaxResult.success();
        ajax.put("fileName", name);
        ajax.put("url", url);
        return ajax;
    }

    /**
     * 判断文件是否存在
     * @param fileName  储存的文件名
     * @return
     */
    @GetMapping("/ossFile/exists")
    public Boolean exists(String fileName) {
        AliOssCloudUtil util = new AliOssCloudUtil();
        Boolean bool = util.doesObjectExist(fileName);
        return bool;
    }


    /**
     * 下载oss对应文件
     * @param fileName 储存的文件名
     * @return
     */
    @PostMapping("/ossFile/downLoad")
    public void downloadFile(String fileName, HttpServletResponse response) {
        try {
            AliOssCloudUtil ossClientUtil = new AliOssCloudUtil();
            InputStream is = ossClientUtil.getInputStreamByFileUrl(ossClientUtil.getFiledir() + fileName);
            // 配置文件下载
            response.setHeader("content-type", "application/octet-stream");
            response.setContentType("application/octet-stream");
            // 下载文件能正常显示中文
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            OutputStream os = response.getOutputStream();
            byte[] b = new byte[1024];
            int len = -1;
            while ((len = is.read(b)) != -1) {
                os.write(b, 0, len);
            }
            is.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

