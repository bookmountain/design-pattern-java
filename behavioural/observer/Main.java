package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();
        new GenericSubscriber(youTubeChannel);
        new PremiumSubscriber(youTubeChannel);
        youTubeChannel.addVideo("End Game");
        youTubeChannel.addVideo("White Phoenix");
    }
}