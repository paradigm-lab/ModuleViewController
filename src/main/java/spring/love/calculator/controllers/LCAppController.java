package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.love.calculator.api.UserInfoDTO;

@Controller
public class LCAppController {


    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfodto) {

        return "home-page";
    }

    /*
    @RequestMapping("/")
    public String showHomepage(Model model) {

       // Read the default property by fetching it from the dto


        UserInfoDTO userInfoDTO = new UserInfoDTO();
        model.addAttribute("userInfo", userInfoDTO);

        return "home-page";
    }
    */


    @RequestMapping("/process-homepage")
    public String showResultPage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {

        return "result-page";
    }

    /*

    @RequestMapping("/process-homepage")
    public String showResult(UserInfoDTO userInfoDTO, Model model) {

        // Writing the value to the properties  by fetching from the url
        System.out.println("User Name is: " + userInfoDTO.getUserName());
        System.out.println("Crush Name is: " + userInfoDTO.getCrushName());

        model.addAttribute("userInfo", userInfoDTO);

        return "result-page";
    }

     */

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
