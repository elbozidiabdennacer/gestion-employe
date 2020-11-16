
package mini_projet;

import Connection.EmployeService;
import Connection.ConnexionBd;
import Modeles.etudiant;
import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.io.File;


import java.sql.*;
import java.util.*;


import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Utilisateurs extends javax.swing.JFrame {
  
    DefaultTableModel d = new DefaultTableModel();
    static ArrayList<Integer> id2 = new ArrayList<Integer>();
    EmployeService epl = new EmployeService(); 
    
    String sexe="Homme",pathimg ="" ;
    
    
   
    public Utilisateurs() {
         
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        d = (DefaultTableModel) tbges.getModel();
        hm.setSelected(true);
        afficher();
        
        
       
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbges = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        modifier = new javax.swing.JButton();
        rechercher = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labimage = new javax.swing.JLabel();
        tprenom = new javax.swing.JTextField();
        btnImg = new javax.swing.JButton();
        tsalaire = new javax.swing.JTextField();
        fm = new javax.swing.JRadioButton();
        supprimer = new javax.swing.JButton();
        tnom = new javax.swing.JTextField();
        hm = new javax.swing.JRadioButton();
        Refreche = new javax.swing.JButton();
        Ajouter = new javax.swing.JButton();
        tidr = new javax.swing.JTextField();
        ButtonHelp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tnomr = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des employes");
        setUndecorated(true);
        setSize(new java.awt.Dimension(850, 40));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jScrollPane1.setName(""); // NOI18N

        tbges.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Nom ", "Prenom", "Salaire", "sexe", "Email"
            }
        ));
        tbges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbgesMouseClicked(evt);
            }
        });
        tbges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbgesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbges);
        if (tbges.getColumnModel().getColumnCount() > 0) {
            tbges.getColumnModel().getColumn(0).setHeaderValue("Id ");
            tbges.getColumnModel().getColumn(1).setHeaderValue("Nom ");
            tbges.getColumnModel().getColumn(2).setHeaderValue("Prenom");
            tbges.getColumnModel().getColumn(3).setHeaderValue("Salaire");
            tbges.getColumnModel().getColumn(4).setHeaderValue("sexe");
            tbges.getColumnModel().getColumn(5).setHeaderValue("Email");
        }

        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Saliare");

        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Prenom Employe");

        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        rechercher.setText("Rechercher");
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Nom Employe");

        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Email");

        labimage.setBackground(new java.awt.Color(0, 95, 97));
        labimage.setForeground(new java.awt.Color(236, 240, 241));
        labimage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        labimage.setOpaque(true);

        btnImg.setText("Img/Parcourir");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        tsalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsalaireActionPerformed(evt);
            }
        });

        buttonGroup1.add(fm);
        fm.setForeground(new java.awt.Color(236, 240, 241));
        fm.setText("Femme");
        fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmActionPerformed(evt);
            }
        });

        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        tnom.setName(""); // NOI18N
        tnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnomActionPerformed(evt);
            }
        });

        buttonGroup1.add(hm);
        hm.setForeground(new java.awt.Color(236, 240, 241));
        hm.setText("Homme");
        hm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmActionPerformed(evt);
            }
        });

        Refreche.setText("Actualiser");
        Refreche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefrecheActionPerformed(evt);
            }
        });

        Ajouter.setText("Ajouter");
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });

        ButtonHelp.setText("?");
        ButtonHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHelpActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Nom chercher:");

        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Id  (modi/supp) :");

        tnomr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnomrActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Gestion employeés");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setText(" X");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel9.setText(" -");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonHelp)
                        .addGap(238, 238, 238)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tidr, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tnomr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rechercher))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tsalaire)
                                                .addComponent(temail)
                                                .addComponent(tprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(hm)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fm))
                                            .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labimage, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Refreche, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnomr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tidr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tsalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hm)
                                    .addComponent(fm))
                                .addGap(18, 18, 18)
                                .addComponent(btnImg))
                            .addComponent(labimage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Refreche, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnomActionPerformed
        
    }//GEN-LAST:event_tnomActionPerformed

    private void fmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmActionPerformed
        sexe = fm.getText();
    }//GEN-LAST:event_fmActionPerformed

    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
       if(!tnomr.getText().equals("")){
          cherche();
       }
       else{
       JOptionPane.showMessageDialog(null,"Entrer le nom d'employee qui vous pouvait rechercher ");
       }
           
    }//GEN-LAST:event_rechercherActionPerformed

    private void hmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmActionPerformed
        sexe= hm.getText();
    }//GEN-LAST:event_hmActionPerformed

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
        afficher(); 
        if(tnom.getText().equals("") || tprenom.getText().equals("")|| temail.getText().equals("") || tsalaire.getText().equals("") || pathimg.equals("") ){
            JOptionPane.showMessageDialog(null,"Un champ ou plus vide, choisi l'image et remplir tous les champs"); 
        }
        else {
         double slr; 
         try{
    
             slr = Double.parseDouble(tsalaire.getText());
             etudiant e = new etudiant();
             epl.ajouter(e.getId(), tnom.getText(), tprenom.getText(),slr,sexe, temail.getText(), pathimg);
              d.addRow(new Object[]{e.getId(), tnom.getText(), tprenom.getText(),slr,sexe, temail.getText()});
             tnom.setText("");tprenom.setText("");tsalaire.setText("");temail.setText("");
         }catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Invalid number, Salaire devrait être contient une valeurs numérique");
         
         }
       }
        
    }//GEN-LAST:event_AjouterActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
      if(!tidr.getText().equals("")){
         try{
          if (JOptionPane.showConfirmDialog(null,"Confirmer la suppression", "Suppression",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
            int pid = Integer.parseInt(tidr.getText()); 
            epl.supprimer(pid);
            tidr.setText("");
            afficher();
            JOptionPane.showMessageDialog(null,"Employee supprimer");}
             }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null,"Id invalid");
             
             }
         }
         else {
           JOptionPane.showMessageDialog(null,"Taper id d'employee qui pouvait supprimer");
         }
    }//GEN-LAST:event_supprimerActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
              if(tnom.getText().equals("") || tprenom.getText().equals("")|| temail.getText().equals("") || tsalaire.getText().equals("") || tidr.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Un champ ou plus vide, remplir tous les champs et donner id de employee qui vous pouvait modifier"); 
        }
        else {
         double slr; 
         int idm;
         try{
              if (JOptionPane.showConfirmDialog(null,"Confirmer la modification ", "Modification",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
             slr = Double.parseDouble(tsalaire.getText());
             idm = Integer.parseInt(tidr.getText());
             epl.modifier(idm, tnom.getText(), tprenom.getText(),slr,sexe, temail.getText(),pathimg);
              afficher();
             JOptionPane.showMessageDialog(null,"Modification réussi");
             tnom.setText("");tprenom.setText("");tsalaire.setText("");temail.setText("");
              }
         }catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Invalid number, Id et Salaire devrait être contient des valeurs numérique");
         }
         }
    }//GEN-LAST:event_modifierActionPerformed

    private void RefrecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefrecheActionPerformed
         afficher();   
    }//GEN-LAST:event_RefrecheActionPerformed

    private void tsalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsalaireActionPerformed
       
    }//GEN-LAST:event_tsalaireActionPerformed

    private void tnomrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnomrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnomrActionPerformed

    private void ButtonHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHelpActionPerformed
        JOptionPane.showMessageDialog(null,"Pour ajouter remplir les chemps (nom,prenom,salaire,Email,sexe) et cliquer sur bouton ajouter\n"
                + "pour supprimer Entrer Id d'employee sur le champ, et cliquer sue bouton supprimer\n"
                + "pour modifier un employer entrer Id et entrer les noveaux valaurs et cliquer sur bouton modifier\n"
                + "pour recherche un employee entrer leur nom\n"
                + "La bouton actualiser pour actualiser votre tableau  ");
    }//GEN-LAST:event_ButtonHelpActionPerformed

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File("Desktop"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGE","JPG","PNG");
        filechooser.addChoosableFileFilter(filter);
        int result = filechooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
        
            File selectedfile = filechooser.getSelectedFile();
            String path = selectedfile.getAbsolutePath();
            ImageIcon myImage = new ImageIcon(path);
            Image img = myImage.getImage();
            Image newImage = img.getScaledInstance(labimage.getWidth(), labimage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon finalImg = new ImageIcon(newImage);
            labimage.setIcon(finalImg);
            pathimg  = path;
          }
        else{
             
            if(result == JFileChooser.CANCEL_OPTION)
                  JOptionPane.showMessageDialog(null,"Vous n'avait pas choisi aucun image !!");
        
           }
    }//GEN-LAST:event_btnImgActionPerformed

    private void tbgesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbgesMouseClicked

        try {
            int ligne= tbges.getSelectedRow();
            int ids =(int) tbges.getModel().getValueAt(ligne,0);
            
            ResultSet resf = epl.getSlected(ids);
            
            if (resf.next()){
            tidr.setText(String.valueOf( resf.getInt("id")));
            tnom.setText(resf.getString("nom")); 
            tprenom.setText(resf.getString("prenom"));
            temail.setText(resf.getString("Email"));
            tsalaire.setText(String.valueOf(resf.getDouble("salaire")));
            if (resf.getString("sexe").equals("Homme")) hm.setSelected(true);
            else fm.setSelected(true);}
            
            byte[] img = resf.getBytes("image");
            ImageIcon image = new ImageIcon(img);
            Image myImg = image.getImage().getScaledInstance(labimage.getWidth(), labimage.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon Fimg = new ImageIcon(myImg);
            
             labimage.setIcon(Fimg);
             
          new gesTempSal(ids).setVisible(true);
            
            
            
        }catch (SQLException e){
         System.out.println(e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_tbgesMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void tbgesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbgesKeyPressed
   
    }//GEN-LAST:event_tbgesKeyPressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(MouseInfo.getPointerInfo().getLocation());
    }//GEN-LAST:event_formMouseDragged

 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilisateurs().setVisible(true);
            }
        });
        
       
    }
    
    public static ArrayList<etudiant> getEmploye(){
        
        ArrayList<etudiant> employelist = new ArrayList<etudiant>();
      try{ 
        Connection    cns =  ConnexionBd.Connecter();
         Statement  st;
         ResultSet rst;
         st = cns.createStatement();
         rst = st.executeQuery("SELECT * FROM employee ORDER by id");
         etudiant etd;
         id2.clear();
       while (rst.next()){
       
          etd = new etudiant(rst.getInt("id"),rst.getString("nom"),rst.getString("prenom"),rst.getInt("salaire"),rst.getString("sexe"),rst.getString("email"));
          id2.add(rst.getInt("id"));
          employelist.add(etd);
       }  
      
      }catch(Exception ex){
          ex.printStackTrace();
          
        }
      return employelist;
      
    }
    
    public void afficher(){
    
    
    ArrayList<etudiant> list = getEmploye();
    DefaultTableModel mod= (DefaultTableModel)tbges.getModel();
    Object[] row = new Object[6];
    mod.setRowCount(0);
    for (int i=0; i<list.size();i++){
      
        row[0] = id2.get(i);
        row[1] = list.get(i).getNom();
        row[2] = list.get(i).getPrenom();
        row[3] = list.get(i).getSalaire();
        row[4] = list.get(i).getSexe();
        row[5] = list.get(i).getEmail();
        mod.addRow(row);
        
        
        
    }
        
    }
    
    public void cherche(){
    ArrayList<etudiant> list = epl.rechercher(tnomr.getText());
    DefaultTableModel mod= (DefaultTableModel)tbges.getModel();
    Object[] row = new Object[6];
    mod.setRowCount(0);
    if(list.size() == 0){
        JOptionPane.showMessageDialog(null,"Aucun employee trouvé !! ");
        
        
    }
    else{
    for (int i=0; i<list.size();i++){
      
        row[0] = EmployeService.id3.get(i);
        row[1] = list.get(i).getNom();
        row[2] = list.get(i).getPrenom();
        row[3] = list.get(i).getSalaire();
        row[4] = list.get(i).getSexe();
        row[5] = list.get(i).getEmail();
        mod.addRow(row);} 
       JOptionPane.showMessageDialog(null,list.size()+ "  Employees trouvé !! ");  
       
    }
    }
    
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton ButtonHelp;
    private javax.swing.JButton Refreche;
    private javax.swing.JButton btnImg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fm;
    private javax.swing.JRadioButton hm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labimage;
    private javax.swing.JButton modifier;
    private javax.swing.JButton rechercher;
    private javax.swing.JButton supprimer;
    public javax.swing.JTable tbges;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tidr;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextField tnomr;
    private javax.swing.JTextField tprenom;
    private javax.swing.JTextField tsalaire;
    // End of variables declaration//GEN-END:variables
}

