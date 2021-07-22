package com.ruoyi.web.controller.demo.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;

public class EnrolUserVo {

    @Excel(name = "用户id", width = 12, orderNum = "1")
    private String value1;

    @Excel(name = "用户手机号", width = 12, orderNum = "1")
    private String value2;

    @Excel(name = "报名问题", width = 12, orderNum = "2")
    private String value3;

    @Excel(name = "问题回答", width = 12, orderNum = "3")
    private String value4;

//    @Excel(name = "问题回答", width = 12, orderNum = "4")
//    private String value5;

    public EnrolUserVo(String value1, String value2, String value3, String value4) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }



    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }
}
