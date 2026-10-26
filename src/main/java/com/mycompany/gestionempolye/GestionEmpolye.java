/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionempolye;

/**
 *
 * @author nassim
 */
public class GestionEmpolye {

    public static void main(String[] args) {
        Employe employe1 = new Employe("HUBERT","Christophe","12/03/1988","Développeur",4800);
        Employe employe2 = new Employe("RENARD","Nathalie","02/01/1975","Manager",7000);
        employe1.description();
        employe2.description();
        employe1.description("HUBERT","Christophe");
        employe2.description("RENARD","Nathalie");
        Interface win = new Interface();
    }
}
