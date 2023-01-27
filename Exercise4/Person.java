public class Person {
    
    //Attributes
    String name;
    int age;
    Person classmate;

    //Constructor
      Person(String PersonName, int PersonAge){
        this.name = PersonName;
        this.age = PersonAge;}

    //Add Friend Method
    void addfriend(Person Friend){
        System.out.println(this.name + " is friends with " + Friend.name);}

    //Add Classmate Method
    void addClassmate1(Person Classmate1){
        System.out.println("I am classmates with " + Classmate1.name);}

    

}
