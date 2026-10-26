
package com.mycompany.gestionempolye;


public class Cadre {
    private String departement;
    private double indemniteVoiture;
    public Cadre (String departement,double indemniteVoiture){
        this.departement = departement;
        this.indemniteVoiture = indemniteVoiture;
    }
    public String getterDepartement(){
        return this.departement;
    }
    
    public double getterindemniteVoiture(){
        return this.indemniteVoiture;
    }
    public void setterDepartement(String departement){
        this.departement = departement;
    }
    
    public void setterindemniteVoiture(double indemniteVoiture){
        this.indemniteVoiture = indemniteVoiture;
    }
}

