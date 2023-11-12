package com.mycompany.bibiotecadigitale.gui;

import com.mycompany.bibiotecadigitale.implementazione_dao.ArticoloScientificoDAOImpl;
import com.mycompany.bibiotecadigitale.implementazione_dao.LibroDAOImpl;
import com.mycompany.bibiotecadigitale.implementazione_dao.TestoDAOImpl;
import com.mycompany.bibiotecadigitale.model.ArticoloScientifico;
import com.mycompany.bibiotecadigitale.model.Libro;
import com.mycompany.bibiotecadigitale.model.Testo;
import com.mycompany.bibiotecadigitale.model.Utente;
import com.mycompany.bibiotecadigitale.gui.Controller;

import java.awt.event.MouseEvent;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManagerTesto extends javax.swing.JFrame {
    private TestoDAOImpl testoDAO;
    private ArticoloScientificoDAOImpl articoloScientificoDAO;
    private LibroDAOImpl libroDAO;
    private Controller controller;
    private int codiceAdmin;
    public ManagerTesto(){
        initComponents();
        testoDAO = new TestoDAOImpl();
        articoloScientificoDAO = new ArticoloScientificoDAOImpl();
        libroDAO = new LibroDAOImpl();
        refreshTestoTable();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ChiudiFinestra = new javax.swing.JLabel();
        ManagerTestiLB = new javax.swing.JLabel();
        CodiceLB = new javax.swing.JLabel();
        TipologiaLB = new javax.swing.JLabel();
        CodiceTestoTF = new javax.swing.JTextField();
        TitoloTestoTF = new javax.swing.JTextField();
        TitoloLB = new javax.swing.JLabel();
        TipologiaTesto = new javax.swing.JComboBox<>();
        AggiungiTestoBTN = new javax.swing.JButton();
        ModificaTestoBTN = new javax.swing.JButton();
        EliminaTestoBTN = new javax.swing.JButton();
        PulisciTestoBTN = new javax.swing.JButton();
        ScrollTabella = new javax.swing.JScrollPane();
        TabellaTesti = new javax.swing.JTable();
        AnnoPubblicazioneLB = new javax.swing.JLabel();
        AnnoPubblicazioneTestoTF = new javax.swing.JTextField();
        EdizioneTestoTF = new javax.swing.JTextField();
        FormatoLB = new javax.swing.JLabel();
        EdizioneLB = new javax.swing.JLabel();
        FormTesto = new javax.swing.JComboBox<>();
        TipologiaLB2 = new javax.swing.JLabel();
        DisponibilitaLB = new javax.swing.JLabel();
        DisponibilitaTesto = new javax.swing.JComboBox<>();
        ArticoliLB = new javax.swing.JLabel();
        LibriLB = new javax.swing.JLabel();
        LOGOUTLB = new javax.swing.JLabel();
        UtentiLB = new javax.swing.JLabel();
        ModificaPasswordLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ChiudiFinestra.setBackground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setFont(new java.awt.Font("Century Gothic", 1, 24));
        ChiudiFinestra.setForeground(new java.awt.Color(204, 0, 51));
        ChiudiFinestra.setText("x");
        ChiudiFinestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChiudiFinestraMouseClicked(evt);
            }
        });

        ManagerTestiLB.setBackground(new java.awt.Color(204, 0, 51));
        ManagerTestiLB.setFont(new java.awt.Font("Century Gothic", 1, 24));
        ManagerTestiLB.setForeground(new java.awt.Color(204, 0, 51));
        ManagerTestiLB.setText("MANAGER TESTI");

        CodiceLB.setBackground(new java.awt.Color(204, 0, 51));
        CodiceLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        CodiceLB.setForeground(new java.awt.Color(204, 0, 51));
        CodiceLB.setText("Codice");
        CodiceLB.setToolTipText("");

        TipologiaLB.setBackground(new java.awt.Color(204, 0, 51));
        TipologiaLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        TipologiaLB.setForeground(new java.awt.Color(204, 0, 51));
        TipologiaLB.setText("Tipologia");

        TitoloLB.setBackground(new java.awt.Color(204, 0, 51));
        TitoloLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        TitoloLB.setForeground(new java.awt.Color(204, 0, 51));
        TitoloLB.setText("Titolo");

        TipologiaTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Articolo Scientifico"}));

        AggiungiTestoBTN.setText("Aggiungi");
        AggiungiTestoBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AggiungiTestoMouseClicked(evt);
            }
        });

        ModificaTestoBTN.setText("Modifica");
        ModificaTestoBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificaTestoMouseClicked(evt);
            }
        });
        EliminaTestoBTN.setText("Elimina");
        EliminaTestoBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminaTestoMouseClicked(evt);
            }
        });
        PulisciTestoBTN.setText("Pulisci");
        PulisciTestoBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciTestoMouseClicked(evt);
            }
        });

        TabellaTesti.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {
                        "Codice", "Titolo", "Anno Pubblicazione", "Edizione", "Disponibilita", "Formato", "Tipologia"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollTabella.setViewportView(TabellaTesti);
        TabellaTesti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabellaTestoMouseClicked(evt);
            }
        });


        AnnoPubblicazioneLB.setBackground(new java.awt.Color(204, 0, 51));
        AnnoPubblicazioneLB.setFont(new java.awt.Font("Century Gothic", 1, 12));
        AnnoPubblicazioneLB.setForeground(new java.awt.Color(204, 0, 51));
        AnnoPubblicazioneLB.setText("Anno Pubblicazione");

        FormatoLB.setBackground(new java.awt.Color(204, 0, 51));
        FormatoLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        FormatoLB.setForeground(new java.awt.Color(204, 0, 51));
        FormatoLB.setText("Formato");

        EdizioneLB.setBackground(new java.awt.Color(204, 0, 51));
        EdizioneLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        EdizioneLB.setForeground(new java.awt.Color(204, 0, 51));
        EdizioneLB.setText("Edizione");

        FormTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Digitale", "Cartaceo", "AudioLibro"}));

        TipologiaLB2.setBackground(new java.awt.Color(204, 0, 51));
        TipologiaLB2.setFont(new java.awt.Font("Century Gothic", 1, 14));
        TipologiaLB2.setForeground(new java.awt.Color(204, 0, 51));
        TipologiaLB2.setText("Tipologia");

        DisponibilitaLB.setBackground(new java.awt.Color(204, 0, 51));
        DisponibilitaLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        DisponibilitaLB.setForeground(new java.awt.Color(204, 0, 51));
        DisponibilitaLB.setText("Disponibilità");

        DisponibilitaTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False"}));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                .addGap(205, 205, 205)
                                                                                .addComponent(ManagerTestiLB))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(CodiceLB, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                        .addComponent(TitoloLB)
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                        .addGap(97, 97, 97)
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(CodiceTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(TitoloTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(AnnoPubblicazioneTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(DisponibilitaTesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                        .addGap(92, 92, 92)
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(EdizioneLB)
                                                                                                                                                .addComponent(FormatoLB))
                                                                                                                                        .addGap(23, 23, 23))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                                                                        .addComponent(TipologiaLB2)
                                                                                                                                        .addGap(18, 18, 18)))
                                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                .addComponent(EdizioneTestoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                                                                                                .addComponent(FormTesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                .addComponent(TipologiaTesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                                        .addComponent(EliminaTestoBTN)
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                        .addComponent(PulisciTestoBTN)
                                                                                                                        .addGap(35, 35, 35))))
                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                        .addGap(51, 51, 51)
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                                        .addComponent(AggiungiTestoBTN)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(ModificaTestoBTN))
                                                                                                                .addComponent(ScrollTabella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                                                .addGap(43, 43, Short.MAX_VALUE)
                                                                .addComponent(ChiudiFinestra))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(AnnoPubblicazioneLB)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(128, 128, 128)
                                                                .addComponent(TipologiaLB))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(DisponibilitaLB)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ManagerTestiLB)
                                        .addComponent(ChiudiFinestra))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(CodiceLB)
                                                        .addComponent(CodiceTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EdizioneTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EdizioneLB))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TitoloTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TitoloLB)
                                                        .addComponent(FormatoLB)
                                                        .addComponent(FormTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AnnoPubblicazioneLB)
                                                        .addComponent(AnnoPubblicazioneTestoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TipologiaTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TipologiaLB2))
                                                .addGap(18, 18, 18)
                                                .addComponent(DisponibilitaTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(DisponibilitaLB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(TipologiaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AggiungiTestoBTN)
                                        .addComponent(ModificaTestoBTN)
                                        .addComponent(EliminaTestoBTN)
                                        .addComponent(PulisciTestoBTN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScrollTabella, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ArticoliLB.setBackground(new java.awt.Color(204, 0, 51));
        ArticoliLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        ArticoliLB.setText("ARTICOLI SCIENTIFICI");
        ArticoliLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArticoloMouseClicked(evt);
            }
        });

        LibriLB.setBackground(new java.awt.Color(204, 0, 51));
        LibriLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        LibriLB.setText("LIBRI");
        LibriLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibroMouseClicked(evt);
            }
        });

        LOGOUTLB.setBackground(new java.awt.Color(204, 0, 51));
        LOGOUTLB.setFont(new java.awt.Font("Century Gothic", 1, 24));
        LOGOUTLB.setText("LOGOUT");
        LOGOUTLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });

        ModificaPasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        ModificaPasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 16));
        ModificaPasswordLB.setText("Modifica Password");
        ModificaPasswordLB.setToolTipText("");
        ModificaPasswordLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificaPasswordMouseClicked(evt);
            }
        });

        UtentiLB.setBackground(new java.awt.Color(204, 0, 51));
        UtentiLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        UtentiLB.setText("UTENTI");
        UtentiLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UtenteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(ArticoliLB))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(LibriLB))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(UtentiLB))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(ModificaPasswordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(LOGOUTLB)))
                                .addGap(20, 20, 20)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(ArticoliLB)
                                .addGap(18, 18, 18)
                                .addComponent(LibriLB)
                                .addGap(18, 18, 18)
                                .addComponent(UtentiLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ModificaPasswordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LOGOUTLB)
                                .addGap(51, 51, 51))
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
    }

    private void ChiudiFinestraMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ChiudiApp();
    }
    public void setController(Controller controller)
    {
        this.controller = controller;
    }
    protected void setCodice (int codice)
    {
        this.codiceAdmin = codice;
    }
    protected int getCodice ()
    {
        return this.codiceAdmin;
    }
    private void AggiungiTestoMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceTestoTF.getText().isEmpty() || TitoloTestoTF.getText().isEmpty() || EdizioneTestoTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Non hai inserito correttamente i dati");
        } else {
            try {
                int codice = Integer.parseInt(CodiceTestoTF.getText());
                // Verifica se il testo con lo stesso codice già esiste nel database
                if (testoDAO.testoExists(codice)) {
                    JOptionPane.showMessageDialog(this, "Il testo con il codice " + codice + " esiste già nel database");
                } else {
                    String titolo = TitoloTestoTF.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date annoPubblicazione = dateFormat.parse(AnnoPubblicazioneTestoTF.getText());
                    String edizione = EdizioneTestoTF.getText();
                    boolean disponibilita = Boolean.parseBoolean(DisponibilitaTesto.getSelectedItem().toString());
                    String formato = FormTesto.getSelectedItem().toString();
                    String tipologia = TipologiaTesto.getSelectedItem().toString();

                    // Verifica se esiste un testo con gli stessi attributi (tranne il codice)
                    if (testoDAO.testoExistsWithSameAttributes(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia)) {
                        JOptionPane.showMessageDialog(this, "Esiste già un testo con gli stessi attributi nel database");
                    } else {
                        // Continua con l'inserimento del nuovo testo nel database
                        if (tipologia.equals("Libro")) {
                            // Inserisci il testo come Libro con attributi di default
                            String genere = "Non disponibile";
                            int capitoli = 0;
                            int pagine = 0;
                            String evento = "Non disponibile";
                            String Collana = "Non disponibile";
                            try {
                                Libro libro = new Libro(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia, genere, capitoli, pagine, evento, Collana);
                                libroDAO.insertLibro(libro);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, "C'è stato un problema con l'inserimento del libro");
                            }
                        } else if (tipologia.equals("Articolo Scientifico")) {
                            // Inserisci il testo come Articolo Scientifico con attributi aggiunti
                            String universita = "Non disponibile"; // Imposta il valore di default
                            String riassunto = "Non disponibile"; // Imposta il valore di default
                            String nomeRivista = "Non disponibile";
                            String argomento = "Non disponibile";
                            String responsabile = "Non disponibile";
                            String luogoConferenza = "Non disponibile";
                            Date dataConferenza = new Date(); // Imposta il valore di default

                            try {
                                ArticoloScientifico articolo = new ArticoloScientifico(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia, universita, riassunto, nomeRivista, argomento, responsabile, luogoConferenza, dataConferenza);
                                articoloScientificoDAO.insertArticoloScientifico(articolo);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, "C'è stato un problema con l'inserimento dell'articolo");
                            }
                        }

                        JOptionPane.showMessageDialog(this, "Testo aggiunto correttamente, assicurati di inserire i dati appositi.");
                        refreshTestoTable();
                        clearTextFields();
                    }
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Errore nella data di pubblicazione. Utilizza il formato 'yyyy-MM-dd'");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Assicurati di inserire un numero valido per i campi Genere, Capitoli e Pagine, se necessario.");
            }
        }
    }

    private void TabellaTestoMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        int Indice = TabellaTesti.getSelectedRow();

        if (Indice != -1) { // Verifica se è stato selezionato un elemento valido
            CodiceTestoTF.setText(model.getValueAt(Indice, 0) != null ? model.getValueAt(Indice, 0).toString() : "");
            TitoloTestoTF.setText(model.getValueAt(Indice, 1) != null ? model.getValueAt(Indice, 1).toString() : "");

            // Verifica se la data è nulla prima di convertirla in una stringa
            Object annoPubblicazioneValue = model.getValueAt(Indice, 2);
            if (annoPubblicazioneValue != null) {
                java.util.Date annoPubblicazioneDate = (java.util.Date) annoPubblicazioneValue;
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String annoPubblicazioneString = dateFormat.format(annoPubblicazioneDate);
                AnnoPubblicazioneTestoTF.setText(annoPubblicazioneString);
            } else {
                AnnoPubblicazioneTestoTF.setText("");
            }

            EdizioneTestoTF.setText(model.getValueAt(Indice, 3) != null ? model.getValueAt(Indice, 3).toString() : "");


            String disponibilita = model.getValueAt(Indice, 4) != null ? model.getValueAt(Indice, 4).toString() : "";
            String formato = model.getValueAt(Indice, 5) != null ? model.getValueAt(Indice, 5).toString() : "";
            String tipologia = model.getValueAt(Indice, 6) != null ? model.getValueAt(Indice, 6).toString() : "";

            DisponibilitaTesto.setSelectedItem(disponibilita);
            FormTesto.setSelectedItem(formato);
            TipologiaTesto.setSelectedItem(tipologia);
        }
    }

    private void ModificaTestoMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceTestoTF.getText().isEmpty() || TitoloTestoTF.getText().isEmpty() || EdizioneTestoTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informazioni mancanti");
        } else {
            try {
                int codice = Integer.parseInt(CodiceTestoTF.getText());
                String titolo = TitoloTestoTF.getText();

                // Ottenere la data come stringa dal campo AnnoPubblicazioneTesto
                String annoPubblicazioneText = AnnoPubblicazioneTestoTF.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date annoPubblicazione = dateFormat.parse(annoPubblicazioneText);

                String edizione = EdizioneTestoTF.getText();
                boolean disponibilita = Boolean.parseBoolean(DisponibilitaTesto.getSelectedItem().toString());
                String formato = FormTesto.getSelectedItem().toString();
                String tipologia = TipologiaTesto.getSelectedItem().toString();

                Testo testo = new Testo(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia);
                testoDAO.updateTesto(testo);

                JOptionPane.showMessageDialog(this, "Testo modificato correttamente");
                refreshTestoTable();
                clearTextFields();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice testo deve essere un numero intero");
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Formato data non valido. Utilizzare il formato yyyy-MM-dd");
            }
        }
    }

    private void EliminaTestoMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceTestoTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Inserisci il codice del testo da eliminare");
        } else {
            try {
                UIManager.put("OptionPane.yesButtonText", "Si");
                int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler eliminare il testo selezionato?", "Conferma eliminazione", JOptionPane.YES_NO_OPTION);
                if (scelta == JOptionPane.YES_OPTION) {
                    int codice = Integer.parseInt(CodiceTestoTF.getText());
                    String tipologia = TipologiaTesto.getSelectedItem().toString();
                    if(tipologia.equals("Libro"))
                    {
                        libroDAO.deleteLibro(codice);
                    }
                    if(tipologia.equals("Articolo Scientifico"))
                    {
                        articoloScientificoDAO.deleteArticoloScientifico(codice);
                    }
                    JOptionPane.showMessageDialog(this, "Testo eliminato correttamente");
                    refreshTestoTable();
                    clearTextFields();
                }
                else {}
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice testo deve essere un numero intero");
            }
        }
    }

    private void LibroMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ApriLibri();
    }

    private void ArticoloMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ApriArticoli();
    }

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {
        UIManager.put("OptionPane.yesButtonText", "Si");
        int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler uscire?", "Conferma uscita", JOptionPane.YES_NO_OPTION);

        // Verifica della scelta dell'utente
        if (scelta == JOptionPane.YES_OPTION) {
            // L'utente ha confermato l'uscita, puoi chiudere la finestra
            controller.Logout();
        } else {
            // L'utente ha annullato l'uscita, la finestra continua
        }
    }
    private void ModificaPasswordMouseClicked(java.awt.event.MouseEvent evt) {
        UIManager.put("OptionPane.yesButtonText", "Si");
        int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler modificare la password? Verrà aperta una nuova finestra per la modifica della password.", "Conferma modifica", JOptionPane.YES_NO_OPTION);

        // Verifica della scelta dell'utente
        if (scelta == JOptionPane.YES_OPTION) {
            controller.ApriModificaAdmin();
        } else {
            // L'utente ha annullato l'uscita, la finestra continua
        }
    }

    private void UtenteMouseClicked (java.awt.event.MouseEvent evt) {
        controller.ApriUtenti();
    }
    private void PulisciTestoMouseClicked (java.awt.event.MouseEvent evt)
    {
        TitoloTestoTF.setText("");
        CodiceTestoTF.setText("");
        EdizioneTestoTF.setText("");
        DisponibilitaTesto.setSelectedIndex(0);
        FormTesto.setSelectedIndex(0);
        TipologiaTesto.setSelectedIndex(0);
        AnnoPubblicazioneTestoTF.setText("");
    }

    protected void refreshTestoTable() {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        model.setRowCount(0); // Cancella tutte le righe attuali

        List<Testo> testi = testoDAO.getAllTesti();

        for (Testo testo : testi) {
            model.addRow(new Object[]{
                    testo.getCodTesto(),
                    testo.getTitolo(),
                    testo.getAnnoPubblicazione(),
                    testo.getEdizione(),
                    testo.isDisponibilita() ? "True" : "False",
                    testo.getFormato(),
                    testo.getTipologia()
            });
        }
    }

    private void clearTextFields() {
        CodiceTestoTF.setText("");
        TitoloTestoTF.setText("");
        AnnoPubblicazioneTestoTF.setText("");
        EdizioneTestoTF.setText("");
        DisponibilitaTesto.setSelectedIndex(0);
        FormTesto.setSelectedIndex(0);
        TipologiaTesto.setSelectedIndex(0);
    }

    private javax.swing.JButton AggiungiTestoBTN;
    private javax.swing.JTextField AnnoPubblicazioneTestoTF;
    private javax.swing.JTextField CodiceTestoTF;
    private javax.swing.JComboBox<String> DisponibilitaTesto;
    private javax.swing.JTextField EdizioneTestoTF;
    private javax.swing.JButton EliminaTestoBTN;
    private javax.swing.JComboBox<String> FormTesto;
    private javax.swing.JButton ModificaTestoBTN;
    private javax.swing.JButton PulisciTestoBTN;
    private javax.swing.JTable TabellaTesti;
    private javax.swing.JComboBox<String> TipologiaTesto;
    private javax.swing.JTextField TitoloTestoTF;
    private javax.swing.JLabel FormatoLB;
    private javax.swing.JLabel EdizioneLB;
    private javax.swing.JLabel TipologiaLB2;
    private javax.swing.JLabel DisponibilitaLB;
    private javax.swing.JLabel ManagerTestiLB;
    private javax.swing.JLabel CodiceLB;
    private javax.swing.JLabel TipologiaLB;
    private javax.swing.JLabel TitoloLB;
    private javax.swing.JLabel AnnoPubblicazioneLB;
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane ScrollTabella;
    private javax.swing.JLabel UtentiLB;
    private javax.swing.JLabel LOGOUTLB;
    private javax.swing.JLabel ModificaPasswordLB;
    private javax.swing.JLabel ArticoliLB;
    private javax.swing.JLabel LibriLB;
}
