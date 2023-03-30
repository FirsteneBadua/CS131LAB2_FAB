/**
 * This class represents a wizard for
 * a D&D type game.
 * Implements the Lockable interface
 * which enforces the use of the
 * setKey(), isLocked(), lock(), and unlock() methods.
 * 
 * @version 1.0
 * Lab 2
 * CS131ON
 */
public class Wizard implements Lockable {

    private String name;
    private int health;
    private int key;
    private boolean locked;

    /**
     * End constructor to put object into consistent state
     */
    public Wizard() {
        setName("");
        setHealth(0);
        setKey(0);
        locked = false;
    }

    /**
     * Constructor to create object with common
     * usage. This is the preferred constructor.
     * @param name
     */
    public Wizard(String name) {
        setName(name);
        setHealth(100);
        setKey(0);
        locked = false;
    }

    /**
     * This method processes the
     * damage to the object when
     * it is hit by other objects
     * (e.g. weapons, lightening, etc.)
     * @param power
     */
    public void takeDamage(int power) {
        if (!isLocked()) {
            health -= power;
            if (health < 0) {
                health = 0;
            }
        }
    }

    /**
     * Getter for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for health
     * @return
     */
    public int getHealth() {
        return health;
    }

    /**
     * Setter for health
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Getter for the key
     * @return
     */
    public int getKey() {
        return key;
    }

    /**
     * Setter for the key
     * @param key
     */
    public void setKey(int key) {
        if (key > 0 && this.key == 0) {
            this.key = key;
        }
    }

    /**
     * Method to check if object is locked
     * @return true if object is locked, false otherwise
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Method to lock the object
     * It should pass in the key that matches the value of the key already set for the object.
     * If they match, then the value of locked should be set to true.
     * @param key
     */
    public void lock(int key) {
        if (this.key == key) {
            locked = true;
        }
    }

    /**
     * Method to unlock the object
     * It should pass the key that matches the value of the key already set for the object.
     * If they match, then the value of locked should be set to false.
     * @param key
     */
    public void unlock(int key) {
        if (this.key == key) {
            locked = false;
        }
    }

    @Override
    public String toString() {
        return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
    }

}
