package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("Invalid argument");
        }
        if (name.isEmpty() || name == null || name.length() > 40 || age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid argument");
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
