package nested.anonymous.ex;

public class Ex0RefMain {

	public static void hello(String arg) {
		System.out.println("프로그램 시작"); // 변하지 않는부분
		System.out.println("Hello " + arg); // 변하는 부분
		System.out.println("프로그램 종료"); // 변하지 않는부분
	}
	
	public static void main(String[] args) {
		hello("Java");
		hello("Hello");
	}
}
