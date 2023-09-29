package com.mycompany.bibiotecadigitale.gui;

/**
 *
 * @author franc
 */
public class AcquistoUtentee extends javax.swing.JFrame {

    public AcquistoUtentee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ChiudiFinestra = new javax.swing.JLabel();
        BibliotecaDigitaleLB = new javax.swing.JLabel();
        NomeTestoTF = new javax.swing.JTextField();
        NomeLB = new javax.swing.JLabel();
        BoxTipologiaTesto = new javax.swing.JComboBox<>();
        AggiungiTestoBTN = new javax.swing.JButton();
        PulisciTestoBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabellaTesti = new javax.swing.JTable();
        BoxTipologiaTesto2 = new javax.swing.JComboBox<>();
        QuantitaLB = new javax.swing.JLabel();
        ResocontoLB = new javax.swing.JLabel();
        BoxQuantita = new javax.swing.JComboBox<>();
        FiltraBTN = new javax.swing.JButton();
        AggiornaBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResocontoTEXT = new javax.swing.JTextArea();
        ListaProdottiLB = new javax.swing.JLabel();
        RichiediOraBTN = new javax.swing.JButton();
        AnnullaBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ChiudiFinestra.setBackground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ChiudiFinestra.setForeground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setText("x");
        ChiudiFinestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChiudiFinestraMouseClicked(evt);
            }
        });

        BibliotecaDigitaleLB.setBackground(new java.awt.Color(204, 0, 51));
        BibliotecaDigitaleLB.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        BibliotecaDigitaleLB.setForeground(new java.awt.Color(204, 0, 51));
        BibliotecaDigitaleLB.setText("BIBLIOTECA DIGITALE");

        NomeLB.setBackground(new java.awt.Color(204, 0, 51));
        NomeLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        NomeLB.setForeground(new java.awt.Color(204, 0, 51));
        NomeLB.setText("Nome");

        BoxTipologiaTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Articolo Scientifico"}));

        AggiungiTestoBTN.setText("Aggiungi");

        PulisciTestoBTN.setText("Pulisci");

        TabellaTesti.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "Titolo", "Genere", "Anno Pubblicazione", "Formato", "Edizione", "Disponibilità", "Tipologia"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabellaTesti);

        BoxTipologiaTesto2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Digitale", "Cartaceo", "AudioLibro"}));

        QuantitaLB.setBackground(new java.awt.Color(204, 0, 51));
        QuantitaLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        QuantitaLB.setForeground(new java.awt.Color(204, 0, 51));
        QuantitaLB.setText("Quantità");

        ResocontoLB.setBackground(new java.awt.Color(204, 0, 51));
        ResocontoLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ResocontoLB.setForeground(new java.awt.Color(204, 0, 51));
        ResocontoLB.setText("RESOCONTO:");

        BoxQuantita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        FiltraBTN.setText("Filtra");
        FiltraBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltraBTNActionPerformed(evt);
            }
        });

        AggiornaBTN.setText("Aggiorna");

        ResocontoTEXT.setColumns(20);
        ResocontoTEXT.setRows(5);
        jScrollPane2.setViewportView(ResocontoTEXT);

        ListaProdottiLB.setBackground(new java.awt.Color(204, 0, 51));
        ListaProdottiLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ListaProdottiLB.setForeground(new java.awt.Color(204, 0, 51));
        ListaProdottiLB.setText("LISTA PRODOTTI");

        RichiediOraBTN.setText("Richiedi Ora");
        RichiediOraBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RichiediOraBTNActionPerformed(evt);
            }
        });

        AnnullaBTN.setText("Annulla");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(AggiungiTestoBTN)
                                                .addGap(39, 39, 39)
                                                .addComponent(PulisciTestoBTN)
                                                .addGap(66, 66, 66)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(BibliotecaDigitaleLB)
                                                                .addGap(250, 250, 250)
                                                                .addComponent(ChiudiFinestra))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(QuantitaLB)
                                                                        .addComponent(NomeLB))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(BoxQuantita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(149, 149, 149)
                                                                                .addComponent(BoxTipologiaTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(BoxTipologiaTesto2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(112, 112, 112)
                                                                                .addComponent(FiltraBTN)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(AggiornaBTN))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(NomeTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(ListaProdottiLB)
                                                                                .addGap(206, 206, 206)))))))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ResocontoLB)
                                .addGap(400, 400, 400))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(RichiediOraBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(AnnullaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(BibliotecaDigitaleLB)
                                                        .addComponent(ChiudiFinestra))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ListaProdottiLB)
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(BoxTipologiaTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(BoxTipologiaTesto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(FiltraBTN)
                                                        .addComponent(AggiornaBTN))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(NomeLB)
                                                        .addComponent(NomeTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(BoxQuantita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(QuantitaLB))
                                                .addGap(47, 47, 47)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AggiungiTestoBTN)
                                                        .addComponent(PulisciTestoBTN))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(ResocontoLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RichiediOraBTN)
                                        .addComponent(AnnullaBTN))
                                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void FiltraBTNActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RichiediOraBTNActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(AcquistoUtentee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcquistoUtentee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcquistoUtentee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcquistoUtentee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcquistoUtentee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AggiornaBTN;
    private javax.swing.JButton AggiungiTestoBTN;
    private javax.swing.JButton AnnullaBTN;
    private javax.swing.JLabel BibliotecaDigitaleLB;
    private javax.swing.JComboBox<String> BoxQuantita;
    private javax.swing.JComboBox<String> BoxTipologiaTesto;
    private javax.swing.JComboBox<String> BoxTipologiaTesto2;
    private javax.swing.JButton FiltraBTN;
    private javax.swing.JLabel ListaProdottiLB;
    private javax.swing.JLabel NomeLB;
    private javax.swing.JTextField NomeTestoTF;
    private javax.swing.JButton PulisciTestoBTN;
    private javax.swing.JLabel QuantitaLB;
    private javax.swing.JLabel ResocontoLB;
    private javax.swing.JTextArea ResocontoTEXT;
    private javax.swing.JButton RichiediOraBTN;
    private javax.swing.JTable TabellaTesti;
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
}
