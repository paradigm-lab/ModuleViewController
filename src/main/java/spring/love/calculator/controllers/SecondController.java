package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {

    @RequestMapping("/normalMethod")
    public String handlingMethod3() {

        return "index";
    }

}
