import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter a number to find the factorial of: ");
        int fact = sc.nextInt();
        System.out.println("The factorial of " + fact + " is " + factorial(fact));
        //Asks the user for a number and then sends it to factorial function
        //Prints out a clear statement of what the factorial of the inputted number is
        
        System.out.println("Please enter a number and I will tell you the sum of every other number: ");
        int numOther = sc.nextInt();
        System.out.println("The sum of every other number in " + numOther + " is " + everyOther(numOther));
        //Asks the user for a number and then sends it to the everyOther function
        //Prints out a clear statement of what the sum of every other number in the inputted number is 

        System.out.println("Please enter a word and I will return it in reverse: ");
        String reverseMe = sc2.nextLine();
        System.out.println("The word " + reverseMe + " in reverse is " + reverse(reverseMe));
        //Asks the user for a word and then sends that word to the reverse function
        //Prints out a clear statement of what the inputted word is in reverse
    
        System.out.println("Please enter a word and I will capitalize every other letter: ");
        String capOther = sc2.nextLine();
        System.out.println("Every other letter in " + capOther + " capitalized is " + capEveryOther(capOther));

    }
    public static int factorial(int x)
    {
        int total = 1;
        for(int i = 1; i <= x; i++)
        {
            total *= i;
        }
        return total;
        //Finds the factorial by multiplying every number from 1-what the user inputs
        //Returns the factorial
    }
    public static int everyOther(int x)
    {
        int total = 0;
        for(int i = 1; i <= x; i+=2)
        {
            total += i;
        }
        return total;
        //Finds the sum of every other number in the inputted number
        //It does this by increasing a for loop from 1-the number by 2
        //Returns the total
    }
    public static String reverse(String words)
    {
        String reversed = "";
        for(int i = words.length()- 1; i >= 0; i--)
        {
            reversed += words.charAt(i);
        }
        return reversed;
        //Finds the reverse of a word by iterating through a string in reverse
        //Adds each letter to a different word 
        //Returns that word
    }
    public static String capEveryOther(String words)
    {
        String capitalized = "";
        for(int i = 0; i < words.length(); i++)
        {
            if(i%2 == 1 && !Character.isUpperCase(words.charAt(i)))
            {
                char upMe = words.charAt(i);
                capitalized += Character.toUpperCase(upMe);
                continue;
            }
            else if(i%2 == 0 && Character.isUpperCase(words.charAt(i)))
            {
                char lowMe = words.charAt(i);
                capitalized += Character.toLowerCase(lowMe);
                continue;
            }
            capitalized += words.charAt(i);

        }
        return capitalized;
        //This function checks every other letter to see if it's capitalized already
        //If it's not, capitalize that letter and add it to a blank string
        //If the letter is capitalized and in opposite spots (as in not every other)
        //Then it makes it lowercase and adds it to the blank string
        //Returns the word with every other letter capitalized
    }
    
}
