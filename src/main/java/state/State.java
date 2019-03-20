package state;

public interface State {
    State handle(Event e);
}
