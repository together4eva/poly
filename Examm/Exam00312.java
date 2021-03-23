
public class Exam00312 {

	public static void main(String[] args) {
		char a, b, c, d, e;
		// char 문자 /String 문자열 /int 정수형 /double 실수형 8byte /float 실수형 4byte

		a = 'A';// 65
		System.out.println("--------");
		System.out.println("a의 값==>" + a);
		System.out.println("a의 값==>" + (int) a);

		b = 'a'; // 97
		c = (char) (b + 1);// 97+1
		System.out.println("--------");
		System.out.println("b의 값==>" + b);
		System.out.println("b의 값==>" + (int) b);
		System.out.println("c의 값==>" + c);

		d = 90;
		System.out.println("--------");
		System.out.println("d의 값==>" + d);

		d = '가';// 44032
		e = (char) (d + 1);// 44032 +1
		System.out.println("--------");
		System.out.println("d의 값==>" + (int) d);
		System.out.println("e의 값==>" + e + "| e의 숫자값" +(int)e);

	}

}
