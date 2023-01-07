package structural.proxy;

import java.util.HashMap;

public interface AccessDataLibrary {
    HashMap<String, User> operatorUsers(String token);

    HashMap<String, User> auditUsers(String toke);

    HashMap<String, User> adminUsers(String token);
}