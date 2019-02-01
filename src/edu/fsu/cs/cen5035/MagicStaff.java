package edu.fsu.cs.cen5035;
import java.time.LocalDateTime;
import java.lang.Math;

/**
 * @author Connor Christian
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    private static final int hitpoints = LocalDateTime.now().getMinute()+1;

    public MagicStaff() {
        super(hitpoints);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int critical = (int)(armor*(100-DAMAGE*2)/100.0);
        int damage = DAMAGE + critical - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
