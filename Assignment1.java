import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter NU student email address: ");
        String studentMail = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentMail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid student email");
        } else {
            System.out.println("Invalid student email");
        }

        // Short method
        System.out.print("Enter Your Philippine Phone Number: ");
        String philPhoneNum = scan.nextLine();
        match = Pattern.compile("\\+63\\d{10}").matcher(philPhoneNum).matches();

        if (match) {
            System.out.println("Valid Philippine Phone Number");
        } else {
            System.out.println("Invalid Philippine Phone Number");
        }

        // Even shorter method
        System.out.print("Enter Your Birthdate (Format: YYYY-MM-DD): ");
        String BirthDate = scan.nextLine();
        match = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", BirthDate);

        if (match) {
            System.out.println("Valid birthdate format");
        } else {
            System.out.println("Invalid birthdate format");
        }


    }
}