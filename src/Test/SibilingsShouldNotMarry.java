package Test;

import Model.Family;
import Model.Individual;

/**
 * Created by dinever on 11/30/15.
 */
public class SibilingsShouldNotMarry {
    public static void compare(Family fam) {
        Individual husband = fam.getHusband();
        Individual wife = fam.getWife();
        if (husband.getFather() != null && wife.getFather() != null)
            if (husband.getFather() == wife.getFather()) {
                System.out.println("Error: The husband and wife are siblings.(They have the same father)");
            }
        if (husband.getMother() != null && wife.getMother() != null)
            if (husband.getMother() == wife.getMother()) {
                System.out.println("Error: The husband and wife are siblings.(They have the same mother)");
            }
    }
}
