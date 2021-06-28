package emailapp;

import java.util.Scanner;



public class Email {
     private final String firstName;
     private final String lastName;
     private String password;
     private int mailBoxCapacity =  500;
    private final String email;
     private String alternateEmail;

    //Generate a constructor to receive the firstName and lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //make a call to the getDepartment method and return the department
        String department = getDepartment();
        //Call a method to generate a random password
        int defaultPassword = 10;
        this.password  = generateRandomPassword(defaultPassword);
        System.out.println("Password is: "+ this.password);

        //combine element to generate email.
        String companySuffix = "emirexco.com";
        email = firstName.toLowerCase() + "."+lastName.toLowerCase()+"@"+ department +"."+ companySuffix;
//        System.out.println("Your Email is: " + email);

    }

    //Ask for the department
    private String getDepartment(){
        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Select your department\n1.Sales\n2.Development\n3.Accounting\nPress 0 to cancel\nSelect: ");
        int departmentSelection = scannerIn.nextInt();
        switch(departmentSelection){
            case 1:
                return "sales";
            case 2:
                return "development";
            case 3:
                return "accounting";
            default:
                return "";
        }

    }


     //Generate a random password
    private String generateRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);

    }

    //Set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }

    //Set alternate email
    public void setAlternateEmail(String altMail){
        this.alternateEmail =altMail;
    }

    //set password
    public void changePassword(String newPassword){
        this.password=newPassword;
    }
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +"\n"+
                "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }

}
