package test;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int cont=0;
		System.out.print("Digite o valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();
		
		int total = a*b;
		
		String binario = Integer.toBinaryString(total);
		
		System.out.println(binario);
		
		for (int i=0; i<binario.length(); i ++) {
			if(binario.charAt(i)=='1') {
				cont++;
				
			}
		}
		System.out.println(cont);
	}

}
