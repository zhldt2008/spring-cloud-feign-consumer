package com.example.springcloudfeignconsumer.controller;

import com.example.springcloudfeignconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userClient")
public class UserClientController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/getUserName", method=RequestMethod.GET)
    public String getUserName(){
      String name =   userService.getName("富贵鸟。");
      System.out.println(name);
      return  name;
    }
}
