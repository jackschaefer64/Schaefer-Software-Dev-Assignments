import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class App {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        int max = 0;
        for(int i = 0; i < stax.size(); i++)
        {
            //Loops through each element in the stack
            for(int j = 0; j < stax.size(); j++)
            {
                //Loops through each element in the stack a second time
                if(stax.get(i) > stax.get(j))
                {
                    //Compares the element at position i and the element at position j
                    if(stax.get(i) > max)
                    {
                        //if the element at position i is greater than max, max is now that element
                        max = stax.get(i);
                    }
                }
            }
        }
        System.out.println("Maximum value: " + max);
        //Prints out the max value of the stack
        int min = stax.get(0);
        //Sets the minimum to the first stack value
        for(int i = 0; i < stax.size(); i++)
        {
            //Loops through the stack
            for(int j = 0; j < stax.size(); j++)
            {
                //Loops through the stack again
                if(stax.get(i) < stax.get(j))
                {
                    //Compares the element at position i to the element at position j
                    if(stax.get(i) < min)
                    {
                        //If the element at i is less than the minimum, set the minimum to that value
                        min = stax.get(i);
                    }
                }
            }
        }
        System.out.println("Minimum value: " + min);
        //Prints out the min value of the stack
        System.out.println("Number of elements in stack: " + stax.size());
        //Prints out the number of elements in the stack
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);
        linky.add(60);

        int middle = linky.size() / 2;
        //Finds the middle element by getting the size and dividing it by 2
        System.out.println("Middle element: " + linky.get(middle));
        //Prints out the middle element


        Queue<String> prep1 = new LinkedList<>();
        Queue<String> prep2 = new LinkedList<>();
        Queue<String> prep3 = new LinkedList<>();

        int baseAmount1 = 3; 
        int baseAmount2 = 1;
        int baseAmount3 = 5;
        //Im creating a queue for prepping ingredients at a restaurant
        for(int i = 0; i< 5; i++)
        {
            prep1.add("Ground Beef (1 lb) " + (i + 1) );
        }
        for(int i = 0; i < 3; i++)
        {
            prep2.add("Buns (1 pack) " + (i + 1) );
        }
        for(int i = 0; i < 7; i++)
        {
            prep3.add("Potatoes (1 lb) " + (i + 1) );
        }

        amountLeft(prep1, baseAmount1, "Ground Beef");
        prep1.remove();
        prep1.remove();
        System.out.println("The oldest prepped ground beef is " + prep1.element());
        amountLeft(prep1, baseAmount1, "Ground Beef");
        prep1.remove();
        prep1.remove();
        prep1.remove();
        amountLeft(prep1, baseAmount1, "Ground Beef");

        //This is a system that adds a base amount of ingredients to different queues
        //Users can check the amount left using the method
        //The operations I used were .add(), .remove(), and .element()
        
    }
    public static void amountLeft(Queue<String> prep, int baseAmount, String ing)
    {
        if(prep.size() < baseAmount)
        {
            System.out.println("Running low on " + ing + ". Buy more!");
        }
        else if(prep.size() <= 0)
        {
            System.out.println("Out of " + ing + ". Buy immediately!");
        }
        else
        {
            System.out.println("Enough of " + ing + " in stock. Do not buy more!");
        }
        //Checks the size of the queue with the base amount we previously set
        //Prints a message based on the amount left
    }
}
