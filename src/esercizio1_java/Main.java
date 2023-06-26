package esercizio1_java;

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
