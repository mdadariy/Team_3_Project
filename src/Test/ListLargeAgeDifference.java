package Test;

/**
 * Created by Shreyansh on 08-10-2015.
 */
import Model.Family;

public class ListLargeAgeDifference {
    // User Story 17
    public static void check(Family fam) {
        if ((fam.getHusband().getAge() >= 2*fam.getWife().getAge())
                || (2*fam.getHusband().getAge() <= fam.getWife().getAge()))
        {
//            System.out.println(fam.getHusband().getAge());
//            System.out.println(fam.getWife().getAge());

            System.out.println("Error: Husband and Wife has large age difference. \nHusband: " + fam.getHusband().getName() +
                    "\t Wife: " + fam.getWife().getName());
        }
    }
}
