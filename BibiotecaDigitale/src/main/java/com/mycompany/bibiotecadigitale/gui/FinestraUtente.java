
package com.mycompany.bibiotecadigitale.gui;

import net.proteanit.sql.DbUtils;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FinestraUtente extends javax.swing.JFrame {

    /**
     * Creates new form FinestraUtente
     */
    public FinestraUtente() {
    initComponents();
    SelectUtente();
    try {
        Class.forName("org.postgresql.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Errore durante il caricamento del driver PostgreSQL");
    }
}
Connection Con = null; 
Statement St = null; 
ResultSet Rs = null;
public void SelectUtente() {
    String url = "jdbc:postgresql://localhost/DatabaseOO";
    String user = "postgres";
    String password = "profbarra";
    try {
        Con = DriverManager.getConnection(url, user, password);
        St = Con.createStatement();
        Rs = St.executeQuery("Select * FROM Utente");
        TabellaUtente.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e)
    {
        e.printStackTrace();
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CodiceUtente = new javax.swing.JTextField();
        NomeUtente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AggiungiUtente = new javax.swing.JButton();
        ModificaUtente = new javax.swing.JButton();
        EliminaUtente = new javax.swing.JButton();
        PulisciUtente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabellaUtente = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        CognomeUtente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TelefonoUtente = new javax.swing.JTextField();
        EmailUtente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(204, 0, 51));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("x");

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("MANAGER UTENTI");

        jLabel8.setBackground(new java.awt.Color(204, 0, 51));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Codice");
        jLabel8.setToolTipText("");

        CodiceUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodiceUtenteActionPerformed(evt);
            }
        });

        NomeUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeUtenteActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 0, 51));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("Nome");

        AggiungiUtente.setText("Aggiungi");
        AggiungiUtente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AggiungiUtenteMouseClicked(evt);
            }
        });

        ModificaUtente.setText("Modifica");
        ModificaUtente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificaUtenteMouseClicked(evt);
            }
        });

        EliminaUtente.setText("Elimina");
        EliminaUtente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminaUtenteMouseClicked(evt);
            }
        });

        PulisciUtente.setText("Pulisci");
        PulisciUtente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciUtenteMouseClicked(evt);
            }
        });

        TabellaUtente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Cognome", "Email", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabellaUtente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabellaUtenteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabellaUtente);

        jLabel13.setBackground(new java.awt.Color(204, 0, 51));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setText("Cognome");

        CognomeUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CognomeUtenteActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(204, 0, 51));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 51));
        jLabel14.setText("Email");

        jLabel15.setBackground(new java.awt.Color(204, 0, 51));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 51));
        jLabel15.setText("Telefono");

        TelefonoUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoUtenteActionPerformed(evt);
            }
        });

        EmailUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailUtenteActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(204, 0, 51));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("LISTA UTENTI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(501, 501, 501)
                                .addComponent(EmailUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(550, 550, 550)
                                .addComponent(TelefonoUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(102, 102, 102)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodiceUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CognomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(239, 239, 239)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel15))
                                                    .addGap(84, 84, 84))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(AggiungiUtente)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ModificaUtente)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(EliminaUtente)
                                                    .addGap(18, 18, 18)))
                                            .addComponent(PulisciUtente))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CodiceUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(EmailUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(TelefonoUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CognomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AggiungiUtente)
                    .addComponent(ModificaUtente)
                    .addComponent(EliminaUtente)
                    .addComponent(PulisciUtente))
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CodiceUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodiceUtenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodiceUtenteActionPerformed

    private void NomeUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeUtenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeUtenteActionPerformed

    private void CognomeUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CognomeUtenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CognomeUtenteActionPerformed

    private void TelefonoUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoUtenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoUtenteActionPerformed

    private void EmailUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailUtenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailUtenteActionPerformed

    private void AggiungiUtenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AggiungiUtenteMouseClicked
        // TODO add your handling code here:
        if(CodiceUtente.getText().isEmpty() || NomeUtente.getText().isEmpty() || CognomeUtente.getText().isEmpty() || EmailUtente.getText().isEmpty() || TelefonoUtente.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Non hai inserito correttamente i dati");
        } else {
            String url = "jdbc:postgresql://localhost/DatabaseOO";
            String user = "postgres";
            String password = "profbarra";
            try {
                Con = DriverManager.getConnection(url, user, password);
                PreparedStatement add = Con.prepareStatement("insert into Utente values (?, ?, ?, ?, ?)");
                add.setInt(1, Integer.valueOf(CodiceUtente.getText()));
                add.setString(2, NomeUtente.getText());
                add.setString(3, CognomeUtente.getText());
                add.setString(4, EmailUtente.getText());
                add.setInt(5, Integer.valueOf(TelefonoUtente.getText()));
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Utente aggiunto correttamente");
                Con.close();
                SelectUtente();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_AggiungiUtenteMouseClicked

    private void TabellaUtenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabellaUtenteMouseClicked
        DefaultTableModel model = (DefaultTableModel) TabellaUtente.getModel();
        int Indice = TabellaUtente.getSelectedRow();
        CodiceUtente.setText(model.getValueAt(Indice, 0).toString());
        NomeUtente.setText(model.getValueAt(Indice, 1).toString());
        CognomeUtente.setText(model.getValueAt(Indice, 2).toString());
        EmailUtente.setText(model.getValueAt(Indice, 3).toString());
        TelefonoUtente.setText(model.getValueAt(Indice, 4).toString());
    }//GEN-LAST:event_TabellaUtenteMouseClicked

    private void PulisciUtenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PulisciUtenteMouseClicked
    NomeUtente.setText("");
    CodiceUtente.setText((""));
    CognomeUtente.setText("");
    EmailUtente.setText("");
    TelefonoUtente.setText("");
    }//GEN-LAST:event_PulisciUtenteMouseClicked

    private void EliminaUtenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminaUtenteMouseClicked
    if(CodiceUtente.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Inserisci il codice dell'utente per poterlo cancellare");

    }else
    {
        try{
            String url = "jdbc:postgresql://localhost/DatabaseOO";
            String user = "postgres";
            String password = "profbarra";
            Con = DriverManager.getConnection(url, user, password);
            String UtenteId = CodiceUtente.getText();
            String Query = "Delete From Utente Where CodUtente="+UtenteId;
            Statement ADD = Con.createStatement();
            ADD.executeUpdate(Query);
            SelectUtente();
            JOptionPane.showMessageDialog(this, "Utente eliminato correttamente");
        }catch (Exception e)
        {
          e.printStackTrace();
        }
    }
    }//GEN-LAST:event_EliminaUtenteMouseClicked

    private void ModificaUtenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificaUtenteMouseClicked
        if(CodiceUtente.getText().isEmpty() || NomeUtente.getText().isEmpty() || CognomeUtente.getText().isEmpty() || EmailUtente.getText().isEmpty() || TelefonoUtente.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Informazioni mancanti");

        } else
        {
            try{
                String url = "jdbc:postgresql://localhost/DatabaseOO";
                String user = "postgres";
                String password = "profbarra";
                Con = DriverManager.getConnection(url, user, password);
                String Query = "UPDATE Utente SET Nome = '" + NomeUtente.getText() + "', Cognome = '" + CognomeUtente.getText() + "', Email = '" + EmailUtente.getText() + "', Telefono = '" + TelefonoUtente.getText() + "'" + "where codutente ="+ CodiceUtente.getText()+"";
                Statement ADD = Con.createStatement();
                ADD.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Utente modificato");
                SelectUtente();

            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ModificaUtenteMouseClicked

    
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
            java.util.logging.Logger.getLogger(FinestraUtente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraUtente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraUtente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraUtente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraUtente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AggiungiUtente;
    private javax.swing.JTextField CodiceUtente;
    private javax.swing.JTextField CognomeUtente;
    private javax.swing.JButton EliminaUtente;
    private javax.swing.JTextField EmailUtente;
    private javax.swing.JButton ModificaUtente;
    private javax.swing.JTextField NomeUtente;
    private javax.swing.JButton PulisciUtente;
    private javax.swing.JTable TabellaUtente;
    private javax.swing.JTextField TelefonoUtente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
