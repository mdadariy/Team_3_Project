package Model;

/**
 * Created by dinever on 9/24/15.
 */

public class Family {

    private String id;
    private Individual husband;
    private Individual wife;
    private String husbandId;
    private String wifeId;
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

    public String getHusbandId() {
        return husbandId;
    }

    public void setHusbandId(String husbandId) {
        this.husbandId = husbandId;
    }

    public String getWifeId() {
        return wifeId;
    }

    public void setWifeId(String wifeId) {
        this.wifeId = wifeId;
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

    public void setHusband(Individual husband) {
        this.husband = husband;
    }

    public void setWife(Individual wife) {
        this.wife = wife;
    }

    public Individual getHusband() {
        return this.husband;
    }

    public Individual getWife() {
        return this.wife;
    }
}
