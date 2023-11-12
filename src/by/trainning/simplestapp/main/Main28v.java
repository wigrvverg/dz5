package by.trainning.simplestapp.main;

import java.util.Scanner;

public class Main28v {

	public static void main(String[] args) {
		// Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —
		//c).
		Scanner sc = new Scanner(System.in);
		System.out.print("введите число ");
		int a = sc.nextInt();
		System.out.print("введите число ");
		int b = sc.nextInt();
		System.out.print("введите число ");
		int c = sc.nextInt();
		System.out.print("введите число d ");
		int d = sc.nextInt();
		boolean t=false;
		if (t==false) {
		if(a==d) {
			System.out.println("Число a=d");
		}
		if(b==d) {
			System.out.println("Число b=d");
		}
		if(c==d) {
			System.out.println("Число c=d");
		}
	}else  {
		System.out.println(d-a);
		System.out.println(d-b);
		System.out.println(d-c);
	}
		
		
	}

}
