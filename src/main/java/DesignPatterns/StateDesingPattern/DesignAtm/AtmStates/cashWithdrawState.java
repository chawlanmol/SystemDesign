package DesignPatterns.StateDesingPattern.DesignAtm.AtmStates;

import DesignPatterns.StateDesingPattern.DesignAtm.ATM;
import DesignPatterns.StateDesingPattern.DesignAtm.BankCard;
import DesignPatterns.StateDesingPattern.DesignAtm.BankingDetails;



public class cashWithdrawState extends AtmStates{

    @Override
    public void cashWithdraw(ATM atm, BankCard bankCard, Integer amount) {
        BankingDetails bankingDetails = bankCard.getBankingDetails();
        Integer accountBalance = bankingDetails.getBankBalance();
        Integer moneyInAtm = atm.getTotalAmount();
        if (moneyInAtm > amount && accountBalance > amount) {
            atm.setTotalAmount(moneyInAtm - amount);
            bankingDetails.setBankBalance(accountBalance - amount);
        }
        System.out.println("remaining account Balance: " + bankingDetails.getBankBalance());
        atm.setCurrentState(new IdleState());
        returnCard(atm, bankCard);
    }

    @Override
    public void returnCard(ATM atm, BankCard card) {
        atm.printAtmStatus();
        System.out.println("Please collect your card");
    }
}
