package Lab4;
import java.util.*;
class Account {
 private String name; // instance variable
 private double balance; // instance variable


 public Account(String name, double balance) {
  this.name = name;


  if (balance > 0.0)
   this.balance = balance;
 }


 public void deposit(double depositAmount) {
  if (depositAmount > 0.0)
   balance = balance + depositAmount;
 }


 public double getBalance() {
  return balance;
 }


 public void setName(String name) {
  this.name = name;
 }
 public String getName()
 {
   return name;
 }

}
public class Excercise1 {

       public static void main(String[] args)
        {
           Account account1 = new Account("Jane Green", 50.00);
           Account account2 = new Account("John Blue", -7.53);


           System.out.printf("%s balance:  INR%.2f%n",
                      account1.getName(), account1.getBalance());
          System.out.printf("%s balance:  INR%.2f%n%n",
                      account2.getName(), account2.getBalance());


           Scanner input = new Scanner(System.in);

          System.out.print("Enter deposit amount for account1: "); // prompt
           double depositAmount = input.nextDouble(); // obtain user input
           System.out.printf("%nadding %.2f to account1 balance%n%n",
                     depositAmount);
           account1.deposit(depositAmount); // add to account1's balance


          System.out.printf("%s balance:  INR%.2f%n",
                     account1.getName(), account1.getBalance());
           System.out.printf("%s balance:  INR%.2f%n%n",
                     account2.getName(), account2.getBalance());

          System.out.print("Enter deposit amount for account2: "); // prompt
           depositAmount = input.nextDouble(); // obtain user input
           System.out.printf("%nadding %.2f to account2 balance%n%n",
                      depositAmount);
         account2.deposit(depositAmount); // add to account2 balance


          System.out.printf("%s balance:  INR%.2f%n",
                      account1.getName(), account1.getBalance());
           System.out.printf("%s balance:  INR%.2f%n%n",
                      account2.getName(), account2.getBalance());
       }
    }


