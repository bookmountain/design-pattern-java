package behavioural.observer;

import java.util.Arrays;
import java.util.List;

public class GenericSubscriber implements Subscriber {
    YouTubeChannel youTubeChannel;

    public GenericSubscriber(YouTubeChannel youTubeChannel) {
        this.youTubeChannel = youTubeChannel;
        //when ever new subscriber object is being created
        // its reference is collected by the YouTube channel
        this.youTubeChannel.registerSubscriber(this);
    }

    @Override
    public void getUpdate() {
        List<String> videoTitles = this.youTubeChannel.getVideoTitles();
        System.out.println(this.getClass().getSimpleName() + " :> " + Arrays.toString(videoTitles.toArray()));
    }
}