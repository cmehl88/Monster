/**
 * Carson Mehl
 * 4/19/2024 CST388 Section 1
 * Description: Ranged Attack java class that implements Attack.java Interface.
 */

package Abilities;
import Monsters.Monster;

public class RangedAttack implements Attack {
    Monster attacker;

    public RangedAttack(Monster attacker){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return attacker.getStr() - target.getDef();
    }
}
