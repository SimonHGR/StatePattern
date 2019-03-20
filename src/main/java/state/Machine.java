package state;

public final class Machine {
    private State state = Empty.get();

    public void machine() {
        Event ev;
        while ((ev = Source.getEvent()) != Event.OFF) {
            state = state.handle(ev);
        }
        System.out.println("Turning off.");
    }

    public static void main(String[] args) {
        new Machine().machine();
    }
}
