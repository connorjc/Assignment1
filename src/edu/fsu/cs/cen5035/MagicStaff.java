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
        /* Critical hit is represented as parabolic curve shifted to a max power
         * of armor and stretched such that DAMGE > 40 does not recieve a bonus
         */
        int critical = (int) Math.ceil(armor*(1-(Math.pow(DAMAGE,2)/15/100.0)));
        critical = (critical < 0) ? 0 : critical;
        int damage = DAMAGE + critical - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
