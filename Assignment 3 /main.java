import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        // Fixed by adding an "=" to the for loop conditions

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you the factorial: ");
        int fact = sc.nextInt();
        int total1 = 1;
        //here's a hint
        for (int i = 1; i <= fact; i++)
        {
            total1 *= i;
        }
        System.out.println(total1);
        //Created a scanner that asks the user for a number and then finds the factorial of that number through a for loop
        //Prints out the final factorial

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int everyOther = sc.nextInt();
        int total2 = 0;
        for(int i = 1; i <= everyOther; i+=2)
        {
            total2 += i;
        }
        System.out.println(total2);
        //No hint! what do you need to complete this task?
        //To do this problem, I copied what I used for problem 2, but instead of increasing i by 1 per loop, it increases by 2
        //This makes sure every other number is added together

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }
        //To fix the infinite loop, I made it so that run is set to false after the first loop

        //P5: Take a string from the user and print it in reverse!
        System.out.println("Problem 5");
        //hint
        String reversed = "";
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a word and I will reverse it: ");
        String words = sc2.nextLine();
        for(int i = words.length()- 1; i >= 0; i--)
        {
            reversed += words.charAt(i);
        }
        System.out.println(reversed);
        //To do this, I went back to my old work from Intro To Programming and googled the terminology needed to repeat the code
        //This code works by setting i to the length of the word (minus 1 so that we don't go over the length of the word)
        //Then the code goes down from the length of the code til it hits zero, and, on each loop, the letter at the given 
        //position is added to a different string

        //Essentially, it looks at each letter in the word, starting from the last letter, then adds that letter to a different variable
        
        System.out.println("Problem 6");
        System.out.println("Enter a word and I will print each letter one by one: ");
        String oneByOne = sc2.nextLine();
        for(int i = 0; i <= oneByOne.length()-1; i++)
        {
            System.out.println(oneByOne.charAt(i));
        }
        //To do this problem, I copied what I had for problem 5, but instead of setting i to the string's length,
        //I set the limit of the loop to that
        //On each loop, I check where in the word we are, and then print that letter on its own line using a println statement

        //Essentially, the code goes one by one through each letter in the given word, and prints the letter it is on
    }
}
