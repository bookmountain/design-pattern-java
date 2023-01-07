package structural.proxy;

import java.util.HashMap;

public class AccessDataApp {
    private final AccessDataLibrary middleware;

    public AccessDataApp(AccessDataLibrary middleware) {
        this.middleware = middleware;
    }

    public void pushLaunchButton(User user, String target) {
        System.out.println("身為 " + user.getLevel() + "，嘗試取得 " + target + " 等級的資料");
        HashMap<String, User> targetData = null;

        if (target.contentEquals("operator")) {
            targetData = middleware.operatorUsers(user.getLevel());
        } else if (target.contentEquals("audit")) {
            targetData = middleware.auditUsers(user.getLevel());
        } else if (target.contentEquals("admin")) {
            targetData = middleware.adminUsers(user.getLevel());
        }
        System.out.println("\n---系統顯示---");
        if (targetData.size() == 0) {
            System.out.println("權限不符合");
        } else {
            System.out.println("人員姓名： " + user.getName() + " ，身份： " + user.getLevel() + " ，順利取得 " + target + " 等級的資料");
            System.out.println("人員清單:");

            for (User listUser : targetData.values()) {
                System.out.println(listUser.getId() + " " + listUser.getName() + " " + listUser.getLevel());
            }
        }

        System.out.println("---系統關閉---\n");
    }
}
