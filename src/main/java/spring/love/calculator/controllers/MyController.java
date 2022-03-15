package spring.love.calculator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/index")
    public String showIndexPage() {

        return "rootPage";
    }

}
