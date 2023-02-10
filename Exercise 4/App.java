public class App {
    
    public static void main(String[] args) throws Exception {

        Person Me = new Person();

        //Set Method
        Me.setName("Pogi");

        String myName = Me.getName();

        //Get Method
        System.out.println("My name is " + myName);

        //Sob Object
        Son myself = new Son();
        System.out.println(myself.surname);

        myself.showSurname();
    }
}
