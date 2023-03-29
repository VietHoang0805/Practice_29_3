package Runnable;

public class ATM {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Not enough money. Please deposit before withdraw.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(amount + " withdrawn. Current balance is " + balance);
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance is " + balance);
        notify();
    }
}

