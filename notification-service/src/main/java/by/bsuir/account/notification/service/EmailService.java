package by.bsuir.account.notification.service;

import by.bsuir.account.notification.domain.NotificationType;
import by.bsuir.account.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
