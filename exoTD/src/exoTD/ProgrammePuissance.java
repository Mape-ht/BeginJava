package exoTD;

import java.util.Scanner;

public class ProgrammePuissance {

	public static void main(String[] args) {
		//Demander les input et les enregistrer en meme temps avec scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre réel");
        float nombre1 = Float.parseFloat(scanner.next());  
        System.out.println("Saisir un nombre entier");
        int nombre2 = scanner.nextInt();  
         

        //sortir nombre 1 puissance nombre 2
        float puissance = (float) Math.pow(nombre1, nombre2);
        System.out.println(+ nombre1+ "puissance " + nombre2+ "est : "+puissance);
        scanner.close();

        //calculer la puissance en boucle 
        i = 0;
        while nombre2 !=1;
        	puissance = Math.pow(nombre1, nombre2);	
        	System.out.println(x+ "à la puissance" +n+ "est égal à : " puissance);
        	i +=1
        	else 
        		System.out.println(x+ "à la puissance" +n+ "est égal à : 1" );
	}

}
