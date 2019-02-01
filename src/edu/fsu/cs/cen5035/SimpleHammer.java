package edu.fsu.cs.cen5035;

/**
 * @author Connor Christian
 */
public class SimpleHammer extends BasicWeapon implements Weapon {

    public SimpleHammer() {
        super(35);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = (armor < 30) ? DAMAGE : DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
