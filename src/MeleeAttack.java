import java.util.function.DoubleFunction;

/**
 * Carson Mehl
 * 4/19/2024 CST388 Section 1
 * Description: Melee Attack java class that implements Attack.java Interface.
 */

public class MeleeAttack implements Attack{

    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }
}
