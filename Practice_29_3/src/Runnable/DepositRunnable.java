package Runnable;

public class DepositRunnable implements Runnable {
    private ATM atm;
    private int amount;

    public DepositRunnable(ATM atm, int amount) {
        this.atm = atm;
        this.amount = amount;
    }

    @Override
    public void run() {
        atm.deposit(amount);
    }
}
