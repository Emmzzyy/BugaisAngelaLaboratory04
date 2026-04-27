/**
 * Warrior class - a melee fighter with defensive capabilities.
 * Implements Defendable interface to provide blocking functionality.
 */
public class Warrior extends GameCharacter implements Defendable {
    private int armorRating;
    
    /**
     * Constructs a new Warrior with specified attributes.
     * 
     * @param name The warrior's name
     * @param hp The warrior's health points
     * @param attackPower The warrior's attack power
     * @param armorRating The warrior's armor rating for defense
     */
    public Warrior(String name, int hp, int attackPower, int armorRating) {
        super(name, hp, attackPower);
        this.armorRating = Math.max(0, armorRating);
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " swings their mighty sword for " + getAttackPower() + " damage!");
    }
    
    @Override
    public String describeClass() {
        return getName() + " the Warrior - HP: " + getHp() + ", Attack: " + getAttackPower() + 
               ", Armor: " + armorRating;
    }
    
    @Override
    public void block() {
        System.out.println(getName() + " raises their shield to block the attack!");
        System.out.println("Armor rating of " + armorRating + " provides excellent protection.");
    }
    
    @Override
    public int getDefenseRating() {
        return armorRating;
    }
    
    // Getter and setter for armorRating
    public int getArmorRating() {
        return armorRating;
    }
    
    public void setArmorRating(int armorRating) {
        this.armorRating = Math.max(0, armorRating);
    }
}
