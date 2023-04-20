package DesignPatterns.Stratergy.Aggresive_Defensive;

import DesignPatterns.Stratergy.Aggresive_Defensive.IStratergy;
import DesignPatterns.Stratergy.Aggresive_Defensive.StratergyContext;

public class StratergyPatterDemo {

    public void Demo() {
        StratergyContext stratergyContext = new StratergyContext();
        IStratergy stratergy = stratergyContext.getStratergy(100);
        System.out.println(stratergy.execute());
    }

}
