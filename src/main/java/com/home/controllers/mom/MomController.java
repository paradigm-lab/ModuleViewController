package com.home.controllers.mom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

    @ResponseBody
    @RequestMapping("/sugar")
    public String giveSugar() {
        return "Ok.. Here is your sugar";
    }

}
