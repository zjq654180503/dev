package com.zjq.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "jpa",fallback = JpaServiceRemoteHystrix.class)
public interface JpaServiceRemote {
    @RequestMapping(value = "/user/findAllUser", method = RequestMethod.POST)
    public String findAllUser();
}
