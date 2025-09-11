/*
 * Jack Schaefer 20167832
 * Major -> Game Design - Technical Development & Programming
 * Minors -> UX & Computer Science
 */
import java.util.Scanner;
public class Debug {
    public static void main(String[] args) {
        //The main scanner object that will take the user's inputs
        Scanner sc = new Scanner(System.in);
        
        //An integer that will keep track of the user's score
        Integer score = 0;

        //Informs the user what the quiz is about and asks them the first question
        System.out.println("We are going to take a quiz! This quiz is about bears!");
        System.out.println("This is multiple choice. There is only one correct answer per question.");
        System.out.println("Question 1: How many species of bears are there? \nA)4\nB)7\nC)8");

        //Reads the user's answer
        String answer1 = sc.nextLine();

        //Checks to see if the user's answer is correct or not
        //If the user inputs an invalid letter, they are informed and not awarded any points
        if(answer1.toUpperCase().equals("C"))
        {
            System.out.println("Correct!");
            score++;
        }
        else if(answer1.toUpperCase().equals("B") || answer1.toUpperCase().equals("A"))
        {
            System.out.println("Sorry that is incorrect");
        }
        else
        {
    
            System.out.println("Invalid input. No score awarded.");
        }
        

        //Asks the user the next question
        System.out.println("This is multiple choice. There is only one correct answer per question.");
        System.out.println("Question 2: What do panda bears mainly eat?\nA)Bamboo\nB)Seeds\nC)Small animals");

        //Reads the user's next answer
        String answer2 = sc.nextLine();

        //Checks to see if the user's answer is correct or not
        //If the user inputs an invalid letter, they are informed and not awarded any points
        if(answer2.toUpperCase().equals("A"))
        {
            System.out.println("Correct!");
            score++;
        }
        else if(answer2.toUpperCase().equals("B") || answer2.toUpperCase().equals("C"))
        {
            System.out.println("Sorry that is incorrect");
        }
        else
        {
            System.out.println("Invalid input. No score awarded.");
        }

        //Asks the user the final question
        System.out.println("This is multiple choice. There is only one correct answer per question.");
        System.out.println("Question 3: What season do bears hibernate?\nA)Spring\nB)Winter\nC)Summer");
        
        //Reads the user's answer
        String answer3 = sc.nextLine();

        //Checks to see if the user's answer is correct or not
        //If the user inputs an invalid letter, they are informed and not awarded any points
        if(answer3.toUpperCase().equals("B"))
        {
            System.out.println("Correct!");
            score++;
        }
        else if(answer3.toUpperCase().equals("A") || answer3.toUpperCase().equals("C"))
        {
            System.out.println("Sorry that is incorrect");
        }
        else
        {
            System.out.println("Invalid input. No score awarded.");
        }
        //Prints the user's score with a congratulations message
        System.out.println("All done! Your final score is " + score);
        //What I learned
        //I learned how to compare a user's input with different values using if, else if, and else statements
        //I also learned how to properly compare strings to others using equals() instead of "=="

    }
}
