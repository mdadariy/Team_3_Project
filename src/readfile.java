import Model.Family;
import Model.Individual;
import Processor.ParseData;
import java.lang.Exception;

import Test.*;

public class readfile {
	public static void main(String[] args) {
		String filename = "My-family-11-Sep-2015.ged";
		ParseData p = new ParseData();
		try {
			p.readFile(filename);
			System.out.println("=== Individuals Information ===");
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
				if (ind.getDeathDate() != null) {
					CompareBirthDate.compare(ind.getBirthDate(), ind.getDeathDate());
				}
				// This is the part that individuals can be tested.
				System.out.println();
			}
			System.out.println("=== Families Information ===");
			for (int i = 0; i < p.families.size(); i++) {
				Family fam = p.families.get(i);
				System.out.println("Family ID: " + fam.getId());
				System.out.println("Family HUSBAND: " + fam.getHusband());
				System.out.println("Family Wife: " + fam.getWife());
				System.out.println("Family Wedding Date: " + fam.getWeddingDate());
				System.out.println("Family Divorce Date: " + fam.getDivorceDate());

				if (fam.getDivorceDate() != null && fam.getWeddingDate() != null) {
					Test.CompareDivorceMarriage.compare(fam.getWeddingDate(), fam.getDivorceDate());
				}
				System.out.println();


			}
		} catch (Exception e) {
		}
	}
}