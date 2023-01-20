public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Maui";
        knight.sayMyName();
        knight.attack();

        Weapon sword1 = new Weapon ();
        sword1.Name = "Maui Taylor Sword";
        sword1.Damage = 5000;
        sword1.Rarity = "Five Star";
        System.out.println(sword1.Rarity());
        sword1.weapondamage();
        sword1.adddamage(10);
        sword1.Rarity();
        

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Alma";
        mage.sayMyName();
        mage.attack();

        Weapon sword2 = new Weapon ();
        sword2.Name = "Alma Moreno Sword";
        sword2.Damage = 3000;
        sword2.Rarity = "Three Star";
        System.out.println(sword2.Rarity());
        sword2.weapondamage();
        sword2.adddamage(20);
        sword2.Rarity();
        

        Character thief = new Character();
 
        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Aj";
        thief.sayMyName();
        thief.attack();
        
        Weapon sword3 = new Weapon ();
        sword3.Name = "AJ Raval Sword";
        sword3.Damage = 1000;
        sword3.Rarity = "One Star";
        System.out.println(sword3.Rarity());
        sword3.weapondamage();
        sword3.adddamage(30);
     
        
    }
}
