package Thread;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        WithdrawThread withdrawThread = new WithdrawThread(atm, 1000);
        DepositThread depositThread = new DepositThread(atm, 3000);

        withdrawThread.start();
        depositThread.start();
    }
}
