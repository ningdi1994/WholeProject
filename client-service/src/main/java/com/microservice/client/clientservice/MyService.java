package com.microservice.client.clientservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class MyService{

    @Autowired
    ServerProxy proxy;

    public ResponseEntity getRsp(String name){
        MessageBody res = proxy.getHiFromServer(name);
        Random rd = new Random();
        res.setId(rd.nextInt());
        return new ResponseEntity(res, HttpStatus.OK);
    }

}
