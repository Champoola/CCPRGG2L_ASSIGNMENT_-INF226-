import java.util.Scanner;

public class App {

    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        drive("Kia");
        s.close();

    }

    static void drive(String car) {
        System.out.println("Driving Start, Kia Start");
        test(car);



        String feedback = getFeedBack(car);
        if (feedback.equals("no")) {
            fixSkill(car);
            drive(car);
        } else if (feedback.equals("yes")) {
            test(car);
        }

    }

    static void test(String car) {
        System.out.println("Done Driving");

    }

    static String getFeedBack(String car) {
        System.out.println("Is the " + car + " parked properly? yes or no?");
        String feedback = s.next();
        return feedback;

    }
              
    static void fixSkill(String car) {
        System.out.println("Enter Skill Issue"); 
        String skill = s.next();
        System.out.println("Studying issue:  " + skill);
  
    }

    static void serve(String car) {
        System.out.println("Now Driving " + car);

    }



}



