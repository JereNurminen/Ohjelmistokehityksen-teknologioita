package com.jerenurminen.h1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class Controller {

    @RequestMapping(value = "/index")
    public String hello() {
        return "This is the main page";
    }

    @RequestMapping(value = "/contact")
    public String contact() {
    	return "This is the contact page";
    }

}
