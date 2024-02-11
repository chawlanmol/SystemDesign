package DesignPatterns.StateDesingPattern.DesignAtm;

import DesignPatterns.StateDesingPattern.DesignAtm.enums.Operations;

public class AtmRoom {
    private  ATM atm;
    private BankCard card;
    public AtmRoom() {

    }

    public void Demo() {
        initialise();
        atm.getCurrentState().insertCard(atm, card);
        atm.getCurrentState().authenticateCard(atm, card);
        atm.getCurrentState().selectionState(atm, card, Operations.WITHDRAW);
//        atm.getCurrentState().balanceEnquiry(atm, card);
        atm.getCurrentState().cashWithdraw(atm, card, 1000);
    }

    private void  initialise() {
        atm = ATM.getAtmInstance();
        atm.setTotalAmount(5000);
        BankingDetails bankingDetails = new BankingDetails();
        bankingDetails.setBankBalance(3000);
        card = new BankCard();
        card.setBankingDetails(bankingDetails);
    }



}
