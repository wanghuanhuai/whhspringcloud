package com.lanson.feign;

import com.lanson.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-message",fallback=FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/user/post")
    public String getPort();
    @GetMapping("/user")
    public String getUser();
}
