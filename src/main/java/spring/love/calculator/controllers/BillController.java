package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.BillDTO;

@Controller
public class BillController {

    @RequestMapping("/bill")
    public String showBillPage(@ModelAttribute("userBill") BillDTO billDTO) {

        return "bill-payment";
    }

    @RequestMapping("/bill-successfully")
    public String showPaymentSuccessfully(@ModelAttribute("userBill") BillDTO billDTO, BindingResult result) {

        return "bill-successfully";
    }

}
