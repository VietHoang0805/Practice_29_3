package Thread;

// Luồng rút tiền
public class WithdrawThread extends Thread {
    private ATM atm;
    private int amount;

    public WithdrawThread(ATM atm, int amount) {
        this.atm = atm;
        this.amount = amount;
    }

    @Override
    public void run() {
        atm.withdraw(amount);
    }
}
