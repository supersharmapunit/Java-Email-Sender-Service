package org.punit;

import org.punit.service.EmailService;


public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();

        emailService.sendEmail("srishtinegi1718@gmail.com, punit2000sharma@gmail.com",
        "This is the third mail",
                "This is the body of the third mail");
    }
}
