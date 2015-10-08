package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mukta on 10/8/15.
 * User Story 7
 */
public class MarriageBeforeDeath{
    public static boolean compare (String marriageDateString, String deathDateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date marriageDate = format.parse(marriageDateString);
        Date divorceDate = format.parse(deathDateString);

        if (marriageDate.compareTo(divorceDate) == 1) {
            System.out.println("Error: Marriage date is after the Death date.");
            return true;
        } else {
            return false;
        }

    }
}