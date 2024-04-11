/**
 * Carson Mehl
 * 4/10/2024 CST388 Section 1
 * Description: Imp class that extends Monster class, enemy number 1.
 */

import java.util.HashMap;

public class Imp extends Monster {

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP,xp,items);
    }

    @Override
    public String toString(){
        return "Imp has : " + super.toString();
    }
}
