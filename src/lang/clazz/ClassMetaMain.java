package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        Class stringClass = String.class; // 1. 클래스에서 조회
        // Class stringClass1 = new String().getClass(); // 2. 인스턴스에서 조회
        // Class stringClass2 = Class.forName("java.lang.String");// 3. 문자열로 조회

        // 모든 필드 출력
        Field[] declaredFields = stringClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField.getType() + " " + declaredField.getName());
            System.out.println("declaredField = " + declaredField);
        }
        System.out.println();

        // 모든 메서드 출력
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod);
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass: " + stringClass.getSuperclass().getName());

        // 모든 인터페이스 출력
        Class[] interfaces = stringClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("Interface : " + anInterface.getName());
        }

    }
}
