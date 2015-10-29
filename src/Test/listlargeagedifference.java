package test;

/**
 * Created by Shreyansh on 08-10-2015.
 */
public class listlargeagedifference {

// User Story 17

    if ((fam.getHusband().getAge() >= 2*fam.getWife().getAge())
            || (2*fam.getHusband().getAge() <= fam.getWife().getAge()))
    {
        System.out.println(fam.getHusband().getAge());
        System.out.println(fam.getWife().getAge());

        System.out.println("Husband and Wife has large age difference. \nHusband: " + fam.getHusband().getName() +
                "\t Wife: " + fam.getWife().getName());
    }
}
