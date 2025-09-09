package lab;

public class Bank {
    double amount;  

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) 
                         ? "Withdrawal successful" 
                         : "Insufficient balance";

        System.out.println(message);

        amount = (withdrawalAmount <= amount) 
        		? (amount - withdrawalAmount) 
                 : amount;
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful: " + depositAmount);
    }

    public void displayBalance() {
        System.out.println("Total Balance = " + amount);
    }

    public static void main(String[] args) {

        Bank account = new Bank(10000);

        account.withdraw(5000);

        account.deposit(5000);

        account.displayBalance();
    }
}
