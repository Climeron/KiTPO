package Package;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите число, из которого требуется вычислить квадратный корень.");
		double BaseNumber = input.nextDouble();
		if (BaseNumber < 0)
		{
			System.out.println("Невозможно вычислить корень из отрицательного числа");
			System.exit(0);
		}
		Extraction ext = new Extraction();
		System.out.println("Ответ: " + ext.Square_Root(BaseNumber));
	}
}
