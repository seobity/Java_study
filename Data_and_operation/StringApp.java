
public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World"); // String - char들이 모여 있는 것
		System.out.println('H'); // Character 문자(한 글자) <- 작은따옴표
		System.out.println("H"); // String 문자열
		
		System.out.println("Hello "
				+"World"); // 줄바꿈 안 됨
		
		// new line
		System.out.println("Hello \nWorld");
		
		// escape
		System.out.println("Hello \"World\""); // Hello "World"
	}

}
