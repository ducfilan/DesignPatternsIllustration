public class AdventureGameSimulator {

     public static void main(String []args){
        Character troll = new Troll();
        troll.fight();

        Character queen = new Queen();
        queen.fight();
        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.fight();

        Character king = new King();
        king.fight();
     }
}
