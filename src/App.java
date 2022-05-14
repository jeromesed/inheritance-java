public class App {//Main
    public static void main(String[] args) throws Exception {
        
        
        Wizard Merlin = new Wizard();
        Warlock Saruman = new Warlock("Warlock", 200, 105);
        Merlin.Display(); // Display Wizard Stats
        Saruman.Display(); // Display Warlock Stats

         //First Round 
         System.out.println();
        Merlin.fireStorm(Saruman); 
        Merlin.mpCost(Merlin); 
        Saruman.golem(Merlin); 
        Saruman.mpCost(Saruman); 

         //Second Round 
         System.out.println();
        Merlin.HealingWand(Merlin); 
        Saruman.golemHeal(Saruman); 

         //Third Round
         System.out.println();
        Merlin.meteor(Saruman); 
        Merlin.mpCost(Merlin); 
        Saruman.meteorRock(Merlin); 
        Saruman.mpCost(Saruman); 

        // -- Fourth Round --//
        System.out.println();
        Merlin.astral(Saruman); 
        Merlin.mpCost(Merlin); 
         

         Merlin.WoL(Saruman);

    }
}
