package Problems.DesignAtm.AtmStates;

import Problems.DesignAtm.ATM;
import Problems.DesignAtm.BankCard;

public class IdleState extends AtmStates {

    @Override
    public void insertCard(ATM atm , BankCard card) {
        System.out.println("Card has been inserted");
        atm.setCurrentState(new HasCardState());
    }
}
