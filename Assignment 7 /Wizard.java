public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t)
    {
        super(h, d);
        type = t;
    }
  //Inherits damage and health from the main enemy class, and adds the type descriptor
    void damageType()
    {
        if(type.toUpperCase().equals("FIRE"))
        {
            System.out.println("The wizard shoots a fireball!");
        }
        else if(type.toUpperCase().equals("ICE"))
        {
            System.out.println("The wizad shoots an icicle!");
        }
        else
        {
            System.out.println("The wizard fumbles his staff :/");
        }
    }
  //This is a wizard class that extends from enemy. There are two different types of wizards that can be created
}
