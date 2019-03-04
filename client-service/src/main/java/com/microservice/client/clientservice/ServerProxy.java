package com.microservice.client.clientservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "SERVER-SERVICE", url = "localhost:8101")
//@FeignClient(name = "SERVER-SERVICE") //used to mapping to server-service
@FeignClient(name = "zuul-server")
@RibbonClient(name = "server-service")
public interface ServerProxy {
    @GetMapping("/server-service/hi/{id}")
    MessageBody getHiFromServer(@PathVariable("id") String id);
}
