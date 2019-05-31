package hero;

public class Gladiator extends Hero{
	
	public Gladiator(String name, int strength, int defense, int vitality) {
		super(name, strength, defense, vitality);
		

	}
	
	
	public String toString() {
		return "Name: " + this.name + "\nStrength: " + this.strength  + "\nDefense:  " + this.defense + "\nVitality: " + this.vitality;
	}
}
