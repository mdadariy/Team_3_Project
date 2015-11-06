package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import Model.Family;
import Model.Individual;

/**
 * Created by Mukta on 10/29/15.
 * User Story 15
 */
public class FewerThan15Siblings {
    public static boolean compare (Family fam) throws ParseException {
        if (fam.getChildList().size() >= 15) {
            System.out.println("Error: There should be fewer than 15 siblings in a family.");
            return false;
        }
        return true;
    }
}
