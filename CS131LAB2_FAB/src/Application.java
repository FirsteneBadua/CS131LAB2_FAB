public class Application {
    
    public static void main(String[] args) {
        
        // Create a new Wizard object with name "Gandalf"
        Wizard wizard = new Wizard("Gandalf");
        
        // Print out the wizard's initial state
        System.out.println(wizard);
        
        // Set the wizard's health to 100
        wizard.setHealth(100);
        
        // Print out the wizard's state after setting health
        System.out.println(wizard);
        
        // Take 20 damage
        wizard.takeDamage(20);
        
        // Print out the wizard's state after taking damage
        System.out.println(wizard);
        
        // Set the wizard's key to 123
        wizard.setKey(123);
        
        // Lock the wizard with the key 123
        wizard.lock(123);
        
        // Try to take damage while locked
        wizard.takeDamage(10);
        
        // Print out the wizard's state after trying to take damage while locked
        System.out.println(wizard);
        
        // Unlock the wizard with the correct key
        wizard.unlock(123);
        
        // Take 10 more damage
        wizard.takeDamage(10);
        
        // Print out the wizard's final state
        System.out.println(wizard);
    }
    
}
