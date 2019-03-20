package state;

public class Winding implements State {
    private Winding() {}
    private static final State self = new Winding();
    public static State get() { return self; }

    @Override
    public State handle(Event e) {
        switch (e) {
            case PLAYPAUSE:
                System.out.println("Start playing electronics");
                return Playing.get();
            case FF:
            case STOP:
                System.out.println("Stop forward winding");
                return Idle.get();
            default:
                return this;
        }
    }
}
