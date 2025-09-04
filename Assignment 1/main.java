import java.util.Scanner;
public class Debug{
    public static void main(String[] args){
        //creates a new scanner
        Scanner sc = new Scanner(System.in);
        //Asks the user for their name and then stores that input into 
        //a string called userName
        System.out.println("What is your name?:");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");

        //Asks the user for their age and then stores that input into
        //a string called userAge
        System.out.println("How old are you?: ");
        String userAge = sc.nextLine();
        System.out.println("You are " + userAge + " years old");

        //Two integers storing two numbers
        int num1 = 10;
        int num2 = 37;
        //Adds these two integers together
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        //What I learned
        //I learned how to create a scanner object and how to intake user inputs 
        
    }
}
