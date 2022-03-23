package privatemethod.in.interfaces.two;

public class Test {
    public static void main(String[] args) {
        Person aurel = new Person("Aurel");
        Person hardy = new Person("Hardy");

        System.out.println("Laurel compareto Hardy : " + aurel.compareTo(hardy));
        System.out.println("Laurel >  Hardy : " + aurel.isAfter(hardy));
        System.out.println("Laurel <  Hardy : " + aurel.isBefore(hardy));
        System.out.println("Laurel == Hardy : " + aurel.isSameAs(hardy));
    }
}
