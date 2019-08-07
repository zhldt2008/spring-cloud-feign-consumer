package com.example.springcloudfeignconsumer.service;


import com.example.springcloudfeignconsumer.service.fallback.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FeignClient注解定义了该接口是一个Feign客户端,
 * name指定了注册到Eureka上的服务名，fallback是服务降级后的接口实现类
 */
@FeignClient(name="spring-eureka-client-service",fallback=UserServiceFallBack.class)
public interface UserService {

    @RequestMapping(value="/user/get-name",method=RequestMethod.GET)
    String getName(@RequestParam("name") String name);

}
