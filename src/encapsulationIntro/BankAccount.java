package encapsulationIntro;

public class BankAccount {
    public static String name = "Harsh's Bank";
    public final double interest = 6.2;
    private double balance;
    private String owner;
    public BankAccount(String owner,double iniBalance){
        this.balance = iniBalance;
        this.owner = owner;
    }
    public void deposit(double amount) {
        if(amount>0){
            this.balance += amount;
            System.out.println("Deposited: "+amount);
        }
    }

    public void withDraw(double amount) {
       try {
           if(amount>balance){
               throw new InsufficientFundException("Insufficient balance: "+balance);
           }
           this.balance -= amount;
           System.out.println("Withdrawn: "+amount);
       } catch (InsufficientFundException e){
           System.out.println("Insufficient funds- "+e.getMessage());
       }

    }

    public void printdetails(){
        System.out.println("Bank: "+name);
        System.out.println("Owner: "+owner);
        System.out.println("Balance: "+balance);
        System.out.println("Interest: "+interest);
    }



}
