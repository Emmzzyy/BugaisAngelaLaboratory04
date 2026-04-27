/**
 * Interface for characters that can defend and block attacks.
 * Provides defensive capabilities and rating information.
 * 
 */
public interface Defendable {
    /**
     * Performs a defensive action to block an incoming attack.
     */
    void block();
    
    /**
     * Returns the defense rating of this character.
     * 
     * @return The defense rating value
     */
    int getDefenseRating();
}
