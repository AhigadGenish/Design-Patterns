public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return this.cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithDraw) {
        this.cashInAccount -= cashWithDraw;
    }

    public void increaseCashInAccount(double cashDeposit) {
        this.cashInAccount += cashDeposit;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if(cashToWithdrawal > this.getCashInAccount()) {
            System.out.println("Error : You Dont have enough money");
            System.out.println("cuurent Balance: " + this.getCashInAccount());
            return false;
        }

        this.decreaseCashInAccount(cashToWithdrawal);
        System.out.println("Withdrawal complete: Current Balance: " + this.getCashInAccount());
        return true;
    }

    public void makeDeposit(double cashToDeposit) {
        this.increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit complete, Current Balance:"+ this.getCashInAccount());
    }
}
