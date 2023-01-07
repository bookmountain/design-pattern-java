package structural.proxy;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        AccessDataLibrary accessDataProxy = new AccessDataProxy();
        AccessDataApp app = new AccessDataApp(accessDataProxy);

        System.out.println("模擬不同權限的人員，取得資料的情境");
        System.out.println("情境一：Operator");
        User operator = new User(RandomID.exec(5), NameSelector.exec(), "operator");
        app.pushLaunchButton(operator, "admin");
        app.pushLaunchButton(operator, "audit");
        app.pushLaunchButton(operator, "operator");

        System.out.println("情境二：Audit");
        User audit = new User(RandomID.exec(5), NameSelector.exec(), "audit");
        app.pushLaunchButton(audit, "admin");
        app.pushLaunchButton(audit, "audit");
        app.pushLaunchButton(audit, "operator");

        System.out.println("情境三：Admin");
        User admin = new User(RandomID.exec(5), NameSelector.exec(), "admin");
        app.pushLaunchButton(admin, "admin");
        app.pushLaunchButton(admin, "audit");
        app.pushLaunchButton(admin, "operator");
    }
}
