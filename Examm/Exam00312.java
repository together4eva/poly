
public class Exam00312 {

	public static void main(String[] args) {
		char a, b, c, d, e;
		// char ���� /String ���ڿ� /int ������ /double �Ǽ��� 8byte /float �Ǽ��� 4byte

		a = 'A';// 65
		System.out.println("--------");
		System.out.println("a�� ��==>" + a);
		System.out.println("a�� ��==>" + (int) a);

		b = 'a'; // 97
		c = (char) (b + 1);// 97+1
		System.out.println("--------");
		System.out.println("b�� ��==>" + b);
		System.out.println("b�� ��==>" + (int) b);
		System.out.println("c�� ��==>" + c);

		d = 90;
		System.out.println("--------");
		System.out.println("d�� ��==>" + d);

		d = '��';// 44032
		e = (char) (d + 1);// 44032 +1
		System.out.println("--------");
		System.out.println("d�� ��==>" + (int) d);
		System.out.println("e�� ��==>" + e + "| e�� ���ڰ�" +(int)e);

	}

}
