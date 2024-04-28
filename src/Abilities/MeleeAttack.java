/**
 * Carson Mehl
 * 4/19/2024 CST388 Section 1
 * Description: Melee Abilities.Attack java class that implements Abilities.Attack.java Interface.
 */

package Abilities;
import Monsters.Monster;

public class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStr() - target.getDef();
    }
}
