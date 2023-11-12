package by.trainning.simplestapp.main;

public class Main09 {

	public static void main(String[] args) {
		// Найти сумму квадратов первых ста чисел.
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum = sum + i * i;
			i = i + 1;

		}
		System.out.println(sum);
	}
}
