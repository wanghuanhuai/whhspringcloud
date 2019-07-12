package com.lanson.rest.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserHandle {

    Logger logger= LoggerFactory.getLogger(getClass());
@Autowired
    RestTemplate restTemplate;
    @GetMapping("")
    public String getUser(){
      String users=  restTemplate.getForEntity("http://PROVIDER-MESSAGE/user",String.class).getBody();
     return  users;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id")Long id){
        restTemplate.delete("http://PROVIDER-MESSAGE/user/"+id);
        logger.info("删除成功:"+id);
    }

    @PutMapping("/{id}")
    public String modifyUser(@PathVariable("id")long id,String modify){
        restTemplate.put("http://PROVIDER-MESSAGE/user/"+id,modify);
        logger.info("修改id"+id+":"+modify);
        return  "修改成功";
    }

    @PostMapping("")
    public String saveUser(@RequestBody String user){
        Map<String,String > map=new HashMap<>();
        map.put("user",user);
       String result= restTemplate.postForObject("http://localhost:9400/user",user,String.class);
        logger.info("保存信息："+user);
        logger.info(result);
        return "保存信息成功";
    }


}
