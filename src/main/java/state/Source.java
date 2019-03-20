package state;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class Source {
    private static final LinkedList<Event> events = new LinkedList<>(Arrays.asList(
            Event.PLAYPAUSE,
            Event.INSERTTAPE,
            Event.PLAYPAUSE,
            Event.STOP,
            Event.PLAYPAUSE,
            Event.FF,
            Event.PLAYPAUSE,
            Event.STOP,
            Event.FF,
            Event.PLAYPAUSE,
            Event.STOP,
            Event.OFF
    ));

    public static Event getEvent() {
        return events.removeFirst();
    }
}
