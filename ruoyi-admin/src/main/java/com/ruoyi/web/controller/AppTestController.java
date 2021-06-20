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
        return "/app_h5/index";
    }


}
