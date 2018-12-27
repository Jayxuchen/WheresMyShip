package com.wheresmyship.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUser(id);

    }

    @RequestMapping(method= RequestMethod.POST,value = "/user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
