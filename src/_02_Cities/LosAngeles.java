package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double pop = getPopulation();
		double gr = getGrowthRate();
		double total = pop*gr*(gr*0.5);
		return total;
	}
	
}
