package test;

import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idada do Mulher 1");
		int m1= sc.nextInt();
		
		System.out.println("Digite a idada do Mulher 2");
		int m2= sc.nextInt();
		
		System.out.println("Digite a idada do Homem 1");
		int h1= sc.nextInt();
		
		System.out.println("Digite a idada do Homem 2");
		int h2= sc.nextInt();
		
		if(h1>h2 && m1>m2) {
			int results= h1 + m2;
			int resultp= h2 * m1;
			System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " +results);
			System.out.println("O produto das idades do homem mais novo com a mulher mais velha.: " +resultp);
		
		}else if(h1<h2 && m1<m2) {
			int results= h2 + m1;
			int resultp= h1 * m2;
			System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " +results);
			System.out.println("O produto das idades do homem mais novo com a mulher mais velha.: " +resultp);
		
		}else if(h1<h2 && m1>m2) {
			int results= h2 + m2;
			int resultp= h1 * m1;
			System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " +results);
			System.out.println("O produto das idades do homem mais novo com a mulher mais velha.: " +resultp);
		
		}else { 
			int results= h1 + m1;
			int resultp= h2 * m2;
			System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " +results);
			System.out.println("O produto das idades do homem mais novo com a mulher mais velha.: " +resultp);
		}
		sc.close();
		
	}
}