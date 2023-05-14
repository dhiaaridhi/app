package contact;

import java.io.Serializable;

public class contacts implements Serializable {
 private int id_contact ;
 private String nom ;
 private String prenom ;
 private String email ; 
  public contacts(){
	  super();
  }
  public contacts (String nom,String prenom,String email){
	  super();
	  this.nom = nom ;
	  this.prenom = prenom ; 
	  this.email= email ;
  }
public int getId_contact() {
	return id_contact;
}
public void setId_contact(int id_contact) {
	this.id_contact = id_contact;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
