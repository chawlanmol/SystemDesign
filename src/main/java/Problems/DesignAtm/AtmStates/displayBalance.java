package Problems.DesignAtm.AtmStates;

import Problems.DesignAtm.ATM;
import Problems.DesignAtm.BankCard;

public class displayBalance extends AtmStates {

    @Override
    public void balanceEnquiry(ATM atm, BankCard bankCard) {
        System.out.println("Account Balance: " +  bankCard.getBankingDetails().getBankBalance());
    }
}
