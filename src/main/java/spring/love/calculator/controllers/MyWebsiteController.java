package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebsiteController {

    @RequestMapping("/showInfo")
    public String showWebsiteInfo() {

        return "index2";
    }

}
