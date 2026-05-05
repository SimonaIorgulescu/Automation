package Tema8.Exercitiul6;

public class Main {

    public static void main(){

        Notification notification = new Notification();

        notification.send();

        EmailNotification emailNotification = new EmailNotification();

        emailNotification.setEmailAddress("simona@yahoo.com");
        String emailAddress1 = emailNotification.getEmailAddress();
        System.out.println(emailAddress1);

        emailNotification.send();

    }
}
