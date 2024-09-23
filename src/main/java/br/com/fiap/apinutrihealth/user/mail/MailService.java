package br.com.fiap.apinutrihealth.user.mail;

import br.com.fiap.apinutrihealth.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    MailSender mailSender;

    public void sendWelcomeEmail(User user) {
        var email = new SimpleMailMessage();

        email.setFrom("NutriHealth");
        email.setTo(user.getEmail());
        email.setSubject("Boas Vindas");
        email.setText("""
                    Olá, %s
                    
                    Seja bem vindo a NutriHealth.
                    
                    Estamos felizes por ter você aqui.
                    
                    Att
                """.formatted(user.getName()));


        mailSender.send(email);
    }
}
