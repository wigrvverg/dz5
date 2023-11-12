package by.trainning.simplestapp.main;

import java.util.Scanner;

public class Main32v {

	public static void main(String[] args) {
		// Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них
		//положительной.
		Scanner sc = new Scanner(System.in);
		System.out.print("введите число ");
		int a = sc.nextInt();
		System.out.print("введите число ");
		int b = sc.nextInt();
		System.out.print("введите число ");
		int c = sc.nextInt();
		if(a+b>0) {
			System.out.println("сумма a и b положительная ");
		}
		if(a+c>0) {
			System.out.println("сумма a и с положительная ");
	}
		if(c+b>0) {
			System.out.println("сумма c и b положительная ");
		}
}}
