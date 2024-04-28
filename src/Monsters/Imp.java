 /**
 * Carson Mehl
 * 4/10/2024 CST388 Section 1
 * Description: Monsters.Imp class that extends Monsters.Monster class, enemy number 1.
 */

package Monsters;
import java.util.HashMap;
import Abilities.MeleeAttack;

public class Imp extends Monster {

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP,xp,items);
        // Stored in a hashmap so we can use an iterator
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxStr);
        agi = super.getAttribute(agi, maxStr);
    }

    @Override
    public String toString(){
        return "Monsters.Imp has : " + super.toString();
    }
}
