package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		int pop = getPopulation();
		double gr = getGrowthRate();
		gr = gr*2;
		double total = pop*gr;
		
		
		return total;
	}

}
