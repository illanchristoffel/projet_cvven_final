package view_cvven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.JDBCType;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.*;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
/**
 *
 * @author Illan
 */

public class CreerParticipant extends javax.swing.JFrame {

    public CreerParticipant () {
        initComponents();
              comboBox();
    }
    
     public static void main(String args[]) {
          
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerParticipant().setVisible(true);
            }
        });
          
      }
     
     private void comboBox(){
             try{
                 Connection conn = DriverManager.getConnection("jdbc:postgresql://chamilo.rene-descartes.fr/GroupeA", "groupea", "grpa");

             String sql="select libelle from evenement where archive!='Archivé'";
             PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
            
             
             while(rs.next()){
                 String name = rs.getString("libelle");
                 eventCombo.addItem(name);
             }
             }catch (Exception e){
                 JOptionPane.showMessageDialog(null, e);
             }
         
     }

     
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jtext1 = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        dateN = new javax.swing.JLabel();
        prenom_user = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        envoyer = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        organisation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eventCombo = new javax.swing.JComboBox<>();
        email1 = new javax.swing.JLabel();
        dN = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(746, 603));
        setPreferredSize(new java.awt.Dimension(746, 603));

        jtext1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtext1.setText("Nom");
        jtext1.setPreferredSize(new java.awt.Dimension(30, 30));

        prenom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prenom.setText("Prénom");
        prenom.setPreferredSize(new java.awt.Dimension(30, 30));

        dateN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateN.setText("Date de naissance");
        dateN.setPreferredSize(new java.awt.Dimension(30, 30));

        envoyer.setText("Valider");
        envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyerActionPerformed(evt);
            }
        });

        annuler.setText("Retour");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        organisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organisationActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Organisation");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inscription du partipant");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Événement");

        eventCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventComboActionPerformed(evt);
            }
        });

        email1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email1.setText("Votre email");
        email1.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(217, 217, 217))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(organisation, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eventCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(envoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenom_user, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenom_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organisation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(envoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void envoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyerActionPerformed

        JComboBox jc = new JComboBox();
        JPanel panel = new JPanel();
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      String date_de_naissance = sdf.format(dN.getDate());
        
        
        
        try {
       Class.forName("org.postgresql.Driver");
       Connection con = DriverManager.getConnection("jdbc:postgresql://chamilo.rene-descartes.fr/GroupeA", "groupea", "grpa");
            System.out.println("Connexion au serveur réussie !");
                     
       if (name.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Veuillez choisir un nom");
      }
       else if (prenom_user.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Veuillez choisir un prenom");
      }
      
       else if  (mail.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Veuillez choisir un mail");
      }
      
       else if  (organisation.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Veuillez choisir une organisation");
      }
      
     else if  (dN.getDate()== null)
      {
          JOptionPane.showMessageDialog(null, "Veuillez saisir l'année de naissance du participant");
      }         
            
     else if(eventCombo.getSelectedItem()==null)
     {                  
                
                    JOptionPane.showMessageDialog(null, "Il n'y a pas d'évenement en cours");
        }else{
            String query = " insert into utilisateur_participant (nom, prenom, email, date_naissance, organisation, evenement_choisi)"
        + " values (?, ?, ?, ?, ?, ?)";

      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString (1, name.getText());
      preparedStmt.setString (2, prenom_user.getText());
      preparedStmt.setString   (3, mail.getText());
      preparedStmt.setString(4, date_de_naissance);
      preparedStmt.setString(5, organisation.getText());
      preparedStmt.setString(6, eventCombo.getSelectedItem().toString()); 

     
          
      
      preparedStmt.execute();
      {
          JOptionPane.showMessageDialog(null, "Participant ajouté");
          name.setText("");
           prenom_user.setText("");
           mail.setText("");
           dN.setDateFormatString("");
           organisation.setText("");
      }
      
      con.close();
    }
        }
    catch (Exception e)
    {
      System.err.println("Il y'a un problème quelque part !");
      System.err.println(e.getMessage());
    }       
    }//GEN-LAST:event_envoyerActionPerformed

    private void organisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organisationActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
menu menuProfil=new menu (); 
   menuProfil.setVisible(true);
   this.hide();          // TODO add your handling code here:
    }//GEN-LAST:event_annulerActionPerformed

    private void eventComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventComboActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private com.toedter.calendar.JDateChooser dN;
    private javax.swing.JLabel dateN;
    private javax.swing.JLabel email1;
    private javax.swing.JButton envoyer;
    private javax.swing.JComboBox<String> eventCombo;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jtext1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField organisation;
    private javax.swing.JLabel prenom;
    private javax.swing.JTextField prenom_user;
    // End of variables declaration//GEN-END:variables
}
