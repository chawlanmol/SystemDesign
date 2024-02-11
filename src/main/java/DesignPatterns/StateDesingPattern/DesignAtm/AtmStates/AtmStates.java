package DesignPatterns.StateDesingPattern.DesignAtm.AtmStates;

import DesignPatterns.StateDesingPattern.DesignAtm.ATM;
import DesignPatterns.StateDesingPattern.DesignAtm.BankCard;
import DesignPatterns.StateDesingPattern.DesignAtm.enums.Operations;

public abstract class AtmStates {

    public void insertCard(ATM atm , BankCard card) {
            System.out.println("error Card not found");
    }

    public void authenticateCard(ATM atm, BankCard card) {
        System.out.println("error Card not found");

    }

    public void selectionState(ATM atm , BankCard bankCard, Operations operation) {
        System.out.println("error Card not found");

    }

    public void cashWithdraw(ATM atm , BankCard bankCard, Integer amount) {
        System.out.println("error Card not found");

    }

    public void balanceEnquiry(ATM atm , BankCard bankCard) {
        System.out.println("error Card not found");

    }

    public void returnCard(ATM atm , BankCard bankCard) {
        System.out.println("error Card not found");

    }

}
