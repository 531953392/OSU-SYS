package com.ruoyi.web.controller;

import com.ruoyi.common.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/app")
public class AppTestController extends BaseController
{


    @GetMapping()
    public String brand()
    {
        return "/h5_html/index";
    }

    @GetMapping("/verifyOrderNo")
    public String verifyOrder()
    {
        return "/h5_html/list.html";
    }

}
