public class Goblin extends Enemy{

    public Goblin(int h, int d)
    {
        super(h, d);
    }
    //Inherits damage and health from the main Enemy class
    void attack()
    {
        System.out.println("The goblin gobbles!");
    }

    //This is a goblin enemy that extends from the enemy class. It has it's own attack message
}
