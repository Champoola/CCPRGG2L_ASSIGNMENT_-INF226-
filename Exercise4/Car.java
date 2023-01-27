public class Car {

    //Attributes
    Person owner;
    String carBrand;

    //Constructor
    Car(String carBrand, Person ownerName){
        this.owner = ownerName;
        this.carBrand= carBrand; }

    // Owner Method
    void showCar(){
        System.out.println("My name is " + owner.name +  " and my car is " + carBrand );}

}
    

