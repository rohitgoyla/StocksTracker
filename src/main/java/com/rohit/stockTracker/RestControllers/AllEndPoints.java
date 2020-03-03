package com.rohit.stockTracker.RestControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/stocks")
public class AllEndPoints {

    @GetMapping(value = "/test", produces = "application/json")
    public String testController(){
        return "DONE";
    }
}
