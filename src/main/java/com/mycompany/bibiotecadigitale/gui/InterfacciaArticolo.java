package com.mycompany.bibiotecadigitale.gui;

import com.mycompany.bibiotecadigitale.dao.ArticoloScientificoDAO;
import com.mycompany.bibiotecadigitale.gui.InterfacciaLibro;
import com.mycompany.bibiotecadigitale.gui.Login;
import com.mycompany.bibiotecadigitale.gui.ManagerTesto;
import com.mycompany.bibiotecadigitale.gui.ManagerUtenti;
import com.mycompany.bibiotecadigitale.implementazione_dao.TestoDAOImpl;
import com.mycompany.bibiotecadigitale.model.ArticoloScientifico;
import com.mycompany.bibiotecadigitale.model.Libro;
import com.mycompany.bibiotecadigitale.model.Testo;
import com.mycompany.bibiotecadigitale.implementazione_dao.ArticoloScientificoDAOImpl;
import com.mycompany.bibiotecadigitale.dao.LibroDAO;
import com.mycompany.bibiotecadigitale.model.Utente;
import com.mycompany.bibiotecadigitale.gui.Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;

public class InterfacciaArticolo extends javax.swing.JFrame {
    private Controller controller;
    private TestoDAOImpl testoDAO;
    private ArticoloScientificoDAOImpl articoloScientificoDAO;

