/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_ajedrez;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author Sergio Oyaga
 */
public class tablero extends javax.swing.JFrame {

    public tablero() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tiempo2 = new javax.swing.JLabel();
        tiempo1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        j00 = new javax.swing.JButton();
        j01 = new javax.swing.JButton();
        j02 = new javax.swing.JButton();
        j03 = new javax.swing.JButton();
        j04 = new javax.swing.JButton();
        j05 = new javax.swing.JButton();
        j06 = new javax.swing.JButton();
        j07 = new javax.swing.JButton();
        j10 = new javax.swing.JButton();
        j11 = new javax.swing.JButton();
        j12 = new javax.swing.JButton();
        j13 = new javax.swing.JButton();
        j14 = new javax.swing.JButton();
        j15 = new javax.swing.JButton();
        j16 = new javax.swing.JButton();
        j17 = new javax.swing.JButton();
        j20 = new javax.swing.JButton();
        j21 = new javax.swing.JButton();
        j22 = new javax.swing.JButton();
        j23 = new javax.swing.JButton();
        j24 = new javax.swing.JButton();
        j25 = new javax.swing.JButton();
        j26 = new javax.swing.JButton();
        j27 = new javax.swing.JButton();
        j30 = new javax.swing.JButton();
        j31 = new javax.swing.JButton();
        j32 = new javax.swing.JButton();
        j33 = new javax.swing.JButton();
        j34 = new javax.swing.JButton();
        j35 = new javax.swing.JButton();
        j36 = new javax.swing.JButton();
        j37 = new javax.swing.JButton();
        j40 = new javax.swing.JButton();
        j41 = new javax.swing.JButton();
        j42 = new javax.swing.JButton();
        j43 = new javax.swing.JButton();
        j44 = new javax.swing.JButton();
        j45 = new javax.swing.JButton();
        j46 = new javax.swing.JButton();
        j47 = new javax.swing.JButton();
        j50 = new javax.swing.JButton();
        j51 = new javax.swing.JButton();
        j52 = new javax.swing.JButton();
        j53 = new javax.swing.JButton();
        j54 = new javax.swing.JButton();
        j55 = new javax.swing.JButton();
        j56 = new javax.swing.JButton();
        j57 = new javax.swing.JButton();
        j60 = new javax.swing.JButton();
        j61 = new javax.swing.JButton();
        j62 = new javax.swing.JButton();
        j63 = new javax.swing.JButton();
        j64 = new javax.swing.JButton();
        j65 = new javax.swing.JButton();
        j66 = new javax.swing.JButton();
        j67 = new javax.swing.JButton();
        j70 = new javax.swing.JButton();
        j71 = new javax.swing.JButton();
        j72 = new javax.swing.JButton();
        j73 = new javax.swing.JButton();
        j74 = new javax.swing.JButton();
        j75 = new javax.swing.JButton();
        j76 = new javax.swing.JButton();
        j77 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        BlancasFisicos = new javax.swing.JCheckBox();
        NegrasFisicos = new javax.swing.JCheckBox();
        BlancasQuimicos = new javax.swing.JCheckBox();
        NegrasQuimicos = new javax.swing.JCheckBox();
        BlancasGeologos = new javax.swing.JCheckBox();
        NegrasGeologos = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        BlancasNormales = new javax.swing.JCheckBox();
        NegrasNormales = new javax.swing.JCheckBox();

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(219, 590));
        jPanel4.setLayout(null);

        jButton1.setText("Back");
        jButton1.setPreferredSize(new java.awt.Dimension(73, 73));
        jPanel4.add(jButton1);
        jButton1.setBounds(43, 0, 73, 73);

        jButton2.setText("Start");
        jButton2.setMaximumSize(new java.awt.Dimension(73, 73));
        jButton2.setMinimumSize(new java.awt.Dimension(73, 73));
        jButton2.setPreferredSize(new java.awt.Dimension(73, 73));
        jPanel4.add(jButton2);
        jButton2.setBounds(131, 0, 73, 73);

        tiempo2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        tiempo2.setText("20:00");
        tiempo2.setMaximumSize(new java.awt.Dimension(73, 36));
        tiempo2.setMinimumSize(new java.awt.Dimension(73, 36));
        tiempo2.setPreferredSize(new java.awt.Dimension(73, 36));
        tiempo2.setRequestFocusEnabled(false);
        jPanel4.add(tiempo2);
        tiempo2.setBounds(10, 256, 90, 36);

        tiempo1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        tiempo1.setText("20:00");
        tiempo1.setMaximumSize(new java.awt.Dimension(73, 36));
        tiempo1.setMinimumSize(new java.awt.Dimension(73, 36));
        tiempo1.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel4.add(tiempo1);
        tiempo1.setBounds(10, 292, 90, 36);

        jLabel28.setFont(new java.awt.Font("Magneto", 1, 11)); // NOI18N
        jLabel28.setText("Diseñado por Sergio Oyaga.");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(40, 570, 170, 20);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajedrez/Imagenes/Copyright_pequeño.png"))); // NOI18N
        jPanel4.add(jLabel29);
        jLabel29.setBounds(10, 570, 20, 20);

        jPanel7.add(jPanel4, java.awt.BorderLayout.EAST);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(585, 585));
        jPanel1.setPreferredSize(new java.awt.Dimension(585, 585));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        j00.setBackground(new java.awt.Color(255, 153, 51));
        j00.setToolTipText("");
        j00.setBorder(null);
        j00.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j00.setMinimumSize(new java.awt.Dimension(73, 73));
        j00.setName(""); // NOI18N
        j00.setOpaque(false);
        j00.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        jPanel1.add(j00, gridBagConstraints);

        j01.setBackground(new java.awt.Color(181, 135, 99));
        j01.setForeground(new java.awt.Color(102, 51, 0));
        j01.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j01.setMinimumSize(new java.awt.Dimension(73, 73));
        j01.setOpaque(false);
        j01.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j01, gridBagConstraints);

        j02.setBackground(new java.awt.Color(255, 153, 51));
        j02.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j02.setMinimumSize(new java.awt.Dimension(73, 73));
        j02.setOpaque(false);
        j02.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j02, gridBagConstraints);

        j03.setBackground(new java.awt.Color(181, 135, 99));
        j03.setForeground(new java.awt.Color(102, 51, 0));
        j03.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j03.setMinimumSize(new java.awt.Dimension(73, 73));
        j03.setOpaque(false);
        j03.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j03, gridBagConstraints);

        j04.setBackground(new java.awt.Color(255, 153, 51));
        j04.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j04.setMinimumSize(new java.awt.Dimension(73, 73));
        j04.setOpaque(false);
        j04.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j04, gridBagConstraints);

        j05.setBackground(new java.awt.Color(181, 135, 99));
        j05.setForeground(new java.awt.Color(102, 51, 0));
        j05.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j05.setMinimumSize(new java.awt.Dimension(73, 73));
        j05.setOpaque(false);
        j05.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j05, gridBagConstraints);

        j06.setBackground(new java.awt.Color(255, 153, 51));
        j06.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j06.setMinimumSize(new java.awt.Dimension(73, 73));
        j06.setOpaque(false);
        j06.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j06, gridBagConstraints);

        j07.setBackground(new java.awt.Color(181, 135, 99));
        j07.setForeground(new java.awt.Color(102, 51, 0));
        j07.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j07.setMinimumSize(new java.awt.Dimension(73, 73));
        j07.setOpaque(false);
        j07.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j07, gridBagConstraints);

        j10.setBackground(new java.awt.Color(181, 135, 99));
        j10.setForeground(new java.awt.Color(102, 51, 0));
        j10.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j10.setMinimumSize(new java.awt.Dimension(73, 73));
        j10.setOpaque(false);
        j10.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j10, gridBagConstraints);

        j11.setBackground(new java.awt.Color(255, 153, 51));
        j11.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j11.setMinimumSize(new java.awt.Dimension(73, 73));
        j11.setOpaque(false);
        j11.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j11, gridBagConstraints);

        j12.setBackground(new java.awt.Color(181, 135, 99));
        j12.setForeground(new java.awt.Color(102, 51, 0));
        j12.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j12.setMinimumSize(new java.awt.Dimension(73, 73));
        j12.setOpaque(false);
        j12.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j12, gridBagConstraints);

        j13.setBackground(new java.awt.Color(255, 153, 51));
        j13.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j13.setMinimumSize(new java.awt.Dimension(73, 73));
        j13.setOpaque(false);
        j13.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j13, gridBagConstraints);

        j14.setBackground(new java.awt.Color(181, 135, 99));
        j14.setForeground(new java.awt.Color(102, 51, 0));
        j14.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j14.setMinimumSize(new java.awt.Dimension(73, 73));
        j14.setOpaque(false);
        j14.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j14, gridBagConstraints);

        j15.setBackground(new java.awt.Color(255, 153, 51));
        j15.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j15.setMinimumSize(new java.awt.Dimension(73, 73));
        j15.setOpaque(false);
        j15.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j15, gridBagConstraints);

        j16.setBackground(new java.awt.Color(181, 135, 99));
        j16.setForeground(new java.awt.Color(102, 51, 0));
        j16.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j16.setMinimumSize(new java.awt.Dimension(73, 73));
        j16.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j16, gridBagConstraints);

        j17.setBackground(new java.awt.Color(255, 153, 51));
        j17.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j17.setMinimumSize(new java.awt.Dimension(73, 73));
        j17.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j17, gridBagConstraints);

        j20.setBackground(new java.awt.Color(255, 153, 51));
        j20.setForeground(new java.awt.Color(102, 51, 0));
        j20.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j20.setMinimumSize(new java.awt.Dimension(73, 73));
        j20.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j20, gridBagConstraints);

        j21.setBackground(new java.awt.Color(181, 135, 99));
        j21.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j21.setMinimumSize(new java.awt.Dimension(73, 73));
        j21.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j21, gridBagConstraints);

        j22.setBackground(new java.awt.Color(255, 153, 51));
        j22.setForeground(new java.awt.Color(102, 51, 0));
        j22.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j22.setMinimumSize(new java.awt.Dimension(73, 73));
        j22.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j22, gridBagConstraints);

        j23.setBackground(new java.awt.Color(181, 135, 99));
        j23.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j23.setMinimumSize(new java.awt.Dimension(73, 73));
        j23.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j23, gridBagConstraints);

        j24.setBackground(new java.awt.Color(255, 153, 51));
        j24.setForeground(new java.awt.Color(102, 51, 0));
        j24.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j24.setMinimumSize(new java.awt.Dimension(73, 73));
        j24.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j24, gridBagConstraints);

        j25.setBackground(new java.awt.Color(181, 135, 99));
        j25.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j25.setMinimumSize(new java.awt.Dimension(73, 73));
        j25.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j25, gridBagConstraints);

        j26.setBackground(new java.awt.Color(255, 153, 51));
        j26.setForeground(new java.awt.Color(102, 51, 0));
        j26.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j26.setMinimumSize(new java.awt.Dimension(73, 73));
        j26.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j26, gridBagConstraints);

        j27.setBackground(new java.awt.Color(181, 135, 99));
        j27.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j27.setMinimumSize(new java.awt.Dimension(73, 73));
        j27.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j27, gridBagConstraints);

        j30.setBackground(new java.awt.Color(181, 135, 99));
        j30.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j30.setMinimumSize(new java.awt.Dimension(73, 73));
        j30.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j30, gridBagConstraints);

        j31.setBackground(new java.awt.Color(255, 153, 51));
        j31.setForeground(new java.awt.Color(102, 51, 0));
        j31.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j31.setMinimumSize(new java.awt.Dimension(73, 73));
        j31.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j31, gridBagConstraints);

        j32.setBackground(new java.awt.Color(181, 135, 99));
        j32.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j32.setMinimumSize(new java.awt.Dimension(73, 73));
        j32.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j32, gridBagConstraints);

        j33.setBackground(new java.awt.Color(255, 153, 51));
        j33.setForeground(new java.awt.Color(102, 51, 0));
        j33.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j33.setMinimumSize(new java.awt.Dimension(73, 73));
        j33.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j33, gridBagConstraints);

        j34.setBackground(new java.awt.Color(181, 135, 99));
        j34.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j34.setMinimumSize(new java.awt.Dimension(73, 73));
        j34.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j34, gridBagConstraints);

        j35.setBackground(new java.awt.Color(255, 153, 51));
        j35.setForeground(new java.awt.Color(102, 51, 0));
        j35.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j35.setMinimumSize(new java.awt.Dimension(73, 73));
        j35.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j35, gridBagConstraints);

        j36.setBackground(new java.awt.Color(181, 135, 99));
        j36.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j36.setMinimumSize(new java.awt.Dimension(73, 73));
        j36.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j36, gridBagConstraints);

        j37.setBackground(new java.awt.Color(255, 153, 51));
        j37.setForeground(new java.awt.Color(102, 51, 0));
        j37.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j37.setMinimumSize(new java.awt.Dimension(73, 73));
        j37.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j37, gridBagConstraints);

        j40.setBackground(new java.awt.Color(255, 153, 51));
        j40.setForeground(new java.awt.Color(102, 51, 0));
        j40.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j40.setMinimumSize(new java.awt.Dimension(73, 73));
        j40.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j40, gridBagConstraints);

        j41.setBackground(new java.awt.Color(181, 135, 99));
        j41.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j41.setMinimumSize(new java.awt.Dimension(73, 73));
        j41.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j41, gridBagConstraints);

        j42.setBackground(new java.awt.Color(255, 153, 51));
        j42.setForeground(new java.awt.Color(102, 51, 0));
        j42.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j42.setMinimumSize(new java.awt.Dimension(73, 73));
        j42.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j42, gridBagConstraints);

        j43.setBackground(new java.awt.Color(181, 135, 99));
        j43.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j43.setMinimumSize(new java.awt.Dimension(73, 73));
        j43.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j43, gridBagConstraints);

        j44.setBackground(new java.awt.Color(255, 153, 51));
        j44.setForeground(new java.awt.Color(102, 51, 0));
        j44.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j44.setMinimumSize(new java.awt.Dimension(73, 73));
        j44.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j44, gridBagConstraints);

        j45.setBackground(new java.awt.Color(181, 135, 99));
        j45.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j45.setMinimumSize(new java.awt.Dimension(73, 73));
        j45.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j45, gridBagConstraints);

        j46.setBackground(new java.awt.Color(255, 153, 51));
        j46.setForeground(new java.awt.Color(102, 51, 0));
        j46.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j46.setMinimumSize(new java.awt.Dimension(73, 73));
        j46.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j46, gridBagConstraints);

        j47.setBackground(new java.awt.Color(181, 135, 99));
        j47.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j47.setMinimumSize(new java.awt.Dimension(73, 73));
        j47.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j47, gridBagConstraints);

        j50.setBackground(new java.awt.Color(181, 135, 99));
        j50.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j50.setMinimumSize(new java.awt.Dimension(73, 73));
        j50.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j50, gridBagConstraints);

        j51.setBackground(new java.awt.Color(255, 153, 51));
        j51.setForeground(new java.awt.Color(102, 51, 0));
        j51.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j51.setMinimumSize(new java.awt.Dimension(73, 73));
        j51.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j51, gridBagConstraints);

        j52.setBackground(new java.awt.Color(181, 135, 99));
        j52.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j52.setMinimumSize(new java.awt.Dimension(73, 73));
        j52.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j52, gridBagConstraints);

        j53.setBackground(new java.awt.Color(255, 153, 51));
        j53.setForeground(new java.awt.Color(102, 51, 0));
        j53.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j53.setMinimumSize(new java.awt.Dimension(73, 73));
        j53.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j53, gridBagConstraints);

        j54.setBackground(new java.awt.Color(181, 135, 99));
        j54.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j54.setMinimumSize(new java.awt.Dimension(73, 73));
        j54.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j54, gridBagConstraints);

        j55.setBackground(new java.awt.Color(255, 153, 51));
        j55.setForeground(new java.awt.Color(102, 51, 0));
        j55.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j55.setMinimumSize(new java.awt.Dimension(73, 73));
        j55.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j55, gridBagConstraints);

        j56.setBackground(new java.awt.Color(181, 135, 99));
        j56.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j56.setMinimumSize(new java.awt.Dimension(73, 73));
        j56.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j56, gridBagConstraints);

        j57.setBackground(new java.awt.Color(255, 153, 51));
        j57.setForeground(new java.awt.Color(102, 51, 0));
        j57.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j57.setMinimumSize(new java.awt.Dimension(73, 73));
        j57.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j57, gridBagConstraints);

        j60.setBackground(new java.awt.Color(255, 153, 51));
        j60.setForeground(new java.awt.Color(102, 51, 0));
        j60.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j60.setMinimumSize(new java.awt.Dimension(73, 73));
        j60.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j60, gridBagConstraints);

        j61.setBackground(new java.awt.Color(181, 135, 99));
        j61.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j61.setMinimumSize(new java.awt.Dimension(73, 73));
        j61.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j61, gridBagConstraints);

        j62.setBackground(new java.awt.Color(255, 153, 51));
        j62.setForeground(new java.awt.Color(102, 51, 0));
        j62.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j62.setMinimumSize(new java.awt.Dimension(73, 73));
        j62.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j62, gridBagConstraints);

        j63.setBackground(new java.awt.Color(181, 135, 99));
        j63.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j63.setMinimumSize(new java.awt.Dimension(73, 73));
        j63.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j63, gridBagConstraints);

        j64.setBackground(new java.awt.Color(255, 153, 51));
        j64.setForeground(new java.awt.Color(102, 51, 0));
        j64.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j64.setMinimumSize(new java.awt.Dimension(73, 73));
        j64.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j64, gridBagConstraints);

        j65.setBackground(new java.awt.Color(181, 135, 99));
        j65.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j65.setMinimumSize(new java.awt.Dimension(73, 73));
        j65.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j65, gridBagConstraints);

        j66.setBackground(new java.awt.Color(255, 153, 51));
        j66.setForeground(new java.awt.Color(102, 51, 0));
        j66.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j66.setMinimumSize(new java.awt.Dimension(73, 73));
        j66.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j66, gridBagConstraints);

        j67.setBackground(new java.awt.Color(181, 135, 99));
        j67.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j67.setMinimumSize(new java.awt.Dimension(73, 73));
        j67.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j67, gridBagConstraints);

        j70.setBackground(new java.awt.Color(181, 135, 99));
        j70.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j70.setMinimumSize(new java.awt.Dimension(73, 73));
        j70.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j70, gridBagConstraints);

        j71.setBackground(new java.awt.Color(255, 153, 51));
        j71.setForeground(new java.awt.Color(102, 51, 0));
        j71.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j71.setMinimumSize(new java.awt.Dimension(73, 73));
        j71.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j71, gridBagConstraints);

        j72.setBackground(new java.awt.Color(181, 135, 99));
        j72.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j72.setMinimumSize(new java.awt.Dimension(73, 73));
        j72.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j72, gridBagConstraints);

        j73.setBackground(new java.awt.Color(255, 153, 51));
        j73.setForeground(new java.awt.Color(102, 51, 0));
        j73.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j73.setMinimumSize(new java.awt.Dimension(73, 73));
        j73.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j73, gridBagConstraints);

        j74.setBackground(new java.awt.Color(181, 135, 99));
        j74.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j74.setMinimumSize(new java.awt.Dimension(73, 73));
        j74.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j74, gridBagConstraints);

        j75.setBackground(new java.awt.Color(255, 153, 51));
        j75.setForeground(new java.awt.Color(102, 51, 0));
        j75.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j75.setMinimumSize(new java.awt.Dimension(73, 73));
        j75.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j75, gridBagConstraints);

        j76.setBackground(new java.awt.Color(181, 135, 99));
        j76.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j76.setMinimumSize(new java.awt.Dimension(73, 73));
        j76.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j76, gridBagConstraints);

        j77.setBackground(new java.awt.Color(255, 153, 51));
        j77.setForeground(new java.awt.Color(102, 51, 0));
        j77.setMaximumSize(new java.awt.Dimension(1000, 1000));
        j77.setMinimumSize(new java.awt.Dimension(73, 73));
        j77.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(j77, gridBagConstraints);

        jPanel7.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel3.setMinimumSize(new java.awt.Dimension(73, 73));
        jPanel3.setPreferredSize(new java.awt.Dimension(73, 73));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("8");
        jLabel9.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel9.setMinimumSize(new java.awt.Dimension(73, 73));
        jLabel9.setPreferredSize(new java.awt.Dimension(73, 73));
        jPanel3.add(jLabel9, new java.awt.GridBagConstraints());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("7");
        jLabel10.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel10.setMinimumSize(new java.awt.Dimension(73, 73));
        jLabel10.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel3.add(jLabel10, gridBagConstraints);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("6");
        jLabel11.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel11.setMinimumSize(new java.awt.Dimension(73, 73));
        jLabel11.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jLabel11, gridBagConstraints);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("5");
        jLabel12.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel12.setMinimumSize(new java.awt.Dimension(73, 73));
        jLabel12.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel3.add(jLabel12, gridBagConstraints);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("4");
        jLabel13.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel13.setMinimumSize(new java.awt.Dimension(73, 73));
        jLabel13.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel3.add(jLabel13, gridBagConstraints);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("3");
        jLabel14.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel14.setMinimumSize(new java.awt.Dimension(73, 73));
        jLabel14.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel3.add(jLabel14, gridBagConstraints);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("2");
        jLabel15.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel15.setMinimumSize(new java.awt.Dimension(73, 73));
        jLabel15.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel3.add(jLabel15, gridBagConstraints);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("1");
        jLabel16.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel16.setMinimumSize(new java.awt.Dimension(73, 73));
        jLabel16.setPreferredSize(new java.awt.Dimension(73, 73));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        jPanel3.add(jLabel16, gridBagConstraints);

        jPanel7.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel18);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("A");
        jLabel19.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel19);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("B");
        jLabel20.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel20);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("C");
        jLabel21.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel21);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("D");
        jLabel22.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel22);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("E");
        jLabel23.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel23);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("F");
        jLabel24.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel24);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("G");
        jLabel25.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel25);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("H");
        jLabel17.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel17);

        jLabel1.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel1);
        jPanel2.add(jLabel3);

        jLabel2.setPreferredSize(new java.awt.Dimension(73, 36));
        jPanel2.add(jLabel2);

        jPanel7.add(jPanel2, java.awt.BorderLayout.NORTH);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel6.setLayout(new java.awt.BorderLayout());

        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0, 3, 0, 3, 0};
        jPanel5Layout.rowHeights = new int[] {0, 1, 0, 1, 0, 1, 0, 1, 0};
        jPanel5.setLayout(jPanel5Layout);

        BlancasFisicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlancasFisicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BlancasFisicos.setName("BlancasFisicos"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(BlancasFisicos, gridBagConstraints);

        NegrasFisicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NegrasFisicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NegrasFisicos.setName("NegrasFisicos"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(NegrasFisicos, gridBagConstraints);

        BlancasQuimicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlancasQuimicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BlancasQuimicos.setName("BlancasQuimicos"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(BlancasQuimicos, gridBagConstraints);

        NegrasQuimicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NegrasQuimicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NegrasQuimicos.setName("NegrasQuimicos"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(NegrasQuimicos, gridBagConstraints);

        BlancasGeologos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlancasGeologos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BlancasGeologos.setName("BlancasGeologos"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(BlancasGeologos, gridBagConstraints);

        NegrasGeologos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        NegrasGeologos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NegrasGeologos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NegrasGeologos.setName("NegrasGeologos"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(NegrasGeologos, gridBagConstraints);

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel4.setText("Tipo de Piezas");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        jPanel5.add(jLabel4, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(0, 0, 204));
        jLabel5.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel5.setText("Blancas");
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        jPanel5.add(jLabel5, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(0, 0, 204));
        jLabel6.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel6.setText("Negras");
        jLabel6.setAlignmentX(0.5F);
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 4;
        jPanel5.add(jLabel6, gridBagConstraints);

        jLabel7.setBackground(new java.awt.Color(255, 102, 0));
        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("Físicos");
        jLabel7.setAlignmentX(0.5F);
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(jLabel7, gridBagConstraints);

        jLabel8.setBackground(new java.awt.Color(255, 102, 0));
        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Químicos");
        jLabel8.setAlignmentX(0.5F);
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(jLabel8, gridBagConstraints);

        jLabel26.setBackground(new java.awt.Color(255, 102, 0));
        jLabel26.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel26.setText("Geólogos");
        jLabel26.setAlignmentX(0.5F);
        jLabel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel26.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(jLabel26, gridBagConstraints);

        jLabel27.setBackground(new java.awt.Color(255, 102, 0));
        jLabel27.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel27.setText("Normal");
        jLabel27.setAlignmentX(0.5F);
        jLabel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel27.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(jLabel27, gridBagConstraints);

        BlancasNormales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlancasNormales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BlancasNormales.setName("BlancasNormales"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(BlancasNormales, gridBagConstraints);

        NegrasNormales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NegrasNormales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NegrasNormales.setName("NegrasNormales"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(NegrasNormales, gridBagConstraints);

        jPanel6.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setIcono(javax.swing.JButton j,ImageIcon icon){
        j.setIcon(icon);
        this.setVisible(true);
    }
    public  void setBackGround(int i,int j, int k,int l,int m){
        JButton boton=getJ(i,j);
        boton.setBackground(new java.awt.Color(k, l, m));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox BlancasFisicos;
    public javax.swing.JCheckBox BlancasGeologos;
    public javax.swing.JCheckBox BlancasNormales;
    public javax.swing.JCheckBox BlancasQuimicos;
    public javax.swing.JCheckBox NegrasFisicos;
    public javax.swing.JCheckBox NegrasGeologos;
    public javax.swing.JCheckBox NegrasNormales;
    public javax.swing.JCheckBox NegrasQuimicos;
    private javax.swing.JButton j00;
    private javax.swing.JButton j01;
    private javax.swing.JButton j02;
    private javax.swing.JButton j03;
    private javax.swing.JButton j04;
    private javax.swing.JButton j05;
    private javax.swing.JButton j06;
    private javax.swing.JButton j07;
    private javax.swing.JButton j10;
    private javax.swing.JButton j11;
    private javax.swing.JButton j12;
    private javax.swing.JButton j13;
    private javax.swing.JButton j14;
    private javax.swing.JButton j15;
    private javax.swing.JButton j16;
    private javax.swing.JButton j17;
    private javax.swing.JButton j20;
    private javax.swing.JButton j21;
    private javax.swing.JButton j22;
    private javax.swing.JButton j23;
    private javax.swing.JButton j24;
    private javax.swing.JButton j25;
    private javax.swing.JButton j26;
    private javax.swing.JButton j27;
    private javax.swing.JButton j30;
    private javax.swing.JButton j31;
    private javax.swing.JButton j32;
    private javax.swing.JButton j33;
    private javax.swing.JButton j34;
    private javax.swing.JButton j35;
    private javax.swing.JButton j36;
    private javax.swing.JButton j37;
    private javax.swing.JButton j40;
    private javax.swing.JButton j41;
    private javax.swing.JButton j42;
    private javax.swing.JButton j43;
    private javax.swing.JButton j44;
    private javax.swing.JButton j45;
    private javax.swing.JButton j46;
    private javax.swing.JButton j47;
    private javax.swing.JButton j50;
    private javax.swing.JButton j51;
    private javax.swing.JButton j52;
    private javax.swing.JButton j53;
    private javax.swing.JButton j54;
    private javax.swing.JButton j55;
    private javax.swing.JButton j56;
    private javax.swing.JButton j57;
    private javax.swing.JButton j60;
    private javax.swing.JButton j61;
    private javax.swing.JButton j62;
    private javax.swing.JButton j63;
    private javax.swing.JButton j64;
    private javax.swing.JButton j65;
    private javax.swing.JButton j66;
    private javax.swing.JButton j67;
    private javax.swing.JButton j70;
    private javax.swing.JButton j71;
    private javax.swing.JButton j72;
    private javax.swing.JButton j73;
    private javax.swing.JButton j74;
    private javax.swing.JButton j75;
    private javax.swing.JButton j76;
    private javax.swing.JButton j77;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JLabel tiempo1;
    private javax.swing.JLabel tiempo2;
    // End of variables declaration//GEN-END:variables
     public JButton getJ(int i, int j) {
        if(i==0 && j==0) return j00;
        if(i==0 && j==1) return j01;
        if(i==0 && j==2) return j02;
        if(i==0 && j==3) return j03;
        if(i==0 && j==4) return j04;
        if(i==0 && j==5) return j05;
        if(i==0 && j==6) return j06;
        if(i==0 && j==7) return j07;
        if(i==1 && j==0) return j10;
        if(i==1 && j==1) return j11;
        if(i==1 && j==2) return j12;
        if(i==1 && j==3) return j13;
        if(i==1 && j==4) return j14;
        if(i==1 && j==5) return j15;
        if(i==1 && j==6) return j16;
        if(i==1 && j==7) return j17;
        if(i==3 && j==0) return j30;
        if(i==3 && j==1) return j31;
        if(i==3 && j==2) return j32;
        if(i==3 && j==3) return j33;
        if(i==3 && j==4) return j34;
        if(i==3 && j==5) return j35;
        if(i==3 && j==6) return j36;
        if(i==3 && j==7) return j37;
        if(i==2 && j==0) return j20;
        if(i==2 && j==1) return j21;
        if(i==2 && j==2) return j22;
        if(i==2 && j==3) return j23;
        if(i==2 && j==4) return j24;
        if(i==2 && j==5) return j25;
        if(i==2 && j==6) return j26;
        if(i==2 && j==7) return j27;
        if(i==4 && j==0) return j40;
        if(i==4 && j==1) return j41;
        if(i==4 && j==2) return j42;
        if(i==4 && j==3) return j43;
        if(i==4 && j==4) return j44;
        if(i==4 && j==5) return j45;
        if(i==4 && j==6) return j46;
        if(i==4 && j==7) return j47;
        if(i==5 && j==0) return j50;
        if(i==5 && j==1) return j51;
        if(i==5 && j==2) return j52;
        if(i==5 && j==3) return j53;
        if(i==5 && j==4) return j54;
        if(i==5 && j==5) return j55;
        if(i==5 && j==6) return j56;
        if(i==5 && j==7) return j57;
        if(i==6 && j==0) return j60;
        if(i==6 && j==1) return j61;
        if(i==6 && j==2) return j62;
        if(i==6 && j==3) return j63;
        if(i==6 && j==4) return j64;
        if(i==6 && j==5) return j65;
        if(i==6 && j==6) return j66;
        if(i==6 && j==7) return j67;
        if(i==7 && j==0) return j70;
        if(i==7 && j==1) return j71;
        if(i==7 && j==2) return j72;
        if(i==7 && j==3) return j73;
        if(i==7 && j==4) return j74;
        if(i==7 && j==5) return j75;
        if(i==7 && j==6) return j76;
        else return j77;    
    }
     void subscribirABotones(ActionListener al) {
            for (int i = 0; i < jPanel1.getComponentCount(); i++) {
                try {((JButton) jPanel1.getComponent(i)).addActionListener(al);
                } catch (Exception ignored) {}
            }
    }
     void subscribirARaton(MouseListener me){
         for (int i = 0; i < jPanel1.getComponentCount(); i++) {
                try {((JButton) jPanel1.getComponent(i)).addMouseListener(me);
                } catch (Exception ignored) {}
            }
     }
    
  
     void subscribirABackStatr(ActionListener al){
        for(int i=0;i<jPanel4.getComponentCount();i++){
            try{((JButton)jPanel4.getComponent(i)).addActionListener(al);
                    }catch (Exception ignored) {}
        }
     }
      public static void setText( JLabel jl, int minutos,int segundos ){
          if(segundos<=9){jl.setText(minutos+":0"+segundos);}else{
          jl.setText(minutos+":"+segundos);}
      }
      public JLabel getJlabel(boolean turnoblanco){
          if(turnoblanco){return tiempo1;}
          else{return tiempo2;}
      }
      void subscribrsACheck(ActionListener al){
          for(int i=0;i<jPanel5.getComponentCount();i++){
              try{((JCheckBox)jPanel5.getComponent(i)).addActionListener(al);
                    }catch (Exception ignored) {}
          }
      }
      public  JCheckBox[] getJcheckbox(String b){
          if("B".equals(b)){
               JCheckBox [] list={BlancasFisicos,BlancasGeologos,BlancasQuimicos,BlancasNormales};
              return list; 
          }else{
              JCheckBox [] list={NegrasFisicos,NegrasGeologos,NegrasQuimicos,NegrasNormales};
              return list;
          }
        
      }

      
}
