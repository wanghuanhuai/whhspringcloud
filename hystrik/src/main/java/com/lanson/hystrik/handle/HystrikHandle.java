package com.lanson.hystrik.handle;



import com.lanson.hystrik.feign.FeignProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HystrikHandle {
    Logger logger= LoggerFactory.getLogger(getClass());
    @Autowired
    private FeignProviderClient feignProviderClient;


    @GetMapping("/post")
    public String getPort()
    {
        String  port= feignProviderClient.getPort();
        return  "当前端口号:"+port;
    }


    @GetMapping("")
    public String getUser(){
       String user= feignProviderClient.getUser();
        return user;
    }
}
