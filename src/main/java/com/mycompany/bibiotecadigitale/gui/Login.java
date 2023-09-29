package main.java.com.mycompany.bibiotecadigitale.gui;

import com.mycompany.bibiotecadigitale.gui.AcquistoUtentee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author visci
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImmagineLB = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CodiceUtenteLB = new javax.swing.JLabel();
        UsernameTF = new javax.swing.JTextField();
        PasswordTF = new javax.swing.JPasswordField();
        BoxUser = new javax.swing.JComboBox<>();
        LoginLB = new javax.swing.JLabel();
        PasswordLB = new javax.swing.JLabel();
        ModalitaLB = new javax.swing.JLabel();
        AccediBTN = new javax.swing.JButton();
        PulisciBTN = new javax.swing.JButton();
        NomeGiovanniLB = new javax.swing.JLabel();
        NomeFrancescoLB = new javax.swing.JLabel();
        ChiudiFinestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        ImmagineLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\visci\\OneDrive\\Desktop\\Università\\Library_icon (1).png")); // NOI18N

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
        CodiceUtenteLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CodiceUtenteLB.setForeground(new java.awt.Color(204, 0, 51));
        CodiceUtenteLB.setText("Codice Utente");

        UsernameTF.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        UsernameTF.setForeground(new java.awt.Color(204, 0, 51));

        PasswordTF.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        PasswordTF.setForeground(new java.awt.Color(204, 0, 51));

        BoxUser.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BoxUser.setForeground(new java.awt.Color(204, 0, 51));
        BoxUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "UTENTE"}));

        LoginLB.setBackground(new java.awt.Color(204, 0, 51));
        LoginLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LoginLB.setForeground(new java.awt.Color(204, 0, 51));
        LoginLB.setText("LOGIN");

        PasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        PasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PasswordLB.setForeground(new java.awt.Color(204, 0, 51));
        PasswordLB.setText("Password");

        ModalitaLB.setBackground(new java.awt.Color(204, 0, 51));
        ModalitaLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ModalitaLB.setForeground(new java.awt.Color(204, 0, 51));
        ModalitaLB.setText("Modalità");

        AccediBTN.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AccediBTN.setForeground(new java.awt.Color(204, 0, 51));
        AccediBTN.setText("ACCEDI");
        AccediBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String modalita = (String) BoxUser.getSelectedItem();
                String codiceUtente = UsernameTF.getText();
                String password = PasswordTF.getText();
                if(modalita.equals("ADMIN") && codiceUtente.equals("admin1") && password.equals("password")) {
                    ManagerTesto managerTesto = new ManagerTesto();
                    managerTesto.setVisible(true);
                    dispose();
                } else if (modalita.equals("UTENTE") && codiceUtente.equals("utente1") && password.equals("password")) {
                    //qua va la finestra che l'utente visualizzerà
                    com.mycompany.bibiotecadigitale.gui.AcquistoUtentee acquistoUtentee = new AcquistoUtentee();
                    acquistoUtentee.setVisible(true);
                    dispose();
                }
            else {
                    // Accesso non riuscito, mostra un messaggio di errore
                    JOptionPane.showMessageDialog(Login.this, "Accesso non riuscito. Verifica le credenziali.","Errore di accesso", JOptionPane.ERROR_MESSAGE);
                    }
                }
        });

        PulisciBTN.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PulisciBTN.setForeground(new java.awt.Color(204, 0, 51));
        PulisciBTN.setText("PULISCI");
        PulisciBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pulisci i campi di input
                UsernameTF.setText("");
                PasswordTF.setText("");
            }
        });

        NomeGiovanniLB.setBackground(new java.awt.Color(204, 0, 51));
        NomeGiovanniLB.setFont(new java.awt.Font("Footlight MT Light", 0, 8)); // NOI18N
        NomeGiovanniLB.setForeground(new java.awt.Color(204, 0, 51));
        NomeGiovanniLB.setText("Giovanni Visciano");

        NomeFrancescoLB.setBackground(new java.awt.Color(204, 0, 51));
        NomeFrancescoLB.setFont(new java.awt.Font("Footlight MT Light", 0, 8)); // NOI18N
        NomeFrancescoLB.setForeground(new java.awt.Color(204, 0, 51));
        NomeFrancescoLB.setText("Francesco Pio Illiano");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(AccediBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PulisciBTN)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeFrancescoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeGiovanniLB))
                .addGap(141, 141, 141))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodiceUtenteLB)
                    .addComponent(PasswordLB)
                    .addComponent(ModalitaLB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLB)
                    .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LoginLB, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModalitaLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodiceUtenteLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccediBTN)
                    .addComponent(PulisciBTN))
                .addGap(29, 29, 29)
                .addComponent(NomeGiovanniLB, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeFrancescoLB, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        ChiudiFinestra.setBackground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ChiudiFinestra.setForeground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setText("x");
        ChiudiFinestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChiudiFinestraMouseClicked(evt);
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
                .addComponent(ChiudiFinestra)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ChiudiFinestra)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChiudiFinestraMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccediBTN;
    private javax.swing.JButton PulisciBTN;
    private javax.swing.JComboBox<String> BoxUser;
    private javax.swing.JLabel CodiceUtenteLB;
    private javax.swing.JLabel LoginLB;
    private javax.swing.JLabel PasswordLB;
    private javax.swing.JLabel ModalitaLB;
    private javax.swing.JLabel NomeGiovanniLB;
    private javax.swing.JLabel NomeFrancescoLB;
    private javax.swing.JLabel ImmagineLB;
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JPasswordField PasswordTF;
    // End of variables declaration//GEN-END:variables
}
