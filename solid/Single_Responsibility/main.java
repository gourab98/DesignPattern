package solid.Single_Responsibility;

// to see all live valid template for the current context "Ctrl + j"

public class main {

    public static void main(String[] args) {

        SRegistration sRegistration = new SRegistration();

        sRegistration.setName("Apu");
        sRegistration.setRoll(50);
        sRegistration.setClassSection("Ten");

        System.out.println(sRegistration.getName());
        System.out.println(sRegistration.getRoll());
        System.out.println(sRegistration.getClassSection());
    }
}


