package state;

public class FastPlaying implements State {
    private FastPlaying() {}
    private static final State self = new FastPlaying();
    public static State get() { return self; }

    @Override
    public State handle(Event e) {
        switch (e) {
            case FF:
            case PLAYPAUSE:
                System.out.println("Start normal-speed playing");
                return Playing.get();
            case STOP:
                System.out.println("Stop motors");
                return Idle.get();
            default:
                return this;
        }
    }
}
