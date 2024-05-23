package bank;

public class DepositAmt extends Banking_Abstract_Deposit{
    public void Deposit(int depositAmount) throws NetBankingException {
        int afterDeposit = AccountInfo.getBalance() + depositAmount;
        if (depositAmount == 0) {
            System.out.println("No Money Added");
        } else
            System.out.println("Your new balance is : " + afterDeposit);
    }
}
