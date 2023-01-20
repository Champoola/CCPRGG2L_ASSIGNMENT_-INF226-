public class Weapon {

    String Name;
    int Damage;
    String Rarity;
    int adddamage;

    public void weaponname() {
        System.out.println("Weapon: " + Name);
    }

    public void weapondamage() {
        System.out.println("Damage: " + Damage);
    }
    
    
    public void adddamage  (int adddamage) {
      adddamage = (Damage + adddamage);
      System.out.println("Damage increased from " + Damage + " to " + adddamage);
        this.Damage = adddamage;
        System.out.println();


    }

    String Rarity() {
        return Name + " " + Rarity;

        
      
    }


    }



