package by.trainning.simplestapp.main;

public class Main10 {

	public static void main(String[] args) {
		double sum = 1;
		double i = 1;
		while (i <= 200) {
			sum =  sum * Math.pow(i, 2);
			i = i + 1;

		}
		System.out.println(sum);
	}
}