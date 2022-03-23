package privatemethod.in.interfaces.one;

public interface Message {

    public void add();


    public default void defaultOne() {
        System.out.println("defaultOne");
    }


    public default void defaultTwo() {
        System.out.println("defaultTwo");
    }



}
