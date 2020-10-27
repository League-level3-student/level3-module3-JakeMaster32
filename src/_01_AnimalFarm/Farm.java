package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList <Animal> farm = new ArrayList <Animal>();
	farm.add(new Cow());
	farm.add(new Sheep());
	farm.add(new Pig());
	farm.add(new Pig());
	farm.add(new Chicken());
	farm.add(new Chicken());
	for (int x = 0; x<farm.size(); x++) {
		farm.get(x).makeNoise();
		farm.get(x).eatFood();
	}
}
}
