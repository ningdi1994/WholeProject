package com.microservice.server.serverservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {


    @Autowired
    Environment environment;

    @GetMapping("/hi/{name}")
    public ResponseBody getHi(@PathVariable("name") String name){
        return new ResponseBody(environment.getProperty("server.port"),name);
    }
}
