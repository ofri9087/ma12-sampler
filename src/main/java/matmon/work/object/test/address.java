package matmon.work.object.test;

public class address {

    public String city;
    private String street;
    private int buildingNum;

    public address(String city, String street, int buildingNum) {
        this.city = city;
        this.street = street;
        this.buildingNum = buildingNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(int buildingNum) {
        this.buildingNum = buildingNum;
    }
}
