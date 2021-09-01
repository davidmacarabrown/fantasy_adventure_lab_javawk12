package Character;

import Character.Behaviours.IFight;
import Creature.Creature;
import Weapons.Weapon;

public class Fighter extends Character implements IFight {

    private Weapon weapon;

    public Fighter(String name, int armour, int health, Weapon weapon){
        super(name, armour, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attackCreature(){

    }

    @Override
    public void attackEnemy(Creature creature) {
        
    }
}
