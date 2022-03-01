package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.WebsiteInfoDTO;

@Controller
public class MyWebsiteController {

    public WebsiteInfoDTO getWebsiteInfoDTO() {

        WebsiteInfoDTO websiteInfoDTO = new WebsiteInfoDTO();
        websiteInfoDTO.setWebsiteName("kwawingu.com");
        websiteInfoDTO.setWebsiteCategory("Cloud Services");

        return websiteInfoDTO;
    }

    @RequestMapping("/showInfo")
    public String showWebsiteInfo(Model model) {


        return "index2";
    }

    @RequestMapping("/showCompanyInfo")
    public String showCompanyInfo(Model model) {


        return "index2";
    }

}
