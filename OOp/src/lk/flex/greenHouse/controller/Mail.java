/*
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Mail {
    Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", SMTP_PORT);

    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(USERNAME, PASSWORD);
        }
    });

        try {
        Message emailMessage = new MimeMessage(session);
        emailMessage.setFrom(new InternetAddress(USERNAME));
        emailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        emailMessage.setSubject(subject);

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");

        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        for (String attachment : attachments) {
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile(attachment);
            multipart.addBodyPart(attachmentBodyPart);
        }

        emailMessage.setContent(multipart);

        Transport.send(emailMessage);
        showSuccessAlert();
    } catch (MessagingException e)

    {
        showErrorAlert("Error sending email: " + e.getMessage());

    }}
*/
