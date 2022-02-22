package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {

    @RequestMapping("/normalMethod")
    public String handlingMethod3(Model model) {

        String firstName = (String) model.getAttribute("firstName");
        System.out.println("Inside the new Controller method, Printing firstName: " + firstName);

        return "index";
    }

}
