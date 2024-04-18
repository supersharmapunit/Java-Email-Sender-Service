package org.punit.config;

import java.util.Properties;

public class SMTPserverConfig {

        public Properties getProp() {
            Properties prop = new Properties();
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.enable", "true");
            return prop;
        }
}
