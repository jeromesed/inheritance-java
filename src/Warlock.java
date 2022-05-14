public class Warlock extends Character {
    Warlock(String name, int hp, int mp) {
        super(name, hp, mp);
    }
    // Display Stats
    public void Display(Character Display) {
        Display();
    }

    //Skills/Spells
    public void golem(Character enemyCharacter) {
        System.out.println(super.characterName + " attack ");
        int damagePoints = 50;
        damageTarget2(enemyCharacter, damagePoints);
    }
    public void mpCost(Character selfCharacter) {
        int manaCost = 50;
        WarmanaCost(selfCharacter, manaCost);
    }

    public void golemHeal(Character selfCharacter) {
        System.out.println(super.characterName + " Use Heavens Treatment +35HP, +35MP");
        int healthPoints = 35;
        int manaPoints = 35;
        recoverAlly(selfCharacter, healthPoints, manaPoints);
    }

    public void meteorRock(Character enemyCharacter) {
        System.out.println(super.characterName + " attack ");
        int damagePoints = 75;
        damageTarget2(enemyCharacter, damagePoints);
    }

    

}
