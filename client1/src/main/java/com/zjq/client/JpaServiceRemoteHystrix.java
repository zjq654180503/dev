package com.zjq.client;

import org.springframework.stereotype.Component;

@Component
public class JpaServiceRemoteHystrix implements JpaServiceRemote{
    @Override
    public String findAllUser() {
        return "Jpa Service Send failed1";
    }
}
