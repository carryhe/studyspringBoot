package cn.hexg.controller;

import cn.hexg.Service.UserService;
import cn.hexg.po.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("find/{id}")
    public User findByUserId(@PathVariable Integer id){
        return userService.queryUserById(id);
    }
}
