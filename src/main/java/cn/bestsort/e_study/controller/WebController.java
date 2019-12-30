package cn.bestsort.e_study.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author zhaoqiang
 * @Date 2019/12/30 9:57
 */
@Controller
@RequestMapping("/web")
@Api(tags = "系统启动接口")
public class WebController  {
    @RequestMapping("/index")
    public String jumpIndex() {
//        ModelAndView mav=new ModelAndView("index");
        return "index";
    }

}