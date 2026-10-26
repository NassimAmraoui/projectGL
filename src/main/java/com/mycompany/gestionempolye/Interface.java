package com.mycompany.gestionempolye;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Interface extends JFrame {
    FlowLayout layout = new FlowLayout(FlowLayout.LEFT,10,20);
    FlowLayout layout2 = new FlowLayout(FlowLayout.RIGHT,10,18);
    String[] type_Employe = {"Cadre","Temporaire"};
    
    JFrame window = new JFrame();
    JPanel mainPanel = new JPanel();
    JPanel row = new JPanel(layout);
    JPanel row1 = new JPanel(layout);
    JPanel row2 = new JPanel(layout);
    JPanel row3 = new JPanel(layout);
    JPanel row4 = new JPanel(layout);
    JPanel row5 = new JPanel(layout);
    JPanel row6 = new JPanel(layout);
    JPanel row7 = new JPanel(layout);
    JPanel row8 = new JPanel(layout);
    JPanel row9 = new JPanel(layout);

    
    JPanel Input = new JPanel(new GridLayout(1,1));
    JPanel Input1 = new JPanel(layout2);
    JPanel Input2 = new JPanel(layout2);
    JPanel Input3 = new JPanel(layout2);
    JPanel Input4 = new JPanel(layout2);
    JPanel Input5 = new JPanel(layout2);
    JPanel Input6 = new JPanel(layout2);
    JPanel Input7 = new JPanel(layout2);
    JPanel Input8 = new JPanel(layout2);
    JPanel Input9 = new JPanel(layout2);
    
    JPanel partieImage = new JPanel();
    JPanel partieTitre = new JPanel();
    JPanel partieBtn = new JPanel(new GridBagLayout());
        
    JPanel LeftSection = new JPanel();
    JPanel RightSection = new JPanel();
    JPanel panelCenter = new JPanel();


    
    
   
    
    /*Everything About Text */
    JLabel titre = new JLabel("Ajout d'un Employé");
    JLabel labeltypeEmploye= new JLabel("Type d'employé:");
    JLabel labelNom= new JLabel("Nom:");
    JLabel labelPrenom= new JLabel("Prenom:");
    JLabel labelDateNaissance= new JLabel("Date de naissance:");
    JLabel labelPosition= new JLabel("Position:");
    JLabel labelSalaire= new JLabel("Salaire:");
    JLabel labelDepartement= new JLabel("Département:");
    JLabel labelIndemniteVoiture= new JLabel("indemnité Voiture:");
    JLabel labelDureeContrat= new JLabel("Durée de contrat:");
    JLabel labelTauxHoraire= new JLabel("Taux d'horaire:");
  
      
            
    /*  Everything about input element*/
     
    
     JComboBox input_type_Employe = new JComboBox() ;
     JTextField input_Nom = new  JTextField(15);
     JTextField input_Prenom= new  JTextField(15);
     JTextField input_Date= new  JTextField(15);
     JTextField input_Positon= new  JTextField(15);
     JTextField input_Salaire = new JTextField(15); 
     JTextField input_Departement= new JTextField(15); 
     JTextField input_Indemnite_Voiture= new JTextField(15); 
     JTextField input_Duree_Contrat= new JTextField(15);
     JTextField input_taux_horaire= new  JTextField(15);
    /*Everything About Button */
    JButton btn_annuler = new JButton("Annuler");
    JButton btn_Enregistrer = new JButton("Enregistrer");
    
    
    
    
    public Interface(){

        this.setTitle("Ajout d'un Employé");
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(mainPanel);
        partieTitre.setLayout(new BorderLayout());
        
        mainPanel.setLayout(new BorderLayout());
        BoxLayout center = new BoxLayout(panelCenter,BoxLayout.Y_AXIS);
        BoxLayout Left = new BoxLayout(LeftSection,BoxLayout.Y_AXIS);
        BoxLayout Right = new BoxLayout(RightSection,BoxLayout.Y_AXIS);
        LeftSection.setLayout(Left);
        RightSection.setLayout(Right);
        panelCenter.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        input_type_Employe.setBorder(BorderFactory.createEmptyBorder(15,0,15,0));
        
        

        ImageIcon img = new ImageIcon("/home/nassim/Desktop/mavenproject1/User.png");
        Image origineImg = img.getImage();
        Image modifyImg = origineImg.getScaledInstance(130, 130,Image.SCALE_SMOOTH);
        
        
        JLabel setImage = new JLabel(new ImageIcon(modifyImg));
        

  
       
       
        
        partieImage.add(setImage);
        partieTitre.setBackground(Color.red);
      
        
       

          
        
        

       
       
        input_type_Employe.setModel(new DefaultComboBoxModel(type_Employe));
        
        titre.setHorizontalAlignment(JLabel.CENTER);
        partieTitre.add(titre,BorderLayout.CENTER);
        
        row.add(labeltypeEmploye);
        
        row1.add(labelNom);
       
        row2.add(labelPrenom);
        
        row3.add(labelDateNaissance);
        row4.add(labelPosition);
        row5.add(labelSalaire);
        row6.add(labelDepartement);
        row7.add(labelIndemniteVoiture);
        row8.add(labelDureeContrat);
        row9.add(labelTauxHoraire);


        
        
        Input.add(input_type_Employe);
        Input1.add(input_Nom);
        Input2.add(input_Prenom);
        Input3.add(input_Date);
        Input4.add(input_Positon);
        Input5.add(input_Salaire);
        Input6.add(input_Departement );
        Input7.add(input_Indemnite_Voiture);
        Input8.add(input_Duree_Contrat);
        Input9.add(input_taux_horaire);

        LeftSection.add(row);
        RightSection.add(Input);
        
        LeftSection.add(row1);
        RightSection.add(Input1);
        
        LeftSection.add(row2);
        RightSection.add(Input2);
        
        LeftSection.add(row3);
        RightSection.add(Input3);
        
        LeftSection.add(row4);
        RightSection.add(Input4);
        
        LeftSection.add(row5);
        RightSection.add(Input5);
        
        LeftSection.add(row6);
        RightSection.add(Input6);

        
        LeftSection.add(row7);
        RightSection.add(Input7);
        
        
        LeftSection.add(row8);
        RightSection.add(Input8);
        
        
        LeftSection.add(row9);
        RightSection.add(Input9);
        
        

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;       
        gbc.gridheight = 2; 
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        
        panelCenter.add(partieTitre, gbc);


       
        gbc.gridx = 0;
        gbc.gridy = 2;        
        gbc.gridwidth = 1;    
        gbc.gridheight = 1;     

        gbc.fill = GridBagConstraints.BOTH;
        panelCenter.add(LeftSection, gbc);


       
        gbc.gridx = 1;
        gbc.gridy = 2;         
        gbc.gridwidth = 1;      
        gbc.gridheight = 1;     
        gbc.fill = GridBagConstraints.BOTH;
        panelCenter.add(RightSection, gbc);


        
        gbc.gridx = 2;
        gbc.gridy = 0;          //
        gbc.gridwidth = 2;      
        gbc.gridheight = 3;     
   
        gbc.fill = GridBagConstraints.BOTH;
        panelCenter.add(partieImage, gbc);
        
        GridBagConstraints n = new GridBagConstraints();
        n.insets = new Insets(20,20,20,20);
        n.gridx = 0;
        n.gridy = 0;
        n.ipady = 5;

        n.anchor = GridBagConstraints.CENTER;
        partieBtn.add(btn_annuler,n); 
        
        n.gridx = 1;
        n.gridy = 0;
        n.ipady = 5;
        n.anchor = GridBagConstraints.CENTER;
        partieBtn.add(btn_Enregistrer,n); 
        
        
        

        mainPanel.add(panelCenter,BorderLayout.CENTER);
        mainPanel.add(partieBtn,BorderLayout.SOUTH);
        
        
        
        
        
        
      

        this.setVisible(true);

        
    }
}
