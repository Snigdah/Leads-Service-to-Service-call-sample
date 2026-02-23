package com.example.order;


import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final UserClient userClient;

    public OrderService(UserClient userClient) {
        this.userClient = userClient;
    }

    public String getOrderWithUser(String userId) {
        String user = userClient.getUserById(userId);
        return "Order created for -> " + user;
    }
}
