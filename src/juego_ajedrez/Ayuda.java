
package juego_ajedrez;

import javax.swing.ImageIcon;


public class Ayuda extends javax.swing.JDialog {


    public Ayuda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setIconImage(new ImageIcon(getClass().getResource("/ajedrez/Imagenes/Caballo_negro.png")).getImage());
        setTitle("Panel de Información.");
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ayda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(0, 0));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ayda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Ayda.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Ayda.setAlignmentY(0.0F);
        Ayda.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Ayda.setIconTextGap(0);
        Ayda.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(Ayda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Ayda;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
