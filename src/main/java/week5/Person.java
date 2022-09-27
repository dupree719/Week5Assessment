package week5;

public abstract class Person {

    private static String name;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;




    }
}
