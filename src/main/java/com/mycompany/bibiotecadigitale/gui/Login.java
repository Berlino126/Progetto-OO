
package com.mycompany.bibiotecadigitale.gui;
import com.mycompany.bibiotecadigitale.dao.AdminDAO;
import com.mycompany.bibiotecadigitale.model.Utente;
import com.mycompany.bibiotecadigitale.implementazione_dao.UtenteDAOImpl;
import com.mycompany.bibiotecadigitale.model.Admin;
import com.mycompany.bibiotecadigitale.implementazione_dao.AdminDAOImpl;
import com.mycompany.bibiotecadigitale.gui.Controller;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {
    private UtenteDAOImpl utenteDAO;
    private AdminDAOImpl adminDAO;
    private Controller controller;
    public Login() {
        initComponents();
        utenteDAO = new UtenteDAOImpl();
        adminDAO = new AdminDAOImpl();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImmagineLB = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CodiceUtenteLB = new javax.swing.JLabel();
        CodiceUtenteTF = new javax.swing.JTextField();
        PasswordUtentePF = new javax.swing.JPasswordField();
        ModalitaComboBox = new javax.swing.JComboBox<>();
        LoginLB = new javax.swing.JLabel();
        PasswordLB = new javax.swing.JLabel();
        ModalitaLB = new javax.swing.JLabel();
        Accedi = new javax.swing.JButton();
        Pulisci = new javax.swing.JButton();
        Studente1LB = new javax.swing.JLabel();
        Studente2LB = new javax.swing.JLabel();
        Registrati = new javax.swing.JButton();
        Chiudi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        ImmagineLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\visci\\OneDrive\\Desktop\\Università\\Library_icon (1).png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(ImmagineLB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(ImmagineLB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        CodiceUtenteLB.setBackground(new java.awt.Color(204, 0, 51));
        CodiceUtenteLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        CodiceUtenteLB.setForeground(new java.awt.Color(204, 0, 51));
        CodiceUtenteLB.setText("Codice Utente");

        CodiceUtenteTF.setFont(new java.awt.Font("Century Gothic", 1, 12));
        CodiceUtenteTF.setForeground(new java.awt.Color(204, 0, 51));

        PasswordUtentePF.setFont(new java.awt.Font("Century Gothic", 1, 12));
        PasswordUtentePF.setForeground(new java.awt.Color(204, 0, 51));

        ModalitaComboBox.setFont(new java.awt.Font("Century Gothic", 1, 14));
        ModalitaComboBox.setForeground(new java.awt.Color(204, 0, 51));
        ModalitaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "UTENTE"}));

        LoginLB.setBackground(new java.awt.Color(204, 0, 51));
        LoginLB.setFont(new java.awt.Font("Century Gothic", 1, 24));
        LoginLB.setForeground(new java.awt.Color(204, 0, 51));
        LoginLB.setText("LOGIN");

        PasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        PasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        PasswordLB.setForeground(new java.awt.Color(204, 0, 51));
        PasswordLB.setText("Password");

        ModalitaLB.setBackground(new java.awt.Color(204, 0, 51));
        ModalitaLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        ModalitaLB.setForeground(new java.awt.Color(204, 0, 51));
        ModalitaLB.setText("Modalità");

        Accedi.setFont(new java.awt.Font("Century Gothic", 1, 14));
        Accedi.setForeground(new java.awt.Color(204, 0, 51));
        Accedi.setText("ACCEDI");
        Accedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccediMouseClicked(evt);
            }
        });

        Pulisci.setFont(new java.awt.Font("Century Gothic", 1, 14));
        Pulisci.setForeground(new java.awt.Color(204, 0, 51));
        Pulisci.setText("PULISCI");
        Pulisci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciMouseClicked(evt);
            }
        });

        Studente1LB.setBackground(new java.awt.Color(204, 0, 51));
        Studente1LB.setFont(new java.awt.Font("Footlight MT Light", 0, 8));
        Studente1LB.setForeground(new java.awt.Color(204, 0, 51));
        Studente1LB.setText("Giovanni Visciano");

        Studente2LB.setBackground(new java.awt.Color(204, 0, 51));
        Studente2LB.setFont(new java.awt.Font("Footlight MT Light", 0, 8));
        Studente2LB.setForeground(new java.awt.Color(204, 0, 51));
        Studente2LB.setText("Francesco Pio Illiano");

        Registrati.setFont(new java.awt.Font("Century Gothic", 1, 8));
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
                                        .addComponent(CodiceUtenteLB)
                                        .addComponent(PasswordLB)
                                        .addComponent(ModalitaLB))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LoginLB)
                                        .addComponent(PasswordUtentePF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ModalitaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CodiceUtenteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                        .addComponent(Studente2LB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Studente1LB))
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
                                .addComponent(LoginLB, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ModalitaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ModalitaLB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CodiceUtenteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CodiceUtenteLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PasswordUtentePF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PasswordLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Accedi)
                                        .addComponent(Pulisci))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Studente1LB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Registrati))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Studente2LB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
        );

        Chiudi.setBackground(new java.awt.Color(204, 0, 51));
        Chiudi.setFont(new java.awt.Font("Century Gothic", 1, 24));
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
    }

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
        if (CodiceUtenteTF.getText().isEmpty() || PasswordUtentePF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Credenziali mancanti");
        } else {
            System.out.println("OK");
            String codiceUtenteText = CodiceUtenteTF.getText();
            String passwordUtente = PasswordUtentePF.getText();
            try {
                int codiceUtente = Integer.parseInt(codiceUtenteText);

                if (ModalitaComboBox.getSelectedItem().toString().equals("UTENTE")) {
                    UtenteDAOImpl utenteDAO = new UtenteDAOImpl();
                    if (utenteDAO.verificaCredenziali(codiceUtente, passwordUtente)) {
                        controller.AccediUtente(codiceUtente);
                    } else {
                        JOptionPane.showMessageDialog(this, "Credenziali utente non valide");
                    }

                } else {
                    AdminDAO adminDAO1 = new AdminDAOImpl();
                    if (adminDAO1.verificaCredenziali(codiceUtente, passwordUtente)) {
                        controller.AccediAdmin(codiceUtente);
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
        CodiceUtenteTF.setText("");
        PasswordUtentePF.setText("");
    }

    private javax.swing.JButton Accedi;
    private javax.swing.JLabel Chiudi;
    private javax.swing.JTextField CodiceUtenteTF;
    private javax.swing.JPasswordField PasswordUtentePF;
    private javax.swing.JButton Pulisci;
    private javax.swing.JComboBox<String> ModalitaComboBox;
    private javax.swing.JButton Registrati;
    private javax.swing.JLabel CodiceUtenteLB;
    private javax.swing.JLabel LoginLB;
    private javax.swing.JLabel PasswordLB;
    private javax.swing.JLabel ModalitaLB;
    private javax.swing.JLabel Studente1LB;
    private javax.swing.JLabel Studente2LB;
    private javax.swing.JLabel ImmagineLB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
}
