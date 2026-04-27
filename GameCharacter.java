/**
 * Abstract base class for all game characters in the RPG system.
 * Provides common functionality and defines the contract that all character classes must implement.
 */
public abstract class GameCharacter {
    private String name;
    private int hp;
    private int attackPower;
    
    /**
     * Constructs a new GameCharacter with specified attributes.
     * 
     * @param name The character's name
     * @param hp The character's health points
     * @param attackPower The character's attack power
     */
    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = Math.max(0, hp);
        this.attackPower = Math.max(0, attackPower);
    }
    
    /**
     * Allows the character to rest and restore health points.
     * Restores a fixed amount of 20 HP.
     */
    public void rest() {
        this.hp += 20;
        System.out.println(name + " rests and recovers 20 HP.");
    }
    
    /**
     * Defines how this character attacks.
     * Must be implemented by all concrete subclasses.
     */
    public abstract void attack();
    
    /**
     * Returns a description of this character's class and abilities.
     * Must be implemented by all concrete subclasses.
     * 
     * @return A string describing the character's class
     */
    public abstract String describeClass();
    
    // Getters and setters with encapsulation
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }
    
    public int getAttackPower() {
        return attackPower;
    }
    
    public void setAttackPower(int attackPower) {
        this.attackPower = Math.max(0, attackPower);
    }
}
