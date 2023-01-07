package structural.proxy;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

public class AccessData implements AccessDataLibrary {
    private final HashMap<String, User> adminData = new HashMap<>();
    private final HashMap<String, User> auditData = new HashMap<>();
    private final HashMap<String, User> operatorData = new HashMap<>();

    public AccessData() throws IOException, ParseException {
        for (int i = 0; i < 3; i++) {
            String id = RandomID.exec(5);
            String name = NameSelector.exec();
            adminData.put(name, new User(id, name, "admin"));
        }

        for (int i = 0; i < 5; i++) {
            String id = RandomID.exec(7);
            String name = NameSelector.exec();
            auditData.put(name, new User(id, name, "audit"));
        }

        for (int i = 0; i < 10; i++) {
            String id = RandomID.exec(10);
            String name = NameSelector.exec();
            operatorData.put(name, new User(id, name, "operator"));
        }
    }

    @Override
    public HashMap<String, User> operatorUsers(String token) {
        return operatorData;
    }

    @Override
    public HashMap<String, User> auditUsers(String token) {
        return auditData;
    }

    @Override
    public HashMap<String, User> adminUsers(String token) {
        return adminData;
    }
}