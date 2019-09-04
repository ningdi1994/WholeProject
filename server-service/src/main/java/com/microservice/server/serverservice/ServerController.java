package com.microservice.server.serverservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @Autowired
    CalculatorProxy calculatorProxy;

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/hi/{name}")
    public ResponseBody getHi(@PathVariable("name") String name){
        name = calculatorProxy.getNameCalculate(name);
        ResponseBody responseBody = new ResponseBody(environment.getProperty("server.port"),name);
        logger.info("{}", responseBody);
        return responseBody;
    }
}
