package com.microservice.client.clientservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
//    @Autowired
//    ServerProxy proxy;

//    @Autowired
//    ThreadPoolTaskExecutor threadPoolTaskExecutor;


    MyService myService;

    @Autowired
    ClientController(MyService myService){
        this.myService = myService;
    }


//    public ServerService getServerService() {
//        return serverService;
//    }
//    @Autowired
//    public void setServerService( ServerService serverService) {
//        this.serverService = serverService;
//    }

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/nihao")
    public ResponseEntity<MessageBody> getNihao(@RequestParam(name = "name", defaultValue = "ning") String name) {


        ResponseEntity<MessageBody> response = myService.getRsp(name);
        logger.info("{}", response );
        return response;
    }

    @Autowired
    ServerServiceRobin serverServiceRobin;

    @GetMapping("/hiRibbon")
    public MessageBody getHi(@RequestParam(name = "name",defaultValue = "nn")String name){
        return serverServiceRobin.getMessageFromServer(name);
    }
}
