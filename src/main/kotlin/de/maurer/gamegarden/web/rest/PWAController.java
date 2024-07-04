package de.maurer.gameengine.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PWAController {

    @GetMapping(value = "/**/{[path:[^\\.]*}")
    public String redirect() {
        return "forward:/";
    }
}
