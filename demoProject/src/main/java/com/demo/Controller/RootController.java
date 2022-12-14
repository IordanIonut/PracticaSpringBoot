package com.demo.Controller;

import com.demo.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class RootController {
    @Autowired
    private SendMail smdMailSender;

    @RequestMapping("/send-mail")
    public void sendMail() throws MessagingException {
        smdMailSender.send("test@gmail.com","Test","Howdy");

    }
}
