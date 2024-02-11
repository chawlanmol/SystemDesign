package DesignPatterns.StateDesingPattern.DesignAtm.AtmStates;

import DesignPatterns.StateDesingPattern.DesignAtm.ATM;
import DesignPatterns.StateDesingPattern.DesignAtm.BankCard;
import DesignPatterns.StateDesingPattern.DesignAtm.enums.Operations;

public class HasCardState extends AtmStates {

    @Override
    public void authenticateCard(ATM atm, BankCard card) {

        if(isSuccessfulAuth(card)) {
            System.out.println("card has been Authenticated");
            atm.setCurrentState(new selectOperationState());
            System.out.println("Select Operations : ");
            Operations.getValues();

        } else {
            returnCard();
            atm.setCurrentState(new IdleState());
        }
    }
    boolean isSuccessfulAuth(BankCard bankCard) {
        return true;
    }

    public void returnCard() {
        System.out.println("Card returned");
    }
}
