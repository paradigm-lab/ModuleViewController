package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.BillDTO;

import javax.validation.Valid;

@Controller
public class BillController {

    @RequestMapping("/bill")
    public String showBillPage(@ModelAttribute("userBill") BillDTO billDTO) {

        return "bill-payment";
    }

    @RequestMapping("/bill-successfully")
    public String showPaymentSuccessfully(@Valid @ModelAttribute("userBill") BillDTO billDTO, BindingResult result) {

        if (result.hasErrors()) {
            return "bill-payment";
        }

        return "bill-successfully";
    }

}
