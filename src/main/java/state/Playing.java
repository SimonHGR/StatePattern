package state;

public class Playing implements State {
    private Playing() {}
    private static final State self = new Playing();
    public static State get() { return self; }

    @Override
    public State handle(Event e) {
        switch (e) {
            case PLAYPAUSE:
            case STOP:
                System.out.println("Stop playing electronics");
                return Idle.get();
            case FF:
                System.out.println("Start squeaky fast playing");
                return FastPlaying.get();
            default:
                return this;
        }
    }
}
