package projects;
import java.util.*;

class Main {
public static void main(String[] args){

System.out.println("Enter password to set up");
Scanner input = new Scanner(System.in);

String upperCaseLatters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String lowerCaseLatters = "abcdefghijklmnopqrstuvwxyz";
String specialCharactars = "@#$%&_-";
String digits = "0123456789";

while (true){

    System.out.println("Enter your password: ");
    String userPassword = input.nextLine();
    if (userPassword.length() >= 6 && userPassword.length() <= 10 );//checking the characters length

    else {
        System.out.println("your password must have 6 to 10 characters");
        Random random = new Random();
         int length = 6 + random.nextInt(5);
         String password = "";
         password += lowerCaseLatters.charAt(random.nextInt(lowerCaseLatters.length()));
         password += upperCaseLatters.charAt(random.nextInt(upperCaseLatters.length()));
         password += digits.charAt(random.nextInt(digits.length()));
         password += specialCharactars.charAt(random.nextInt(specialCharactars.length()));
         for (int i = 4;i<length; i++){

            String allChars = lowerCaseLatters + upperCaseLatters + digits + specialCharactars;
            password += allChars.charAt(random.nextInt(allChars.length()));
         }
         System.out.println("password suggested: "+ password);
         
         }
    
    boolean hasUpperCase = false;
    boolean hasLowerCase = false;
    boolean hasDigit = false;
    boolean hasChar = false;
        
                for (char c : userPassword.toCharArray()) {//checking if the password has the required chars
        if (Character.isUpperCase(c)) hasUpperCase = true;
        else if (Character.isLowerCase(c)) hasLowerCase = true;
        else if (Character.isDigit(c)) hasDigit = true;
        else if (specialCharactars.contains(String.valueOf(c))) hasChar = true;
    }
    if (!hasUpperCase) System.out.println("Password must contain at least one upper case letter");
    if (!hasLowerCase) System.out.println("Password must contain at least one lower case letter");
    if (!hasDigit) System.out.println("Password must contain at least one digit");
     if (!hasChar) System.out.println("Password must contain at least one of following characters @#$%&_- ");
    else System.out.println("Password is valid");
}
}
}




