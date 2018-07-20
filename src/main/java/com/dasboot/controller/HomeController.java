package com.dasboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Octavian on 5/14/2017.
 */
@RestController
public class HomeController {


    @RequestMapping("/")
    public String home(){
        return "DasBoot reporting for duty";
    }


}
