package behavioural.memento;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class MusicSimulator {
    private List<Solfege> inputs = new ArrayList<>();

    public void showInputs() {
        System.out.println("輸入的音階有：");

        for (Solfege solfege : inputs) {
            System.out.print(solfege.getName());
        }

        System.out.println("\n");
    }

    public void inputSolfege(Solfege solfege) {
        inputs.add(solfege);
    }

    public MusicSimulatorMemento saveInputs() {
        System.out.println("開始備份\n");
        StringBuilder stringBuilder = new StringBuilder();

        for (Solfege input : inputs) {
            stringBuilder.append(input.getName());
        }

        return new MusicSimulatorMemento(Base64.getEncoder().encodeToString(stringBuilder.toString().getBytes()));
    }

    public void restore(MusicSimulatorMemento musicSimulatorMemento) {
        System.out.println("開始還原\n");

        if (musicSimulatorMemento == null) {
            System.out.println("沒有記錄");
        } else {
            String decodedString = new String(Base64.getDecoder().decode(musicSimulatorMemento.getBackup().getBytes()));
            inputs.clear();

            for (String inputString : decodedString.split("")) {
                inputs.add(new Solfege(inputString));
            }
        }
    }
}
