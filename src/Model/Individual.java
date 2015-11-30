package Model;

import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

//class for individual
public class Individual implements Comparable<Individual> {

    // the info list for individual
    private String id;
    private String name;
    private String givenName;
    private String surName;
    private char sex;
    private String birthDate;
    private String deathDate;

    private Individual mother;
    private Individual father;

    private Individual spouse;

    public Individual getSpouse() {
        return this.spouse;
    }

    public void setSpouse(Individual ind) {
        this.spouse = ind;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getId () {
        return this.id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setSurName (String name) {
        this.surName = name;
    }

    public String getSurName () {
        return this.surName;
    }

    public void setGivenName (String name) {
        this.givenName = name;
    }

    public String getGivenName () {
        return this.givenName;
    }

    public Individual getMother () { return this.mother; }

    public void setMother (Individual mother) { this.mother = mother; }

    public Individual getFather () { return this.father; }

    public void setFather (Individual father) { this.father= father; }

    public void setSex (char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return this.sex;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getDeathDate() {
        return this.deathDate;
    }

    public double getAge() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

            Date birthDate = format.parse(this.getBirthDate());
            Date currentDate = new Date();

            long diff = currentDate.getTime() - birthDate.getTime();
            long diffHours = diff / (60 * 60 * 1000);
            long diffDays = diffHours / 24; // 48
            double diffYear = diffDays / 365.0;
            return diffYear;
        } catch (Exception ex) {}
        return 0.0;
    }

    public int compareTo(Individual other)
    {
        if (this.getAge() > other.getAge())
            return 1;
        if (this.getAge() < other.getAge())
            return -1;
        else
            return 0;
    }

    public Individual getFathersFather() {
        if (this.getFather() != null) {
            if (this.getFather().getFather() != null)
                return this.getFather().getFather();
        }
        return null;
    }

    public Individual getFathersMother() {
        if (this.getFather() != null) {
            if (this.getFather().getFather() != null)
                return this.getFather().getFather();
        }
        return null;
    }

    public Individual getMothersFather() {
        if (this.getFather() != null) {
            if (this.getFather().getFather() != null)
                return this.getFather().getFather();
        }
        return null;
    }

    public Individual getMothersMother() {
        if (this.getFather() != null) {
            if (this.getFather().getFather() != null)
                return this.getFather().getFather();
        }
        return null;
    }
}

