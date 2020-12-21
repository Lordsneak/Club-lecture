package com.lecteur.models;

import java.util.ArrayList;


import java.util.Scanner;

public class Bienfaiteur {
		private int id;
		private String surnom;
		private String mail;
		private int carte;
		
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getSurnom() {
			return surnom;
		}
		
		public void setSurnom(String surnom) {
			this.surnom = surnom;
		}
		
		public String getMail() {
			return mail;
		}
		
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		public int getCarte() {
			return carte;
		}
		
		public void setCarte(int carte) {
			this.carte = carte;
		}

		public Bienfaiteur(int id, String surnom, String mail, int carte) {
			this.id = id;
			this.surnom = surnom;
			this.mail = mail;
			this.carte = carte;
		}
		public Bienfaiteur() {
			
		}
		
		@Override
		public String toString() {
			return "id:"+ id + "\n Surnom:"+ surnom + "\n Email:" + mail + "Carte de fidélité : " + carte;
		}
		
		// METHOD ADD;
		public void add(ArrayList<Bienfaiteur> array) {
			Bienfaiteur bienfaiteurObj = new Bienfaiteur();
			
			// Enter Bienfaiteur ID
			Scanner scanBienfaiteurId = new Scanner(System.in);
			System.out.println("Enter ton  id Bienfaiteur : ");
			int bienfaiteurId = scanBienfaiteurId.nextInt();
			bienfaiteurObj.setId(bienfaiteurId);
			
			// Entre Surnom Bienfaiteur
			Scanner scanBienfaiteurSurnom = new Scanner(System.in);
			System.out.println("Enter Surnom Bienfaiteur : ");
			String bienfaiteurSurnom = scanBienfaiteurSurnom.nextLine();
			bienfaiteurObj.setSurnom(bienfaiteurSurnom);
			
			// Entre Mail Bienfaiteur
			Scanner scanBienfaiteurMail = new Scanner(System.in);
			System.out.println("Entre Mail Bienfaiteur : ");
			String bienfaiteurMail = scanBienfaiteurMail.nextLine();
			bienfaiteurObj.setMail(bienfaiteurMail);
			
			// Entre Carte 
			Scanner scanCarteBienfaiteur = new Scanner(System.in);
			System.out.println("Enter Bienfaiteur Carte : ");
			int bienfaiteurCarte = scanCarteBienfaiteur.nextInt();
			bienfaiteurObj.setCarte(bienfaiteurCarte);
			
			
			array.add(bienfaiteurObj);
		}
		
		// METHOD EDIT;
					public void edit(ArrayList<Bienfaiteur> array) {
						Bienfaiteur bienfaiteurObj = new Bienfaiteur();
						
						//Enter index Bienfaiteur
						Scanner scanIndex = new Scanner(System.in);
						System.out.println("Enter  index : ");
						int in = scanIndex.nextInt();
						
						//Entre ID
						
						Scanner scanEditIdBienfaiteur = new Scanner(System.in);
						System.out.println("Enter Livre id :");
						int bienfaiteurId = scanEditIdBienfaiteur.nextInt();
						bienfaiteurObj.setId(bienfaiteurId);
						
						//Entre Surnom
						Scanner scanEditSurnom = new Scanner(System.in);
						System.out.println("Enter Surnom :");
						String bienfaiteurSurnom = scanEditSurnom.nextLine();
						bienfaiteurObj.setSurnom(bienfaiteurSurnom);
						
						//Entre Mail
						Scanner scanEditMail = new Scanner(System.in);
						System.out.println("Enter Surnom :");
						String bienfaiteurMail = scanEditMail.nextLine();
						bienfaiteurObj.setMail(bienfaiteurMail);
						
						Scanner scanEditCarte = new Scanner(System.in);
						System.out.println("Enter Livre id :");
						int bienfaiteurCarte = scanEditCarte.nextInt();
						bienfaiteurObj.setId(bienfaiteurCarte);

						
						array.set(in, bienfaiteurObj);
						
					}
					public void delete(ArrayList<Bienfaiteur> array) {
						
						// Entre Number Index
						Scanner scanIndex = new Scanner(System.in);
						System.out.println("Enter index : ");
						int i = scanIndex.nextInt();
						
						// remove object
						array.remove(i);
					}
					// Search
					
					public void search(ArrayList<Bienfaiteur> array) {
						// ask user to enter index
						Scanner scanBienfaiteurSurnom = new Scanner(System.in);
						System.out.println("Enter Nom de Bienfaiteur : ");
						String name = scanBienfaiteurSurnom.next();
						
						String isFound = "";
						for (Bienfaiteur b1 : array) {
							if (b1.getSurnom().equals(name)) {
								isFound = "Bienfaiteur found";
							}else {
								isFound = "Bienfaiteur not found";
							}
						}
						
						System.out.println("Element " + isFound);
					}
					
					// Affiche Result
					
					public void show(ArrayList<Bienfaiteur> array) {
						for (Bienfaiteur b1 : array) {
							
							 System.out.println("id:"+ b1.getId() + " \n Surnom:"+ b1.getSurnom() + "\n Mail: " + b1.getMail() + "\n Carte : " + b1.getCarte());
						}
					}
		
		
}
