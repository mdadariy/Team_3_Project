package test;

import java.util.List;

/**
 * Created by Shreyansh on 08-10-2015.
 */
public class comparenames {
    public static boolean check(List<String> nameStringList) {

        for (int i = 0; i < nameStringList.size() - 1; i++) {
            for (int j = i + 1; j < nameStringList.size(); j++) {
                if (!nameStringList.get(i).equals(nameStringList.get(j)))
                    return false;
            }
        }
        return true;
    }
}
