package bank;

import java.lang.reflect.Method;

public class BankCodeFINDER {
    public static void main(String[] args) {
       Class<InternalWork> refToInternalWork = InternalWork.class;
        Method[] inMethods = refToInternalWork.getDeclaredMethods();
        for(Method m : inMethods)
            System.out.println("The method in InternalWorks are : \n" + m + "\n");

        Class<DepositAmt> refToDepositAmt = DepositAmt.class;
        Method[] daMethods = refToDepositAmt.getDeclaredMethods();
        for(Method m : daMethods)
            System.out.println("The method in DepositAmt are : \n" + m + "\n");

        Class<NetBanking> refToNetBanking = NetBanking.class;
        Method[] nbMethods = refToNetBanking.getDeclaredMethods();
        for(Method m : nbMethods)
            System.out.println("The method in NetBanking are : \n" + m + "\n");

        Class<WithdrawalAction> refToWithdrawalAction = WithdrawalAction.class;
        Method[] waMethods = refToWithdrawalAction.getDeclaredMethods();
        for(Method m : waMethods)
            System.out.println("The method in WithdrawalAction are : \n" + m + "\n");

        Class<CheckBALANCE> reftoCheckBALANCE = CheckBALANCE.class;
        Method[] cbMethods = reftoCheckBALANCE.getDeclaredMethods();
        for (Method m : cbMethods){
            System.out.println("The methods in checkBAlANCE are : \n" + m + "\n");
        }
    }
}
