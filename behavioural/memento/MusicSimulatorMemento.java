package behavioural.memento;

public class MusicSimulatorMemento {
    private String backup;

    public MusicSimulatorMemento(String backup) {
        this.backup = backup;
    }

    public String getBackup() {
        return backup;
    }
}
