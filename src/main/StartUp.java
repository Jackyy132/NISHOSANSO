package main;

import hero.Gladiator;
import scanner.GodScanner;

public class StartUp {	
	public static void mainMenu() {
		String name = "";
		int strength = 1;
		int defense = 1;
		int vitality = 1;
		int startingSkillPoints = 9;
		String userChoice;
		System.out.println("Please enter a name for your gladiator: ");
		name = GodScanner.godScanner.nextLine();
		do {
			System.out.println("Name: " + name);
			System.out.println("A) Strength: " + strength);
			System.out.println("B) Defense:  " + defense);
			System.out.println("C) Vitality: " + vitality);
		
			System.out.println("You have '" + startingSkillPoints + "' skill points to use." );
			System.out.println("You cannot undo skill points");
			System.out.println("Which skill do you want to upgrade?");
			userChoice =  GodScanner.godScanner.nextLine().toUpperCase();
			
			switch(userChoice) {
			case "A":
				strength++;
				startingSkillPoints--;
				break;
			case "B":
				defense++;
				startingSkillPoints--;
				break;
			case "C":
				vitality++;
				startingSkillPoints--;	
				break;	
			default:
				System.out.println("I do not recognise that... please enter a character from the list");
				}
			}while(startingSkillPoints != 0);
		
		Gladiator g = new Gladiator(name, strength, defense, vitality);
		System.out.println(g);
	}
}
