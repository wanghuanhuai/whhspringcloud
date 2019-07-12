package com.lanson.hystrik.feign.impl;

import com.lanson.hystrik.feign.FeignProviderClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String getPort() {
        return "服务器正在维护";
    }

    @Override
    public String getUser() {
        return "服务器正在维护";
    }
}
