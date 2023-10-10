
package main.java.com.mycompany.bibiotecadigitale.gui;
import main.java.com.mycompany.bibiotecadigitale.dao.UtenteDAO;
import main.java.com.mycompany.bibiotecadigitale.model.ArticoloScientifico;
import main.java.com.mycompany.bibiotecadigitale.model.Utente;
import main.java.com.mycompany.bibiotecadigitale.dao.UtenteDAO;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManagerUtenti extends javax.swing.JFrame {

    private UtenteDAO utenteDAO;
    public ManagerUtenti() {
    initComponents();
    utenteDAO = new UtenteDAO();
    refreshUtenteTable();
}

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ChiudiFinestra = new javax.swing.JLabel();
        ManagerUtentiLB = new javax.swing.JLabel();
        CodiceLB = new javax.swing.JLabel();
        CodiceUtente = new javax.swing.JTextField();
        NomeUtente = new javax.swing.JTextField();
        NomeLB = new javax.swing.JLabel();
        AggiungiUtente = new javax.swing.JButton();
        ModificaUtente = new javax.swing.JButton();
        EliminaUtente = new javax.swing.JButton();
        PulisciUtente = new javax.swing.JButton();
        ScrollTabella = new javax.swing.JScrollPane();
        TabellaUtente = new javax.swing.JTable();
        CognomeLB = new javax.swing.JLabel();
        CognomeUtente = new javax.swing.JTextField();
        EmailLB = new javax.swing.JLabel();
        TelefonoLB = new javax.swing.JLabel();
        TelefonoUtente = new javax.swing.JTextField();
        EmailUtente = new javax.swing.JTextField();
        ListaUtentiLB = new javax.swing.JLabel();
        LibriLB = new javax.swing.JLabel();
        TestiLB = new javax.swing.JLabel();
        LOGOUTLB = new javax.swing.JLabel();
        ArticoliLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));
        setUndecorated(true);


        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        ChiudiFinestra.setBackground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ChiudiFinestra.setForeground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setText("x");
        ChiudiFinestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });


        ManagerUtentiLB.setBackground(new java.awt.Color(204, 0, 51));
        ManagerUtentiLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ManagerUtentiLB.setForeground(new java.awt.Color(204, 0, 51));
        ManagerUtentiLB.setText("MANAGER UTENTI");

        CodiceLB.setBackground(new java.awt.Color(204, 0, 51));
        CodiceLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CodiceLB.setForeground(new java.awt.Color(204, 0, 51));
        CodiceLB.setText("Codice");
        CodiceLB.setToolTipText("");

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

        NomeLB.setBackground(new java.awt.Color(204, 0, 51));
        NomeLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NomeLB.setForeground(new java.awt.Color(204, 0, 51));
        NomeLB.setText("Nome");

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
        ScrollTabella.setViewportView(TabellaUtente);

        CognomeLB.setBackground(new java.awt.Color(204, 0, 51));
        CognomeLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CognomeLB.setForeground(new java.awt.Color(204, 0, 51));
        CognomeLB.setText("Cognome");

        CognomeUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CognomeUtenteActionPerformed(evt);
            }
        });

        EmailLB.setBackground(new java.awt.Color(204, 0, 51));
        EmailLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EmailLB.setForeground(new java.awt.Color(204, 0, 51));
        EmailLB.setText("Email");

        TelefonoLB.setBackground(new java.awt.Color(204, 0, 51));
        TelefonoLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TelefonoLB.setForeground(new java.awt.Color(204, 0, 51));
        TelefonoLB.setText("Telefono");

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

        ListaUtentiLB.setBackground(new java.awt.Color(204, 0, 51));
        ListaUtentiLB.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ListaUtentiLB.setForeground(new java.awt.Color(204, 0, 51));
        ListaUtentiLB.setText("LISTA UTENTI");

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
                                .addComponent(CodiceLB)
                                .addGap(501, 501, 501)
                                .addComponent(EmailUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(ManagerUtentiLB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(ChiudiFinestra))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CognomeLB)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(554, 554, 554)
                                .addComponent(TelefonoUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(NomeLB)
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
                                                        .addComponent(EmailLB)
                                                        .addComponent(TelefonoLB))
                                                    .addGap(84, 84, 84))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(AggiungiUtente)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ModificaUtente)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(EliminaUtente)
                                                    .addGap(18, 18, 18)))
                                            .addComponent(PulisciUtente))
                                        .addComponent(ScrollTabella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(ListaUtentiLB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManagerUtentiLB)
                    .addComponent(ChiudiFinestra))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodiceLB)
                    .addComponent(CodiceUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLB)
                    .addComponent(EmailUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLB)
                    .addComponent(TelefonoLB)
                    .addComponent(TelefonoUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CognomeLB)
                    .addComponent(CognomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AggiungiUtente)
                    .addComponent(ModificaUtente)
                    .addComponent(EliminaUtente)
                    .addComponent(PulisciUtente))
                .addGap(27, 27, 27)
                .addComponent(ListaUtentiLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollTabella, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LibriLB.setBackground(new java.awt.Color(204, 0, 51));
        LibriLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        LibriLB.setText("LIBRI");
        LibriLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibroMouseClicked(evt);
            }
        });

        TestiLB.setBackground(new java.awt.Color(204, 0, 51));
        TestiLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TestiLB.setText("TESTI");
        TestiLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestoMouseClicked(evt);
            }
        });

        LOGOUTLB.setBackground(new java.awt.Color(204, 0, 51));
        LOGOUTLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LOGOUTLB.setText("LOGOUT");
        LOGOUTLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });

        ArticoliLB.setBackground(new java.awt.Color(204, 0, 51));
        ArticoliLB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ArticoliLB.setText("ARTICOLI SCIENTIFICI");
        ArticoliLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArticoloMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LOGOUTLB)
                                        .addComponent(LibriLB, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ArticoliLB)
                                        .addComponent(TestiLB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(7, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(ArticoliLB)
                                .addGap(18, 18, 18)
                                .addComponent(TestiLB)
                                .addGap(18, 18, 18)
                                .addComponent(LibriLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LOGOUTLB)
                                .addGap(17, 17, 17))
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
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }
    private void AggiungiUtenteMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceUtente.getText().isEmpty() || NomeUtente.getText().isEmpty() || CognomeUtente.getText().isEmpty()
                || EmailUtente.getText().isEmpty() || TelefonoUtente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Non hai inserito correttamente i dati");
        } else {
            try {
                int codice = Integer.parseInt(CodiceUtente.getText());
                if (utenteDAO.utenteExists(codice)) {
                    JOptionPane.showMessageDialog(this, "Il testo con il codice " + codice + " esiste già nel database");
                } else{
                    String nome = NomeUtente.getText();
                String cognome = CognomeUtente.getText();
                String email = EmailUtente.getText();
                Long telefono = Long.parseLong(TelefonoUtente.getText());

                utenteDAO.insertUtente(nome, cognome, email, telefono);

                JOptionPane.showMessageDialog(this, "Utente aggiunto correttamente");
                refreshUtenteTable();
                clearFields();
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice utente deve essere un numero intero");
            }
        }
    }

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

    private void EliminaUtenteMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceUtente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Inserisci il codice dell'utente da eliminare");
        } else {
            try {
                UIManager.put("OptionPane.yesButtonText", "Si");
                int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler eliminare l'utente selezionato?", "Conferma eliminazione", JOptionPane.YES_NO_OPTION);
                if (scelta == JOptionPane.YES_OPTION) {
                    int codice = Integer.parseInt(CodiceUtente.getText());
                    utenteDAO.deleteUtente(codice);
                    JOptionPane.showMessageDialog(this, "Utente eliminato correttamente");
                    refreshUtenteTable();
                    clearFields();
                }
                else {}
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice utente deve essere un numero intero");
            }
        }
    }

    private void ModificaUtenteMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceUtente.getText().isEmpty() || NomeUtente.getText().isEmpty() || CognomeUtente.getText().isEmpty()
                || EmailUtente.getText().isEmpty() || TelefonoUtente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informazioni mancanti");
        } else {
            try {
                int codice = Integer.parseInt(CodiceUtente.getText());
                String nome = NomeUtente.getText();
                String cognome = CognomeUtente.getText();
                String email = EmailUtente.getText();
                Long telefono = Long.parseLong(TelefonoUtente.getText());


                utenteDAO.updateUtente(nome, cognome, email, telefono);

                JOptionPane.showMessageDialog(this, "Utente modificato correttamente");
                refreshUtenteTable();
                clearFields();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice utente deve essere un numero intero");
            }
        }
    }
    private void refreshUtenteTable() {
        DefaultTableModel model = (DefaultTableModel) TabellaUtente.getModel();
        model.setRowCount(0); // Cancella tutte le righe attuali

        List<Utente> utenti = utenteDAO.getAllUtenti();

        for (Utente utente : utenti) {
            model.addRow(new Object[]{
                    utente.getCodUtente(),
                    utente.getNome(),
                    utente.getCognome(),
                    utente.getEmail(),
                    utente.getTelefono()
            });
        }
    }
    private void clearFields() {
        CodiceUtente.setText("");
        NomeUtente.setText("");
        CognomeUtente.setText("");
        EmailUtente.setText("");
        TelefonoUtente.setText("");
    }

    private void TestoMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
        ManagerTesto managerTesto = new ManagerTesto();
        managerTesto.setVisible(true);
    }

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {
        UIManager.put("OptionPane.yesButtonText", "Si");
        int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler uscire?", "Conferma uscita", JOptionPane.YES_NO_OPTION);

        // Verifica della scelta dell'utente
        if (scelta == JOptionPane.YES_OPTION) {
            // L'utente ha confermato l'uscita, puoi chiudere la finestra
            dispose();
            Login login = new Login();
            login.setVisible(true);
        } else {
            // L'utente ha annullato l'uscita, la finestra continua
        }
    }

    private void LibroMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
        InterfacciaLibro interfacciaLibro = new InterfacciaLibro();
        interfacciaLibro.setVisible(true);
        //interfacciaarticolo
    }

    private void ArticoloMouseClicked (java.awt.event.MouseEvent evt) {
        dispose();
        InterfacciaArticolo interfacciaArticolo = new InterfacciaArticolo();
        interfacciaArticolo.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerUtenti().setVisible(true);
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
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JLabel ListaUtentiLB;
    private javax.swing.JLabel NomeLB;
    private javax.swing.JLabel CognomeLB;
    private javax.swing.JLabel EmailLB;
    private javax.swing.JLabel TelefonoLB;
    private javax.swing.JLabel ManagerUtentiLB;
    private javax.swing.JLabel CodiceLB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane ScrollTabella;
    private javax.swing.JLabel TestiLB;
    private javax.swing.JLabel LOGOUTLB;
    private javax.swing.JLabel ArticoliLB;
    private javax.swing.JLabel LibriLB;
    // End of variables declaration//GEN-END:variables
}