    public InterfacciaArticolo() {
        initComponents();
        testoDAO = new TestoDAOImpl();
        articoloScientificoDAO = new ArticoloScientificoDAOImpl();
        refreshArticoloTable();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ChiudiFinestra = new javax.swing.JLabel();
        ArticoliScientificiLB = new javax.swing.JLabel();
        ResponsabileLB = new javax.swing.JLabel();
        ResponsabileTF = new javax.swing.JTextField();
        UniversitàTF = new javax.swing.JTextField();
        UniversitàLB = new javax.swing.JLabel();
        ModificaTesto = new javax.swing.JButton();
        PulisciTesto = new javax.swing.JButton();
        ScrollTabella = new javax.swing.JScrollPane();
        TabellaTesti = new javax.swing.JTable();
        RivistaTF = new javax.swing.JTextField();
        RivistaLB = new javax.swing.JLabel();
        RiassuntoTF = new javax.swing.JTextField();
        RiassuntoLB = new javax.swing.JLabel();
        LuogoLB = new javax.swing.JLabel();
        LuogoTF = new javax.swing.JTextField();
        CodiceLB = new javax.swing.JLabel();
        CodiceTF = new javax.swing.JTextField();
        ArgomentoLB = new javax.swing.JLabel();
        ArgomentoTF = new javax.swing.JTextField();
        DataLB = new javax.swing.JLabel();
        DataTF = new javax.swing.JTextField();
        ConferenzaLB = new javax.swing.JLabel();
        LibriLB = new javax.swing.JLabel();
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

        ArticoliScientificiLB.setBackground(new java.awt.Color(204, 0, 51));
        ArticoliScientificiLB.setFont(new java.awt.Font("Century Gothic", 1, 24));
        ArticoliScientificiLB.setForeground(new java.awt.Color(204, 0, 51));
        ArticoliScientificiLB.setText("ARTICOLI SCIENTIFICI");

        ResponsabileLB.setBackground(new java.awt.Color(204, 0, 51));
        ResponsabileLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        ResponsabileLB.setForeground(new java.awt.Color(204, 0, 51));
        ResponsabileLB.setText("Responsabile");
        ResponsabileLB.setToolTipText("");

        UniversitàLB.setBackground(new java.awt.Color(204, 0, 51));
        UniversitàLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        UniversitàLB.setForeground(new java.awt.Color(204, 0, 51));
        UniversitàLB.setText("Università");

        ModificaTesto.setText("Modifica");
        ModificaTesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificaTestoMouseClicked(evt);
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
                        "Codice", "Argomento", "Rivista", "Responsabile", "Università", "Riassunto", "Luogo Conferenza", "Data Conferenza"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollTabella.setViewportView(TabellaTesti);
        TabellaTesti.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TabellaTestoMouseClicked(e);
            }
        });

        RivistaLB.setBackground(new java.awt.Color(204, 0, 51));
        RivistaLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        RivistaLB.setForeground(new java.awt.Color(204, 0, 51));
        RivistaLB.setText("Rivista");

        RiassuntoLB.setBackground(new java.awt.Color(204, 0, 51));
        RiassuntoLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        RiassuntoLB.setForeground(new java.awt.Color(204, 0, 51));
        RiassuntoLB.setText("Riassunto");
        RiassuntoLB.setToolTipText("");

        LuogoLB.setBackground(new java.awt.Color(204, 0, 51));
        LuogoLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        LuogoLB.setForeground(new java.awt.Color(204, 0, 51));
        LuogoLB.setText("Luogo");
        LuogoLB.setToolTipText("");

        CodiceLB.setBackground(new java.awt.Color(204, 0, 51));
        CodiceLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        CodiceLB.setForeground(new java.awt.Color(204, 0, 51));
        CodiceLB.setText("Codice");
        CodiceLB.setToolTipText("");

        ArgomentoLB.setBackground(new java.awt.Color(204, 0, 51));
        ArgomentoLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        ArgomentoLB.setForeground(new java.awt.Color(204, 0, 51));
        ArgomentoLB.setText("Argomento");
        ArgomentoLB.setToolTipText("");

        DataLB.setBackground(new java.awt.Color(204, 0, 51));
        DataLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        DataLB.setForeground(new java.awt.Color(204, 0, 51));
        DataLB.setText("Data");
        DataLB.setToolTipText("");

        ConferenzaLB.setBackground(new java.awt.Color(204, 0, 51));
        ConferenzaLB.setFont(new java.awt.Font("Century Gothic", 1, 18));
        ConferenzaLB.setForeground(new java.awt.Color(204, 0, 51));
        ConferenzaLB.setText("CONFERENZA:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(ArticoliScientificiLB)
                                                .addGap(215, 215, 215)
                                                .addComponent(ChiudiFinestra))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(ModificaTesto)
                                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(LuogoLB)
                                                                                                        .addComponent(DataLB)))
                                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                .addGap(35, 35, 35)
                                                                                                .addComponent(ConferenzaLB)))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(RivistaLB)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(RivistaTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                                                        .addComponent(ArgomentoTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(ResponsabileTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(CodiceTF, javax.swing.GroupLayout.Alignment.TRAILING))))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(ScrollTabella, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                        .addComponent(ArgomentoLB)
                                                                                                        .addGap(111, 111, 111))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(CodiceLB, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(ResponsabileLB, javax.swing.GroupLayout.Alignment.LEADING))
                                                                                                        .addGap(97, 97, 97)))
                                                                                        .addComponent(PulisciTesto))
                                                                                .addGap(37, 37, 37)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                .addComponent(UniversitàLB)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(UniversitàTF))
                                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                .addComponent(RiassuntoLB)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(RiassuntoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(70, 70, 70)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(LuogoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                                                                        .addComponent(DataTF))))
                                                                .addGap(0, 21, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ArticoliScientificiLB)
                                                        .addComponent(ChiudiFinestra))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(UniversitàLB)
                                                        .addComponent(UniversitàTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(RiassuntoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(RiassuntoLB))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ScrollTabella, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(CodiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(CodiceLB))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ResponsabileTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ResponsabileLB))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ArgomentoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ArgomentoLB))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(RivistaLB)
                                                        .addComponent(RivistaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addComponent(ConferenzaLB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(LuogoLB)
                                                        .addComponent(LuogoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(DataTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(DataLB))
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ModificaTesto)
                                                        .addComponent(PulisciTesto))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        LibriLB.setBackground(new java.awt.Color(204, 0, 51));
        LibriLB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        LibriLB.setText("LIBRI");
        LibriLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibroMouseClicked(evt);
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

        LOGOUTLB.setBackground(new java.awt.Color(204, 0, 51));
        LOGOUTLB.setFont(new java.awt.Font("Century Gothic", 1, 24));
        LOGOUTLB.setText("LOGOUT");
        LOGOUTLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
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
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LOGOUTLB)
                                        .addComponent(UtentiLB, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LibriLB)
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
                                .addComponent(LibriLB)
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

    private void TabellaTestoMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        int Indice = TabellaTesti.getSelectedRow();
        if (Indice != -1) {
            CodiceTF.setText(model.getValueAt(Indice, 0) != null ? model.getValueAt(Indice, 0).toString() : "");
            ArgomentoTF.setText(model.getValueAt(Indice, 1) != null ? model.getValueAt(Indice, 1).toString() : "");
            RivistaTF.setText(model.getValueAt(Indice, 2) != null ? model.getValueAt(Indice, 2).toString() : "");
            ResponsabileTF.setText(model.getValueAt(Indice, 3) != null ? model.getValueAt(Indice, 3).toString() : "");
            UniversitàTF.setText(model.getValueAt(Indice, 4) != null ? model.getValueAt(Indice, 4).toString() : "");
            RiassuntoTF.setText(model.getValueAt(Indice, 5) != null ? model.getValueAt(Indice, 5).toString() : "");
            LuogoTF.setText(model.getValueAt(Indice, 6) != null ? model.getValueAt(Indice, 6).toString() : "");
            // Verifica se la data è nulla prima di convertirla in una stringa
            Object dataConferenzaValue = model.getValueAt(Indice, 7);
            if (dataConferenzaValue != null) {
                java.util.Date dataConferenzaDate = (java.util.Date) dataConferenzaValue;
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String annoPubblicazioneString = dateFormat.format(dataConferenzaDate);
                DataTF.setText(annoPubblicazioneString);
            } else {
                DataTF.setText("");
            }
        }
    }

    public void setController(Controller controller)
    {
        this.controller = controller;
    }

    private void ModificaTestoMouseClicked (java.awt.event.MouseEvent evt) {
        if (CodiceTF.getText().isEmpty() || ResponsabileTF.getText().isEmpty() || RivistaTF.getText().isEmpty() || RiassuntoTF.getText().isEmpty() || ArgomentoTF.getText().isEmpty() || UniversitàTF.getText().isEmpty() || LuogoTF.getText().isEmpty() || DataTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informazioni mancanti");
        } else {
            try {
                int codice = Integer.parseInt(CodiceTF.getText());
                String universita = UniversitàTF.getText();
                String riassunto = RiassuntoTF.getText();
                String nomeRivista = RivistaTF.getText();
                String argomento = ArgomentoTF.getText();
                String responsabile = ResponsabileTF.getText();
                String luogoConferenza = LuogoTF.getText();
                String dataConferenzaText= DataTF.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dataConferenza = dateFormat.parse(dataConferenzaText);
                articoloScientificoDAO.updateArticoloScientifico(codice, universita, riassunto, nomeRivista, argomento, responsabile, luogoConferenza, dataConferenza);

                JOptionPane.showMessageDialog(this, "Testo modificato correttamente");
                refreshArticoloTable();
                clearTextFields();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Il codice testo deve essere un numero intero");
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Formato data non valido. Utilizzare il formato yyyy-MM-dd");
            }
        }
    }

    private void ChiudiFinestraMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ChiudiApp();
    }

    private void TestoMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ApriTesti();
    }

    private void LibroMouseClicked(java.awt.event.MouseEvent evt) {
        controller.ApriLibri();
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

    private void UtenteMouseClicked (java.awt.event.MouseEvent evt) {
        controller.ApriUtenti();
    }
    private void PulisciTestoMouseClicked (java.awt.event.MouseEvent evt)
    {
        CodiceTF.setText("");
        ArgomentoTF.setText("");
        RivistaTF.setText("");
        ResponsabileTF.setText("");
        UniversitàTF.setText("");
        RiassuntoTF.setText("");
        LuogoTF.setText("");
        DataTF.setText("");
    }

    private void clearTextFields() {
        CodiceTF.setText("");
        ArgomentoTF.setText("");
        RivistaTF.setText("");
        ResponsabileTF.setText("");
        UniversitàTF.setText("");
        RiassuntoTF.setText("");
        LuogoTF.setText("");
        DataTF.setText("");
    }

    protected void refreshArticoloTable() {
        DefaultTableModel model = (DefaultTableModel) TabellaTesti.getModel();
        model.setRowCount(0); // Cancella tutte le righe attuali

        ArticoloScientificoDAOImpl dao = new ArticoloScientificoDAOImpl(); // Crea un'istanza del DAO
        List<ArticoloScientifico> articoli = dao.getAllArticolo(); // Chiama il metodo su un'istanza

        for (ArticoloScientifico articoloScientifico : articoli) {
            model.addRow(new Object[]{
                    articoloScientifico.getCodTesto(),
                    articoloScientifico.getArgomento(),
                    articoloScientifico.getNomeRivista(),
                    articoloScientifico.getResponsabile(),
                    articoloScientifico.getUniversita(),
                    articoloScientifico.getRiassunto(),
                    articoloScientifico.getLuogoConferenza(),
                    articoloScientifico.getDataConferenza(),
            });
        }
    }

    private javax.swing.JLabel ArgomentoLB;
    private javax.swing.JTextField ArgomentoTF;
    private javax.swing.JLabel CodiceLB;
    private javax.swing.JTextField CodiceTF;
    private javax.swing.JLabel ConferenzaLB;
    private javax.swing.JLabel DataLB;
    private javax.swing.JTextField DataTF;
    private javax.swing.JLabel LibriLB;
    private javax.swing.JLabel LOGOUTLB;
    private javax.swing.JLabel LuogoLB;
    private javax.swing.JTextField LuogoTF;
    private javax.swing.JButton ModificaTesto;
    private javax.swing.JButton PulisciTesto;
    private javax.swing.JLabel ResponsabileLB;
    private javax.swing.JTextField ResponsabileTF;
    private javax.swing.JLabel RiassuntoLB;
    private javax.swing.JTextField RiassuntoTF;
    private javax.swing.JLabel RivistaLB;
    private javax.swing.JTextField RivistaTF;
    private javax.swing.JTable TabellaTesti;
    private javax.swing.JLabel TestiLB;
    private javax.swing.JLabel UniversitàLB;
    private javax.swing.JTextField UniversitàTF;
    private javax.swing.JLabel UtentiLB;
    private javax.swing.JLabel ArticoliScientificiLB;
    private javax.swing.JLabel ChiudiFinestra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane ScrollTabella;
}
