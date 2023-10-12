package main.java.com.mycompany.bibiotecadigitale.gui;


import main.java.com.mycompany.bibiotecadigitale.dao.RichiestaDAO;
import main.java.com.mycompany.bibiotecadigitale.gui.Login;
import main.java.com.mycompany.bibiotecadigitale.model.LibreriaUtente;
import main.java.com.mycompany.bibiotecadigitale.model.Testo;
import main.java.com.mycompany.bibiotecadigitale.dao.TestoDAO;
import main.java.com.mycompany.bibiotecadigitale.gui.Controller;
import main.java.com.mycompany.bibiotecadigitale.model.Richiesta;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author franc
 */
public class AcquistoUtentee extends javax.swing.JFrame {

    private TestoDAO testoDAO;
    private RichiestaDAO richiestaDAO;
    private Controller controller;
    private int codiceutente;
    private int codicerichiesta;

    public AcquistoUtentee() {
        initComponents();
        testoDAO = new TestoDAO();
        richiestaDAO = new RichiestaDAO();
        refreshTestoTable();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ChiudiFinestra = new javax.swing.JLabel();
        BibliotecaDigitaleLB = new javax.swing.JLabel();
        TitoloLB = new javax.swing.JLabel();
        TitoloTF = new javax.swing.JTextField();
        GenereTF = new javax.swing.JTextField();
        GenereLB = new javax.swing.JLabel();
        TipologiaTestoBOX = new javax.swing.JComboBox<String>();
        RichiediBTN = new javax.swing.JButton();
        FiltraBTN = new javax.swing.JButton();
        RipristinaBTN = new javax.swing.JButton();
        PulisciBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabellaTesti = new javax.swing.JTable();
        EdizioneTF = new javax.swing.JTextField();
        EdizioneLB = new javax.swing.JLabel();
        FormatoTestoBOX = new javax.swing.JComboBox<String>();
        ListaProdottiLB = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabellaResoconto = new javax.swing.JTable();
        LibreriaLB = new javax.swing.JLabel();
        EliminaBTN = new javax.swing.JButton();
        RimuoviBTN = new javax.swing.JButton();
        LOGOUTLB = new javax.swing.JLabel();
        ModificaPasswordLB = new javax.swing.JLabel();

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
        BibliotecaDigitaleLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        BibliotecaDigitaleLB.setForeground(new java.awt.Color(204, 0, 51));
        BibliotecaDigitaleLB.setText("BIBLIOTECA DIGITALE");

        TitoloLB.setBackground(new java.awt.Color(204, 0, 51));
        TitoloLB.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        TitoloLB.setForeground(new java.awt.Color(204, 0, 51));
        TitoloLB.setText("Titolo");
        TitoloLB.setToolTipText("");

        TitoloTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitoloTFActionPerformed(evt);
            }
        });

        GenereLB.setBackground(new java.awt.Color(204, 0, 51));
        GenereLB.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        GenereLB.setForeground(new java.awt.Color(204, 0, 51));
        GenereLB.setText("Genere");

        TipologiaTestoBOX.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Libro", "Articolo Scientifico"}));
        TipologiaTestoBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipologiaTestoBOXActionPerformed(evt);
            }
        });

        RichiediBTN.setText("Richiedi");
        RichiediBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RichiediMouseClicked(evt);
            }
        });

        FiltraBTN.setText("Filtra");
        FiltraBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiltraMouseClicked(evt);
            }
        });

        RipristinaBTN.setText("Ripristina");
        RipristinaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RipristinaBTNActionPerformed(evt);
            }
        });

        PulisciBTN.setText("Pulisci");
        PulisciBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciTestoMouseClicked(evt);
            }
        });

        TabellaTesti.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {
                        "Titolo", "Anno Pubblicazione", "Formato", "Edizione", "Disponibilità", "Tipologia"
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
        TabellaTesti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabellaTestoMouseClicked(evt);
            }
        });

        EdizioneLB.setBackground(new java.awt.Color(204, 0, 51));
        EdizioneLB.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        EdizioneLB.setForeground(new java.awt.Color(204, 0, 51));
        EdizioneLB.setText("Edizione");

        FormatoTestoBOX.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Digitale", "Cartaceo", "AudioLibro"}));

        ListaProdottiLB.setBackground(new java.awt.Color(204, 0, 51));
        ListaProdottiLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ListaProdottiLB.setForeground(new java.awt.Color(204, 0, 51));
        ListaProdottiLB.setText("LISTA PRODOTTI");

        TabellaResoconto.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {
                        "Titolo", "Anno Pubblicazione", "Formato", "Edizione", "Tipologia", "Data Richiesta", "Stato"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabellaResoconto);

        LibreriaLB.setBackground(new java.awt.Color(204, 0, 51));
        LibreriaLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LibreriaLB.setForeground(new java.awt.Color(204, 0, 51));
        LibreriaLB.setText("LIBRERIA:");

        EliminaBTN.setText("Elimina");
        EliminaBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminaMouseClicked(evt);
            }
        });

        RimuoviBTN.setText("Rimuovi");
        RimuoviBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RimuoviMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(EdizioneLB)
                                                        .addComponent(TitoloLB))
                                                .addGap(61, 61, 61)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(EdizioneTF, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                                        .addComponent(TitoloTF)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(RichiediBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(PulisciBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(RimuoviBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(TipologiaTestoBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(FormatoTestoBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                                .addComponent(FiltraBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(RipristinaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(BibliotecaDigitaleLB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ChiudiFinestra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ListaProdottiLB)
                                .addGap(175, 175, 175))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(383, 383, 383)
                                .addComponent(LibreriaLB)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EliminaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(346, 346, 346))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(10, Short.MAX_VALUE)
                                                .addComponent(BibliotecaDigitaleLB))
                                        .addComponent(ChiudiFinestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ListaProdottiLB)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FormatoTestoBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TipologiaTestoBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FiltraBTN)
                                        .addComponent(RipristinaBTN)
                                        .addComponent(TitoloLB)
                                        .addComponent(TitoloTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(EdizioneLB)
                                                        .addComponent(EdizioneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(RichiediBTN)
                                                        .addComponent(PulisciBTN))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RimuoviBTN))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(LibreriaLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EliminaBTN)
                                .addGap(10, 10, 10))
        );

        LOGOUTLB.setBackground(new java.awt.Color(204, 0, 51));
        LOGOUTLB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LOGOUTLB.setText("LOGOUT");
        LOGOUTLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });

        ModificaPasswordLB.setBackground(new java.awt.Color(204, 0, 51));
        ModificaPasswordLB.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        ModificaPasswordLB.setText("Modifica Password");
        ModificaPasswordLB.setToolTipText("");
        ModificaPasswordLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificaPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(LOGOUTLB))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(ModificaPasswordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addComponent(ModificaPasswordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LOGOUTLB)
                                .addGap(39, 39, 39))
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

    private void TitoloTFActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RipristinaBTNActionPerformed(java.awt.event.ActionEvent evt) {
        refreshTestoTable();
    }

    private void TipologiaTestoBOXActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void RichiediOraBTNActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Richiedi");
    }

    private void ChiudiFinestraMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ChiudiApp();
    }
    public void setController(Controller controller)
    {
        this.controller = controller;
    }
    public void setCodice(int codice)
    {
        this.codiceutente = codice;
    }


    protected void refreshLibreriaTable() {
        DefaultTableModel model = (DefaultTableModel) TabellaResoconto.getModel();
        model.setRowCount(0); // Cancella tutte le righe attuali

        List<LibreriaUtente> libreriaUtenteList = richiestaDAO.getAllRichiesteLibreria(codiceutente);

        for (LibreriaUtente libreriaUtente : libreriaUtenteList) {
            model.addRow(new Object[]{
                    libreriaUtente.getTitolo(),
                    libreriaUtente.getAnnoPubblicazione(),
                    libreriaUtente.getFormato(),
                    libreriaUtente.getEdizione(),
                    libreriaUtente.getTipologia(),
                    libreriaUtente.getDataRichiesta(),
                    libreriaUtente.getStato(),
            });
        }
    }


    private void refreshTestoTable() {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        model.setRowCount(0); // Cancella tutte le righe attuali

        List<Testo> testi = testoDAO.getAllTesti();

        for (Testo testo : testi) {
            model.addRow(new Object[]{
                    testo.getTitolo(),
                    testo.getAnnoPubblicazione(),
                    testo.getFormato(),
                    testo.getEdizione(),
                    testo.isDisponibilita(),
                    testo.getTipologia()
            });
        }
    }

    private void aggiornaInterfacciaConTestiFiltrati(List<Testo> testiFiltrati) {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        // Rimuovi tutte le righe attualmente presenti nella tabella
        model.setRowCount(0);

        // Aggiungi le righe dei testi filtrati alla tabella
        for (Testo testo : testiFiltrati) {
            // Creare un array di oggetti che rappresentano una riga di dati
            // Ed aggiungere la riga alla tabella
            model.addRow(new Object[] {
                    testo.getTitolo(),
                    testo.getAnnoPubblicazione(),
                    testo.getFormato(),
                    testo.getEdizione(),
                    testo.isDisponibilita(),
                    testo.getTipologia()
            });
        }

        // Aggiorna l'interfaccia utente per riflettere i nuovi dati
        model.fireTableDataChanged();
    }


    private void TabellaTestoMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        int Indice = TabellaTesti.getSelectedRow();

        if (Indice != -1) { // Verifica se è stato selezionato un elemento valido
            TitoloTF.setText(model.getValueAt(Indice, 0) != null ? model.getValueAt(Indice, 0).toString() : "");
            EdizioneTF.setText(model.getValueAt(Indice, 3) != null ? model.getValueAt(Indice, 3).toString() : "");

            // Imposta il valore selezionato nei JComboBox
            String formato = model.getValueAt(Indice, 2) != null ? model.getValueAt(Indice, 2).toString() : "";
            String tipologia = model.getValueAt(Indice, 3) != null ? model.getValueAt(Indice, 3).toString() : "";

            FormatoTestoBOX.setSelectedItem(formato);
            TipologiaTestoBOX.setSelectedItem(tipologia);
        }
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

    private void RichiediMouseClicked(java.awt.event.MouseEvent evt) {
        String titolo = TitoloTF.getText();
        String edizione = EdizioneTF.getText();

        if (titolo.isEmpty() ||  edizione.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Compila tutti i campi", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TestoDAO testoDAO = new TestoDAO();
        int codiceTesto = testoDAO.RichiediTesto(titolo, edizione);
        System.out.println(codiceTesto);
        if (codiceTesto > 0) {
            RichiestaDAO richiestaDAO = new RichiestaDAO();
            richiestaDAO.insertRichiesta(codiceutente, codiceTesto);
            JOptionPane.showMessageDialog(this, "Richiesta inserita con successo", "Successo", JOptionPane.INFORMATION_MESSAGE);
            TitoloTF.setText("");
            EdizioneTF.setText("");
            int selectedRow = TabellaTesti.getSelectedRow();
            refreshLibreriaTable();
        } else {
            // Messaggio di errore se il testo non è stato trovato
            JOptionPane.showMessageDialog(this, "Testo non trovato nel database", "Errore", JOptionPane.ERROR_MESSAGE);
        }

    }


    private void EliminaMouseClicked(java.awt.event.MouseEvent evt) {
        UIManager.put("OptionPane.yesButtonText", "Si");
        int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler eliminare TUTTA la libreria? I dati andranno persi.", "Conferma eliminazione", JOptionPane.YES_NO_OPTION);
        DefaultTableModel modelResoconto = (DefaultTableModel) TabellaResoconto.getModel();
        if (scelta == JOptionPane.YES_OPTION) {
            // Rimuovi tutte le righe dalla tabella di destinazione
            while (modelResoconto.getRowCount() > 0) {
                richiestaDAO.deleteRichiesta(codicerichiesta);
                modelResoconto.removeRow(0);
            }
            JOptionPane.showMessageDialog(null, "Libreria eliminata.", "Conferma", JOptionPane.INFORMATION_MESSAGE);
        } else {}
    }
    private void ModificaPasswordMouseClicked(java.awt.event.MouseEvent evt) {
        UIManager.put("OptionPane.yesButtonText", "Si");
        int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler modificare la password? Verrà aperta una nuova finestra per la modifica della password.", "Conferma modifica", JOptionPane.YES_NO_OPTION);

        // Verifica della scelta dell'utente
        if (scelta == JOptionPane.YES_OPTION) {
            controller.ApriModificaUtente();
        } else {
            // L'utente ha annullato l'uscita, la finestra continua
        }
    }

    private void FiltraMouseClicked (java.awt.event.MouseEvent evt) {
        String formatoCB = FormatoTestoBOX.getSelectedItem().toString();
        String tipologiacb = TipologiaTestoBOX.getSelectedItem().toString();
        List<Testo> testiFiltrati = testoDAO.getTestiByFormatoETipologia(formatoCB, tipologiacb);
        aggiornaInterfacciaConTestiFiltrati(testiFiltrati);
    }

    private void RimuoviMouseClicked (java.awt.event.ActionEvent evt) {
        DefaultTableModel modelResoconto = (DefaultTableModel) TabellaResoconto.getModel();

        // Ottieni l'indice della riga selezionata nella tabella di destinazione
        int selectedRow = TabellaResoconto.getSelectedRow();
        UIManager.put("OptionPane.yesButtonText", "Si");
        int scelta = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler rimuovere dalla libreria il testo selezionato?", "Conferma rimozione", JOptionPane.YES_NO_OPTION);

        // Verifica della scelta dell'utente
        if (scelta == JOptionPane.YES_OPTION) {

            // Verifica se è stata selezionata una riga
            if (selectedRow != -1) {
                // Rimuovi la riga selezionata dalla tabella di destinazione
                modelResoconto.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Il testo selezionato è stato rimosso dalla libreria.", "Conferma rimozione", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Nessuna riga è stata selezionata, mostra un messaggio di avviso all'utente
                JOptionPane.showMessageDialog(null, "Seleziona una riga da eliminare.", "Attenzione", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {}
    }

    private void PulisciTestoMouseClicked (java.awt.event.MouseEvent evt) {
        TitoloTF.setText("");
        EdizioneTF.setText("");
    }

    private void clearTextField() {
        TitoloTF.setText("");
        EdizioneTF.setText("");
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
    private javax.swing.JLabel BibliotecaDigitaleLB;
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JLabel EdizioneLB;
    private javax.swing.JTextField EdizioneTF;
    private javax.swing.JButton EliminaBTN;
    private javax.swing.JComboBox<String> FormatoTestoBOX;
    private javax.swing.JLabel GenereLB;
    private javax.swing.JTextField GenereTF;
    private javax.swing.JLabel LOGOUTLB;
    private javax.swing.JLabel ListaProdottiLB;
    private javax.swing.JButton FiltraBTN;
    private javax.swing.JLabel ModificaPasswordLB;
    private javax.swing.JButton PulisciBTN;
    private javax.swing.JLabel LibreriaLB;
    private javax.swing.JButton RichiediBTN;
    private javax.swing.JButton RimuoviBTN;
    private javax.swing.JButton RipristinaBTN;
    private javax.swing.JTable TabellaResoconto;
    private javax.swing.JTable TabellaTesti;
    private javax.swing.JComboBox<String> TipologiaTestoBOX;
    private javax.swing.JLabel TitoloLB;
    private javax.swing.JTextField TitoloTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
}

