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
       if(amount>0&&amount<balance){
           this.balance -= amount;
           System.out.println("Withdrawn: "+amount);
       } else {
           System.out.println("Insufficient amount");
       }
    }

    public void printdetails(){
        System.out.println("Bank: "+name);
        System.out.println("Owner: "+owner);
        System.out.println("Balance: "+balance);
        System.out.println("Interest: "+interest);
    }



}
