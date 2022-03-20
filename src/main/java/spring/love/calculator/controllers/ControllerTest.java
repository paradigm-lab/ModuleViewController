package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {

    @RequestMapping("/process-helloworld")
    @ResponseBody
    public String processHelloWorldForm(@RequestParam("yn") String name) {

        return " hello world " + name;
    }

}
