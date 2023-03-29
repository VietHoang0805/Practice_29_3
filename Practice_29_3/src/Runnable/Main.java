package Runnable;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Thread withdrawThread = new Thread(new WithdrawRunnable(atm, 500));
        Thread depositThread = new Thread(new DepositRunnable(atm, 1000));

        withdrawThread.start();
        depositThread.start();
    }
}