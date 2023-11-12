package by.trainning.simplestapp.main;

import java.util.Scanner;

public class Main21v {
	public static void main(String[] args) {
		//Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены
		//некорректные данные, то сообщить об этом.
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите день (от 1 до 31): ");
        int day = sc.nextInt();
if(day>31) {
	System.out.println("Вы ввели неправильную дату");
	 
}else {
System.out.print("Введите месяц (от 1 до 12): ");
int month = sc.nextInt();
if(month>12) {
	System.out.println("Вы ввели неправильную дату");
	 
	
}
}}}
