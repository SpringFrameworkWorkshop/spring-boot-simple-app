package io.spring.springbootsimpleapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomController {

    @GetMapping("/custom")
    public String home() {
        return "custom";
    }

}
