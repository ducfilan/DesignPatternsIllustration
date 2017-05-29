public abstract class Character {
    WeaponBehavior weapon;

    public Character(){}

    public void fight(){
        weapon.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior w){
        weapon = w;
    }
}
