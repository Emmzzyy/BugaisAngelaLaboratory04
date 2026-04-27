/**
 * Archer class - a ranged combat specialist with arrow-based attacks.
 * Focuses on precision strikes from a distance.
 */
public class Archer extends GameCharacter {
    private int arrowCount;
    
    /**
     * Constructs a new Archer with specified attributes.
     * 
     * @param name The archer's name
     * @param hp The archer's health points
     * @param attackPower The archer's attack power
     * @param arrowCount The number of arrows the archer has
     */
    public Archer(String name, int hp, int attackPower, int arrowCount) {
        super(name, hp, attackPower);
        this.arrowCount = Math.max(0, arrowCount);
    }
    
    @Override
    public void attack() {
        if (arrowCount > 0) {
            arrowCount--;
            System.out.println(getName() + " fires a precise arrow for " + getAttackPower() + " damage!");
            System.out.println("Arrows remaining: " + arrowCount);
        } else {
            System.out.println(getName() + " is out of arrows and cannot attack!");
        }
    }
    
    @Override
    public String describeClass() {
        return getName() + " the Archer - HP: " + getHp() + ", Attack: " + getAttackPower() + 
               ", Arrows: " + arrowCount;
    }
    
    // Getter and setter for arrowCount
    public int getArrowCount() {
        return arrowCount;
    }
    
    public void setArrowCount(int arrowCount) {
        this.arrowCount = Math.max(0, arrowCount);
    }
    
    /**
     * Restocks the archer's arrow supply.
     * 
     * @param arrowsToAdd The number of arrows to add
     */
    public void restockArrows(int arrowsToAdd) {
        this.arrowCount += Math.max(0, arrowsToAdd);
        System.out.println(getName() + " restocks " + arrowsToAdd + " arrows. Total: " + arrowCount);
    }
}
