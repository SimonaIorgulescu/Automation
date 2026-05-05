package Tema8.Exercitiul4;

public class Main {

    public static void main(){

        Account account = new Account();

        account.login();

        account.setUsername("simona1234");

        String account1 = account.getUsername();
        System.out.println(account1);


        AdminAccount adminAccount = new AdminAccount();

        adminAccount.login();

        adminAccount.setUsername("patrick1960");

        String adminUsername = adminAccount.getUsername();
        System.out.println(adminUsername);

        adminAccount.deleteUser();
    }
}
