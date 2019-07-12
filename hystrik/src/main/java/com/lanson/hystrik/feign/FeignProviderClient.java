package com.lanson.hystrik.feign;


import com.lanson.hystrik.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER-MESSAGE",fallback = FeignError.class  )
public interface FeignProviderClient {
    @GetMapping("/user/post")
     String getPort();
    @GetMapping("/user")
     String getUser();
}
