package DesignPatterns.StateDesingPattern.DesignAtm.enums;

public enum  Operations {
    WITHDRAW,
    DEPOSIT,
    ENQUIRY;

    public static void getValues() {
        for(Operations operation : Operations.values()) {
            System.out.print(operation + " ");
        }
        System.out.println();
    }
}
