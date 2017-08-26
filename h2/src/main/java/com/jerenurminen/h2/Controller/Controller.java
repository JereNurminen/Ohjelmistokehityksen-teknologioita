package com.jerenurminen.h2.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public static String hello(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "location", required = false) String location) {
        if (name != null && location != null) {
            return "Welcome to " + location + ", " + name + "!";
        } else if (name == null && location == null) {
            return "Welcome!";
        } else if (name == null) {
            return "Welcome to " + location + "!";
        } else {
            return "Welcome " + name + "!";
        }

    }

}
