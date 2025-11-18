class Person {
    private String privateInfo = "Private Info";
    protected String protectedInfo = "Protected Info";
    public String publicInfo = "Public Info";

    void showInfo() {
        System.out.println("Person Class:");
        System.out.println(privateInfo);
        System.out.println(protectedInfo);
        System.out.println(publicInfo);
    }
}

class Child extends Person {
    void displayInfo() {
        System.out.println("Child Class:");
        // System.out.println(privateInfo); // Not accessible
        System.out.println(protectedInfo); // Accessible
        System.out.println(publicInfo);    // Accessible
    }
}

// Main class renamed to AccessDemo
public class AccessDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.showInfo();

        Child child = new Child();
        child.displayInfo();
    }
}
