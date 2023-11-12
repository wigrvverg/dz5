package by.trainning.simplestapp.main;

import java.util.Scanner;

public class Main34v {

	public static void main(String[] args) {
		// Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
		//запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
		//«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
		//денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
		Scanner sc = new Scanner(System.in);
		System.out.print("введите стоиомость книги ");
		int a = sc.nextInt();
		System.out.print("введите сумму денег, внесенную покупателем ");
		int b = sc.nextInt();
		if(a==b) {
			System.out.println("Спасибо");
		}
		if(a<b) {
			System.out.println("возьмите сдачу "+(b-a));
		}
		if(a>b) {
			System.out.println("Вам не хватает "+(a-b));
		}
		
	}

}
