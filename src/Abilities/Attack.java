/**
 * Carson Mehl
 * 4/19/2024 CST388 Section 1
 * Description: This is an interface that is organized under the Abilities.Ability interface.
 */

package Abilities;
import Monsters.Monster;

public interface Attack extends Ability {
    Integer attack(Monster target);
}
