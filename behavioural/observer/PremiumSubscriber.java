package behavioural.observer;

import java.util.Arrays;
import java.util.List;

public class PremiumSubscriber implements Subscriber {
    YouTubeChannel youTubeChannel;

    public PremiumSubscriber(YouTubeChannel youTubeChannel) {
        this.youTubeChannel = youTubeChannel;
        //whenever new subscriber object is being created
        // its reference is collected by the YouTube channel's
        //subscriberList field
        this.youTubeChannel.registerSubscriber(this);
    }

    @Override
    public void getUpdate() {
        List<String> videoTitles = this.youTubeChannel.getVideoTitles();
        System.out.println(this.getClass().getSimpleName() + " :> " + Arrays.toString(videoTitles.toArray()));
    }
}
