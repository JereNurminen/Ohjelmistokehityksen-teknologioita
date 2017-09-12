package com.jerenurminen.k2h1.com.jerenurminen.k2h1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/")
public class xController {

    @RequestMapping(value = "index", method=GET)
    public String index(@RequestParam(value = "name") String name,
                        @RequestParam(value = "age") int age,
                        Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "index";
    }

}
