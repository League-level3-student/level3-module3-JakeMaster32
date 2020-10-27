package _01_AnimalFarm;

import javax.swing.JOptionPane;

public class Cow extends Animal{

	
	public void makeNoise() {
		
		System.out.println("Moo");
		
	}

	@Override
	public void eatFood() {
		System.out.println("The cow is eating grass");
		
	}

	

}
