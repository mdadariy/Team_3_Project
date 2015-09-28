package Model;

/**
 * Created by dinever on 9/24/15.
 */

public class Family {

    private String id;
    private String husband;
    private String wife;
    private String type;
    private String weddingDate;
    private String divorceDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHusband() {
        return husband;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public String getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(String wdate) {
        this.weddingDate = wdate;
    }

    public String getDivorceDate() {
        return divorceDate;
    }

    public void setDivorceDate(String ddate) {
        this.divorceDate = ddate;
    }
}
