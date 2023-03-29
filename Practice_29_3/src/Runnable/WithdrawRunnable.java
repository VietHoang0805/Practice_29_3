package Runnable;

public class WithdrawRunnable implements Runnable {
    private ATM atm;
    private int amount;

    public WithdrawRunnable(ATM atm, int amount) {
        this.atm = atm;
        this.amount = amount;
    }

    @Override
    public void run() {
        atm.withdraw(amount);
    }
}
