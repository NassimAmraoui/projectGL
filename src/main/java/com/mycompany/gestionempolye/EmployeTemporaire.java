
package com.mycompany.gestionempolye;


public class EmployeTemporaire {
    
    private int dureeContant;
    private double tauxHoraire;
    public EmployeTemporaire(int dureeContant,double tauxHoraire){
        this.dureeContant = dureeContant;
        this.tauxHoraire = tauxHoraire;
    }
    
    public int getterDureeContant(){
        return this.dureeContant;
    }
    
    public double getterTauxHoraire(){
        return this.tauxHoraire;
    }
    public void setterDureeContant(int dureeContant){
        this.dureeContant = dureeContant;
    }
    
    public void setterTauxHoraire(double tauxHoraire){
        this.tauxHoraire = tauxHoraire;
    }
}
