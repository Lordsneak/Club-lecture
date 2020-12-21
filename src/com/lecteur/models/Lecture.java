package com.lecteur.models;
import java.util.ArrayList;
import java.util.Scanner;

public class Lecture {
		private int id;
		private String nom;
		private String prenom;
		private String tel;
		private String mail;
		private int carte;
		
		//getter setter
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getNom() {
			return nom;
		}
		
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		public String getPrenom() {
			return prenom;
		}
		
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		
		public String getTel() {
			return tel;
		}
		
		public void setTel(String tel) {
			this.tel = tel;
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

		public Lecture(int id, String nom, String prenom, String tel, String mail, int carte) {
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.tel = tel;
			this.mail = mail;
			this.carte = carte;
		}
		public Lecture() {
			
		}
		@Override
		public String toString() {
			return "id:"+ id + "\n Nom:"+ nom + "\n Prenom:" + prenom +"\n Telephone:" + tel +"\n Mail:" + mail +"\n Carte:" + carte;
		}
		
		//Method Add
		public void add (ArrayList<Lecture> array) {
			Lecture lecObj = new Lecture();
			
			
			// id
			Scanner scanlectureId = new Scanner(System.in);
			System.out.println("Entre Id Lecture");
			int lectureId = scanlectureId.nextInt();
			lecObj.setId(lectureId);
			
			//Nom
			Scanner scanLectureNom = new Scanner(System.in);
			System.out.println("Entre Nom Lecture");
			String lectureNom = scanLectureNom.nextLine();
			lecObj.setNom(lectureNom);
			
			//Prenom
			Scanner scanLecturePrenom = new Scanner(System.in);
			System.out.println("Entre Prenom Lecture");
			String lecturePrenom = scanLecturePrenom.nextLine();
			lecObj.setPrenom(lecturePrenom);
			
			//Tel
			Scanner scanLectureTel = new Scanner(System.in);
			System.out.println("Entre Tel Lecture");
			String lectureTel = scanLectureTel.nextLine();
			lecObj.setTel(lectureTel);
			
			//Mail
			Scanner scanLectureMail = new Scanner(System.in);
			System.out.println("Entre Mail Lecture");
			String lectureMail = scanLectureMail.nextLine();
			lecObj.setMail(lectureMail);
			
			//Carte
			Scanner scanLectureCarte = new Scanner(System.in);
			System.out.println("Entre Carte Lecture");
			int lectureCarte = scanLectureCarte.nextInt();
			lecObj.setCarte(lectureCarte);
			
			
			array.add(lecObj);

		}
		//Edit 
		public void edit(ArrayList<Lecture> array) {
			Lecture lecObj = new Lecture();
			
			// Entre Index
			System.out.println("Entre Index Lecture");
			Scanner scanIndex = new Scanner(System.in);
			int in = scanIndex.nextInt();
			// Edit
			Scanner scanlectureEditId = new Scanner(System.in);
			System.out.println("Entre Id Lecture");
			int lectureEditId = scanlectureEditId.nextInt();
			lecObj.setId(lectureEditId);
			//Nom
			Scanner scanLectureEditNom = new Scanner(System.in);
			System.out.println("Entre Nom Lecture");
			String lectureEditNom = scanLectureEditNom.nextLine();
			lecObj.setNom(lectureEditNom);
			
			//Prenom
			Scanner scanLectureEditPrenom = new Scanner(System.in);
			System.out.println("Entre Prenom Lecture");
			String lectureEditPrenom = scanLectureEditPrenom.nextLine();
			lecObj.setPrenom(lectureEditPrenom);
			
			//Tel
			Scanner scanLectureEditTel = new Scanner(System.in);
			System.out.println("Entre Tel Lecture");
			String lectureEditTel = scanLectureEditTel.nextLine();
			lecObj.setTel(lectureEditTel);
			
			//Mail
			Scanner scanLectureEditMail = new Scanner(System.in);
			System.out.println("Entre Mail Lecture");
			String lectureEditMail = scanLectureEditMail.nextLine();
			lecObj.setMail(lectureEditMail);
			
			//Carte
			Scanner scanLectureEditCarte = new Scanner(System.in);
			System.out.println("Entre Carte Lecture");
			int lectureEditCarte = scanLectureEditCarte.nextInt();
			lecObj.setCarte(lectureEditCarte);
			
			array.set(in, lecObj);	
		}
		//Delete
		public void delete(ArrayList<Lecture> array) {
			
			// Entre Number Index
			Scanner scanIndex = new Scanner(System.in);
			System.out.println("Enter index : ");
			int i = scanIndex.nextInt();
			
			// remove object
			array.remove(i);
		}
		
		// Search
		
		public void search(ArrayList<Lecture> array) {
			// ask user to enter index
			Scanner scanLecturenom = new Scanner(System.in);
			System.out.println("Enter Nom de Lecture : ");
			String name = scanLecturenom.next();
			
			String isFound = "";
			for (Lecture l1 : array) {
				if (l1.getNom().equals(name)) {
					isFound = "Lecture found";
				}else {
					isFound = "Lecture not found";
				}
			}
			System.out.println("Element " + isFound);
		}
		
		// Affiche Result
		
		public void show(ArrayList<Lecture> array) {
			
			for (Lecture l1 : array) {
				
				 System.out.println("id:"+ l1.getId() + " \n Nom:"+ l1.getNom() + "\n Prenom: " + l1.getPrenom() + "\n Telephone : " + l1.getTel()+ "\n Mail : " + l1.getMail()+ "\n Carte : " + l1.getCarte());
			}

}
}
