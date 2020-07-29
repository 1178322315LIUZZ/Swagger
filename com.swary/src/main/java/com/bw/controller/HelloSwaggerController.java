package com.bw.controller;

import com.bw.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSwaggerController {

    @RequestMapping("sayHello")
    @ApiImplicitParams({@ApiImplicitParam(name = "name",value = "用户姓名",required = true)})
    @ApiOperation(value = "返回用户姓名")
    public String sayHello(String name){
        User user=new User();
        user.setName("张san1");
        return "用户姓名"+user.getName();
    }
    @RequestMapping("login")
    @ApiImplicitParams({@ApiImplicitParam(name = "name",value = "用户姓名",required = true),
            @ApiImplicitParam(name = "password",value = "用户密码",required = true)})
    @ApiOperation(value = "返回用户姓名和用户密码")
    public String login(String name,String password){
        User user=new User();
        user.setName("张san1");
        user.setPassword("123456");
        return "用户姓名"+user.getName()+"用户密码"+user.getPassword();
    }



}
