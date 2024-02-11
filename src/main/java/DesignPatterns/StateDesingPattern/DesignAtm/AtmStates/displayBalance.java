package DesignPatterns.StateDesingPattern.DesignAtm.AtmStates;

import DesignPatterns.StateDesingPattern.DesignAtm.ATM;
import DesignPatterns.StateDesingPattern.DesignAtm.BankCard;

public class displayBalance extends AtmStates {

    @Override
    public void balanceEnquiry(ATM atm, BankCard bankCard) {
        System.out.println("Account Balance: " +  bankCard.getBankingDetails().getBankBalance());
    }
}
