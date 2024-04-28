/**
 * Carson Mehl
 * 4/10/2024 CST388 Section 1
 * Description: This project has three sections and is four classes
 * along with the goals being Practice converting UML to code,
 * practice creating abstract classes, practice creating concrete classes,
 * and to build familiarity with managing large projects. - Dr C's Description.
 */

package Monsters;
import Abilities.Attack;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {
    private int hp = 0;
    private int xp = 10;
    private int maxHP = 0;
    int agi = 10;
    int def = 10;
    int str = 10;
    Attack attack;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    // Return int value between min and max in a goofy way
    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }

    public boolean takeDamage(Integer damage){
        if (damage > 0) {
            hp = hp - damage;
            System.out.println("The creature was hit for " + damage + " damage");
            if (hp <= 0) {
                System.out.println("Oh no! the creature has perished");
                System.out.println(this.toString());
                return false;
            }
        }
        return true;
    }

    public Integer attackTarget(Monster target) {
        // Make sure there actually is an attack though shouldn't be an issue
        if (attack != null) {
            // Attack using the Attack object and get the damage dealt then call takeDamage
            Integer damageDealt = attack.attack(target);
            target.takeDamage(damageDealt);
            return damageDealt; // Return the damage dealt to the health
        } else {
            // Send an error if somehow no attack is defined, then we got a real problem
            System.out.println("No attack is defined for this monster.");
            return null;
        }
    }

    // equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster monster)) return false;
        if (getHp() != monster.getHp()) return false;
        if (getXp() != monster.getXp()) return false;
        if (getMaxHP() != monster.getMaxHP()) return false;
        if (getAgi() != monster.getAgi()) return false;
        if (getDef() != monster.getDef()) return false;
        if (getStr() != monster.getStr()) return false;
        if (!Objects.equals(attack, monster.attack)) return false;
        return Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        int result = getHp();
        result = 31 * result + getXp();
        result = 31 * result + getMaxHP();
        result = 31 * result + getAgi();
        result = 31 * result + getDef();
        result = 31 * result + getStr();
        result = 31 * result + (attack != null ? attack.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }

    // Getters and setters generated
    public int getHp() {
        return hp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getAgi() {
        return agi;
    }

    public int getDef() {
        return def;
    }

    public int getStr() {
        return str;
    }

    @Override
    public String toString(){
        return "hp=" + hp + "/" + maxHP;
    }
}

