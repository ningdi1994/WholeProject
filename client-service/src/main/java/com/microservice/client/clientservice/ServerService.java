package com.microservice.client.clientservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Service
public class ServerService{

    @Autowired
    ServerProxy proxy;

    public ResponseEntity<MessageBody> getRsp(String name){
        MessageBody res = proxy.getHiFromServer(name);
        System.out.println(res.getName());
        System.out.println(res.getPort());
        Random rd = new Random();
        res.setId(rd.nextInt());
        return new ResponseEntity<MessageBody>(res, HttpStatus.OK);
    }

}
