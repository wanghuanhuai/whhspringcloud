package com.lanson.cilent1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger= LoggerFactory.getLogger(getClass());

    @Value("${server.port}")
    private String port;

    @GetMapping("")
    public String getUser(){
        return "获取用户信息成功";
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id")Long id){
        logger.info("删除成功:"+id);
    }

    @PutMapping("/{id}")
    public String modifyUser(@PathVariable("id")long id,String modify){
        logger.info("修改id"+id+":"+modify);
        return  "修改成功";
    }

    @PostMapping("")
    public String saveUser(@RequestBody String user){
        logger.info("保存信息："+user);
        return "保存信息成功";
    }

    @GetMapping("/post")
    public String getPort(){
        return  "当前端口号:"+port;
    }

}
