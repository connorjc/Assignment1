package edu.fsu.cs.cen5035;
import java.util.Random;
import java.lang.Math;

/**
 * @author Connor Christian
 */
public class CrazyRandomSword extends BasicWeapon implements Weapon {

    private static Random rand = new Random();

    private static final int hitpoints = rand.nextInt(99-4) + 4;

    public CrazyRandomSword() {
        super(hitpoints);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int strength = rand.nextInt(Math.floorDiv(armor,3)-3) + 3;
        int damage = DAMAGE - armor - strength;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
