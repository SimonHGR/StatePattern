package state;

public final class Empty implements State {
    private Empty() {}
    private static final State self = new Empty();
    public static State get() { return self; }

    @Override
    public State handle(Event e) {
        if (e == Event.INSERTTAPE) {
            System.out.println("Engaging tape");
            return Idle.get();
        }
        return this;
    }
}
