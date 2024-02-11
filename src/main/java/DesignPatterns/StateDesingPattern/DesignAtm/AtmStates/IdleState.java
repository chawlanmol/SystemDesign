package DesignPatterns.StateDesingPattern.DesignAtm.AtmStates;

import DesignPatterns.StateDesingPattern.DesignAtm.ATM;
import DesignPatterns.StateDesingPattern.DesignAtm.BankCard;

public class IdleState extends AtmStates {

    @Override
    public void insertCard(ATM atm , BankCard card) {
        System.out.println("Card has been inserted");
        atm.setCurrentState(new HasCardState());
    }
}
