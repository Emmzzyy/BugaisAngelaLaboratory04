# RPG Character Class System

A Java implementation demonstrating object-oriented programming concepts including inheritance, abstract classes, interfaces, and polymorphism.

## Project Structure

- `GameCharacter.java` - Abstract base class for all characters
- `Warrior.java` - Concrete subclass implementing Defendable interface
- `Mage.java` - Concrete subclass implementing CasterAbility interface  
- `Archer.java` - Concrete subclass with ranged combat abilities
- `Defendable.java` - Interface for defensive capabilities
- `CasterAbility.java` - Interface for spell casting abilities
- `Main.java` - Driver class demonstrating all functionality

## Key Features Demonstrated

### Abstract Class (GameCharacter)
- 2 abstract methods: `attack()`, `describeClass()`
- 1 concrete method: `rest()`
- Private fields with encapsulation (name, hp, attackPower)
- Proper constructor with validation

### Interfaces
- `Defendable`: `block()`, `getDefenseRating()`
- `CasterAbility`: `castSpell()`, `getMana()`

### Concrete Classes
- **Warrior**: Implements Defendable, has armorRating field
- **Mage**: Implements CasterAbility, has mana field
- **Archer**: Has arrowCount field with custom restock method

### OOP Concepts
- **Inheritance**: All subclasses extend GameCharacter
- **Method Overriding**: @Override used on all abstract methods
- **Polymorphism**: ArrayList<GameCharacter> stores mixed types
- **Interface Implementation**: Warrior and Mage implement different interfaces
- **Encapsulation**: All fields private with getters/setters
- **Instanceof Checks**: Downcasting for interface-specific methods

## Running the Program

```bash
javac *.java
java Main
```

## Sample Output

The program demonstrates:
1. Character creation and polymorphic processing
2. Interface-specific actions (spell casting, blocking)
3. Subclass-specific methods (arrow restocking)
4. Party summary statistics and readiness assessment


