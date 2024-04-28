 /**
 * Carson Mehl
 * 4/10/2024 CST388 Section 1
 * Description: Monsters.Kobold class that extends Monsters.Monster class, enemy number 2.
 */

package Monsters;
import Abilities.MeleeAttack;
import java.util.HashMap;

public class Kobold extends Monster {

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxStr);
        agi = super.getAttribute(agi, maxStr);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }
}
