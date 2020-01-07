package com.porridgez.springboot_day1.controller;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/success")
    public String Success(Map<String,Object> map){
        map.put("name", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
    @RequestMapping(value = "/")
    public String Index(HttpSession session){
        if(session.getAttribute("username")!=null){
            return "redirect:/dashboard";
        }else {
            return "login";
        }
    }

}
