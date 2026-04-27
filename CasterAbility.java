/**
 * Interface for characters that can cast magical spells.
 * Provides spell casting capabilities and mana management.
 */
public interface CasterAbility {
    /**
     * Casts a spell with the given name.
     * 
     * @param spellName The name of the spell to cast
     */
    void castSpell(String spellName);
    
    /**
     * Returns the current mana amount of this character.
     * 
     * @return The current mana value
     */
    int getMana();
}
