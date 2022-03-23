package privatemethod.in.interfaces.two;

public class Person implements Orderable<Person> {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }

}