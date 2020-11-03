package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double pop = getPopulation();
		double gr = getGrowthRate();
		double total = pop*gr;
		total = total + 1000000;
		return total;
	}
}
