import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        
        int[] myArray = {10, 3, 295, 38, 20, 3, 
                4, 267, 2445, 10, 5566, 87, 93, 
                    17, 10, 2, 87, 267, 3276, 3, 82};
        
        
        

        for(int i = 0; i < myArray.length; i++)
        {
            //First loop iterates through the length of the array 
            boolean counted = false;
            //This is a checker to make sure that we don't double count elements
            for(int k = 0; k < i; k++)
            {
                //This loop checks to see if we've already counted an element
                if(myArray[i] == myArray[k])
                {
                    counted = true;
                    break;
                }
            }
            
            if(counted == true)
            {
                //If the number was already counted then we move on
                continue;
            }
            int counter = 1;
            //A counter that keeps track of how many times a number appears
            for(int j = i+1; j < myArray.length; j++)
            {
                //Iterates through the length of myArray again but starts from the element after i
                if(myArray[i] == myArray[j])
                {
                    //Compares the element at position i to the element at position j
                    counter++;
                    //Increments counter by 1
                }
            }
            if(counter > 1)
            {
                //If the counter is greater than 1, it prints this message
                //The reason its greater than 1 is because it would print out all the numbers in the array
                //Greater than 1 ensures that it will only print duplicates
                System.out.println(myArray[i]+ " is in the array " + counter + " times");
            }
        }
        //This program loops through the array and then compares each element to every other element
        //If the number was not already counted, it adds 1 to the counter of how many times that number appears
        //Then prints out a statement
        

        //This assignment taught me how to loop through arrays and compare their elements
        //I also learned how to go between loops and use continue and break
        //This assignment also gave me better practice with booleans

       

        
    }
}
