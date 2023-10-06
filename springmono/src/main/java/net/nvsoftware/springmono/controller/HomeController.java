package net.nvsoftware.springmono.controller;

import net.nvsoftware.springmono.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "NVsoftware Home";
    }

    @RequestMapping("/user")
    public User user() {
        User user = new User();
        user.setId("3423");
        user.setName("nvso");
        user.setEmail("sfnlsklfd");
        return user;
    }
}
