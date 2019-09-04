package com.calculator.calculatorserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/{name}/calculate")
    public String getCalculateResult(@PathVariable(value = "name")String input){
        logger.info("{}", "have a log here");
        return input+" this is aftermarket";
    }
}
