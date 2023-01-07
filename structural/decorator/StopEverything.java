package structural.decorator;

public class StopEverything extends Activity {
    public StopEverything() {
    }

    public StopEverything(Activity activity) {
        super(activity);
    }

    @Override
    public void commute() {
        super.commute();
        System.out.println("停止一切事物");
    }
}