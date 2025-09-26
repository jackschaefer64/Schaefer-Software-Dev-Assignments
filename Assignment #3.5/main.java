
import java.util.Scanner;
class Debug {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly salary");
        int salary = sc.nextInt();
        System.out.println("Enter your yearly expenses");
        int expenses = sc.nextInt();
        System.out.println("Enter the amount of people in your household");
        int people = sc.nextInt();
        //Creates a scanner object called sc, then asks the user multiple questions
        //Each question's answers is stored in an integer

        int additionalTaxReduction = 0;
        for(int i = 0; i <= people; i++){
            additionalTaxReduction += 2;
        }
        //Increases a variable called additionalTaxReduction by 2 for every person 
        //The number of people is provided by the above scanner

        int taxReduction = 0;
        taxReduction += additionalTaxReduction;
        //stores additionalTaxReduction in a second variable called taxReduction

        if(salary > 50000 && people > 3){
            taxReduction += 10;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
            //If the user's salary is greater than 50000 and their house has more than 3 people in it, they get x reduction on their taxes
        } else if(salary > 30000 && people > 4){
            taxReduction += 9;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
            //If the user's salary is greater than 30000 and their house has more than 4 people in it, they get x reduction on their taxes
        } else if(salary > 70000 && people > 2){
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
            //If the user's salary is greater than 70000 and their house has more than 2 people in it, they get x reduction on their taxes
        } else {
            System.out.println("No applicable reduction on taxes found.");
            //Final check that provides a N/A statement if the user's information does not match the above if and else if statements
        }

        //The reason I commented where I did was because each comment explains the code directly above it
        //I commented on each section of code to make it as easy to read as possible
        //I did not explain the basics like "This line prints this" because that should be clear by both reading the code and running it
        


    }
}
