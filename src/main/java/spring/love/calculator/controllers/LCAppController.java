package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showHomepage() {
        return "home-page";
    }

    @RequestMapping("/process-homepage")
    public String showResultPage(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1, Model model) {
        System.out.println("User name is: " + userName1);
        System.out.println("Crush name is: " + crushName1);

        model.addAttribute("userName", userName1);
        model.addAttribute("crushName", crushName1);

        return "result-page";
    }

}
