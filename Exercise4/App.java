public class App {
    public static void main(String[] arge) throws Exception {
   
        // Person Object
        Person Me = new Person("Dhan",  10);
        // Person Object
        Person Friend = new Person("KiKo",  65);
        
        Me.addfriend(Friend);
        
        // Pet Object
        Pet Hotdog = new Pet( "Abdul",  3, Me);
        Hotdog.showOwner();

        // Classmate1 Object
        Person Classmate1 = new Person ( "Ako",  90); 
        Me.addClassmate1(Classmate1);
        // Classmate2 Object
        Person Classmate2 = new Person ( "Ma",  90); 
        Me.addClassmate1(Classmate2);
        // Classmate3 Object
        Person Classmate3 = new Person ( "Ba",  90); 
        Me.addClassmate1(Classmate3);

        // Pet Object
        Car Lambo = new Car("Lamborghini Murciélago ", Me);
        Lambo.showCar();
    }
}

    
 
