package com.mycompany.bibiotecadigitale.gui;

import com.mycompany.bibiotecadigitale.implementazione_dao.UtenteDAOImpl;
import com.mycompany.bibiotecadigitale.gui.Controller;

import javax.swing.*;

public class UpdatingUtente extends javax.swing.JFrame {

    private Controller controller;
    private int codiceUtente;
    private UtenteDAOImpl utenteDAO;
    public UpdatingUtente() {
        initComponents();
        utenteDAO = new UtenteDAOImpl();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IndietroLB = new javax.swing.JLabel();
        ConfermaPasswordPF = new javax.swing.JPasswordField();
        ConfermaPasswordLB = new javax.swing.JLabel();
        AggiornaUtente = new javax.swing.JButton();
        PulisciUtente = new javax.swing.JButton();
        UpdateUtenteLB = new javax.swing.JLabel();
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

        AggiornaUtente.setText("Aggiorna");
        AggiornaUtente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AggiornaUtenteMouseClicked(evt);
            }
        });

        PulisciUtente.setText("Pulisci");

        UpdateUtenteLB.setBackground(new java.awt.Color(204, 0, 51));
        UpdateUtenteLB.setFont(new java.awt.Font("Century Gothic", 1, 24));
        UpdateUtenteLB.setForeground(new java.awt.Color(255, 255, 255));
        UpdateUtenteLB.setText("Update Utente");

        PasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        PasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        PasswordLB.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLB.setText("Password");


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
                                                        .addComponent(AggiornaUtente)
                                                        .addComponent(PulisciUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 71, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(UpdateUtenteLB)
                                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(UpdateUtenteLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PasswordLB)
                                        .addComponent(PasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ConfermaPasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ConfermaPasswordLB))
                                .addGap(26, 26, 26)
                                .addComponent(AggiornaUtente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PulisciUtente)
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
        this.codiceUtente = codice;
    }

    private void IndietroLBMouseClicked(java.awt.event.MouseEvent evt) {
        controller.IndietroUtente();
    }

    private void AggiornaUtenteMouseClicked(java.awt.event.MouseEvent evt) {
        String password = PasswordPF.getText();
        String confermaPassword = ConfermaPasswordPF.getText();

        if (!password.equals(confermaPassword)) {
            // Mostra un messaggio di errore se le password non corrispondono
            JOptionPane.showMessageDialog(this, "Le password non corrispondono", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        UtenteDAOImpl utenteDAO = new UtenteDAOImpl();
        // Aggiorna la password dell'utente nel database
        utenteDAO.updatePassword(codiceUtente, password);
        JOptionPane.showMessageDialog(this, "Password aggiornata con successo", "Successo", JOptionPane.INFORMATION_MESSAGE);

    }

    private javax.swing.JButton AggiornaUtente;
    private javax.swing.JPasswordField ConfermaPasswordPF;
    private javax.swing.JLabel IndietroLB;
    private javax.swing.JPasswordField PasswordPF;
    private javax.swing.JButton PulisciUtente;
    private javax.swing.JLabel PasswordLB;
    private javax.swing.JLabel UpdateUtenteLB;
    private javax.swing.JLabel ConfermaPasswordLB;
    private javax.swing.JPanel jPanel1;
}
