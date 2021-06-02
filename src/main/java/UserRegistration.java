import java.util.regex.*;
import java.util.Scanner;

@FunctionalInterface
interface IValidateUser {
        boolean validate(String input, String regex);
}
public class UserRegistration {
    IValidateUser validator=(String input, String regex) -> (Pattern.compile(regex).matcher(input).matches());

    public static void main(String[] args) {
        System.out.println("User Registration");
        System.out.println("Enter Details");
        UserRegistration registration=new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String mobileNo;
        String emailId;
        String password;
        String regex="";

        do {
            System.out.println("Enter First Name");
            firstName = scanner.nextLine();
            regex="^[A-Z][a-z]{3,}";
            System.out.println(registration.validator.validate(firstName, regex));
        } while (!registration.validator.validate(firstName, regex));

        do {
            System.out.println("Enter Last Name");
            lastName = scanner.nextLine();
            regex="^[A-Z][a-z]{3,}";
            System.out.println(registration.validator.validate(lastName, regex));
        } while (!registration.validator.validate(lastName, regex));

        do {
            System.out.println("Enter Mobile No :");
            mobileNo = scanner.nextLine();
            regex= "\\d{2} \\d{10}" ;
            System.out.println(registration.validator.validate(mobileNo, regex));
        } while (!registration.validator.validate(mobileNo, regex));

        do {
            System.out.println("Enter email Id");
            emailId = scanner.nextLine();
            regex=" ^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$ " ;
            System.out.println(registration.validator.validate(emailId, regex));
        } while (!registration.validator.validate(emailId, regex));

        do {
            System.out.println("Enter Password");
            password = scanner.nextLine();
            regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
            System.out.println(registration.validator.validate(password, regex));
        } while (!registration.validator.validate(password, regex));
        System.out.println("User has been registered");

    }
}