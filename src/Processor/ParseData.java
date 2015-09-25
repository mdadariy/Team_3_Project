package Processor;

import Model.*;
import java.io.*;
import java.util.*;

public class ParseData {

    public List<Individual> individuals = new ArrayList<Individual>();
    public List<Family> families = new ArrayList<Family>();

    private String getArguments(String[] parseLine) {
        String arguments = "";
        for (int i = 2; i < parseLine.length; i++) {
            arguments = arguments + " " + parseLine[i];
        }
        return arguments.trim();
    }

    private String getId(String Id) {
        return Id.replace("@", "");
    }

    public void readFile(String file) throws IOException {

        FileInputStream fileInput = null;
        BufferedReader bufferRead = null;

        try {

            fileInput = new FileInputStream(file);
            bufferRead = new BufferedReader(new InputStreamReader(fileInput));

            String line = null;
            boolean isIndividule = false;
            boolean isBirthDate = true;
            Individual ind = null;
            Family fam = null;

            while ((line = bufferRead.readLine()) != null) {
                String[] parseLine = (line.split("\\s+"));
                int level = Integer.valueOf(parseLine[0]);
                String tag = parseLine[1];
                String arguments = (parseLine.length > 2) ? getArguments(parseLine) : null;
                if (level == 0) {
                    if ("INDI".equals(arguments)) {
                        ind = new Individual();
                        if (ind != null) {
                            ind.setId(getId(tag));
                            individuals.add(ind);
                            isIndividule = true;
                        }
                    } else if ("FAM".equals(arguments)) {
                        fam = new Family();
                        if (fam != null) {
                            families.add(fam);
                            fam.setId(getId(tag));
                            isIndividule = true;
                        }
                    } else {
                        isIndividule = false;
                    }
                }
                if (level == 1) {
                    if (isIndividule) {
                        if (tag.equals("NAME")) {
                            ind.setName(arguments);
                        }
                        if (tag.equals("SEX")) {
                            ind.setSex(arguments.charAt(0));
                        }
                        if (tag.equals("BIRT")) {
                            isBirthDate = true;
                        }
                        if (tag.equals("DEAT")) {
                            isBirthDate = false;
                        }
                    } else {
                    }
                }
                if (level == 2) {
                    if (isIndividule) {
                        if (tag.equals("SURN")) {
                            ind.setSurName(arguments);
                        }
                        if (tag.equals("GIVN")) {
                            ind.setGivenName(arguments);
                        }
                        if (tag.equals("DATE")) {
                            if (isBirthDate) ind.setBirthDate(arguments);
                            else ind.setDeathDate(arguments);
                        }
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File is not found!");
        }
    }

}
