package com.mycompany.bibiotecadigitale.gui;
import com.mycompany.bibiotecadigitale.implementazione_dao.AdminDAOImpl;
import com.mycompany.bibiotecadigitale.dao.AdminDAO;
import com.mycompany.bibiotecadigitale.gui.Controller;

import javax.swing.*;

public class UpdatingAdmin extends javax.swing.JFrame {

    private Controller controller;
    private int codiceAdmin;
    private AdminDAO adminDAO;
    public UpdatingAdmin() {
        initComponents();
        adminDAO = new AdminDAOImpl();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IndietroLB = new javax.swing.JLabel();
        ConfermaPasswordPF = new javax.swing.JPasswordField();
        ConfermaPasswordLB = new javax.swing.JLabel();
        AggiornaAdmin = new javax.swing.JButton();
        PulisciAdmin = new javax.swing.JButton();
        UpdateAdminLB = new javax.swing.JLabel();
        PasswordPF = new javax.swing.JPasswordField();
        PasswordLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        IndietroLB.setBackground(new java.awt.Color(204, 0, 51));
        IndietroLB.setFont(new java.awt.Font("Century Gothic", 1, 10));
        IndietroLB.setForeground(new java.awt.Color(255, 255, 255));
        IndietroLB.setText("Indietro");
        IndietroLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IndietroLBMouseClicked(evt);
            }
        });

        ConfermaPasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        ConfermaPasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 10));
        ConfermaPasswordLB.setForeground(new java.awt.Color(255, 255, 255));
        ConfermaPasswordLB.setText("Conferma Password");

        AggiornaAdmin.setText("Aggiorna");
        AggiornaAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AggiornaAdminMouseClicked(evt);
            }
        });

        PulisciAdmin.setText("Pulisci");

        UpdateAdminLB.setBackground(new java.awt.Color(204, 0, 51));
        UpdateAdminLB.setFont(new java.awt.Font("Century Gothic", 1, 24));
        UpdateAdminLB.setForeground(new java.awt.Color(255, 255, 255));
        UpdateAdminLB.setText("Update Admin");

        PasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        PasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        PasswordLB.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLB.setText("Password");
        PasswordLB.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(IndietroLB))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(ConfermaPasswordLB)
                                                        .addComponent(PasswordLB))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ConfermaPasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AggiornaAdmin)
                                                        .addComponent(PulisciAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 71, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(UpdateAdminLB)
                                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(UpdateAdminLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PasswordLB)
                                        .addComponent(PasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ConfermaPasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ConfermaPasswordLB))
                                .addGap(26, 26, 26)
                                .addComponent(AggiornaAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PulisciAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(IndietroLB)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
    public void setController(Controller controller)
    {
        this.controller = controller;
    }
    protected void setCodice (int codice)
    {
        this.codiceAdmin = codice;
    }


    private void IndietroLBMouseClicked(java.awt.event.MouseEvent evt) {
        controller.IndietroAdmin();
    }

    private void AggiornaAdminMouseClicked(java.awt.event.MouseEvent evt) {
        String password = PasswordPF.getText();
        String confermaPassword = ConfermaPasswordPF.getText();
        if (!password.equals((confermaPassword)))
        {
            JOptionPane.showMessageDialog(this, "Le password non corrispondono ", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }
        AdminDAO adminDAO = new AdminDAOImpl();
        adminDAO.updatePassword(codiceAdmin, password);
        JOptionPane.showMessageDialog(this, "Password aggiornata con successo ");
    }

    private javax.swing.JButton AggiornaAdmin;
    private javax.swing.JPasswordField ConfermaPasswordPF;
    private javax.swing.JLabel IndietroLB;
    private javax.swing.JPasswordField PasswordPF;
    private javax.swing.JButton PulisciAdmin;
    private javax.swing.JLabel PasswordLB;
    private javax.swing.JLabel UpdateAdminLB;
    private javax.swing.JLabel ConfermaPasswordLB;
    private javax.swing.JPanel jPanel1;
}
