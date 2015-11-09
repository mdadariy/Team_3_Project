package Test;

import Model.Family;

import java.util.HashMap;

/**
 * Created by dinever on 11/9/15.
 */
public class MultipleBirthsLessThanFive {
    public static boolean compare(Family fam) {
        if (fam.getChildList().size() < 5) return true;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < fam.getChildList().size(); i++) {
            String childBirth = fam.getChildList().get(i).getBirthDate();
            if (!map.containsKey(childBirth))
                map.put(childBirth, 0);
            else {
                int count = map.get(childBirth);
                map.put(childBirth, ++count);
            }
            if (map.get(childBirth) >= 5) {
                System.out.println("Error: No more than five siblings should be born at the same time");
                return false;
            }
        }
        return true;
    }
}
