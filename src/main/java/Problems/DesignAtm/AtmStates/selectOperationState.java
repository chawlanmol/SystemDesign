package Problems.DesignAtm.AtmStates;

import Problems.DesignAtm.ATM;
import Problems.DesignAtm.BankCard;
import Problems.DesignAtm.enums.Operations;

public class selectOperationState extends AtmStates {

    @Override
    public void selectionState(ATM atm, BankCard bankCard, Operations operation) {
        System.out.println("Selected Operation: " + operation);
        switch (operation) {
            case WITHDRAW:
                System.out.println("need to withdraw");
                atm.setCurrentState(new cashWithdrawState());
                return;
            case DEPOSIT:
                System.out.println("need to deposit");
                return;
            case ENQUIRY:
                System.out.println("Loading account balance");
                atm.setCurrentState(new displayBalance());
                return;
                default:
                    returnCard(atm, bankCard);
        }
    }

}
