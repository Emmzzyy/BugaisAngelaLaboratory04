/**
 * Mage class - a magical spellcaster with mana-based abilities.
 * Implements CasterAbility interface to provide spell casting functionality.
 */
public class Mage extends GameCharacter implements CasterAbility {
    private int mana;
    
    /**
     * Constructs a new Mage with specified attributes.
     * 
     * @param name The mage's name
     * @param hp The mage's health points
     * @param attackPower The mage's attack power
     * @param mana The mage's mana points for casting spells
     */
    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = Math.max(0, mana);
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " casts a magic missile for " + getAttackPower() + " arcane damage!");
    }
    
    @Override
    public String describeClass() {
        return getName() + " the Mage - HP: " + getHp() + ", Attack: " + getAttackPower() + 
               ", Mana: " + mana;
    }
    
    @Override
    public void castSpell(String spellName) {
        int manaCost = 20;
        if (mana >= manaCost) {
            mana -= manaCost;
            System.out.println(getName() + " casts " + spellName + " consuming " + manaCost + " mana!");
            System.out.println("The spell erupts with magical energy!");
        } else {
            System.out.println(getName() + " doesn't have enough mana to cast " + spellName + "!");
        }
    }
    
    @Override
    public int getMana() {
        return mana;
    }
    
    // Getter and setter for mana
    public void setMana(int mana) {
        this.mana = Math.max(0, mana);
    }
}
