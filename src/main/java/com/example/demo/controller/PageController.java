package com.example.demo.controller;

import com.example.demo.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 보통 사용하지 않음

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    // ResponseEntity


    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User(); // Type 추론 (Jva 11버전 이상)
        user.setName("gukim");
        user.setAddress("seoul");
        return user;
    }

}
