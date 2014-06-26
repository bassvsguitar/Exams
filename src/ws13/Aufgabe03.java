package ws13;

import java.util.*;

public class Aufgabe03 {

	public static void main (String []args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie 3 Zahlen f�r das erste Zahlen-Array ein!");
		int[] x = new int[3];
		System.out.print("1. Stelle = ");
		x[0] = input.nextInt();
		System.out.print("2. Stelle = ");
		x[1] = input.nextInt();
		System.out.print("3. Stelle = ");
		x[2] = input.nextInt();
		System.out.print("\n");
		
		System.out.println("Bitte geben Sie 3 Zahlen f�r das zweite Zahlen-Array ein!");
		int[] y = new int[3];
		System.out.print("1. Stelle = ");
		x[0] = input.nextInt();
		System.out.print("2. Stelle = ");
		x[1] = input.nextInt();
		System.out.print("3. Stelle = ");
		x[2] = input.nextInt();
		System.out.print("\n");
		
		//--------------------------------------------
		// Einfachere Variante ist die 2 Zahlen-Arrays
		// manuell im Vorfeld zu belegen. Einfach den 
		// Arrays Integer-Werte schon zuweisen.
		// 
		// int[] x = {3, 4, 2};
		// int[] y = {6, 2, 9};
		// -------------------------------------------
		
		System.out.println("  " + Arrays.toString(x));
		System.out.println("+ " + Arrays.toString(y));
		
		System.out.println("________________________");
		System.out.println("");
		
		System.out.println( "________________________" 
						  + "\n= " + Arrays.toString(String.valueOf(addiere(x, y)).toCharArray())); 
		
		input.close();
		
	}
	public static int addiere(int[] a, int[] b){
		
		int[] c = new int[a.length + 1];//Feld f�r das Ergebnis
		int s;//Summe der aktuell berechneten Stelle
		int �bertrag = 0;
		
		for(int i = 0; i < c.length - 1; i++){
			
			s = a[i] + b[i];
			�bertrag = (s / 10) * 10;
			c[i + 1] = s - �bertrag;
			�bertrag = �bertrag / 10;
			System.out.println("�bertrag "+ �bertrag + " an Stelle " + i);
            c[i] += �bertrag;
            System.out.println(Arrays.toString(c));
            System.out.print("\n");
            
		}
		
		int ergebnis = 0;
	    for(int i = 0; i < c.length; i++) {
	    	 
	           ergebnis = (int) ((c[i] * Math.pow(10, (c.length-1 - i))) + ergebnis);
	     }
	     return ergebnis;
	}
}
