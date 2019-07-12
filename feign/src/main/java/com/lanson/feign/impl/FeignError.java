package com.lanson.feign.impl;

import com.lanson.feign.FeignProviderClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

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
