package src.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mukta on 10/8/15.
 * User Story 10
 */
public class ChildBirthBeforeDeathOfMother {
    public static boolean compare(String birthDateString, String deathDateOfMotherString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date birthDate = format.parse(birthDateString);
        Date deathDate = format.parse(deathDateOfMotherString);

        if (birthDate.compareTo(deathDate) == 1) {
            System.out.println("Error:Child Birth is after parents death date.");
            return false;
        } else {
            return true;
        }

    }
}
