public class Player {
    private String playerName;
    private String playerRace;
    private String playerRaceAbility;
    // Resources Object --> Make Class, include max values
    // Stats Object --> Make Class
    // Inventory Object --> List of Items(needs Item class)? Or Map?
    // Skills Object
    // Essence Object
    // Compendium Object --> List of Monster objects for determining experience gained

    public Player(String name, String race) {
        this.playerName = name;
        this.playerRace = race;
		
		if (race.equals("Human")) this.playerRaceAbility = "Jack of All Trades";
		else if (race.equals("Dwarf")) this.playerRaceAbility = "Weapon Durabilty";
		else if (race.equals("Elf")) this.playerRaceAbility = "Elemental Affinity";
		// Maybe have an additional check to make an elemental affinity? --> Maybe do that in player setup?
		else if (race.equals("Barbarian")) this.playerRaceAbility = "Spirit Path";
		else if (race.equals("Beastperson")) this.playerRaceAbility = "Beast Soul";

        // Set stats to 10, with x free points
        // Initialize empty inventory, skills, essence, and compendium
    }

    // Getters & Setters --> Are some of these necessary since they won't change after game start?
    public String getName() { return this.playerName; }

    public String getRace() { return this.playerRace; }

    public String getAbility() { return this.playerRaceAbility; }

    // More Getters/Setters when other classes are created

    // Player Functions
    // Level Up --> Boolean check for exp/EXPCap which leads to level++, exp = -, EXPCap increased
    // Attack? 




}
