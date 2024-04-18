package org.punit.utils;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import org.punit.dao.SmtpCredDao;

import java.util.Properties;

public class STMPsession {
    public Session getSessionInstance(Properties prop, SmtpCredDao smtpCredDao) {
        return Session.getInstance(prop,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(smtpCredDao.getUsername(), smtpCredDao.getPassword());
                    }
                });
    }
}
