package Test;

import Model.Individual;

/**
 * Created by dinever on 11/30/15.
 */
public class ListOrphans {
    public static void list(Individual ind) {
        if (ind.getFather() != null && ind.getMother() != null)
            if (ind.getAge() <= 18.0 && ind.getFather().getDeathDate() != null && ind.getMother().getDeathDate() != null) {
                System.out.println("Name: " + ind.getName());
            }
    }
}
