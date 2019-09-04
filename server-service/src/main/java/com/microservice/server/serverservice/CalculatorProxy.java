package com.microservice.server.serverservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("calculator-server")
public interface CalculatorProxy {
    @GetMapping("/{name}/calculate")
    String getNameCalculate(@PathVariable("name") String name);
}
