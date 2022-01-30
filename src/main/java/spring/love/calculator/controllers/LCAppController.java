package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showHomepage() {
        return "home-page";
    }

}
