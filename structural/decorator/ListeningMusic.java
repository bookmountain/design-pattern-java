package structural.decorator;

public class ListeningMusic extends Activity {
    public ListeningMusic() {
    }

    public ListeningMusic(Activity activity) {
        super(activity);
    }

    public void feel() {
        System.out.println("這首歌真讚啊");
    }

    @Override
    public void commute() {
        super.commute();
        System.out.println("專注在聽音樂");
        feel();
    }
}
