package com.mycompany.bibiotecadigitale.gui;

import com.mycompany.bibiotecadigitale.gui.AcquistoUtentee;
import com.mycompany.bibiotecadigitale.gui.Login;
import com.mycompany.bibiotecadigitale.implementazione_dao.UtenteDAOImpl;
import com.mycompany.bibiotecadigitale.model.Utente;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Registrazione extends javax.swing.JFrame {
    private Controller controller;
    private UtenteDAOImpl utenteDAO;
    public Registrazione() {
        initComponents();
        utenteDAO = new UtenteDAOImpl();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ChiudiFinestra = new javax.swing.JLabel();
        RegistrazioneLB = new javax.swing.JLabel();
        CognomeLB = new javax.swing.JLabel();
        TelefonoTF = new javax.swing.JTextField();
        NomeTF = new javax.swing.JTextField();
        NomeLB = new javax.swing.JLabel();
        RegistratiBTN = new javax.swing.JButton();
        PulisciBTN = new javax.swing.JButton();
        EmailLB = new javax.swing.JLabel();
        CognomeTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        TelefonoLB = new javax.swing.JLabel();
        CPasswordLB = new javax.swing.JLabel();
        PasswordPF = new javax.swing.JPasswordField();
        ConfermaLB = new javax.swing.JLabel();
        ConfermaPasswordPF = new javax.swing.JPasswordField();
        PasswordLB = new javax.swing.JLabel();
        AccediLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ChiudiFinestra.setBackground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        ChiudiFinestra.setForeground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setText("Indietro");
        ChiudiFinestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChiudiFinestraMouseClicked(evt);
            }
        });

        RegistrazioneLB.setBackground(new java.awt.Color(204, 0, 51));
        RegistrazioneLB.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        RegistrazioneLB.setForeground(new java.awt.Color(204, 0, 51));
        RegistrazioneLB.setText("REGISTRAZIONE");

        CognomeLB.setBackground(new java.awt.Color(204, 0, 51));
        CognomeLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CognomeLB.setForeground(new java.awt.Color(204, 0, 51));
        CognomeLB.setText("Cognome");
        CognomeLB.setToolTipText("");

        TelefonoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTFActionPerformed(evt);
            }
        });

        NomeLB.setBackground(new java.awt.Color(204, 0, 51));
        NomeLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        NomeLB.setForeground(new java.awt.Color(204, 0, 51));
        NomeLB.setText("Nome");

        RegistratiBTN.setText("Registrati");
        RegistratiBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistratiMouseClicked(evt);
            }
        });


        PulisciBTN.setText("Pulisci");
        PulisciBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciTestoMouseClicked(evt);
            }
        });

        EmailLB.setBackground(new java.awt.Color(204, 0, 51));
        EmailLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EmailLB.setForeground(new java.awt.Color(204, 0, 51));
        EmailLB.setText("Email");

        EmailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTFActionPerformed(evt);
            }
        });

        TelefonoLB.setBackground(new java.awt.Color(204, 0, 51));
        TelefonoLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        TelefonoLB.setForeground(new java.awt.Color(204, 0, 51));
        TelefonoLB.setText("Telefono");

        CPasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        CPasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CPasswordLB.setForeground(new java.awt.Color(204, 0, 51));
        CPasswordLB.setText("Password");

        ConfermaLB.setBackground(new java.awt.Color(204, 0, 51));
        ConfermaLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ConfermaLB.setForeground(new java.awt.Color(204, 0, 51));
        ConfermaLB.setText("Conferma");

        ConfermaPasswordPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfermaPasswordPFActionPerformed(evt);
            }
        });

        PasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        PasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        PasswordLB.setForeground(new java.awt.Color(204, 0, 51));
        PasswordLB.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RegistrazioneLB)
                                                .addGap(197, 197, 197)
                                                .addComponent(ChiudiFinestra))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(202, 202, 202)
                                                .addComponent(RegistratiBTN)
                                                .addGap(105, 105, 105)
                                                .addComponent(PulisciBTN)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(EmailLB)
                                                        .addComponent(NomeLB)
                                                        .addComponent(CognomeLB)
                                                        .addComponent(TelefonoLB)
                                                        .addComponent(PasswordLB))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(CognomeTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(NomeTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TelefonoTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EmailTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PasswordPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ConfermaLB)
                                                        .addComponent(CPasswordLB))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ConfermaPasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ChiudiFinestra)
                                        .addComponent(RegistrazioneLB))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NomeLB)
                                        .addComponent(NomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CognomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CognomeLB))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TelefonoLB)
                                        .addComponent(TelefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE,  javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EmailLB))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(PasswordLB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CPasswordLB)
                                                .addGap(23, 23, 23))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(PasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(ConfermaLB)
                                                                .addGap(48, 48, 48))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(ConfermaPasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RegistratiBTN)
                                        .addComponent(PulisciBTN))
                                .addGap(33, 33, 33))
        );

        AccediLB.setBackground(new java.awt.Color(204, 0, 51));
        AccediLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AccediLB.setText("ACCEDI");
        AccediLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccediMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(AccediLB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AccediLB)
                                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void ConfermaPasswordPFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void EmailTFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void TelefonoTFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    public void setController(Controller controller)
    {
        this.controller = controller;
    }

    private boolean isStringNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        // Verifica che ci sia almeno un "@" nell'indirizzo email
        if (email.contains("@")) {
            // Verifica che ci sia almeno un carattere prima e dopo l'@" per considerare l'email valida
            int atIndex = email.indexOf("@");
            return atIndex > 0 && atIndex < email.length() - 1;
        }
        return false;
    }

    private void RegistratiMouseClicked (java.awt.event.MouseEvent evt) {
        int CodiceUtente = utenteDAO.getUtenteRegistrato();
        CodiceUtente += 1;
        if (NomeTF.getText().isEmpty() || CognomeTF.getText().isEmpty() || TelefonoTF.getText().isEmpty()
                || PasswordPF.getText().isEmpty() || ConfermaPasswordPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Non hai inserito correttamente i dati.", "Attenzione", JOptionPane.WARNING_MESSAGE);
        }
        else if (!PasswordPF.getText().equals(ConfermaPasswordPF.getText())) {
            JOptionPane.showMessageDialog(null, "Le password non coincidono, riprova.", "Attenzione", JOptionPane.WARNING_MESSAGE);
        }
        else if (!isStringNumeric(TelefonoTF.getText())) {
            JOptionPane.showMessageDialog(this, "Il numero di telefono non è valido. Assicurati di inserire un numero corretto.", "Errore", JOptionPane.ERROR_MESSAGE);
        }
        else if (!isValidEmail(EmailTF.getText())) {
            JOptionPane.showMessageDialog(this, "L'indirizzo email non è valido. Assicurati di inserire un indirizzo email corretto.", "Errore", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String nome = NomeTF.getText();
            String cognome = CognomeTF.getText();
            Long telefono = Long.parseLong(TelefonoTF.getText());
            String email = EmailTF.getText();
            String password = String.valueOf(PasswordPF.getPassword());
            utenteDAO.registerUtente(nome, cognome, email, telefono, password);
            JOptionPane.showMessageDialog(this, "Registrazione avvenuta con successo! Il tuo codice è: " + CodiceUtente);
            ClearTextFields();
            controller.Logout();
        }
    }

    private void PulisciTestoMouseClicked (java.awt.event.MouseEvent evt) {
        NomeTF.setText("");
        CognomeTF.setText("");
        TelefonoTF.setText("");
        EmailTF.setText("");
        PasswordPF.setText("");
        ConfermaPasswordPF.setText("");
    }

    private void ClearTextFields () {
        NomeTF.setText("");
        CognomeTF.setText("");
        TelefonoTF.setText("");
        EmailTF.setText("");
        PasswordPF.setText("");
        ConfermaPasswordPF.setText("");
    }

    private void AccediMouseClicked (java.awt.event.MouseEvent evt) {
        UIManager.put("OptionPane.yesButtonText", "Si");
        int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler tornare alla pagina di login? I dati inseriti andranno persi.", "Conferma uscita", JOptionPane.YES_NO_OPTION);

        // Verifica della scelta dell'utente
        if (scelta == JOptionPane.YES_OPTION) {
            controller.Logout(); //il principio è lo stesso quindi sfrutto questa funzione
        }
        else {}
    }

    private void ChiudiFinestraMouseClicked(java.awt.event.MouseEvent evt) {
        controller.Logout();
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AccediLB;
    private javax.swing.JLabel CPasswordLB;
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JLabel CognomeLB;
    private javax.swing.JTextField CognomeTF;
    private javax.swing.JLabel ConfermaLB;
    private javax.swing.JPasswordField ConfermaPasswordPF;
    private javax.swing.JLabel EmailLB;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JLabel NomeLB;
    private javax.swing.JTextField NomeTF;
    private javax.swing.JLabel PasswordLB;
    private javax.swing.JPasswordField PasswordPF;
    private javax.swing.JButton PulisciBTN;
    private javax.swing.JButton RegistratiBTN;
    private javax.swing.JLabel RegistrazioneLB;
    private javax.swing.JLabel TelefonoLB;
    private javax.swing.JTextField TelefonoTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}