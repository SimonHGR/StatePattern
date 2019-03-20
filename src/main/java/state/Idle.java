package state;

public class Idle implements State {
    private Idle() {}
    private static final State self = new Idle();
    public static State get() { return self; }

    @Override
    public State handle(Event e) {
        switch (e) {
            case PLAYPAUSE:
                System.out.println("Start playing electronics");
                return Playing.get();
            case FF:
                System.out.println("Start forward winding");
                return Winding.get();
            default:
                return this;
        }
    }
}
