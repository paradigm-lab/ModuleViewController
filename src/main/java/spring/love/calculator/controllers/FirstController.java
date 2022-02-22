package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"firstName", "lastName"})
public class FirstController {

    @RequestMapping("/first")
    public String handlingMethod1(Model model) {

        model.addAttribute("firstName", "Collins");
        model.addAttribute("lastName", "Boniface");

        model.addAttribute("next", "/second");

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

        model1.addAttribute("next", "/third");

        // Removing the session attributes from the session scope
        // All the Session Attributes will be removed from the session scope
        // status.setComplete();

        return "index";
    }


    @RequestMapping("/third")
    public String handlingMethod3(Model model2, SessionStatus status) {

        String lastName = (String) model2.getAttribute("lastName");
        System.out.println("Third request; Fetching from model: " + lastName);

        model2.addAttribute("lastName");

        status.setComplete();

        return "index";
    }
}
