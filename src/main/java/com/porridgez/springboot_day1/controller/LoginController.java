package com.porridgez.springboot_day1.controller;

import com.porridgez.springboot_day1.SqlMapper.AccountMapper;
import com.porridgez.springboot_day1.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.PrimitiveIterator;

@Controller
public class LoginController {
    @Autowired
    AccountMapper accountMapper;

    @PostMapping(value = "/login")
    public String Login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session) {
        Account account=accountMapper.getAccount(username,password);
        if(account!=null){
            session.setAttribute("username",username);
            return "redirect:/dashboard";
        }else {
            return "login";
        }
    }

    @RequestMapping("/dashboard")
    public String Dashboard(HttpSession session){
//        if((boolean)session.getAttribute("islogin")){
//            return "dashboard";
//        }
//        return "redirect:/";
        return "dashboard";
    }
}
