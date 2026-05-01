package Tema7;

public class BankAccount {

    // Exercitiul 2
//    Creează clasa BankAccount:
//    Atribute:
//    ownerName
//    balance
//    Metode:
//    deposit(double amount)
//    withdraw(double amount)
//    displayBalance()
//    Reguli:
//    nu permite retragere dacă balance < amount
//    În main:
//    creează un cont
//    fă 2 depuneri și 1 retragere

    String ownerName;
    double balance;

    public BankAccount(String ownerName,double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        if(balance > amount){
            balance = balance - amount;
        }else {
            System.out.println("Not enough funds");
        }
    }

    public void displayBalance(){
        System.out.println(this.balance);
    }

    public static void main(String []args){

        BankAccount account1 = new BankAccount("Simona",500);

        account1.deposit(200);
        account1.deposit(50);
        account1.displayBalance();

        account1.withdraw(100);
        account1.displayBalance();
    }

}
