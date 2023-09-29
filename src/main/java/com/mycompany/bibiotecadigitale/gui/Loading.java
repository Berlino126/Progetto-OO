package main.java.com.mycompany.bibiotecadigitale.gui;

/**
 *
 * @author visci
 */
public class Loading extends javax.swing.JFrame {

    public Loading() {
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Percentuale = new javax.swing.JLabel();
        FinestraLoading = new javax.swing.JProgressBar();
        BibliotecaDigitaleLB = new javax.swing.JLabel();
        ImmagineLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        Percentuale.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Percentuale.setForeground(new java.awt.Color(255, 255, 255));
        Percentuale.setText("%");

        FinestraLoading.setBackground(new java.awt.Color(255, 255, 255));

        BibliotecaDigitaleLB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        BibliotecaDigitaleLB.setForeground(new java.awt.Color(255, 255, 255));
        BibliotecaDigitaleLB.setText("Biblioteca Digitale");

        ImmagineLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\visci\\OneDrive\\Desktop\\Università\\Library_icon (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FinestraLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ImmagineLB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Percentuale)
                        .addGap(221, 221, 221))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(BibliotecaDigitaleLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(132, 132, 132)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(ImmagineLB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Percentuale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FinestraLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(BibliotecaDigitaleLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(178, 178, 178)))
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Loading BarraCaricamento = new Loading ();
        BarraCaricamento.setVisible(true);
        try{
            for (int i = 0; i <= 100; i++)
            {
                Thread.sleep(40);
                BarraCaricamento.FinestraLoading.setValue(i);
                BarraCaricamento.Percentuale.setText(Integer.toString(i)+ "%");
            }
        }catch(Exception e)
        {

        }
        new Login().setVisible(true);
        BarraCaricamento.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar FinestraLoading;
    private javax.swing.JLabel Percentuale;
    private javax.swing.JLabel BibliotecaDigitaleLB;
    private javax.swing.JLabel ImmagineLB;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
