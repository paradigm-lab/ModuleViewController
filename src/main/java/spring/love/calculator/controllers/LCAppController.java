package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.love.calculator.api.UserInfoDTO;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showHomepage() {
        return "home-page";
    }

    @RequestMapping("/process-homepage")
    public String showResult(UserInfoDTO userInfoDTO, Model model) {
        System.out.println("User Name is: " + userInfoDTO.getUserName());
        System.out.println("Crush Name is: " + userInfoDTO.getCrushName());

        model.addAttribute("userInfo", userInfoDTO);

        return "result-page";
    }

    /*
    @RequestMapping("/process-homepage")
    public String showResultPage(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1, Model model) {
        System.out.println("User name is: " + userName1);
        System.out.println("Crush name is: " + crushName1);

        model.addAttribute("userName", userName1);
        model.addAttribute("crushName", crushName1);

        return "result-page";
    }
    */

}
