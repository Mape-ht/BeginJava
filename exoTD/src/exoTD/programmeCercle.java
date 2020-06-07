package exoTD;

import java.util.Scanner;

public class programmeCercle {

	public static void main(String[] args) {
		//récuperer les données saisies par l'utilisteur 
		Scanner scanner = new Scanner(System.in);
		System.out.print("rayon =" );
		int rayon = scanner.nextInt();
		System.out.println("le rayon du cercle est : " +rayon);
		
		//type float accepte integer  
	
		float perimetre = rayon*rayon;
		System.out.println("perimetre ="+perimetre);
		float surface = (float)Math.PI*(rayon*rayon);
		System.out.println("surface ="+surface);
		
	scanner.close();

	}

}
