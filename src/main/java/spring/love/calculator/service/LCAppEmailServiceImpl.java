package spring.love.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements LCAppEmailService{

    @Autowired
    private JavaMailSenderImpl javaMailSender;

    @Override
    public void sendEmail(String userName, String userEmail, String result) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(userEmail);
        simpleMailMessage.setSubject("Love Calculator Application Result");
        simpleMailMessage.setText("Hi" + userName + " The result predicated by the LCApp is " + result);

        javaMailSender.send(simpleMailMessage);
    }

}
