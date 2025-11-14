import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("file.txt");
        //Creates the file object
        String line = "";
        //Sets a blank string to hold the file text
        Integer counter = 0;
        //A counter to count how many lines there are
        Integer nameCounter = 0;
        //A counter to count how many names there are
        List<String> names = new ArrayList<String>();
        //A list to hold the names
        List<Double> numbers = new ArrayList<Double>();
        //A list to hold the GPAs


        try{
            //Try to read the file
            Scanner input = new Scanner(inputFile);
            //Creates a scanner object to read the file
            while(input.hasNext())
            {
                //Iterates through the entire file
                line = input.nextLine();
                //Sets the line variable to the next line in the file 
                counter++;
                //Increases the counter by 1
                if(counter % 2 == 0)
                {
                    //If the counter is even, it is a GPA
                    numbers.add(Double.parseDouble(line));
                    //Adds the GPA to the numbers list
                }
                else
                {
                    //If the counter is odd, it is a name
                    names.add(line);
                    //Adds the name to the names list
                    nameCounter++;
                    //Increases the name counter by 1
                }
            }
        } 
        catch(FileNotFoundException e)
        {
            //Catches the exception if the file is not found
            throw new RuntimeException(e);
        }
        for(int i = 0; i < names.size(); i++)
        {
            //Iterates through the names list which is the same size as the numbers list
            if(numbers.get(i) > 3.5)
            {
                //If the GPA is greater than 3.5, print out the name with a high GPA message
                System.out.println(names.get(i) + " has a high GPA");
            }
        }
        System.out.println("There are " + nameCounter + " names in the file");
        //Prints out how many names there are in the file


        //From doing this homework I learned how to read from a file using the scanner and then parse through that 
        //data using different lists
        //I also learned how to handle exceptions when dealing with files

        //I also learned that the AI of this program keeps trying to automatically write exactly what I'm thinking
        //This program was not created by AI I do not know how to turn it off
    }
}
