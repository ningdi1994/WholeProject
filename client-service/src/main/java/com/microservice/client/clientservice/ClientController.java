package com.microservice.client.clientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    ServerProxy proxy;

    @GetMapping("/nihao")
    public ResponseEntity<MessageBody> getNihao(@RequestParam(name = "name", defaultValue = "ning") String name) {

        return proxy.getHiFromServer(name);
    }
}