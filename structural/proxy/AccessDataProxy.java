package structural.proxy;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

public class AccessDataProxy implements AccessDataLibrary {
    private final AccessData accessData;

    public AccessDataProxy() throws IOException, ParseException {
        this.accessData = new AccessData();
    }

    @Override
    public HashMap<String, User> operatorUsers(String token) {
        if (token.contentEquals("operator") || token.contentEquals("audit") || token.contentEquals("admin")) {
            return accessData.operatorUsers("PASS");
        } else {
            return new HashMap<>();
        }
    }

    @Override
    public HashMap<String, User> auditUsers(String token) {
        if (token.contentEquals("audit") || token.contentEquals("admin")) {
            return accessData.auditUsers("PASS");
        } else {
            return new HashMap<>();
        }
    }

    @Override
    public HashMap<String, User> adminUsers(String token) {
        if (token.contentEquals("admin")) {
            return accessData.adminUsers("PASS");
        } else {
            return new HashMap<>();
        }
    }
}
