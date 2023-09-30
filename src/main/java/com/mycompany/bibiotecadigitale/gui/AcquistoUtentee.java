package main.java.com.mycompany.bibiotecadigitale.gui;

import main.java.com.mycompany.bibiotecadigitale.dao.ArticoloScientificoDAO;
import main.java.com.mycompany.bibiotecadigitale.dao.TestoDAO;
import main.java.com.mycompany.bibiotecadigitale.model.ArticoloScientifico;
import main.java.com.mycompany.bibiotecadigitale.model.Libro;
import main.java.com.mycompany.bibiotecadigitale.model.Testo;
import main.java.com.mycompany.bibiotecadigitale.dao.ArticoloScientificoDAO;
import main.java.com.mycompany.bibiotecadigitale.dao.LibroDAO;
import main.java.com.mycompany.bibiotecadigitale.model.Utente;

import java.awt.event.MouseEvent;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author franc
 */
public class AcquistoUtentee extends javax.swing.JFrame {
    private TestoDAO testoDAO;
    private ArticoloScientificoDAO articoloScientificoDAO;
    private LibroDAO libroDAO;
    public AcquistoUtentee() {
        testoDAO = new TestoDAO();
        articoloScientificoDAO = new ArticoloScientificoDAO();
        libroDAO = new LibroDAO();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ChiudiFinestra = new javax.swing.JLabel();
        BibliotecaDigitaleLB = new javax.swing.JLabel();
        TitoloTF = new javax.swing.JTextField();
        NomeLB = new javax.swing.JLabel();
        BoxTipologiaTesto = new javax.swing.JComboBox<>();
        AggiungiBTN = new javax.swing.JButton();
        PulisciBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabellaTesti = new javax.swing.JTable();
        BoxFormatoTesto = new javax.swing.JComboBox<>();
        GenereLB = new javax.swing.JLabel();
        ResocontoLB = new javax.swing.JLabel();
        FiltraBTN = new javax.swing.JButton();
        AggiornaBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResocontoTEXT = new javax.swing.JTextArea();
        ListaProdottiLB = new javax.swing.JLabel();
        RichiediOraBTN = new javax.swing.JButton();
        AnnullaBTN = new javax.swing.JButton();
        GenereTF = new javax.swing.JTextField();
        EdizioneLB = new javax.swing.JLabel();
        EdizioneTF = new javax.swing.JTextField();
        LOGOUTLB = new javax.swing.JLabel();

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
        NomeLB.setText("Titolo");

        BoxTipologiaTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Articolo Scientifico"}));

        AggiungiBTN.setText("Aggiungi");

        PulisciBTN.setText("Pulisci");
        PulisciBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciTestoMouseClicked(evt);
            }
        });

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
        ));

        TabellaTesti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabellaTestiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabellaTesti);

        BoxFormatoTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Digitale", "Cartaceo", "AudioLibro"}));

        GenereLB.setBackground(new java.awt.Color(204, 0, 51));
        GenereLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        GenereLB.setForeground(new java.awt.Color(204, 0, 51));
        GenereLB.setText("Genere");

        ResocontoLB.setBackground(new java.awt.Color(204, 0, 51));
        ResocontoLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ResocontoLB.setForeground(new java.awt.Color(204, 0, 51));
        ResocontoLB.setText("RESOCONTO:");

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

        EdizioneLB.setBackground(new java.awt.Color(204, 0, 51));
        EdizioneLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EdizioneLB.setForeground(new java.awt.Color(204, 0, 51));
        EdizioneLB.setText("Edizione");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(4, 4, 4))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(GenereTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                                .addComponent(EdizioneLB)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(EdizioneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(TitoloTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(63, 63, 63)
                                                                                .addComponent(AggiungiBTN)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(PulisciBTN)
                                                                                .addGap(30, 30, 30)))
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(BibliotecaDigitaleLB)
                                                                                .addGap(232, 232, 232)
                                                                                .addComponent(ChiudiFinestra))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                .addContainerGap())
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(GenereLB)
                                                        .addComponent(NomeLB))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(249, 249, 249)
                                                                .addComponent(BoxTipologiaTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(BoxFormatoTesto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(102, 102, 102)
                                                                .addComponent(FiltraBTN)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(AggiornaBTN))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 488, Short.MAX_VALUE)
                                                                .addComponent(ListaProdottiLB)
                                                                .addGap(212, 212, 212))))))
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
                                                        .addComponent(BoxFormatoTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(FiltraBTN)
                                                        .addComponent(AggiornaBTN))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(NomeLB)
                                                        .addComponent(TitoloTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PulisciBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(GenereLB)
                                                                        .addComponent(GenereTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(EdizioneLB)
                                                                        .addComponent(EdizioneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(56, 56, 56)
                                                                .addComponent(AggiungiBTN)))))
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

        LOGOUTLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LOGOUTLB.setText("LOGOUT");
        LOGOUTLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(LOGOUTLB, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(LOGOUTLB)
                                                .addGap(64, 64, 64))))
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
    }// </editor-fold>

    private void FiltraBTNActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RichiediOraBTNActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ChiudiFinestraMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void TabellaTestiMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        int Indice = TabellaTesti.getSelectedRow();
        if (Indice != -1) { // Verifica se è stato selezionato un elemento valido
            TitoloTF.setText(model.getValueAt(Indice, 0) != null ? model.getValueAt(Indice, 0).toString() : "");
            GenereTF.setText(model.getValueAt(Indice, 1) != null ? model.getValueAt(Indice, 1).toString() : "");
            String formato = model.getValueAt(Indice, 3) != null ? model.getValueAt(Indice, 3).toString() : "";
            EdizioneTF.setText(model.getValueAt(Indice, 4) != null ? model.getValueAt(Indice, 4).toString() : "");
            String tipologia = model.getValueAt(Indice, 6) != null ? model.getValueAt(Indice, 6).toString() : "";

            BoxFormatoTesto.setSelectedItem(formato);
            BoxTipologiaTesto.setSelectedItem(tipologia);
        }
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

    private void PulisciTestoMouseClicked (java.awt.event.MouseEvent evt)
    {
        TitoloTF.setText("");
        EdizioneTF.setText("");
        GenereTF.setText("");
    }



    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcquistoUtentee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AggiornaBTN;
    private javax.swing.JButton AggiungiBTN;
    private javax.swing.JButton AnnullaBTN;
    private javax.swing.JLabel BibliotecaDigitaleLB;
    private javax.swing.JComboBox<String> BoxFormatoTesto;
    private javax.swing.JComboBox<String> BoxTipologiaTesto;
    private javax.swing.JLabel EdizioneLB;
    private javax.swing.JTextField EdizioneTF;
    private javax.swing.JButton FiltraBTN;
    private javax.swing.JLabel GenereLB;
    private javax.swing.JTextField GenereTF;
    private javax.swing.JLabel LOGOUTLB;
    private javax.swing.JLabel ListaProdottiLB;
    private javax.swing.JLabel NomeLB;
    private javax.swing.JButton PulisciBTN;
    private javax.swing.JLabel ResocontoLB;
    private javax.swing.JTextArea ResocontoTEXT;
    private javax.swing.JButton RichiediOraBTN;
    private javax.swing.JTable TabellaTesti;
    private javax.swing.JTextField TitoloTF;
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
}

