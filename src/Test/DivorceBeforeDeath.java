package Test;

//Compare the divorse date and the death date
import java.text.ParseException ;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User Story 8
 */

public class DivorceBeforeDeath {
    public static boolean compare(String divorceDate, String deathDate)
    {
        try{

            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            Date DEAT = sdf.parse(deathDate);
            Date DIV= sdf.parse(divorceDate);

            //System.out.println(sdf.format(DEAT));
            //System.out.println(sdf.format(DIV));

            if(DIV.compareTo(DEAT)>0){
                System.out.println("Error: Divorce date is after Death Date which is not possible");
                return false;
            }else
            return true;

        }catch(ParseException e){
            e.printStackTrace();
            return true;
        }
    }
}
