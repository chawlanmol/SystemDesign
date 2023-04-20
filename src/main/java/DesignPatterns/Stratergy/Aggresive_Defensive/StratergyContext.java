package DesignPatterns.Stratergy.Aggresive_Defensive;

import DesignPatterns.Stratergy.Aggresive_Defensive.AggressiveStratergy;
import DesignPatterns.Stratergy.Aggresive_Defensive.DefensiveStratergy;
import DesignPatterns.Stratergy.Aggresive_Defensive.IStratergy;

public class StratergyContext {

    public IStratergy getStratergy(int x){
        if(x > 10) return new AggressiveStratergy();
        return new DefensiveStratergy();
    }
}
