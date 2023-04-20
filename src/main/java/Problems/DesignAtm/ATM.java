package Problems.DesignAtm;

import Problems.DesignAtm.AtmStates.AtmStates;
import Problems.DesignAtm.AtmStates.IdleState;

public class ATM {

    private Integer totalAmount;
    private static ATM atm = new ATM();

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public AtmStates getCurrentState() {
        return currentState;
    }

    private ATM() {

    }
    public static ATM getAtmInstance() {
        atm.setCurrentState(new IdleState());
        return atm;
    }

    private AtmStates currentState;

    public void setCurrentState(AtmStates currentState) {
        this.currentState = currentState;
    }

    public void printAtmStatus() {
        System.out.println(atm.getTotalAmount());
    }
}
