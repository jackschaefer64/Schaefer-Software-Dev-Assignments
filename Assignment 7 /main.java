public class App {
    public static void main(String[] args) throws Exception {
        Enemy enemy1 = new Enemy(200, 25);
        enemy1.attack();

        Goblin goblin1 = new Goblin(100, 15);
        goblin1.attack();

        Wizard wizardFire = new Wizard(300, 50, "Fire");
        wizardFire.damageType();

        Wizard wizardIce = new Wizard(300, 50, "Ice");
        wizardIce.damageType();

        Wizard wizardFool = new Wizard(300, 50, "Fool");
        wizardFool.damageType();
    }
}
