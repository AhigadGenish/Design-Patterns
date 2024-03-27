public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public boolean accountActive(int accNumToCheck) {

        if(accNumToCheck == this.getAccountNumber()) {
            return true;
        }
        return false;

    }

}