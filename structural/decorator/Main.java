package structural.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("---第一位通勤者---");
        Commuter victor = new Commuter("維特", "臺北車站");
        Activity watchingYouTube = new WatchingYouTube();
        watchingYouTube.commuterDecorate(victor);
        Activity stopEverything = new StopEverything(watchingYouTube);
        stopEverything.commute();
        stopEverything.claimDestination();

        System.out.println("\n---第二位通勤者---");
        Commuter sandy = new Commuter("珊迪", "市府站");
        Activity listeningMusic = new ListeningMusic();
        listeningMusic.commuterDecorate(sandy);
        listeningMusic.commute();
        listeningMusic.claimDestination();

        System.out.println("\n---第三位通勤者---");
        Commuter johnny = new Commuter("強尼", "象山站");
        Activity inADaze = new InADaze();
        inADaze.commuterDecorate(johnny);
        Activity observingOthers = new ObservingOthers(inADaze);
        observingOthers.commute();
        observingOthers.claimDestination();
    }
}
