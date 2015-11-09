import Model.Family;
import Model.Individual;
import Processor.ParseData;
import java.lang.Exception;
import java.util.Collections;
import java.util.List;

import Test.*;

public class readfile {
	public static void main(String[] args) {
		String filename = "My-Family-11-Sep-2015.ged";
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

				Test.UniqueID.checkUniqueId(ind, p.individuals);
				if (ind.getDeathDate() != null) {
					Test.BirthBeforeDeath.compare(ind.getBirthDate(), ind.getDeathDate());
				}

				if (ind.getBirthDate() != null) {
					Test.DateBeforeCurrentDate.compare(ind.getBirthDate());
				}
				// This is the part that individuals can be tested.
				System.out.println();
			}
			System.out.println("=== Families Information ===");
			for (int i = 0; i < p.families.size(); i++) {
				System.out.println("");
				Family fam = p.families.get(i);
				System.out.println("Family ID: " + fam.getId());
				System.out.println("Family HUSBAND: " + fam.getHusband().getName());
				System.out.println("Family Wife: " + fam.getWife().getName());
				System.out.println("Family Wedding Date: " + fam.getWeddingDate());
				System.out.println("Family Divorce Date: " + fam.getDivorceDate());
				for (int j = 0; j < fam.getChildList().size(); j++) {
					System.out.println("Family Child: " + fam.getChildList().get(j).getName());
				}

				if (fam.getDivorceDate() != null && fam.getWeddingDate() != null) {
					Test.MarriageBeforeDivorce.compare(fam.getWeddingDate(), fam.getDivorceDate());
				}

				if (fam.getHusband() != null && fam.getWeddingDate() != null)
					Test.BirthBeforeMarriage.compare(fam.getHusband().getBirthDate(), fam.getWeddingDate());

				if (fam.getWife() != null && fam.getWeddingDate() != null)
					Test.BirthBeforeMarriage.compare(fam.getWife().getBirthDate(), fam.getWeddingDate());

				if (fam.getHusband() != null && fam.getWeddingDate() != null)
					Test.MarriageAfter14.compare(fam.getHusband().getBirthDate(), fam.getWeddingDate());

				if (fam.getWife() != null && fam.getWeddingDate() != null)
					Test.MarriageAfter14.compare(fam.getWife().getBirthDate(), fam.getWeddingDate());

				if (fam.getHusband() != null && fam.getWeddingDate() != null)
					Test.MarriageBeforeDeath.compare(fam.getHusband().getBirthDate(), fam.getWeddingDate());

				if (fam.getWife() != null && fam.getWeddingDate() != null)
					Test.MarriageBeforeDeath.compare(fam.getWife().getBirthDate(), fam.getWeddingDate());

				if (fam.getWife() != null && fam.getWeddingDate() != null && fam.getWife().getDeathDate() != null)
					Test.DivorceBeforeDeath.compare(fam.getDivorceDate(), fam.getWife().getDeathDate());

				if (fam.getHusband() != null && fam.getWeddingDate() != null && fam.getHusband().getDeathDate() != null)
					Test.DivorceBeforeDeath.compare(fam.getDivorceDate(), fam.getHusband().getDeathDate());

				for (int j = 0; j < fam.getChildList().size(); j++) {
					if (fam.getChildList().get(j).getBirthDate() != null && fam.getWife().getBirthDate() != null)
						Test.ChildBirthBeforeDeathOfMother.compare(fam.getChildList().get(j).getBirthDate(), fam.getWife().getBirthDate());
				}

				for (int j = 0; j < fam.getChildList().size(); j++) {
					if (fam.getChildList().get(j).getBirthDate() != null && fam.getWeddingDate() != null)
						Test.ChildBirthBeforeMarriageOfParents.compare(fam.getChildList().get(j).getBirthDate(), fam.getWeddingDate());
				}

				for (int j = 0; j < fam.getChildList().size(); j++) {
					if (fam.getChildList().get(j).getBirthDate() != null && fam.getWife().getBirthDate() != null && fam.getHusband().getDeathDate() != null)
						Test.ParentsNotTooOld.compare(fam.getChildList().get(j).getBirthDate(), fam.getHusband().getBirthDate(), fam.getWife().getBirthDate());
				}

				CompareLastNames.check(fam);

				List<Individual> childList = fam.getChildList();
				Collections.sort(childList);
				for (int j = 0; j < fam.getChildList().size(); j++) {
					System.out.println("Family Siblings :" + childList.get(j).getName() + " Age: " + childList.get(j).getAge());
				}

				Test.ListLargeAgeDifference.check(fam);
				Test.FewerThan15Siblings.compare(fam);
				Test.NoMarriagesToDescendants.compare(fam);
				Test.MultipleBirthsLessThanFive.compare(fam);


				// User Story 17
//					Test.ListLargeAgeDifference.check(fam);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}