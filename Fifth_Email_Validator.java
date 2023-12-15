// /*Write a program that accepts an email string and validates that email. If email is valid must display success message and If email is not valid must display error message
// Example:  Input - test01*gmail.com
// 	     Output - Invalid Email Id
// 	     Input - student01@gmail.com
// 	     Output - Valid Email Id
//  */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fifth_Email_Validator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Email Address: ");
        String email=scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid Email Id");
        }
        else{
            System.out.println("Invalid Email Id");
        }
    }

    private static boolean isValidEmail(String email){
        String emailRegex="^[a-zA=Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
