package Test;

import Model.*;

/**
 * Created by Mukta on 11/26/15.
 * User Story 21
 */
public class CorrectGenderForRole {
        public static boolean compare (Model.Family fam){
            if (fam.getHusband().getSex() != 'M' || fam.getWife().getSex() != 'F') {
                System.out.println("Error: Husband should be male and wife should be female");
                return false;
            }
            return true;
        }
    }

