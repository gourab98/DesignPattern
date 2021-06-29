package solid.Single_Responsibility;

public class SRegistration {
    private String name;
    private int roll;
    private String classSection;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setClassSection(String classSection) {
        this.classSection = classSection;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getClassSection() {
        return classSection;
    }
}
