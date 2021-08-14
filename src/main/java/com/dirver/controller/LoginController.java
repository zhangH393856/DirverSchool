package com.dirver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: logincontroller
 * @Description: TODO
 * @Author: lenovo
 * @Date: 9:20 2021/8/12
 * @Version 1.0
 **/
@Controller
public class LoginController {
    @RequestMapping("openindex")
    public String openindex() {
        return "index";
    }

    @RequestMapping("login")
    public String login() {

        return "index";
    }

}
