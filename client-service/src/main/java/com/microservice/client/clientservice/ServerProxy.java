package com.microservice.client.clientservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "SERVER-SERVICE", url = "localhost:8101")
//@FeignClient(name = "server-service") //used to mapping to server-service
@FeignClient(name = "zuul-server")
//@RibbonClient(name = "server-service") // when use feign, we don't need ribbon client.(eureka is a mid tier LB) ribbon use with @loadbalance restTemplate.
public interface ServerProxy {
    @GetMapping("/server-service/hi/{name}")
//    @GetMapping("hi/{name}")//used to mapping to server-service w/t zuul
    MessageBody getHiFromServer(@PathVariable("name") String id);

}


