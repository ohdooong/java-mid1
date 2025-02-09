package enumeration.test;

import java.util.List;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
        String inputGrade = scanner.next();

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            if (inputGrade.equals(authGrade.name())) {
                System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
                System.out.println("==메뉴 목록==");
                List<Menu> menuList = authGrade.getMenuList();
                for (Menu menu : menuList) {
                    System.out.println("- " + menu.getDescription());
                }
            }
        }
    }
}
