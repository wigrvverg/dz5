package by.trainning.simplestapp.main;

public class Main05 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		while (number <= 99) {
			sum += number;
			number += 2;
		}
		System.out.println("сумма всех нечетных чисел " + sum);
	}

}
