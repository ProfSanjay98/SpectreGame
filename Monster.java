public class Monster {
	private String name;
	private String description; 	// For compendium obj
	private int floor; 	// Floor monster is available on --> might make array for multiple floors
	private Stats stats; // Initialized in each constructor??
	private Resources resources; 	// Initialized in constructor
	// Map for loot drops --> Item & double (percent chance of giving loot)
	// Skill objects for rune drop?
	
	// Constructors?? Or somehow reference a dictionary of Monsters?

	public Item dropLoot() {	// TODO: Lookup functions and figure out logic
		// Create random number
		// Check it against library --> whichever has the closest value?
		return loot;
	}

	public boolean giveEXP(Compendium playerCompendium) {
		// Check Compendium obj for entry --> loop through until found
		// return found ? true : false
	}

	

}