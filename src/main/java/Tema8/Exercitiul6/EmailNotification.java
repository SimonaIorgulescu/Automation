package Tema8.Exercitiul6;

public class EmailNotification extends Notification {

    // Exercitiul 6
    //Creează:
    //- Notification → metodă send()
    //- EmailNotification → private emailAddress + getter/setter + override send()

    private String emailAddress;

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(String newEmailAddress){
        emailAddress = newEmailAddress;
    }

    public void send(){
        System.out.println("Email sent");
    }
}
