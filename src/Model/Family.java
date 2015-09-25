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

    public void setId(String id) {
        this.id = id;
    }

    public String getId(String id) {
        return this.id;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }

    public String getHusband() {
        return this.husband;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public String getWife() {
        return this.wife;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

