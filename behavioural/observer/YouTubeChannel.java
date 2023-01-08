package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Notifier {
    List<Subscriber> subscriberList;
    List<String> videoTitles;

    public YouTubeChannel() {
        subscriberList = new ArrayList<>();
        videoTitles = new ArrayList<>();

    }

    public void registerSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void addVideo(String title) {
        videoTitles.add(title);
        notifySubscribers();
    }

    public void notifySubscribers() {
        for (Subscriber sub : subscriberList) {
            sub.getUpdate();
        }
    }

    public List<String> getVideoTitles() {
        return videoTitles;
    }
}
