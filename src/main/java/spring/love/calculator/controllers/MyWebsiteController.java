package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.love.calculator.api.WebsiteInfoDTO;

@Controller
@ControllerAdvice(assignableTypes = TestController.class)
@SessionAttributes("websiteInfo")
public class MyWebsiteController {

    @ModelAttribute("websiteInfo")
    public WebsiteInfoDTO getWebsiteInfoDTO() {

        System.out.println("************************");
        System.out.println("@ModelAttribute : Inside getWebsiteInfoDTO() ");

        WebsiteInfoDTO websiteInfoDTO = new WebsiteInfoDTO();
        websiteInfoDTO.setWebsiteName("kwawingu.com");
        websiteInfoDTO.setWebsiteCategory("Cloud Services");
        System.out.println("************************");

        return websiteInfoDTO;
    }

    @RequestMapping("/showInfo")
    public String showWebsiteInfo(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO) {

        System.out.println("@RequestMapping : Inside showWebsiteInfo() ");

        // websiteInfoDTO.setWebsiteName("SubKwawingu.com");
        // websiteInfoDTO.setWebsiteCategory("Cloud Computing");

        // WebsiteInfoDTO websiteInfoDTO = (WebsiteInfoDTO) model.getAttribute("websiteInfo");
        System.out.println(websiteInfoDTO.getWebsiteName());
        System.out.println(websiteInfoDTO.getWebsiteCategory());

        return "index2";
    }


    // @ModelAttribute inside method argument doesn't create objects, when a model object is already available
    @RequestMapping("/showCompanyInfo")
    public String showCompanyInfo(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO) {

        System.out.println("@RequestMapping : Inside showCompanyInfo() ");
        System.out.println(websiteInfoDTO.getWebsiteName());
        System.out.println(websiteInfoDTO.getWebsiteCategory());

        return "index2";
    }

}
