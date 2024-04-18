package org.punit.utils;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.punit.dao.SmtpCredDao;

public class SendEmailUtil {
    public boolean sendMessage(Session session, SmtpCredDao smtpCredDao, String recipientStringList, String subject, String emailBody) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(smtpCredDao.getUsername()+"@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(recipientStringList)
            );
            message.setSubject(subject);
            message.setText(emailBody);

            Transport.send(message);

            System.out.println("Done");
            return true;

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return false;
    }
}
