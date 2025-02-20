package enumeration.test;

public enum Menu {
    MAIN("메인 화면"),
    EMAIL_MNG("이메일 관리 화면"),
    ADMIN("관리자 화면");
    private final String description;

    Menu(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
