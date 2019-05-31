package hero;

public abstract class Hero {
	String name;
	int strength;
	int defense;
	int vitality;
	int exp;
	int level; 
	int gold;
	
	public Hero(String name, int strength, int defense, int vitality) {
		this.name = name;
		this.strength = strength;
		this.defense = defense;
		this.vitality = vitality;
		this.exp = 0;
		this.level = 1;
		this.gold = 0;
	}
}
