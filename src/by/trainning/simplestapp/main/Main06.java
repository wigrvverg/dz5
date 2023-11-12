package by.trainning.simplestapp.main;
import java.util.Scanner;
public class Main06 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.print(">");
		x=sc.nextInt();
		int sum=0;
		for (int i=1; i<=x; i++) {
			sum=sum+i;
		
		}
		System.out.println("сумма чисел от 0 до "+x+" равна "+sum);
	}
	
}

