package Thread;

// Luồng nạp tiền
public class DepositThread extends Thread {
    private ATM atm;
    private int amount;

    public DepositThread(ATM atm, int amount) {
        this.atm = atm;
        this.amount = amount;
    }

    @Override
    public void run() {
        atm.deposit(amount);
    }
}