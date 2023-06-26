package esercizio1_java;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int x = prodotto(2,4);
		String s = concatena("prova", 3);
		String arr [] = {"1","2","3","4","5"};
		String lista [] = inserisci(arr, "add");
		
		System.out.println(x);
		System.out.println(s);
		for(int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]);
			if(i < lista.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		System.out.println("Inserire tre parole.");
		
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String s3 = input.nextLine();
		
		System.out.println(s1+s2+s3);
		System.out.println(s3+s2+s1);
		
		System.out.println();
		System.out.println("Inserisci lati rettangolo");
		double l1 = input.nextDouble();
		double l2 = input.nextDouble();
		System.out.println("Perimetro: " + perimetro(l1,l2));
		
		System.out.println("Inserire numero");
		int n = input.nextInt();
		System.out.println("pari dispari: "+ pariDispari(n));
		
		System.out.println("Inserire lati triangolo.");
		double t1 = input.nextDouble();
		double t2 = input.nextDouble();
		double t3 = input.nextDouble();
		System.out.println("Area triangolo: "+ area(t1,t2,t3));
		
	}
	
	public static double area(double l1, double l2, double l3) {
		double s = (l1 + l2 +l3)/2;
		double val = s*(s-l1)*(s-l2)*(s-l3);
		return Math.sqrt(val);
	}
	
	public static double perimetro(double l1, double l2) {
		return 2*(l1 + l2);
	}
	
	public static int pariDispari(int n) {
		return n%2 == 0? 0 : 1;
	}

	public static int prodotto(int n1, int n2) {
		return n1*n2;
	}
	
	public static String concatena(String s, int n) {
		return s + n;
	}
	
	public static String[] inserisci(String[] arr, String s) {
		String value [] = new String[6];
		value[2] = s;
		for(int i = 0; i < arr.length; i++) {
			if(i >= 2) {
				value[i+1] = arr[i];
			}else {
				value[i] = arr[i];
			}
		}
		return value;
	}
}
