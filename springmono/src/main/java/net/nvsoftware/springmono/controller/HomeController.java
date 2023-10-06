package net.nvsoftware.springmono.controller;

import net.nvsoftware.springmono.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "NVsoftware Home";
    }

    @RequestMapping(value = "/user", method= RequestMethod.GET)
    public User user() {
        User user = new User();
        user.setId("3423");
        user.setName("nvso");
        user.setEmail("sfnlsklfd");
        return user;
    }

    @GetMapping("/user/{id}/{username}")
    public User userByPathVariable(@PathVariable String id, @PathVariable("username") String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail("sfnlsklfd");
        return user;
    }
}
