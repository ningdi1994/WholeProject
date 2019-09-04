package com.ribbon.server.ribbonserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/ribbon/server/{name}")
    public String getMs(@PathVariable("name")String name){
        return name+"ribbon server got it.";
    }

}
