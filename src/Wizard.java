public class Wizard extends Character {
    Wizard() {
        super();
    }
    //Skills/Spells of Wizard
    public void fireStorm(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName);
        int damagePoints = 50;
        damageTarget1(enemyCharacter, damagePoints, damagePoints);
    }

    public void mpCost(Character selfCharacter) {
        int manaCost = 50;
        WizmanaCost(selfCharacter, manaCost);
    }


    public void HealingWand(Character selfCharacter) {
        System.out.println(super.characterName + " Use Healing Wand");
        int healthPoints = 35;
        int manaPoints = 35;
        recoverEnemy(selfCharacter, healthPoints, manaPoints);
    }

    public void meteor(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName);
        int damagePoints = 75;
        damageTarget1(enemyCharacter, damagePoints);          
    }

    private void damageTarget1(Character enemyCharacter, int damagePoints) {
    }

    
    public void astral(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName);
        int damagePoints = 60;
        damageTarget1(enemyCharacter, damagePoints);
    }

    
    public void WoL(Character enemyCharacter) {
        winLose(enemyCharacter);
    }

    
}
