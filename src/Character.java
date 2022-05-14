public class Character {
    public String characterName;
    public int healthPoints;
    public int manaPoints;

    Character() {
        characterName = "Merlin The Wizard";
        healthPoints = 200;
        manaPoints = 150;
    }

    Character(String name, int hp, int mp) {
        characterName = name;
        healthPoints = hp;
        manaPoints = mp;
    }

    
     //Method that displays the Name of the Character

    public void Display() {
        System.out.println("Character Name: " + characterName);
        System.out.println("Character HP: " + healthPoints);
        System.out.println("Character MP: " + manaPoints);
    }

   
     //method to Damage Target Character
     
    public void damageTarget1(Character enemyCharacter, int damagePoints, int damagePoints2) {
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Warlock HP Left = " + enemyCharacter.healthPoints);
    }

    //method to decrease mana
    public void WizmanaCost(Character selfCharacter, int manaCost) {
        selfCharacter.manaPoints -= manaCost;
        System.out.println("Wizard Mana Left = " + manaPoints);
    }
    public void WarmanaCost(Character selfCharacter, int manaCost) {
        selfCharacter.manaPoints -= manaCost;
        System.out.println("Warlock Mana Left = " + manaPoints);
    }
    
    //method to Damage Target Character
    public void damageTarget2(Character enemyCharacter, int damagePoints) {
      
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Merlin The Wizard HP Left = " + enemyCharacter.healthPoints);
    }
    
    // method to recover/regen hp and mana
    public void recoverEnemy(Character selfCharacter, int healthPoints, int manaPoints) {
        selfCharacter.healthPoints += healthPoints;
        selfCharacter.manaPoints += manaPoints;

        System.out.println("Enemy character HP Left = " + selfCharacter.healthPoints);
        System.out.println("Enemy character MP Left = " + selfCharacter.manaPoints);
    }

    public void recoverAlly(Character selfCharacter, int healthPoints, int manaPoints) {
        selfCharacter.healthPoints += healthPoints;
        selfCharacter.manaPoints += manaPoints;

        System.out.println("Ally character HP Left = " + selfCharacter.healthPoints);
        System.out.println("Ally character MP Left = " + selfCharacter.manaPoints);
    }

    
    // method who is the winner
    public void winLose(Character enemyCharacter) {
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Game Over!");
            System.out.println("Defeat");
        }
        return;
    };

   
   
}
