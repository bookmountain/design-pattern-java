package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class MusicSimulatorCareTaker {
    private List<MusicSimulatorMemento> saves = new ArrayList<>();

    public MusicSimulatorMemento getUndo() {
        if (saves.isEmpty()) {
            return null;
        } else {
            return saves.get(saves.size() - 1);
        }
    }

    public void setSave(MusicSimulatorMemento memento) {
        saves.add(memento);
    }
}