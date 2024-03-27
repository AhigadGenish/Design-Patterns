
public class BankAccountFacade {

    private int accountNumber;

    private int securityCode;

    private AccountNumberCheck accChecker;
    private SecurityCodeCheck codeChecker;
    private FundsCheck fundChecker;

    private WelconeToBank bankWelcome;

    public BankAccountFacade(int newAccNum, int newSecCode) {

        this.accountNumber = newAccNum;
        this.securityCode = newSecCode;

        this.bankWelcome = new WelconeToBank();

        this.accChecker = new AccountNumberCheck();
        this.codeChecker = new SecurityCodeCheck();
        this.fundChecker = new FundsCheck();

    }

    public int getAccountNumver() {return this.accountNumber;}
    public int getSecurityCode() {
        return this.securityCode;

    }
    public void withdrawCash(double cashToGet) {
        if(this.accChecker.accountActive(getAccountNumver()) && codeChecker.isCodeCorrect(getSecurityCode())
                && fundChecker.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction complete");
        }
        else {
            System.out.println("Transaction failed");
        }
    }

    public void depositCash(double cashToDeposit) {
        if(this.accChecker.accountActive(getAccountNumver()) && codeChecker.isCodeCorrect(getSecurityCode())) {

            this.fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction complete");
        }
        else {
            System.out.println("Transaction failed");
        }
    }
}
