package com.lecteur.models;

import java.util.ArrayList;
import java.util.Scanner;


public class Livre {
		private int id;
		private String titre;
		private String edition;
		private String bienfaiteur;
		private String dateedition;
		
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getTitre() {
			return titre;
		}
		
		public void setTitre(String titre) {
			this.titre = titre;
		}
		
		public String getEdition() {
			return edition;
		}
		
		public void setEdition(String edition) {
			this.edition = edition;
		}
		
		public String getBienfaiteur() {
			return bienfaiteur;
		}
		
		public void setBienfaiteur(String bienfaiteur) {
			this.bienfaiteur = bienfaiteur;
		}
		
		public String getDateedition() {
			return dateedition;
		}
		
		public void setDateedition(String dateedition) {
			this.dateedition = dateedition;
		}

		public Livre(int id, String titre, String edition, String bienfaiteur, String dateedition) {
			this.id = id;
			this.titre = titre;
			this.edition = edition;
			this.bienfaiteur = bienfaiteur;
			this.dateedition = dateedition;
		}
		
		public Livre() {
				super();
		}
		// TO STRING
		@Override
		public String toString() {
			return "id:"+ getId() + "\n Titre:"+ getTitre() + "\n Edition: " + getEdition() + "Bienfaiteur : " + getBienfaiteur() + "Date de Edition:  " + getDateedition();
		}
		
		// METHOD ADD;
		public void add(ArrayList<Livre> array) {
			Livre livreObj = new Livre();
			
			// Enter livre ID
			Scanner scanLivreId = new Scanner(System.in);
			System.out.println("Enter ton  id Livre : ");
			int livreId = scanLivreId.nextInt();
			livreObj.setId(livreId);
			
			// Entre Titre Livre
			Scanner scanLivreTitre = new Scanner(System.in);
			System.out.println("Enter ton  Titre Livre : ");
			String livreTitre = scanLivreTitre.nextLine();
			livreObj.setTitre(livreTitre);
			
			// Entre Edition Livre
			Scanner scanLivreEdition = new Scanner(System.in);
			System.out.println("Enter ton  Edition Livre : ");
			String livreEdition = scanLivreEdition.nextLine();
			livreObj.setEdition(livreEdition);
			
			// Entre bienfaiteur Livre
			Scanner scanLivreBienfaiteur = new Scanner(System.in);
			System.out.println("Enter ton  Bienfaiteur Livre : ");
			String livreBienfaiteur = scanLivreBienfaiteur.nextLine();
			livreObj.setBienfaiteur(livreBienfaiteur);
			
			// Entre Date Edition Livre
			Scanner scanLivrerelease = new Scanner(System.in);
			System.out.println("Enter Date Edition Livre : ");
			String livredaterelease = scanLivrerelease.nextLine();
			livreObj.setDateedition(livredaterelease);
			
			
			array.add(livreObj);
		}
			// METHOD EDIT;
			public void edit(ArrayList<Livre> array) {
				Livre livreObj = new Livre();
				
				//Enter index
				Scanner scanIndex = new Scanner(System.in);
				System.out.println("Enter  index : ");
				int in = scanIndex.nextInt();
				
				//Entre ID
				
				Scanner scanEditId = new Scanner(System.in);
				System.out.println("Enter Livre id :");
				int livreId = scanEditId.nextInt();
				livreObj.setId(livreId);
				
				//Entre Titre
				Scanner scanEditTitre = new Scanner(System.in);
				System.out.println("Enter Livre Titre :");
				String livreTitre = scanEditTitre.nextLine();
				livreObj.setTitre(livreTitre);
				
				//Entre Edition
				Scanner scanEditEdition = new Scanner(System.in);
				System.out.println("Enter Livre Edition :");
				String livreEdition = scanEditEdition.nextLine();
				livreObj.setEdition(livreEdition);
				
				//Entre Bienfaiteur

				Scanner scanEditBienfaiteur = new Scanner(System.in);
				System.out.println("Enter Livre Bienfaiteur :");
				String livreBienfaiteur = scanEditBienfaiteur.nextLine();
				livreObj.setBienfaiteur(livreBienfaiteur);
				
				//Entre Date Release
				
				Scanner scanEditDateRelease = new Scanner(System.in);
				System.out.println("Enter Livre Bienfaiteur :");
				String livreDateRelease = scanEditDateRelease.nextLine();
				livreObj.setDateedition(livreDateRelease);
				array.set(in, livreObj);
				
			}
			public void delete(ArrayList<Livre> array) {
				// Entre Number Index
				Scanner scanIndex = new Scanner(System.in);
				System.out.println("Enter index : ");
				int i = scanIndex.nextInt();
				
				// remove object
				array.remove(i);
			}
			// Search
			
			public void search(ArrayList<Livre> array) {
				// ask user to enter index
				Scanner scanBienfaiteurName = new Scanner(System.in);
				System.out.println("Enter Nom de Bienfaiteur : ");
				String name = scanBienfaiteurName.next();
				
				String isFound = "";
				for (Livre liv : array) {
					if (liv.getTitre().equals(name)) {
						isFound = "found";
					}else {
						isFound = "not found";
					}
				}
				
				System.out.println("Element " + isFound);
			}
			
			// Affiche Result
			
			public void show(ArrayList<Livre> array) {
				for (Livre livre : array) {
					
					 System.out.println("id:"+ livre.getId() + " \n Titre:"+ livre.getTitre() + "\n Edition: " + livre.getEdition() + "\n Bienfaiteur : " + livre.getBienfaiteur() + "\n Date de Edition:  " + livre.getDateedition());
				}
			}
			
			
		}

		
