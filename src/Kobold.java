/**
 * Carson Mehl
 * 4/10/2024 CST388 Section 1
 * Description: Kobold class that extends Monster class, enemy number 2.
 */

import java.util.HashMap;

public class Kobold extends Monster{

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}
