package com.mycompany.bibiotecadigitale.gui;

import com.mycompany.bibiotecadigitale.dao.ArticoloScientificoDAO;
import com.mycompany.bibiotecadigitale.dao.TestoDAO;
import com.mycompany.bibiotecadigitale.model.ArticoloScientifico;
import com.mycompany.bibiotecadigitale.model.Libro;
import com.mycompany.bibiotecadigitale.model.Testo;
import com.mycompany.bibiotecadigitale.dao.ArticoloScientificoDAO;
import com.mycompany.bibiotecadigitale.dao.LibroDAO;
import com.mycompany.bibiotecadigitale.model.Utente;

import java.awt.event.MouseEvent;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagerTesto extends javax.swing.JFrame {
    private TestoDAO testoDAO;
    private ArticoloScientificoDAO articoloScientificoDAO;
    private LibroDAO libroDAO;
    public ManagerTesto(){
        initComponents();
        testoDAO = new TestoDAO();
        articoloScientificoDAO = new ArticoloScientificoDAO();
        libroDAO = new LibroDAO();
        refreshTestoTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        //FormatoTesto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CodiceTesto = new javax.swing.JTextField();
        TitoloTesto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TipologiaTesto = new javax.swing.JComboBox<>();
        AggiungiTesto = new javax.swing.JButton();
        ModificaTesto = new javax.swing.JButton();
        EliminaTesto = new javax.swing.JButton();
        PulisciTesto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabellaTesti = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        AnnoPubblicazioneTesto = new javax.swing.JTextField();
        EdizioneTesto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FormTesto = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DisponibilitaTesto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(204, 0, 51));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("x");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 0, 51));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("MANAGER TESTI");

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Codice");
        jLabel5.setToolTipText("");

        jLabel6.setBackground(new java.awt.Color(204, 0, 51));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Tipologia");

        CodiceTesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodiceTestoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 0, 51));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Titolo");

        TipologiaTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Articolo Scientifico", " ", " " }));

        AggiungiTesto.setText("Aggiungi");
        AggiungiTesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AggiungiTestoMouseClicked(evt);
            }
        });

        ModificaTesto.setText("Modifica");
        ModificaTesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificaTestoMouseClicked(evt);
            }
        });
        EliminaTesto.setText("Elimina");
        EliminaTesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminaTestoMouseClicked(evt);
            }
        });
        PulisciTesto.setText("Pulisci");
        PulisciTesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciTestoMouseClicked(evt);
            }
        });
        TabellaTesti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabellaTestoMouseClicked(evt);
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
                        "Titolo", "Genere", "Anno Pubblicazione", "Formato", "Disponibilita", "Edizione", "Tipologia"
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

        jLabel8.setBackground(new java.awt.Color(204, 0, 51));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Anno Pubblicazione");

        jLabel10.setBackground(new java.awt.Color(204, 0, 51));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Formato");

        jLabel11.setBackground(new java.awt.Color(204, 0, 51));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Edizione");

        FormTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Digitale", "Cartaceo", "AudioLibro", " " }));

        jLabel12.setBackground(new java.awt.Color(204, 0, 51));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("Tipologia");

        jLabel13.setBackground(new java.awt.Color(204, 0, 51));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setText("Disponibilità");

        DisponibilitaTesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False", " " }));

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
                                                                                .addComponent(jLabel3))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel7)
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                        .addGap(97, 97, 97)
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(CodiceTesto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(TitoloTesto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(AnnoPubblicazioneTesto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(DisponibilitaTesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                        .addGap(92, 92, 92)
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel11)
                                                                                                                                                .addComponent(jLabel10))
                                                                                                                                        .addGap(23, 23, 23))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                                                                        .addComponent(jLabel12)
                                                                                                                                        .addGap(18, 18, 18)))
                                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                .addComponent(EdizioneTesto, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                                                                                                .addComponent(FormTesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                .addComponent(TipologiaTesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                                        .addComponent(EliminaTesto)
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                        .addComponent(PulisciTesto)
                                                                                                                        .addGap(35, 35, 35))))
                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                        .addGap(51, 51, 51)
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                                        .addComponent(AggiungiTesto)
                                                                                                                        .addGap(18, 18, 18)
                                                                                                                        .addComponent(ModificaTesto))
                                                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                                                .addGap(43, 43, Short.MAX_VALUE)
                                                                .addComponent(jLabel9))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(128, 128, 128)
                                                                .addComponent(jLabel6))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel13)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel9))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(CodiceTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EdizioneTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TitoloTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel10)
                                                        .addComponent(FormTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(AnnoPubblicazioneTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TipologiaTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel12))
                                                .addGap(18, 18, 18)
                                                .addComponent(DisponibilitaTesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AggiungiTesto)
                                        .addComponent(ModificaTesto)
                                        .addComponent(EliminaTesto)
                                        .addComponent(PulisciTesto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>

    private void CodiceTestoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }


    private void AggiungiTestoMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceTesto.getText().isEmpty() || TitoloTesto.getText().isEmpty() || EdizioneTesto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Non hai inserito correttamente i dati");
        } else {
            try {
                int codice = Integer.parseInt(CodiceTesto.getText());
                // Verifica se il testo con lo stesso codice già esiste nel database
                if (testoDAO.testoExists(codice)) {
                    JOptionPane.showMessageDialog(this, "Il testo con il codice " + codice + " esiste già nel database");
                } else {
                    String titolo = TitoloTesto.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date annoPubblicazione = dateFormat.parse(AnnoPubblicazioneTesto.getText());
                    String edizione = EdizioneTesto.getText();
                    boolean disponibilita = DisponibilitaTesto.getSelectedItem().toString().equals("Disponibile");
                    String formato = FormTesto.getSelectedItem().toString();
                    String tipologia = TipologiaTesto.getSelectedItem().toString();
                    if (tipologia.equals("Libro")) {
                        // Inserisci il testo come Libro con attributi di default
                        String genere = "Non disponibile"; // Imposta il valore di default
                        int capitoli = 0; // Imposta il valore di default
                        int pagine = 0; // Imposta il valore di default
                        try {
                            Libro libro = new Libro(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia, genere, capitoli, pagine);
                            libroDAO.insertLibro(libro);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "C'è stato un problema con l'inserimento del libro");
                        }

                    }
                    if (tipologia.equals("Articolo Scientifico")) {
                        // Inserisci il testo come Articolo Scientifico con attributi di default
                        String universita = "Non disponibile"; // Imposta il valore di default
                        String riassunto = "Non disponibile"; // Imposta il valore di default
                        try {
                            ArticoloScientifico articolo = new ArticoloScientifico(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia, universita, riassunto);
                            articoloScientificoDAO.insertArticoloScientifico(articolo);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "C'è stato un problema con l'inserimento dell'articolo");
                        }


                    }
                    // Inserisci il testo come generico (Testo)
                    //Testo testo = new Testo(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia);
                    //testoDAO.insertTesto(testo);

                    JOptionPane.showMessageDialog(this, "Testo aggiunto correttamente");
                    refreshTestoTable();
                    clearTextFields();
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
            CodiceTesto.setText(model.getValueAt(Indice, 0) != null ? model.getValueAt(Indice, 0).toString() : "");
            TitoloTesto.setText(model.getValueAt(Indice, 1) != null ? model.getValueAt(Indice, 1).toString() : "");

            // Verifica se la data è nulla prima di convertirla in una stringa
            Object annoPubblicazioneValue = model.getValueAt(Indice, 2);
            if (annoPubblicazioneValue != null) {
                java.util.Date annoPubblicazioneDate = (java.util.Date) annoPubblicazioneValue;
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String annoPubblicazioneString = dateFormat.format(annoPubblicazioneDate);
                AnnoPubblicazioneTesto.setText(annoPubblicazioneString);
            } else {
                AnnoPubblicazioneTesto.setText("");
            }

            EdizioneTesto.setText(model.getValueAt(Indice, 3) != null ? model.getValueAt(Indice, 3).toString() : "");

            // Imposta il valore selezionato nei JComboBox
            String disponibilita = model.getValueAt(Indice, 4) != null ? model.getValueAt(Indice, 4).toString() : "";
            String formato = model.getValueAt(Indice, 5) != null ? model.getValueAt(Indice, 5).toString() : "";
            String tipologia = model.getValueAt(Indice, 6) != null ? model.getValueAt(Indice, 6).toString() : "";

            DisponibilitaTesto.setSelectedItem(disponibilita);
            FormTesto.setSelectedItem(formato);
            TipologiaTesto.setSelectedItem(tipologia);
        }
    }

    private void ModificaTestoMouseClicked(java.awt.event.MouseEvent evt) {
        if (CodiceTesto.getText().isEmpty() || TitoloTesto.getText().isEmpty() || EdizioneTesto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informazioni mancanti");
        } else {
            try {
                int codice = Integer.parseInt(CodiceTesto.getText());
                String titolo = TitoloTesto.getText();

                // Ottenere la data come stringa dal campo AnnoPubblicazioneTesto
                String annoPubblicazioneText = AnnoPubblicazioneTesto.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date annoPubblicazione = dateFormat.parse(annoPubblicazioneText);

                String edizione = EdizioneTesto.getText();
                boolean disponibilita = DisponibilitaTesto.getSelectedItem().toString().equals("Disponibile");
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
        if (CodiceTesto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Inserisci il codice del testo da eliminare");
        } else {
            try {
                int codice = Integer.parseInt(CodiceTesto.getText());
                String tipologia = TipologiaTesto.getSelectedItem().toString();
                if(tipologia.equals("Libro"))
                {
                    libroDAO.deleteLibro(codice);
                }
                if(tipologia.equals("Articolo Scientifico"))
                {
                    articoloScientificoDAO.deleteArticoloScientifico(codice);
                }
                //libroDAO.deleteLibro(codice);
                //articoloScientificoDAO.deleteArticoloScientifico(codice);
                //estoDAO.deleteTesto(codice);
                JOptionPane.showMessageDialog(this, "Testo eliminato correttamente");
                refreshTestoTable();
                clearTextFields();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice testo deve essere un numero intero");
            }
        }
    }
    private void PulisciTestoMouseClicked (java.awt.event.MouseEvent evt)
    {
        TitoloTesto.setText("");
        CodiceTesto.setText("");
        EdizioneTesto.setText("");
        DisponibilitaTesto.setSelectedIndex(0);
        FormTesto.setSelectedIndex(0);
        TipologiaTesto.setSelectedIndex(0);
    }

    private void refreshTestoTable() {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        model.setRowCount(0); // Cancella tutte le righe attuali

        List<Testo> testi = testoDAO.getAllTesti();

        for (Testo testo : testi) {
            model.addRow(new Object[]{
                    testo.getCodTesto(),
                    testo.getTitolo(),
                    testo.getAnnoPubblicazione(),
                    testo.getEdizione(),
                    testo.isDisponibilita() ? "True" : "False", // Modifica la rappresentazione della disponibilità
                    testo.getFormato(),
                    testo.getTipologia()
            });
        }
    }

    private void clearTextFields() {
        CodiceTesto.setText("");
        TitoloTesto.setText("");
        AnnoPubblicazioneTesto.setText("");
        EdizioneTesto.setText("");
        DisponibilitaTesto.setSelectedIndex(0); // Imposta la selezione predefinita
        FormTesto.setSelectedIndex(0); // Imposta la selezione predefinita
        TipologiaTesto.setSelectedIndex(0); // Imposta la selezione predefinita
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
            java.util.logging.Logger.getLogger(ManagerTesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerTesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerTesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerTesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerTesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AggiungiTesto;
    private javax.swing.JTextField AnnoPubblicazioneTesto;
    private javax.swing.JTextField CodiceTesto;
    private javax.swing.JComboBox<String> DisponibilitaTesto;
    private javax.swing.JTextField EdizioneTesto;
    private javax.swing.JButton EliminaTesto;
    private javax.swing.JComboBox<String> FormTesto;
    private javax.swing.JButton ModificaTesto;
    private javax.swing.JButton PulisciTesto;
    private javax.swing.JTable TabellaTesti;
    private javax.swing.JComboBox<String> TipologiaTesto;
    private javax.swing.JTextField TitoloTesto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}