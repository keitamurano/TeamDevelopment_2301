package com.example.demo.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

public class Newuser {

    @RequestMapping("user")
    public String user(ModelMap modelMap, HttpServletRequest httpServletRequest) {
        String username = httpServletRequest.getRemoteUser();
        User user = userRepository.getOne(username);
        modelMap.addAttribute("user", user);
        return "user";
    }

}

//1行目: 引数にHttpServletRequestを指定することによってそのオブジェクトが取得できる。
//2行目: getRemoteUserメソッドでユーザ名を取得する。
//3行目: getOneメソッドは、JpaRepositoryに最初から用意されているメソッドで、IDからインスタンスを取得することができる。
//4行目: addAttributeメソッドで、userをビューに送る。String以外のオブジェクトでもビューに送ることができる。