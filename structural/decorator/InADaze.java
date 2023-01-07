package structural.decorator;

public class InADaze extends Activity {
    public InADaze() {
    }

    public InADaze(Activity activity) {
        super(activity);
    }

    public void dream() {
        System.out.println("似乎想到什麼，讓人想「A Ha」一下");
    }

    @Override
    public void commute() {
        super.commute();
        System.out.println("什麼都不想做，發呆中");
        dream();
    }
}
