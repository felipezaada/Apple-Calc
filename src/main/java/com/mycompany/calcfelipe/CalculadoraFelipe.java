/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calcfelipe;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class CalculadoraFelipe extends javax.swing.JFrame {
       
    Calculos calculos = new Calculos();
    
    String txtNum1;
    String txtNum2;
    double num1;
    double num2;
    char escolha;
    /**
     * Creates new form calculadoraFelipe
     */
    public CalculadoraFelipe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoAC = new javax.swing.JButton();
        BotaoMaisMenos = new javax.swing.JButton();
        BotaoPorcentagem = new javax.swing.JButton();
        BotaoVezes = new javax.swing.JButton();
        BotaoMenos = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        BotaoMais = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoPonto = new javax.swing.JButton();
        Botao0 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao1 = new javax.swing.JButton();
        BotaoDivisao = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(390, 700));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(null);
        jPanel1.setMinimumSize(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 700));

        BotaoAC.setBackground(new java.awt.Color(204, 204, 204));
        BotaoAC.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoAC.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAC.setText("AC");
        BotaoAC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoAC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoAC.setFocusPainted(false);
        BotaoAC.setMaximumSize(null);
        BotaoAC.setMinimumSize(null);
        BotaoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAC(evt);
            }
        });

        BotaoMaisMenos.setBackground(new java.awt.Color(204, 204, 204));
        BotaoMaisMenos.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoMaisMenos.setForeground(new java.awt.Color(255, 255, 255));
        BotaoMaisMenos.setText("+/-");
        BotaoMaisMenos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoMaisMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoMaisMenos.setFocusPainted(false);
        BotaoMaisMenos.setMaximumSize(null);
        BotaoMaisMenos.setMinimumSize(null);
        BotaoMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMaisMenos(evt);
            }
        });

        BotaoPorcentagem.setBackground(new java.awt.Color(204, 204, 204));
        BotaoPorcentagem.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        BotaoPorcentagem.setText("%");
        BotaoPorcentagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoPorcentagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPorcentagem.setFocusPainted(false);
        BotaoPorcentagem.setMaximumSize(null);
        BotaoPorcentagem.setMinimumSize(null);
        BotaoPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPorcentagem(evt);
            }
        });

        BotaoVezes.setBackground(new java.awt.Color(252, 166, 37));
        BotaoVezes.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoVezes.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVezes.setText("x");
        BotaoVezes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoVezes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoVezes.setFocusPainted(false);
        BotaoVezes.setMaximumSize(null);
        BotaoVezes.setMinimumSize(null);
        BotaoVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVezes(evt);
            }
        });

        BotaoMenos.setBackground(new java.awt.Color(252, 166, 37));
        BotaoMenos.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoMenos.setForeground(new java.awt.Color(255, 255, 255));
        BotaoMenos.setText("-");
        BotaoMenos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoMenos.setFocusPainted(false);
        BotaoMenos.setMaximumSize(null);
        BotaoMenos.setMinimumSize(null);
        BotaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenos(evt);
            }
        });

        Botao9.setBackground(new java.awt.Color(102, 102, 102));
        Botao9.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao9.setForeground(new java.awt.Color(255, 255, 255));
        Botao9.setText("9");
        Botao9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao9.setFocusPainted(false);
        Botao9.setMaximumSize(null);
        Botao9.setMinimumSize(null);
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9(evt);
            }
        });

        Botao8.setBackground(new java.awt.Color(102, 102, 102));
        Botao8.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao8.setForeground(new java.awt.Color(255, 255, 255));
        Botao8.setText("8");
        Botao8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao8.setFocusPainted(false);
        Botao8.setMaximumSize(null);
        Botao8.setMinimumSize(null);
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8(evt);
            }
        });

        Botao7.setBackground(new java.awt.Color(102, 102, 102));
        Botao7.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao7.setForeground(new java.awt.Color(255, 255, 255));
        Botao7.setText("7");
        Botao7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao7.setFocusPainted(false);
        Botao7.setMaximumSize(null);
        Botao7.setMinimumSize(null);
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7(evt);
            }
        });

        Botao4.setBackground(new java.awt.Color(102, 102, 102));
        Botao4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao4.setForeground(new java.awt.Color(255, 255, 255));
        Botao4.setText("4");
        Botao4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao4.setFocusPainted(false);
        Botao4.setMaximumSize(null);
        Botao4.setMinimumSize(null);
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4(evt);
            }
        });

        Botao5.setBackground(new java.awt.Color(102, 102, 102));
        Botao5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao5.setForeground(new java.awt.Color(255, 255, 255));
        Botao5.setText("5");
        Botao5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao5.setFocusPainted(false);
        Botao5.setMaximumSize(null);
        Botao5.setMinimumSize(null);
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5(evt);
            }
        });

        Botao6.setBackground(new java.awt.Color(102, 102, 102));
        Botao6.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao6.setForeground(new java.awt.Color(255, 255, 255));
        Botao6.setText("6");
        Botao6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao6.setFocusPainted(false);
        Botao6.setMaximumSize(null);
        Botao6.setMinimumSize(null);
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6(evt);
            }
        });

        BotaoMais.setBackground(new java.awt.Color(252, 166, 37));
        BotaoMais.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoMais.setForeground(new java.awt.Color(255, 255, 255));
        BotaoMais.setText("+");
        BotaoMais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoMais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoMais.setFocusPainted(false);
        BotaoMais.setMaximumSize(null);
        BotaoMais.setMinimumSize(null);
        BotaoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMais(evt);
            }
        });

        BotaoIgual.setBackground(new java.awt.Color(252, 166, 37));
        BotaoIgual.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoIgual.setForeground(new java.awt.Color(255, 255, 255));
        BotaoIgual.setText("=");
        BotaoIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoIgual.setFocusPainted(false);
        BotaoIgual.setMaximumSize(null);
        BotaoIgual.setMinimumSize(null);
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgual(evt);
            }
        });

        BotaoPonto.setBackground(new java.awt.Color(102, 102, 102));
        BotaoPonto.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoPonto.setForeground(new java.awt.Color(255, 255, 255));
        BotaoPonto.setText(".");
        BotaoPonto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoPonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPonto.setFocusPainted(false);
        BotaoPonto.setMaximumSize(null);
        BotaoPonto.setMinimumSize(null);
        BotaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPonto(evt);
            }
        });

        Botao0.setBackground(new java.awt.Color(102, 102, 102));
        Botao0.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao0.setForeground(new java.awt.Color(255, 255, 255));
        Botao0.setText("0");
        Botao0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao0.setFocusPainted(false);
        Botao0.setMaximumSize(null);
        Botao0.setMinimumSize(null);
        Botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao0(evt);
            }
        });

        Botao3.setBackground(new java.awt.Color(102, 102, 102));
        Botao3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao3.setForeground(new java.awt.Color(255, 255, 255));
        Botao3.setText("3");
        Botao3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao3.setFocusPainted(false);
        Botao3.setMaximumSize(null);
        Botao3.setMinimumSize(null);
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3(evt);
            }
        });

        Botao2.setBackground(new java.awt.Color(102, 102, 102));
        Botao2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao2.setForeground(new java.awt.Color(255, 255, 255));
        Botao2.setText("2");
        Botao2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao2.setFocusPainted(false);
        Botao2.setMaximumSize(null);
        Botao2.setMinimumSize(null);
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2(evt);
            }
        });

        Botao1.setBackground(new java.awt.Color(102, 102, 102));
        Botao1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Botao1.setForeground(new java.awt.Color(255, 255, 255));
        Botao1.setText("1");
        Botao1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botao1.setFocusPainted(false);
        Botao1.setMaximumSize(null);
        Botao1.setMinimumSize(null);
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1(evt);
            }
        });

        BotaoDivisao.setBackground(new java.awt.Color(252, 166, 37));
        BotaoDivisao.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        BotaoDivisao.setForeground(new java.awt.Color(255, 255, 255));
        BotaoDivisao.setText("÷");
        BotaoDivisao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoDivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoDivisao.setFocusPainted(false);
        BotaoDivisao.setMaximumSize(null);
        BotaoDivisao.setMinimumSize(null);
        BotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivisao(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 60)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.setMaximumSize(null);
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoAC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoAC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotaoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );

        BotaoMais.getAccessibleContext().setAccessibleName("jButton7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6

        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "6";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "6";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao6

    private void Botao9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "9";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "9";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao9

    private void BotaoMenos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenos
        jTextField1.setText("");
        escolha = '-';
    }//GEN-LAST:event_BotaoMenos

    private void BotaoVezes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVezes
        jTextField1.setText("");
        escolha = 'x';
    }//GEN-LAST:event_BotaoVezes

    private void BotaoPorcentagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPorcentagem
        jTextField1.setText("");
        escolha = '%';
    }//GEN-LAST:event_BotaoPorcentagem

    private void BotaoAC(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAC
        txtNum1 = "";
        txtNum2 = "";
        num1 = 0.0;
        num2 = 0.0;
        escolha = '\0';
        jTextField1.setText("");
    }//GEN-LAST:event_BotaoAC

    private void BotaoMaisMenos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMaisMenos

    }//GEN-LAST:event_BotaoMaisMenos

    private void BotaoIgual(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgual
        calculos.Calcular(num1, num2, escolha);
        jTextField1.setText(Double.toString(calculos.resultado));
    }//GEN-LAST:event_BotaoIgual

    private void Botao3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "3";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "3";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao3

    private void BotaoDivisao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivisao
        jTextField1.setText("");
        escolha = '/';
    }//GEN-LAST:event_BotaoDivisao

    private void Botao1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "1";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "1";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao1

    private void Botao0(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao0
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "0";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "0";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao0

    private void BotaoPonto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPonto
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + ".";
            jTextField1.setText(txtNum1);
            num1 = Double.parseDouble(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + ".";
            jTextField1.setText(txtNum2);
            num2 = Double.parseDouble(txtNum2);
        }
    }//GEN-LAST:event_BotaoPonto

    private void BotaoMais(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMais
        jTextField1.setText("");
        escolha = '+';
    }//GEN-LAST:event_BotaoMais

    private void Botao2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "2";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "2";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao2

    private void Botao4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "4";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "4";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao4

    private void Botao5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "5";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "5";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao5

    private void Botao8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "8";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "8";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao8

    private void Botao7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7
       if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + "7";
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + "7";
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
    }//GEN-LAST:event_Botao7

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CalculadoraFelipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFelipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFelipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFelipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFelipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao0;
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoAC;
    private javax.swing.JButton BotaoDivisao;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoMais;
    private javax.swing.JButton BotaoMaisMenos;
    private javax.swing.JButton BotaoMenos;
    private javax.swing.JButton BotaoPonto;
    private javax.swing.JButton BotaoPorcentagem;
    private javax.swing.JButton BotaoVezes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}