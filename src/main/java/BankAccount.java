public class BankAccount {

    private String owner;
    private double balance;
    private String iban;

    // Este in neregula faptul ca se foloseste modificatorul de access Public si informatiile
    // pot fi editate de oriunde, fie chiar si cu intentii rele

    public BankAccount(String owner,double balance,String iban){
        this.owner = owner;
        this.balance = balance;
        this.iban = iban;
    }

    public void setOwner(String newOwner){
        this.owner = newOwner;
        if(owner.isEmpty()){
            System.out.println("Owner empty");
        }
    }

    public void getOwner(){
        System.out.println(owner);
    }

    public void setBalance(double newBalance){
        balance = newBalance;
        if(balance >=0){
            System.out.println("Your balance is: " + balance);
        }else {
            System.out.println("Balance can't be lower than 0");
        }
    }

    public void getBalance(){
        System.out.println(balance);
    }

    public void setIban(String newIban){
        this.iban = newIban;
    }

    public void getIban(){
        System.out.println(iban);
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Deposit can't be lower than 0");
        }else{
            balance = balance + amount;
        }
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough funds");
        }else{
            balance = balance - amount;
        }
    }

    public static void main(String []args){

        BankAccount account1 = new BankAccount("Simona",500,"RO57INGB65646846464");

        account1.getOwner();
        account1.getBalance();
        account1.getIban();

    }


}
