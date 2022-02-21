package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"firstName", "lastName"})
public class FirstController {

    @RequestMapping("/first")
    public String handlingMethod1(Model model) {

        model.addAttribute("firstName", "Collins");
        model.addAttribute("lastName", "Boniface");

        return "index";
    }

    @RequestMapping("/second")
    public String handlingMethod2(Model model1) {
        // Getting from the model object
        // Because the model is available in my Request Scope
        String firstName = (String) model1.getAttribute("firstName");
        System.out.println(firstName);

        String lastName = (String) model1.getAttribute("lastName");
        System.out.println(lastName);

        model1.addAttribute("firstName", firstName);
        model1.addAttribute("lastName", lastName);

        return "index";
    }
}
