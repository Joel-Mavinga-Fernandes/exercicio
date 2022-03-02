package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("valor x");
		int x = sc.nextInt();
		
		System.out.println("valor y");
		int y = sc.nextInt();
		
		int z = (x*y)+5;
		
		System.out.println(z);
		
		if(z<=0) {
			System.out.println("A");
		}else if(z<=100) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		System.out.println(z);
		
		sc.close();

	}

}
