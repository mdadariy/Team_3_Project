package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mukta on 9/28/15.
 */
public class CompareBirthWithMarriage {
    public static boolean compare (String birthDateString, String marriageDateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date birthDate = format.parse(birthDateString);
        Date marriageDate = format.parse(marriageDateString);

        if (birthDate.compareTo(marriageDate) == 1) {
            System.out.println("Error: Birth date should be before the marriage date.");
            return true;
        } else {
            return false;
        }
    }
}
