package com.home.controllers.mom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BroController {

    @RequestMapping("/cricketbat")
    public String giveCricketBat(){
        return "views/MRFCricketbat.html";
    }

}
