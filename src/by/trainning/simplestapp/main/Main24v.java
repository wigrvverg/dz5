package by.trainning.simplestapp.main;

import java.util.Scanner;

public class Main24v {

	public static void main(String[] args) {
		// Составить программу, определяющую результат гадания на ромашке — «любит—не
		// любит», взяв за исходное
		// данное количество лепестков
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество лепестков ");
		int i = sc.nextInt();
		if (i % 2 == 0) {
			System.out.println("Не любит");

		} else {
			System.out.println("Любит");
		}

	}

}
