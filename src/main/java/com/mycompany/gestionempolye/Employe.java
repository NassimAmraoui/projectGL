
package com.mycompany.gestionempolye;


public class Employe {
    private static int count = 0 ;
    private int IdEmploye;
    private String Nom;
    private String Prenom;
    private String dateNaissance;
    private String position;
    private float salaire;
    
    
    public Employe(){
    this.IdEmploye = ++count;
    this.Nom = null;
    this.Prenom = null;
    this.dateNaissance = null;
    this.position = null;
    this.salaire = 0;
 
    } 
    public Employe(String nom,String Prenom,String dateNaissance,String position,float salaire){
        this.IdEmploye = ++count;
        this.Nom = nom;
        this.Prenom = Prenom;
        this.dateNaissance = dateNaissance;
        this.position = position;
        this.salaire = salaire;
                
    }
    
    
    public int getterID(){
        return this.IdEmploye;
    }
    
    public String getterNom(){
        return this.Nom;
    }
    
    public String getterPrenom(){
        return this.Prenom;
    }
    
    public String getterDateNaissance(){
        return this.dateNaissance;
    }
    
    public String getterPosition(){
        return this.position;
    }
    
    public float getterSalaire(){
        return this.salaire;
    }
    
    public void setterID(int id){
        this.IdEmploye = id;
    }
    
    public void setterNom(String nom){
         this.Nom = nom;
    }
    
    public void setterPrenom(String prenom){
        this.Prenom = prenom;
    }
    
    
    public void setterDateNaissance(String dateNaissance){
         this.dateNaissance = dateNaissance;
    }
    
    public void setterPosition(String position){
        this.position = position;
    }
    
    public void setterSalaire(float salaire){
        this.salaire = salaire;
    }

    public void description(){
    System.out.println("Nom : "+this.Nom+" Prenom : "+this.Prenom+" Date Naissance : "+this.dateNaissance+" Position : "+this.position+" Salaire : "+this.salaire);
    }
    
    public void description(String nom, String prenom){
        System.out.println("L'indentifiant d'employé : "+nom+" "+prenom +" est ID :"+this.IdEmploye);
                
    }
    
    public void augmenterSalaire(float montant){
        this.salaire += montant;
    }
    public float obtenirSalaireAnnuel(){
        float totalAnnuel = this.salaire * 12;
        return totalAnnuel;
    }
    
}
