package src.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mukta on 9/28/15.
 */
public class CompareWithCurrentDate {
    public static boolean compare(String datesString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date dates = format.parse(datesString);

        Date currentDate = new Date();

        if (dates.compareTo(currentDate) == 1) {
            System.out.println("Error: All dates should be less than current dates");
            return false;
        } else {
            return true;
        }
    }
}
