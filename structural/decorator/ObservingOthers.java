package structural.decorator;

public class ObservingOthers extends Activity {
    public ObservingOthers() {
    }

    public ObservingOthers(Activity activity) {
        super(activity);
    }

    public void alert() {
        System.out.println("警戒中");
    }

    @Override
    public void commute() {
        super.commute();
        alert();
        System.out.println("觀察他人的衣著、行為");
    }
}
