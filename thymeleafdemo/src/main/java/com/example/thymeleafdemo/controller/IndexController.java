package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hx1999
 * @Date 2020/7/1
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/","/index"})
    public String index(Model model){
        List<User> users=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("张三"+i);
            user.setAddress("北京"+i);
            users.add(user);
        }
        model.addAttribute("users",users);
        return "index";
    }

}
