package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {

    @RequestMapping("/process-helloworld")
    public String processHelloWorldForm() {

        return "helloworldform";
    }

}
