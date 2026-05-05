package Tema8.Exercitiul4;

public class Account {

    // Exercitiul 4
    //Creează:
    //- Account → private username + getter/setter + metodă login()
    //- AdminAccount extinde Account → metodă deleteUser()
    // (Metodele le am apelat in clasa Main

    private String username;

    public String getUsername(){
        return username;
    }

    public void setUsername(String newUsername){
        username = newUsername;
    }

    public void login(){
        System.out.println("You are now logged in");
    }

}
