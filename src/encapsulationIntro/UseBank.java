package encapsulationIntro;

public class UseBank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Harsh",7800.05);
        BankAccount c = new BankAccount("Rahul",6800.98);
        b.deposit(1000);
        c.withDraw(1000);
        b.printdetails();
        c.printdetails();
    }
}
