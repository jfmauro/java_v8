package privatemethod.in.interfaces.one;

public class MessageBean implements Message {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void defaultOne() {
        System.out.println("defaultOne in MessageBean");
    }
}
