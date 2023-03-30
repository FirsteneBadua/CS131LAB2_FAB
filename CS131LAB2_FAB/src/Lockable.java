/**
 * This interface represents a lockable object for a D&D type game.
 */
public interface Lockable {
    
    /**
     * Method to set the key for the object
     * @param key
     */
    void setKey(int key);
    
    /**
     * Method to get the key for the object
     * @return
     */
    int getKey();
    
    /**
     * Method to lock the object
     * It should pass in the key that matches the value of the key already set for the object. 
     * If they match, then the value of locked should be set to true.
     * @param key
     */
    void lock(int key);
    
    /**
     * Method to unlock the object
     * It should pass the key that matches the value of the key already set for the object. 
     * If they match, then the value of locked should be set to false.
     * @param key
     */
    void unlock(int key);
    
    /**
     * Method to check if the object is locked
     * @return
     */
    boolean isLocked();
}