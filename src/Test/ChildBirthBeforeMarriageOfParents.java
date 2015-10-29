package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dinever on 10/8/15.
 * User Story 9
 */
public class ChildBirthBeforeMarriageOfParents {
        public static boolean compare (String childBirthDateString, String parentsMarriageDateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date childBirthDate = format.parse(childBirthDateString);
        Date parentsMarriageDate = format.parse(parentsMarriageDateString);

        if (childBirthDate.compareTo(parentsMarriageDate) == 1) {
            System.out.println("Error: Child birth date should not be before marriage date of parents.");
            return true;
        } else {
            return false;
        }

    }
}
