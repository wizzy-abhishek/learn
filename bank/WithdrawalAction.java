package bank;


public class WithdrawalAction implements Banking_Interfaces_Withdrawal {
    @Override
    public void withdrawal(int withdrawalAmt) throws NetBankingException {
        if (withdrawalAmt <= 0) {
            System.out.println("You are wasting resource and our time ");
        } else if (withdrawalAmt > 10000) {
            System.out.println("You can only objWithdraw upto 10000 once ");
        } else if (AccountInfo.getBalance() < withdrawalAmt) {
            System.out.println("You only have : " + AccountInfo.getBalance() + " in your account");
        } else {
            int afterWithdrawal = AccountInfo.getBalance() - withdrawalAmt;
            System.out.printf("You withdrew : " + withdrawalAmt);
            System.out.println("Your new balance is : " + afterWithdrawal);

        }
    }
}