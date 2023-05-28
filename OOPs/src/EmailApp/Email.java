package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private  String email;
    private int mainBoxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String CompanySuffix = "XYZ.com";

    //constructor to receive the first and lastName

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created : " + this.firstName + " " + this.lastName);

        //Call a method asking for a department
        this.department = setDepartment();
        System.out.println("Department is " + this.department );

        //call a method to generate a random password
        this.password = generatePassword(defaultPasswordLength);

        System.out.print("Password is : " + this.password);

        // combine elements to generate email
        System.out.println();

        email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+ department+"."+CompanySuffix;
        System.out.println("Your email is: " + email);

    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("Department \n 1: Sales \n 2: Development\n 3: Accounting \n 0: None \n Enter the Department code : ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        return switch (depChoice) {
            case 1 -> "Sales";
            case 2 -> "Development";
            case 3 -> "Accounting";
            case 0 -> "None";
            default -> "";
        };
    }

    //Generate a random password
    private  String generatePassword(int length){
        String passwordSet = "qwertyuiopasdfghjklzxcvbnm1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }


}
