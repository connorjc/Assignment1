package edu.fsu.cs.cen5035;

/**
 *
 * @author Connor Christian
 */
public class RoleGame {

    public static void main(String[] args) {

    	int armor = 29;

        Weapon weapon = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + weapon.hit() + " of damage.");        
        System.out.println("Swords was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        weapon = WeaponFactory.getWeapon("spear");
        System.out.println("Spear has " + weapon.hit() + " of damage.");        
        System.out.println("Spear was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //TODO: Add the remaining weapons here
        weapon = WeaponFactory.getWeapon("simple hammer");
        System.out.println("Simple Hammer has " + weapon.hit() + " of damage.");        
        System.out.println("Simple Hammer was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

    }
}
