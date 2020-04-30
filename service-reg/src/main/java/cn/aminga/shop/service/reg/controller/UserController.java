package cn.aminga.shop.service.reg.controller;

import cn.aminga.shop.commons.domain.User;
import cn.aminga.shop.service.reg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@RestController
    public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public String get(@PathVariable int id) throws Exception {
        return userService.getById(id).getName();
    }



    @PostMapping("/user/register")
    public Object register(@RequestBody User user) {
        String name =  user.getName();
        String password = user.getPassword();
        name = HtmlUtils.htmlEscape(name);
        user.setName(name);
        user.setPassword(user.getPassword());
        userService.add(user);

        return "添加成功";
    }


}
