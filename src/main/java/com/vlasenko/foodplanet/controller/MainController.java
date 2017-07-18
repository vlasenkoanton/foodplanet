package com.vlasenko.foodplanet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by A. Vlasenko on 18.07.2017.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }


}
