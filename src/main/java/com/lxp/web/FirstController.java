package com.lxp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName FirstController
 * @Description 第一个测试Controller
 * @Author liangxp
 * @Date 2020/4/16 10:27
 **/
@Controller
public class FirstController {

    @GetMapping("/first")
    @ResponseBody
    public String first() {

        return "hello grandle springboot";
    }
}
