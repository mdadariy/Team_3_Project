package Test;

import Model.*;
/**
 * Created by Mukta on 11/26/15.
 * User Story 22
 */
public class ListLivingMarried {
    public static void compare (Model.Family fam){
        if (fam.getWife().getDeathDate() != null) {
            System.out.println("Living Wife Name: " + fam.getWife().getName());
        }
        if (fam.getHusband().getDeathDate() != null) {
            System.out.println("Living Husband Name: " + fam.getHusband().getName());
        }
    }
}
