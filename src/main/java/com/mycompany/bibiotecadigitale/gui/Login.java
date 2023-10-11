package com.mycompany.bibiotecadigitale.gui;
import com.mycompany.bibiotecadigitale.model.Utente;
import com.mycompany.bibiotecadigitale.dao.UtenteDAO;
import com.mycompany.bibiotecadigitale.model.Admin;
import com.mycompany.bibiotecadigitale.dao.AdminDAO;
import com.mycompany.bibiotecadigitale.gui.Controller;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author visci
 */
public class Login extends javax.swing.JFrame {
    private UtenteDAO utenteDAO;
    private AdminDAO adminDAO;
    private Controller controller;
    public Login() {
        initComponents();
        utenteDAO = new UtenteDAO();
        adminDAO = new AdminDAO();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CodiceUtente = new javax.swing.JTextField();
        PasswordUtente = new javax.swing.JTextField();
        Modalita = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Accedi = new javax.swing.JButton();
        Pulisci = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Registrati = new javax.swing.JButton();
        Chiudi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\visci\\OneDrive\\Desktop\\Università\\Library_icon (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(204, 0, 51));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Codice Utente");

        CodiceUtente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CodiceUtente.setForeground(new java.awt.Color(204, 0, 51));

        PasswordUtente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        PasswordUtente.setForeground(new java.awt.Color(204, 0, 51));

        Modalita.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Modalita.setForeground(new java.awt.Color(204, 0, 51));
        Modalita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "UTENTE", " " }));

        jLabel3.setBackground(new java.awt.Color(204, 0, 51));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("LOGIN");

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Password");

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Modalità");

        Accedi.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Accedi.setForeground(new java.awt.Color(204, 0, 51));
        Accedi.setText("ACCEDI");
        Accedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccediMouseClicked(evt);
            }
        });

        Pulisci.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Pulisci.setForeground(new java.awt.Color(204, 0, 51));
        Pulisci.setText("PULISCI");
        Pulisci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 0, 51));
        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Giovanni Visciano");

        jLabel7.setBackground(new java.awt.Color(204, 0, 51));
        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 0, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Francesco Pio Illiano");

        Registrati.setFont(new java.awt.Font("Century Gothic", 1, 8)); // NOI18N
        Registrati.setForeground(new java.awt.Color(204, 0, 51));
        Registrati.setText("Registrati");
        Registrati.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistratiMouseClicked(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(37, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(PasswordUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Modalita, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CodiceUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(Accedi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(22, 22, 22)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Pulisci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Registrati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Modalita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CodiceUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PasswordUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Accedi)
                                        .addComponent(Pulisci))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Registrati))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
        );

        Chiudi.setBackground(new java.awt.Color(204, 0, 51));
        Chiudi.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Chiudi.setForeground(new java.awt.Color(204, 0, 51));
        Chiudi.setText("x");
        Chiudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChiudiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Chiudi)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Chiudi)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    public void setController(Controller controller) {
        this.controller = controller;
    }
    private void ChiudiMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ChiudiApp();
    }
    private void RegistratiMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ApriRegistrazione();
    }

    private void AccediMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceUtente.getText().isEmpty() || PasswordUtente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Credenziali mancanti");
        } else {
            System.out.println("OK");
            String codiceUtenteText = CodiceUtente.getText();
            String passwordUtente = PasswordUtente.getText();
            try {
                int codiceUtente = Integer.parseInt(codiceUtenteText);

                if (Modalita.getSelectedItem().toString().equals("UTENTE")) {
                    //System.out.println("Modalità selezionata: " + Modalita.getSelectedItem().toString());

                    UtenteDAO utenteDAO = new UtenteDAO();
                    if (utenteDAO.verificaCredenziali(codiceUtente, passwordUtente)) {
                        controller.AccediUtente();
                    } else {
                        JOptionPane.showMessageDialog(this, "Credenziali utente non valide");
                    }
                    //utenteDAO.close();
                } else {
                    AdminDAO adminDAO1 = new AdminDAO();
                    if (adminDAO1.verificaCredenziali(codiceUtente, passwordUtente)) {
                        controller.AccediAdmin();
                    } else {
                        JOptionPane.showMessageDialog(this, "Credenziali admin non valide");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice utente deve essere un numero valido");
            }
        }
    }



    private void PulisciMouseClicked(java.awt.event.MouseEvent evt) {
        CodiceUtente.setText("");
        PasswordUtente.setText("");
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Accedi;
    private javax.swing.JLabel Chiudi;
    private javax.swing.JTextField CodiceUtente;
    private javax.swing.JTextField PasswordUtente;
    private javax.swing.JButton Pulisci;
    private javax.swing.JComboBox<String> Modalita;
    private javax.swing.JButton Registrati;

    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
