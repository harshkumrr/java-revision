package encapsulationIntro;

public class UseBank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("harsh",7800.95);
        b.withDraw(1090);
        b.printdetails();
    }
}
