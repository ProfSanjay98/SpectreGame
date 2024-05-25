public class Stats {
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int charisma;
	private int freePoints;

	public Stats() {
		this.strength = 10;
		this.dexterity = 10;
		this.constitution = 10;
		this.intelligence = 10;
		this.charisma = 10;
		this.freePoints = 6;	// TODO: Maybe increase?
	}

	// Getters & Setters
	public int getSTR() { return this.strength; }
	public int getDEX() { return this.dexterity; }
	public int getCON() { return this.constitution; }
	public int getINT() { return this.intelligence; }
	public int getCHA() { return this.charisma; }
	public int getFreePts() { return this.freePoints; }

	public void setSTR(int str) { this.strength = str; }
	public void setDEX(int dex) { this.dexterity = dex; }
	public void setCON(int con) { this.constitution = con; }
	public void setINT(int wis) { this.intelligence = wis; }
	public void setCHA(int cha) { this.charisma = cha; }
	public void setFreePts(int free) { this.freePoints = free; }


	public int increaseStat(String stat) {
		if (stat == "Strength") return this.strength++;
		if (stat == "Dexterity") return this.dexterity++;
		if (stat == "Constitution") return this.constitution++;
		if (stat == "Intelligence") return this.intelligence++;
		if (stat == "Charisma") return this.charisma++;
	}

	public int decreaseStat(String stat) {
		if (stat == "Strength") return this.strength--;
		if (stat == "Dexterity") return this.dexterity--;
		if (stat == "Constitution") return this.constitution--;
		if (stat == "Intelligence") return this.intelligence--;
		if (stat == "Charisma") return this.charisma--;
	}

	public int increaseFreePoints(int numPoints) { return this.freePoints += numPoints; }
	public int decreaseFreePoints(int numPoints) { return this.freePoints -= numPoints; }

	
}