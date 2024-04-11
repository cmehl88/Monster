/**
 * Carson Mehl
 * 4/10/2024 CST388 Section 1
 * Description: This project has three sections and is four classes
 * along with the goals being Practice converting UML to code,
 * practice creating abstract classes, practice creating concrete classes,
 * and to build familiarity with managing large projects.
 */

import java.util.HashMap;

public abstract class Monster {
    private int hp = 0;
    private int xp = 10;
    private int maxHP = 0;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public String toString(){
        return "hp=" + hp + "/" + maxHP;
    }
}

