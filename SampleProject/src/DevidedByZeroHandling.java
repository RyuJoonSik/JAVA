import java.util.Scanner;

public class DevidedByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;

		System.out.println("�������� �Է��Ͻÿ� : ");
		dividend = scanner.nextInt();
		System.out.println("�������� �Է��Ͻÿ� : ");
		divisor = scanner.nextInt();
		try {
			System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend / divisor + "�Դϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ� !");
		} finally {
			scanner.close();
		}
	}
}
