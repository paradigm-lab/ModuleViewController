package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping("/first")
    public String handlingMethod1(Model model) {

        model.addAttribute("firstName", "Collins");
        model.addAttribute("lastName", "Boniface");

        return "index";
    }

    @RequestMapping("/second")
    public String handlingMethod2(Model model1) {

         String firstName = (String) model1.getAttribute("firstName");
         System.out.println(firstName);

        return "index";
    }
}
