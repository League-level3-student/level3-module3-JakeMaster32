package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double pop = getPopulation();
		double gr = getGrowthRate();
		double total = pop*gr;
		for (int x = 0; x<pop; x++) {
			total = total +0.5;
		}
		return total;
	}

}
