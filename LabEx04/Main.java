import java.util.ArrayList;

/**
 * Main driver class demonstrating the RPG Character Class System.
 * Shows polymorphism, inheritance, interfaces, and method overriding.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Create party members
        ArrayList<GameCharacter> party = new ArrayList<>();
        party.add(new Warrior("Aldric", 120, 18, 25));
        party.add(new Mage("Elara", 70, 30, 100));
        party.add(new Archer("Kael", 85, 22, 30));
        party.add(new Warrior("Borin", 100, 15, 30));
        party.add(new Mage("Lyra", 60, 25, 80));
        
        // 2. Polymorphic loop — all characters
        System.out.println("=== Party Roster ===");
        for (GameCharacter c : party) {
            System.out.println(c.describeClass());
            c.attack();
            c.rest();
            System.out.println();
        }
        
        // 3. Interface-specific actions
        System.out.println("=== Casters in the Party ===");
        for (GameCharacter c : party) {
            if (c instanceof CasterAbility) {
                CasterAbility caster = (CasterAbility) c;
                caster.castSpell("Fireball");
                System.out.println("Mana remaining: " + caster.getMana());
                System.out.println();
            }
        }
        
        System.out.println("=== Defenders in the Party ===");
        for (GameCharacter c : party) {
            if (c instanceof Defendable) {
                Defendable d = (Defendable) c;
                d.block();
                System.out.println("Defense rating: " + d.getDefenseRating());
                System.out.println();
            }
        }
        
        // 4. Subclass-specific actions using instanceof
        System.out.println("=== Archer-specific Actions ===");
        for (GameCharacter c : party) {
            if (c instanceof Archer) {
                Archer archer = (Archer) c;
                System.out.println(archer.getName() + " needs more arrows!");
                archer.restockArrows(10);
                System.out.println();
            }
        }
        
        // 5. Party summary
        System.out.println("=== Party Summary ===");
        int totalHp = 0;
        int casterCount = 0;
        int meleeCount = 0;
        
        for (GameCharacter c : party) {
            totalHp += c.getHp();
            if (c instanceof CasterAbility) {
                casterCount++;
            } else {
                meleeCount++;
            }
        }
        
        System.out.println("Total party members: " + party.size());
        System.out.println("Total party HP: " + totalHp);
        System.out.println("Casters: " + casterCount);
        System.out.println("Melee fighters: " + meleeCount);
        
        // Party readiness status
        boolean partyReady = totalHp >= 300 && casterCount >= 2 && meleeCount >= 2;
        System.out.println("Party readiness: " + (partyReady ? "READY FOR BATTLE!" : "NEEDS PREPARATION"));
        
        // Demonstrate polymorphic dispatch again after actions
        System.out.println("\n=== Final Party Status ===");
        for (GameCharacter c : party) {
            System.out.println(c.describeClass());
        }
    }
}
