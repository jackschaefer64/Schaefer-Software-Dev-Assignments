import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        student alice = new student("Alice", "Freshman", 3.16, 100);
        student bob = new student("Bob", "Junior", 2.8, 101);
        student tom = new student("Tom", "Junior", 3.42, 102);
        student barb = new student("Barbara", "Sophomore", 3.44, 103);
        student bruce = new student("Bruce", "Senior", 3.88, 104);
        //Creates 5 different students
        student[] students = {alice, bob, tom, barb, bruce};
        //Creates an array of students for looping
        for(int i = 0; i < students.length; i++)
        {
            if(isHonors(students[i]) == true)
            {
                System.out.println(students[i].name + " is an honors student!");
            }
            else
            {
                System.out.println(students[i].name + " is not an honors student.");
            }
            //Loops through the array of students and checks each student's gpa
            //If their gpa is > 3.6 it prints out a statement that they are an honors student
            //If not, it says so
        }
        System.out.println("\n\n");
        //Makes a break in the print to make it clear the two sections of code
        int randomLunch = freeLunch();
        //Creates a random integer so that only one student is chosen every time the code is run
        for(int i = 0; i < students.length; i++)
        {
            if(students[i].id == randomLunch)
            {
                System.out.println(students[i].name + " will receive free lunch!");
            }
            else
            {
                System.out.println(students[i].name + " will not receive free lunch.");
            }
            //Loops through the array of students and checks if each student's id matches the randomized id
            //If so, print out a statement that they got free lunch
            //Otherwise, say so
        }

    }
    public static boolean isHonors(student person)
    {
        if(person.gpa > 3.6)
        {
            return true;
        }
        else
        {
            return false;
        }
        //Checks a student's gpa
        //If it is above 3.6, return true
        //Otherwise, return false
    }
    public static int freeLunch()
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100, 105);
        return randomNumber;
        //Creates a random integer from 100-105, which is the ids of the created students
        //Returns that random integer
    }
}
