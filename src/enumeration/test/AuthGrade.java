package enumeration.test;

import java.util.ArrayList;
import java.util.List;

public enum AuthGrade {
    GUEST(1, "손님", List.of(Menu.MAIN)),
    LOGIN(2,"로그인 회원", List.of(Menu.MAIN, Menu.EMAIL_MNG)),
    ADMIN(3, "관리자", List.of(Menu.MAIN, Menu.EMAIL_MNG, Menu.ADMIN));

    private final int level;
    private final String description;
    private final List<Menu> menuList;


    AuthGrade(int level, String description, List<Menu> menuList) {
        this.level = level;
        this.description = description;
        this.menuList = menuList;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }
}
