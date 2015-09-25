import Model.Individual;
import Processor.ParseData;
import java.lang.Exception;

import Test.*;

public class readfile {
	public static void main(String[] args) {
		String filename = "My-Family-11-Sep-2015.ged";
		ParseData p = new ParseData();
		try {
			p.readFile(filename);
			for (int i = 0; i < p.individuals.size(); i++) {
				Individual ind = p.individuals.get(i);
				System.out.println("ID: " + ind.getId());
				System.out.println("Given Name: " + ind.getGivenName());
				System.out.println("Family Name: " + ind.getSurName());
				System.out.println("Sex: " + ind.getSex());
				System.out.println("Birth Date: " + ind.getBirthDate());
				if (ind.getDeathDate() != null) {
					System.out.println("Death Date: " + ind.getDeathDate());
				}

				UnitId.checkUniqueId(ind, p.individuals);
				// This is the part that individuals can be tested.
				System.out.println();
			}
		} catch (Exception e) {
		}
	}
}