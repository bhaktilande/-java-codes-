class BankAccount {
   String accountHolder;
   double balance;
    void transferTo(BankAccount receiver,double amount) {
    if (balance >= amount) {
       balance = balance - amount;
       receiver. balance = receiver. balance + amount;
    }
  }
}
public class Main {
   public static void main(String []args) {
    BankAccount a1 = new BankAccount();
    BankAccount a2 = new BankAccount();
    a1.balance = 20000;
    a2.balance = 15000;
    a1.transferTo (a2,5000);
    System.out.println ("A1 Balance ="+ a1.balance);
    System.out.println ("A2 Balance ="+ a2.balance);
  }
}
  
  
