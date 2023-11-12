package by.trainning.simplestapp.main;

import java.util.Scanner;

public class Main25v {

//Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение
	// «Пожароопасная ситуация », если температура в комнате превысила 60° С.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("температура в комнате ");
		int i = sc.nextInt();
		if (i > 60) {
			System.out.println("Пожароопасная ситуация");
		}

	}
}