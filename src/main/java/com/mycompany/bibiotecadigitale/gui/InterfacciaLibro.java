
package com.mycompany.bibiotecadigitale.gui;

import com.mycompany.bibiotecadigitale.dao.LibroDAO;
import com.mycompany.bibiotecadigitale.implementazione_dao.LibroDAOImpl;
import com.mycompany.bibiotecadigitale.model.Libro;
import com.mycompany.bibiotecadigitale.model.Testo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfacciaLibro extends javax.swing.JFrame {
    private Controller controller;
    private LibroDAOImpl libroDAO;
    public InterfacciaLibro() {
        initComponents();
        this.controller = controller;
        libroDAO = new LibroDAOImpl();
        refreshLibroTable();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ChiudiFinestra = new javax.swing.JLabel();
        LibriLB = new javax.swing.JLabel();
        GenereLB = new javax.swing.JLabel();
        GenereTF = new javax.swing.JTextField();
        CapitoliTF = new javax.swing.JTextField();
        CapitoliLB = new javax.swing.JLabel();
        ModificaTesto = new javax.swing.JButton();
        PulisciTesto = new javax.swing.JButton();
        ScrollTabella = new javax.swing.JScrollPane();
        TabellaTesti = new javax.swing.JTable();
        PagineTF = new javax.swing.JTextField();
        PagineLB = new javax.swing.JLabel();
        EventoTF = new javax.swing.JTextField();
        EventoLB = new javax.swing.JLabel();
        CollanaLB = new javax.swing.JLabel();
        CollanaTF = new javax.swing.JTextField();
        CodiceLB = new javax.swing.JLabel();
        CodiceTF = new javax.swing.JTextField();
        ArticoliLB = new javax.swing.JLabel();
        TestiLB = new javax.swing.JLabel();
        LOGOUTLB = new javax.swing.JLabel();
        UtentiLB = new javax.swing.JLabel();

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

        LibriLB.setBackground(new java.awt.Color(204, 0, 51));
        LibriLB.setFont(new java.awt.Font("Century Gothic", 1, 24));
        LibriLB.setForeground(new java.awt.Color(204, 0, 51));
        LibriLB.setText("LIBRI");

        GenereLB.setBackground(new java.awt.Color(204, 0, 51));
        GenereLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        GenereLB.setForeground(new java.awt.Color(204, 0, 51));
        GenereLB.setText("Genere");
        GenereLB.setToolTipText("");

        CapitoliLB.setBackground(new java.awt.Color(204, 0, 51));
        CapitoliLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        CapitoliLB.setForeground(new java.awt.Color(204, 0, 51));
        CapitoliLB.setText("Capitoli");

        ModificaTesto.setText("Modifica");
        ModificaTesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificaTestoMouseClicked(evt);
            }
        });

        TabellaTesti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabellaTestoMouseClicked(evt);
            }
        });

        PulisciTesto.setText("Pulisci");
        PulisciTesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PulisciTestoMouseClicked(evt);
            }
        });


        TabellaTesti.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {
                        "Codice", "Genere", "Capitoli", "Pagine", "Evento", "Collana"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollTabella.setViewportView(TabellaTesti);

        PagineLB.setBackground(new java.awt.Color(204, 0, 51));
        PagineLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        PagineLB.setForeground(new java.awt.Color(204, 0, 51));
        PagineLB.setText("Pagine");

        EventoLB.setBackground(new java.awt.Color(204, 0, 51));
        EventoLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        EventoLB.setForeground(new java.awt.Color(204, 0, 51));
        EventoLB.setText("Evento");
        EventoLB.setToolTipText("");

        CollanaLB.setBackground(new java.awt.Color(204, 0, 51));
        CollanaLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        CollanaLB.setForeground(new java.awt.Color(204, 0, 51));
        CollanaLB.setText("Collana");
        CollanaLB.setToolTipText("");

        CodiceLB.setBackground(new java.awt.Color(204, 0, 51));
        CodiceLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        CodiceLB.setForeground(new java.awt.Color(204, 0, 51));
        CodiceLB.setText("Codice");
        CodiceLB.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LibriLB)
                                .addGap(269, 269, 269)
                                .addComponent(ChiudiFinestra)
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(GenereLB)
                                                .addGap(18, 18, 18)
                                                .addComponent(GenereTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(CodiceLB)
                                                .addGap(18, 18, 18)
                                                .addComponent(CodiceTF)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(EventoLB)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(EventoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(ModificaTesto)
                                                                .addGap(105, 105, 105))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(CapitoliLB)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(CapitoliTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(CollanaLB)
                                                        .addComponent(PagineLB))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(CollanaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PagineTF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(84, 84, 84))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(168, 168, 168)
                                                .addComponent(PulisciTesto)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ScrollTabella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LibriLB)
                                        .addComponent(ChiudiFinestra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CapitoliLB)
                                        .addComponent(CapitoliTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PagineLB)
                                        .addComponent(PagineTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CodiceLB)
                                        .addComponent(CodiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(EventoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EventoLB)
                                                        .addComponent(GenereTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(GenereLB)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(CollanaLB)
                                                        .addComponent(CollanaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PulisciTesto)
                                        .addComponent(ModificaTesto))
                                .addGap(18, 18, 18)
                                .addComponent(ScrollTabella, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );


        ArticoliLB.setBackground(new java.awt.Color(204, 0, 51));
        ArticoliLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        ArticoliLB.setText("ARTICOLI SCIENTIFICI");
        ArticoliLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArticoloMouseClicked(evt);
            }
        });

        TestiLB.setBackground(new java.awt.Color(204, 0, 51));
        TestiLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        TestiLB.setText("TESTI");
        TestiLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestoMouseClicked(evt);
            }
        });

        UtentiLB.setBackground(new java.awt.Color(204, 0, 51));
        UtentiLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        UtentiLB.setText("UTENTI");
        UtentiLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UtentiMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LOGOUTLB)
                                        .addComponent(UtentiLB, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ArticoliLB)
                                        .addComponent(TestiLB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(7, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(ArticoliLB)
                                .addGap(18, 18, 18)
                                .addComponent(TestiLB)
                                .addGap(18, 18, 18)
                                .addComponent(UtentiLB)
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
    }

    public void setController(Controller controller)
    {
        this.controller = controller;
    }
    private void ModificaTestoMouseClicked (java.awt.event.MouseEvent evt) {
        if (CodiceTF.getText().isEmpty() || GenereTF.getText().isEmpty() || CapitoliTF.getText().isEmpty() || PagineTF.getText().isEmpty() || EventoTF.getText().isEmpty() || CollanaTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informazioni mancanti");
        } else {
            try {
                int codice = Integer.parseInt(CodiceTF.getText());
                String genere = GenereTF.getText();
                int capitoli = Integer.parseInt(CapitoliTF.getText());
                int pagine = Integer.parseInt(PagineTF.getText());
                String evento = EventoTF.getText();
                String collana = CollanaTF.getText();
                libroDAO.updateLibro(codice, genere, capitoli, pagine, evento, collana);
                JOptionPane.showMessageDialog(this, "Testo modificato correttamente");
                refreshLibroTable();
                //clearTextFields();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice testo deve essere un numero intero");
            }
        }
    }

    private void ChiudiFinestraMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ChiudiApp();
    }

    private void TestoMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ApriTesti();
    }

    private void UtentiMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ApriUtenti();
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
    private void PulisciTestoMouseClicked (java.awt.event.MouseEvent evt)
    {
        GenereTF.setText("");
        CapitoliTF.setText("");
        PagineTF.setText("");
        EventoTF.setText("");
        CodiceTF.setText("");
        CollanaTF.setText("");
    }

    private void clearTextFields() {
        GenereTF.setText("");
        CapitoliTF.setText("");
        PagineTF.setText("");
        EventoTF.setText("");
        CodiceTF.setText("");
        CollanaTF.setText("");
    }

    protected void refreshLibroTable() {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        model.setRowCount(0); // Cancella tutte le righe attuali

        LibroDAOImpl dao = new LibroDAOImpl(); // Crea un'istanza del DAO
        List<Libro> libri = dao.getAllLibri(); // Chiama il metodo su un'istanza

        // Ordina la lista dei libri in base all'attributo "Collana"
        Collections.sort(libri, new Comparator<Libro>() {
            @Override
            public int compare(Libro libro1, Libro libro2) {
                return libro1.getCollana().compareTo(libro2.getCollana());
            }
        });

        for (Libro libro : libri) {
            model.addRow(new Object[]{
                    libro.getCodTesto(),
                    libro.getGenere(),
                    libro.getCapitoli(),
                    libro.getPagine(),
                    libro.getEvento(),
                    libro.getCollana(),
            });
        }
    }

    private void TabellaTestoMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        int Indice = TabellaTesti.getSelectedRow();

        if (Indice != -1) { // Verifica se è stato selezionato un elemento valido
            CodiceTF.setText(model.getValueAt(Indice, 0) != null ? model.getValueAt(Indice, 0).toString() : "");
            GenereTF.setText(model.getValueAt(Indice, 1) != null ? model.getValueAt(Indice, 1).toString() : "");

            // Verifica se la data è nulla prima di convertirla in una stringa
            Object capitoliValue = model.getValueAt(Indice, 2);
            if (capitoliValue != null) {
                int capitoli = Integer.parseInt(capitoliValue.toString());
                CapitoliTF.setText(String.valueOf(capitoli));
            } else {
                CapitoliTF.setText("");
            }

            // Imposta il valore selezionato nei JTextField
            PagineTF.setText(model.getValueAt(Indice, 3) != null ? model.getValueAt(Indice, 3).toString() : "");
            EventoTF.setText(model.getValueAt(Indice, 4) != null ? model.getValueAt(Indice, 4).toString() : "");
            CollanaTF.setText(model.getValueAt(Indice, 5) != null ? model.getValueAt(Indice, 5).toString() : "");
        }
    }

    private javax.swing.JLabel ArticoliLB;
    private javax.swing.JLabel CapitoliLB;
    private javax.swing.JTextField CapitoliTF;
    private javax.swing.JLabel CodiceLB;
    private javax.swing.JTextField CodiceTF;
    private javax.swing.JLabel CollanaLB;
    private javax.swing.JTextField CollanaTF;
    private javax.swing.JLabel EventoLB;
    private javax.swing.JTextField EventoTF;
    private javax.swing.JLabel GenereLB;
    private javax.swing.JLabel LOGOUTLB;
    private javax.swing.JLabel UtentiLB;
    private javax.swing.JButton ModificaTesto;
    private javax.swing.JLabel PagineLB;
    private javax.swing.JTextField PagineTF;
    private javax.swing.JButton PulisciTesto;
    private javax.swing.JTable TabellaTesti;
    private javax.swing.JLabel TestiLB;
    private javax.swing.JTextField GenereTF;
    private javax.swing.JLabel LibriLB;
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane ScrollTabella;
}
