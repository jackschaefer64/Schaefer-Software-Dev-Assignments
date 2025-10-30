public class Enemy {
    int health;
    int damage;

    public Enemy(int h, int d)
    {
        health = h;
        damage = d;
    }
    void attack()
    {
        System.out.println("The enemy attacks!");
    }
    //This is the main enemy class. It has health and damage variables that it gives to any other classes that inherit it.
    //A basic enemy has a basic attack message
}
