package Test;

import Model.*;

/**
 * Created by Mukta on 10/29/15.
 * User Story 16
 */
public class NoMarriagesToDescendants {
    public static boolean compare (Family fam) {
        for (int i = 0; i < fam.getChildIdList().size(); i++) {
            if (fam.getHusbandId().equals(fam.getChildIdList().get(i))) {
                System.out.println("Error: Mother married her child");
                return false;
            }
            if (fam.getWifeId().equals(fam.getChildIdList().get(i))) {
                System.out.println("Error: Husband married his child");
                return false;
            }
        }
        return true;
    }
}
