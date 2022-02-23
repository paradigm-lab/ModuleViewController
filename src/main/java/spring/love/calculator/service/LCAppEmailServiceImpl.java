package spring.love.calculator.service;

import org.springframework.mail.SimpleMailMessage;

public class LCAppEmailServiceImpl implements LCAppEmailService{

    @Override
    public void sendEmail(String userName, String userEmail, String result) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(userEmail);
        simpleMailMessage.setSubject("Love Calculator Application Result");
        simpleMailMessage.setText("Hi" + userName + " The result predicated by the LCApp is " + result);
    }

}
