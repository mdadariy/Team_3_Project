package Test;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dinever on 10/8/15.
 */
public class ParentsNotTooOld {
    public static void compare(String child, String father, String mother) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

            Date childBirthDate = format.parse(child);
            Date fatherBirthDate = format.parse(father);
            Date motherBirthDate = format.parse(mother);

            long diffChildAndFather = childBirthDate.getTime() - fatherBirthDate.getTime();
            long diffChildAndMother= childBirthDate.getTime() - motherBirthDate.getTime();
            long diffYearChildAndFather = diffChildAndFather / (60 * 60 * 1000 * 24 * 365);
            long diffYearChildAndMother = diffChildAndMother / (60 * 60 * 1000 * 24 * 365);
            if (diffYearChildAndFather > 80)
                System.out.println("Error: Father should be less than 80 years old than child.");
            if (diffYearChildAndMother > 60)
                System.out.println("Error: Mother should be less than 60 years old than child.");
        } catch (Exception ex) {

        }
    }
}
