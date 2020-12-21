package com.lecteur.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.lecteur.models.Bienfaiteur;
import com.lecteur.models.Lecture;
import com.lecteur.models.Livre;

public class Main {

	public static void main(String[] args) {
    	int opt;
    	do {
    		
    		System.out.println("1 - Ajoute Livre");
    		System.out.println("2 - Ajoute Bienfaiteur");
    		System.out.println("3 - Ajoute Lecture");
    		System.out.println("0 - Exit");	
    		Scanner sc = new Scanner(System.in);
    		opt = sc.nextInt();
    		switch (opt) {
    		case 1:
    			Livre livreObj = new Livre();
    			ArrayList<Livre> livres = new ArrayList<Livre>();
    			int opt1;
    			
    			do {
    	    		
    	    		System.out.println("1 - Ajoute Livre");
    	    		System.out.println("2 - Edit Livre");
    	    		System.out.println("3 - Supprimé Livre");
    	    		System.out.println("4 - Recherche Livre");
    	    		System.out.println("5 - Afficher Livres");	
    	    		System.out.println("0 - Exit");	
    	    		Scanner sc1 = new Scanner(System.in);
    	    		opt1 = sc1.nextInt();
    	    		switch (opt1) {
    	    		case 1:
    	    			livreObj.add(livres);
    	    			break;
    	    		case 2:
    	    			livreObj.edit(livres);
    	    			break;
    	    		case 3:
    	    			livreObj.delete(livres);
    	    			break;
    	    		case 4:
    	    			livreObj.search(livres);
    	    			break;
    	    		case 5:
    	    			livreObj.show(livres);
    	    		
    	    		default:
    	    			break;
    	    	}
    	    	} while (opt!=0);
    		case 2:
    			Bienfaiteur bienfaiteurObj = new Bienfaiteur();
    			ArrayList<Bienfaiteur> bienfaiteurs = new ArrayList<Bienfaiteur>();
    			int opt2;
    			
    				do {
    	    		
    	    		System.out.println("1 - Ajoute Bienfaiteur");
    	    		System.out.println("2 - Edit Bienfaiteur");
    	    		System.out.println("3 - Supprimé Bienfaiteur");
    	    		System.out.println("4 - Recherche Bienfaiteur");
    	    		System.out.println("5 - Afficher Bienfaiteurs");	
    	    		System.out.println("0 - Exit");	
    	    		Scanner sc2 = new Scanner(System.in);
    	    		opt2 = sc2.nextInt();
    	    		switch (opt2) {
    	    		case 1:
    	    			bienfaiteurObj.add(bienfaiteurs);
    	    			break;
    	    		case 2:
    	    			bienfaiteurObj.edit(bienfaiteurs);
    	    			break;
    	    		case 3:
    	    			bienfaiteurObj.delete(bienfaiteurs);
    	    			break;
    	    		case 4:
    	    			bienfaiteurObj.search(bienfaiteurs);
    	    			break;
    	    		case 5:
    	    			bienfaiteurObj.show(bienfaiteurs);
    	    		
    	    		default:
    	    			break;
    	    	}
    	    	} while (opt!=0);
    		case 3:
    			Lecture lecObj = new Lecture();
    			ArrayList<Lecture> lectures = new ArrayList<Lecture>();
    			int opt3;
    			
    				do {
    	    		
    	    		System.out.println("1 - Ajoute Lecture");
    	    		System.out.println("2 - Edit Lecture");
    	    		System.out.println("3 - Supprimé Lecture");
    	    		System.out.println("4 - Recherche Lecture");
    	    		System.out.println("5 - Afficher Lectures");	
    	    		System.out.println("0 - Exit");	
    	    		Scanner sc3 = new Scanner(System.in);
    	    		opt3 = sc3.nextInt();
    	    		switch (opt3) {
    	    		case 1:
    	    			lecObj.add(lectures);
    	    			break;
    	    		case 2:
    	    			lecObj.edit(lectures);
    	    			break;
    	    		case 3:
    	    			lecObj.delete(lectures);
    	    			break;
    	    		case 4:
    	    			lecObj.search(lectures);
    	    			break;
    	    		case 5:
    	    			lecObj.show(lectures);
    	    		
    	    		default:
    	    			break;
    	    	}
    	    	} while (opt!=0);
    		
    		default:
    			break;
    	}
    	} while (opt!=0);
    	
    	
	}

}