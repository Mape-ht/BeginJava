package exoTD;

import java.util.Scanner;

public class programmeParametre {

	public static void main(String[] args) {
		System.out.println("saisir le premier nombre entier a");
		Scanner nombre1 = new Scanner (System.in);
		int a = nombre1.nextInt ();
		System.out.println("saisir le premier nombre entier b");
		Scanner nombre2 = new Scanner (System.in);
		int b = nombre2.nextInt ();
		System.out.println("le quotient de"+ a + "divis� par " + b + "est :"+a/b);
		System.out.println("le reste de"+ a + "divis� par " + b + "est :"+a%b);
		System.out.println("le ratio de"+ a + "divis� par " + b + "est :"+(float)a/b);

	}

}
