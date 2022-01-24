package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    @ResponseBody
    @RequestMapping("/test")
    public String sayHello() {
        return "Hey it's Working";
    }

}
