package by.trainning.simplestapp.main;

import java.util.Scanner;

public class Main26v {
	public static void main(String[] args) {
		//Написать программу нахождения суммы большего и меньшего из трех чисел.
		Scanner sc = new Scanner(System.in);
		System.out.print("введите число ");
		int i = sc.nextInt();
		System.out.print("введите число ");
		int l = sc.nextInt();
		System.out.print("введите число ");
		int m = sc.nextInt();
		int x=Math.max(i, l);
		int y=Math.max(x, m);
		
		int z=Math.min(i, l);
		int p=Math.min(x, m);
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(z, p));
		System.out.println(Math.max(x, y)+Math.min(z, p));
}}
