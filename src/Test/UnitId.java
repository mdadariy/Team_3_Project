package Test;

import Model.Individual;
import java.util.List;

/**
 * Created by dinever on 9/24/15.
 */
public class UnitId {
    public static boolean checkUniqueId(Individual ind, List<Individual> individuals) {
        String indId = ind.getId();
        for (int i = 0; i < individuals.size(); i++) {
            String id = individuals.get(i).getId();
            if (!individuals.get(i).equals(ind) && id.equals(indId)) {
                System.out.println("Error: Individual has reduplicated ID.");
                return false;
            }
        }
        return true;
    }
}
