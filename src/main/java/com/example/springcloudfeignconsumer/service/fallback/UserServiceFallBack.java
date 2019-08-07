package com.example.springcloudfeignconsumer.service.fallback;

import com.example.springcloudfeignconsumer.service.UserService;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class UserServiceFallBack implements UserService {

    @Override
    public String getName(String name) {
        return "test";
    }
}
