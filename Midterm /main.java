import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {

        
        introDesign();
        //A little opening design welcoming the player
        double[] briefCaseValues = {0.01, 1, 5, 10, 25, 50, 75, 100,
                                    200, 300, 400, 500, 750, 1000, 5000,
                                    10000, 25000, 50000, 75000, 100000, 
                                    200000, 300000, 400000, 500000, 750000,
                                    1000000};
                                    //All the values that can be in each case
        List<Integer> caseBlackList = new ArrayList<Integer>();
        //A list that will be used to check if a case has already been chosen
        List<Double>caseValues = Shuffles(briefCaseValues);
        //Turns the briefCaseValues array into a list and then shuffles it
        int userFirstPick = firstPick();
        //Gets the users first case choice


        caseBlackList.add(userFirstPick);
        //Adds the users first case choice to the blacklist so that they cannot choose that case again
        int casesRemaining = 26;
        //Keeps track of how many cases are remaining for calculating the average
        Scanner asking = new Scanner(System.in);
        int response = 0;
        //Will be used to collect the users case number input
        int counter = 6;
        //Keeps track of how many cases the user can open at each step

        for(int i = 0; i < 6; i++) // 6 picks
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            //Asks the user to choose a case and then stores that choice
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
                //If the user inputs a case that was already chosen, repeat the question
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
                //Otherwise, prints out the value of the case chose, adds it to the blacklist, lowers the number of cases remaining by one
                //Sets the case value of the case chosen to 0 to help with averaging later
                //Lowers counter by one
            }
        }
        int averageRemaining = findAverage(caseValues, casesRemaining);
        //Finds the average of the case values
        boolean bankerAnswer = Banker(averageRemaining);
        //Either true or false depending on if the user said deal or no deal
        if(bankerAnswer == true)
        {
            //If the user says no deal, continue to the next bit of code
        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
            //If the user says deal, print how much they made from the deal and how much their case was
            //Ends the program
        }
        
        

        response = 0;
        counter = 5;
        for(int i = 0; i < 5; i++) //5 picks
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
            }
        }
        averageRemaining = findAverage(caseValues, casesRemaining);
        bankerAnswer = Banker(averageRemaining);
        if(bankerAnswer == true)
        {

        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
        }


        response = 0;
        counter = 4;
        for(int i = 0; i < 4; i++) //4 picks
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
            }
        }
        averageRemaining = findAverage(caseValues, casesRemaining);
        bankerAnswer = Banker(averageRemaining);
        if(bankerAnswer == true)
        {

        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
        }


        response = 0;
        counter = 3;
        for(int i = 0; i < 3; i++) //3 picks
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
            }
        }
        averageRemaining = findAverage(caseValues, casesRemaining);
        bankerAnswer = Banker(averageRemaining);
        if(bankerAnswer == true)
        {

        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
        }



        response = 0;
        counter = 2;
        for(int i = 0; i < 2; i++) //2 picks
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
            }
        }
        averageRemaining = findAverage(caseValues, casesRemaining);
        bankerAnswer = Banker(averageRemaining);
        if(bankerAnswer == true)
        {

        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
        }



        response = 0;
        counter = 1;
        for(int i = 0; i < 1; i++)  //1 pick
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
            }
        }
        averageRemaining = findAverage(caseValues, casesRemaining);
        bankerAnswer = Banker(averageRemaining);
        if(bankerAnswer == true)
        {
            
        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
        }



        response = 0;
        counter = 1;
        for(int i = 0; i < 1; i++) //1 pick
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
            }
        }
        averageRemaining = findAverage(caseValues, casesRemaining);
        bankerAnswer = Banker(averageRemaining);
        if(bankerAnswer == true)
        {

        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
        }



        response = 0;
        counter = 1;
        for(int i = 0; i < 1; i++) //1 pick
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
            }
        }
        averageRemaining = findAverage(caseValues, casesRemaining);
        bankerAnswer = Banker(averageRemaining);
        if(bankerAnswer == true)
        {
            
        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
        }



        response = 0;
        counter = 1;
        for(int i = 0; i < 1; i++)// 1 pick
        {
            System.out.println("Please choose a case (" + counter +  "):");
            response = asking.nextInt();
            if(caseBlackList.contains(response))
            {
                System.out.println("I'm sorry you already picked that case. Choose again: ");
                i--;
            }
            else
            {
                System.out.println("Case #" + response + " is: $" + caseValues.get(response-1));
                caseBlackList.add(response);
                casesRemaining--;
                caseValues.set(response-1, 0.0);
                counter--;
            }
        }
        averageRemaining = findAverage(caseValues, casesRemaining);
        bankerAnswer = Banker(averageRemaining);
        if(bankerAnswer == true)
        {

        }
        else
        {
            System.out.println("You accepted the deal for $" + averageRemaining +". Your case was worth $" + caseValues.get(userFirstPick-1));
            System.exit(0);
        }


        //The final choice and final deal
        boolean finalAnswer = finalChoice();
        if(finalAnswer == true) //If the user decided to keep the case, run this
        {
            System.out.println("You have chosen to keep your case. It was worth $" + caseValues.get(userFirstPick-1) + "!");
            //Prints the user's case's value with a little message
            System.exit(0);
        }
        else //If the user decided to pick the last case, run this
        {
            caseValues.set(userFirstPick-1, 0.0); 
            //Sets the users original case value to zero so we just get the final case's value
            double lastCaseValue = calcFinalValue(caseValues);
            System.out.println("You have chosen the final case. It was worth $" + lastCaseValue + "!");
            //Prints out the case's value with a little message
            System.exit(0);
        }
    }
    public static int firstPick() //Used to get the user's first case choice
    {
        Scanner askUser =  new Scanner(System.in);
        System.out.println("Please enter which case you want to choose!(1-26): ");
        int caseChoice = askUser.nextInt();
        return caseChoice;
        //Sets up a scanner and asks the user to input a number from 1-26
        //Returns that number
    }
    public static void introDesign() //Makes a small intro design
    {
        System.out.println("-------------------------------");
        System.out.println("| Welcome to Deal Or No Deal! |");
        System.out.println("-------------------------------\n");
    }
    public static List<Double> Shuffles(double[] values) //Shuffles a list
    {
        List<Double> caseValues = new ArrayList<Double>();
        for(int i = 0; i < values.length; i++)
        {
            caseValues.add(values[i]);
        }
        Collections.shuffle(caseValues); 
        return caseValues;
        //Turns the original array of values into a list and then shuffles that list
        //Returns the shuffled list
    }
    public static int findAverage(List<Double> caseValues, int remaining) //Finds the average of the cases remaining
    {
        int total = 0;
        for(int i = 0; i < caseValues.size(); i++)
        {
            total += caseValues.get(i);
        }
        total = total / remaining;
        return total;
        //Adds up the total of the values of the cases remaining and then averages it out
        //Returns that average
    }
    public static boolean Banker(int average) //Acts as the banker, asking questions and offering deals
    {
        Scanner bankerAsk = new Scanner(System.in);
        boolean continues = true;
        System.out.println("The banker is offering you a deal! He offers: $" + average);
        //Offers the user a deal that is equal to the average of the value of the remaining cases
        for(int i = 0; i < 1; i++)
        {
            System.out.println("Deal or No Deal?: ");
            String dealNoDeal = bankerAsk.nextLine();
            if(dealNoDeal.toUpperCase().equals("DEAL"))
            {
                continues = false;
                break;
                //If the user accepts the deal, returns a false
            }
            else if(dealNoDeal.toUpperCase().equals("NO DEAL"))
            {
                continues = true;
                break;
                //If the user rejects the deal, returns a true
            }
            else
            {
                System.out.println("That is not an option. Please reenter.");
                i--;
                //Repeats the question if the user's input is not recognized
            }
        }
        return continues;
        //Returns either true or false
        
    }
    public static boolean finalChoice()//Asks the user the final question
    {
        Scanner sc = new Scanner(System.in);
        boolean lastOne = false;
        for(int i = 0; i < 1; i++)
        {
            System.out.println("This is the final choice. Do you want to stick with your original case, or choose the last one?(Keep/trade):");
            String finalPick = sc.nextLine();
            if(finalPick.toUpperCase().equals("KEEP"))
            {
                lastOne = true;
                //The user kept their original case

            }
            else if(finalPick.toUpperCase().equals("TRADE"))
            {
                lastOne = false;
                //The user wants the final case
            }
            else
            {
                System.out.println("That is not an option. Please reenter.");
                i--;
                //Repeats the questionif the user's input is not recognized
            }
        }
        return lastOne;
    }
    public static double calcFinalValue(List<Double> caseValues) //Calculates the final value of the last case
    {
        double number = 0;
        for(int i = 0; i < caseValues.size(); i++)
        {
            number += caseValues.get(i);
        }
        //Simply adds up all the values of the remaining cases, which is only 1 at this point
        return number;
        //Returns that value
    }
}
