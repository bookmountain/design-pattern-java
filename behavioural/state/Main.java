package behavioural.state;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        VideoGameController controller = new VideoGameController(hero);

        System.out.println("---嘗試基本按鈕---");
        standardOperation(controller);
        System.out.println("\n---按住按鈕 R---");
        controller.holdButtonR();
        standardOperation(controller);
        System.out.println("\n---放開按鈕 R---");
        controller.releaseButtonR();
        standardOperation(controller);
        System.out.println("\n---按住按鈕 L---");
        controller.holdButtonL();
        standardOperation(controller);
        System.out.println("\n---放開按鈕 L---");
        controller.releaseButtonL();
        standardOperation(controller);
    }

    private static void standardOperation(VideoGameController controller) {
        controller.pushButtonY();
        controller.pushButtonX();
        controller.pushButtonB();
        controller.pushButtonA();
        controller.pushButtonRightArrow();
        controller.pushButtonLeftArrow();
    }
}
