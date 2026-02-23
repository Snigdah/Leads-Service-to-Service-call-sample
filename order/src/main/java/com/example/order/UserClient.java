package com.example.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "userservice")
public interface UserClient {

    @GetMapping("/api/users/{id}")
    String getUserById(@PathVariable("id") String id);
}
