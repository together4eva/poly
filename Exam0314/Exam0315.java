
public class Exam0315 {

	public static void main(String[] args) {
		String str1 = "IT CookBook �Դϴ�.";
		String str2 = "10";
		String str3 = "20";

		str1 = " java �Դϴ�";
		System.out.println("str1 = " + str1);
		System.out.println("str2+str3 = " + str2 + str3);
		int num1 = Integer.parseInt(str2);
		int num2 = Integer.parseInt(str3);
		//integer.parseInt
		//�������� ���ڿ��� ���ڰ����� ������ integer�������� �������
		System.out.println("str2+str3 = " +(num1+num2));
	}
}
