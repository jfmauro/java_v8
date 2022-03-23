package privatemethod.in.interfaces.two;

public interface Orderable<T> extends Comparable<T> {

    // La méthode compareTo() est définie
    // dans la super-interface Comparable

    public default boolean isAfter(T other) {
        return compareTo(other) > 0;
    }

    public default boolean isBefore(T other) {
        return compareTo(other) < 0;
    }

    public default boolean isSameAs(T other) {
        return compareTo(other) == 0;
    }

}
