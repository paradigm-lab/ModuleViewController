package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping("/first")
    public String handlingMethod1() {

        return "index";
    }

}
