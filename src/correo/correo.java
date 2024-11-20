/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correo;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author DIEGO CHAVARRY
 */
public class correo {
    public static void main(String[] args) {
        String nombreCliente = "Diego Chavarry";
        String to = "diegoherbay@gmail.com"; // Dirección del destinatario
        String from = "diegoherbay9@gmail.com"; // Tu dirección de Gmail
        String password = "tluk cyav govs pidi"; // Contraseña de aplicación
        
        // Configuración de propiedades
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Crear sesión
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Crear el mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("¡Promoción exclusiva de CinePlanet!");
            message.setText("Hola " + nombreCliente + ",\n\n" +
                         "¡Tenemos una oferta especial para ti!\n" +
                         "Compra tus entradas hoy y obtén un 2x1 en todas las funciones de martes y miércoles.\n" +
                         "Además, acumula puntos triples con tu membresía CinePlanet.\n\n" +
                         "¡No te pierdas esta oportunidad!\n\n" +
                         "Saludos,\n" +
                         "Tu equipo de CinePlanet");

            // Enviar el mensaje
            Transport.send(message);
            System.out.println("Correo enviado exitosamente.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
