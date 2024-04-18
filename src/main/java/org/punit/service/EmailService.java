package org.punit.service;

import jakarta.mail.Session;
import org.punit.config.SMTPserverConfig;
import org.punit.dao.SmtpCredDao;
import org.punit.utils.STMPsession;
import org.punit.utils.SendEmailUtil;

import java.util.Properties;

public class EmailService {
    private SendEmailUtil sendEmailUtil;
    SMTPserverConfig smtPserverConfig;
    STMPsession smtpSession;
    SmtpCredDao smtpCredDao;

    public EmailService() {
        this.sendEmailUtil= new SendEmailUtil();
        this.smtPserverConfig = new SMTPserverConfig();
        this.smtpSession = new STMPsession();
        this.smtpCredDao = new SmtpCredDao();
    }

    public boolean sendEmail(String recipientStringList, String subject, String emailBody) {
        this.smtpCredDao.setUsername("negi.srishti1812");
        this.smtpCredDao.setPassword("zsky hmdy cprl fthm");

        Properties prop = this.smtPserverConfig.getProp();
        Session session = this.smtpSession.getSessionInstance(prop, smtpCredDao);

        return this.sendEmailUtil.sendMessage(
                session,
                smtpCredDao,
                recipientStringList,
                subject,
                emailBody
        );
    }
}
