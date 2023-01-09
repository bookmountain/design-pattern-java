package behavioural.memento;

public class Main {

    public static void main(String[] args) {
        MusicSimulator musicSimulator = new MusicSimulator();

        // 輸入音階
        musicSimulator.inputSolfege(new Solfege("C"));
        musicSimulator.inputSolfege(new Solfege("D"));
        musicSimulator.inputSolfege(new Solfege("E"));
        musicSimulator.inputSolfege(new Solfege("F"));

        // 確認輸入的音階
        musicSimulator.showInputs();

        // 儲存
        MusicSimulatorCareTaker musicSimulatorCareTaker = new MusicSimulatorCareTaker();
        musicSimulatorCareTaker.setSave(musicSimulator.saveInputs());

        // 輸入新的音階
        musicSimulator.inputSolfege(new Solfege("G"));
        musicSimulator.inputSolfege(new Solfege("A"));
        musicSimulator.inputSolfege(new Solfege("B"));

        // 確認輸入的音階
        musicSimulator.showInputs();

        // 復原到上個狀態
        musicSimulator.restore(musicSimulatorCareTaker.getUndo());

        // 確認輸入的音階
        musicSimulator.showInputs();
    }

}