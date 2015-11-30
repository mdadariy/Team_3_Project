package Test;

import Model.Individual;

public class LessThan150YearsOld {
    public static void compare(Individual ind) {
        if (ind.getAge() > 150.0) {
            System.out.println("Error: Individual age greater than 150 years old.");
        }
    }
