package com.bin.deng.springdemo.controller;

import com.bin.deng.springdemo.dao.HelloMapper;
import com.bin.deng.springdemo.model.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author bin
 */

@Controller
public class HelloController {

    @Resource
    private HelloMapper helloMapper;

    @RequestMapping("/hello")
    public  String hello(Model model) {
        Hello hello123 = helloMapper.findOne((long)1);
        String name = hello123.getName();
        model.addAttribute("name",name);

        //跳转到 templates下的hello.html
        return  "hello";
}

}
