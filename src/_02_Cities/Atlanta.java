package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		int pop = getPopulation();
		double gr = getGrowthRate();
		double tr = pop*gr;
		double totalTaxes = tr;
		for (int x = 0; x<pop; x++) {
			totalTaxes=totalTaxes+0.15;
		}
		System.out.println(totalTaxes);
		return totalTaxes;
	}

}
