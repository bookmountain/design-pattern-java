package behavioural.observer;

public interface Notifier {
    void registerSubscriber(Subscriber subscriber);

    void addVideo(String title);

    void notifySubscribers();
}
