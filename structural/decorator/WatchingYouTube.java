package structural.decorator;

public class WatchingYouTube extends Activity {
    public WatchingYouTube() {
    }

    public WatchingYouTube(Activity activity) {
        super(activity);
    }

    public void detail() {
        System.out.println("這部影片可是今天的發燒啊");
    }

    @Override
    public void commute() {
        super.commute();
        System.out.println("專注在 YT 上");
        detail();
    }
}