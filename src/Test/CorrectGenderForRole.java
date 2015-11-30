package Test;

import Model.*;

/**
 * Created by Mukta on 11/26/15.
 * User Story 21
 */
public class CorrectGenderForRole {
        public static boolean compare (Model.Family fam){
            if (fam.getHusband().getSex() != 'M') {
                System.out.println("Error: Incorrect gender for husband.");
                return false;
            }
            if (fam.getWife().getSex() != 'F') {
                System.out.println("Error: Incorrect gender for wife.");
                return false;
            }
            return true;
        }
    }

