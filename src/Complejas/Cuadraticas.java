package Complejas;

import ListaCircular.Lista;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 * @author Jonathan Rivera Vasquez
 * @version 1.0
 * @since 4/05/2022
 */
public class Cuadraticas extends javax.swing.JInternalFrame {

    // <editor-fold defaultstate="collapsed" desc="Variables Globales">
    boolean modoOscuro;
    private JComponent Barra;
    private Dimension DimensionBarra;
    Lista<String> historial;
    boolean historialVisible;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Cuadraticas() {
        initComponents();
        inicioPanel3();
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = null;
        QuitarLaBarraTitulo();
        modoOscuro = false;
        historial = new Lista();
        historialVisible = false;
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        laHistorial = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        btnDark = new javax.swing.JButton();
        Cerrar = new javax.swing.JLabel();
        txtFormula = new javax.swing.JLabel();
        txtX1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtX22 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtResultado = new javax.swing.JLabel();
        txtResultado1 = new javax.swing.JLabel();
        X1 = new javax.swing.JLabel();
        txtX0 = new javax.swing.JLabel();
        txtx2 = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        txtx = new javax.swing.JTextField();
        btnHitorial = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnResultado = new javax.swing.JButton();
        btnC = new javax.swing.JButton();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laHistorial.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        laHistorial.setForeground(new java.awt.Color(55, 62, 71));
        laHistorial.setText("Historial");
        jPanel4.add(laHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(53, 60, 69));
        jSeparator4.setForeground(new java.awt.Color(53, 60, 69));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 10));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        jScrollPane1.setBorder(null);

        txtHistorial.setEditable(false);
        txtHistorial.setBackground(new java.awt.Color(255, 255, 255));
        txtHistorial.setBorder(null);
        txtHistorial.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtHistorial.setForeground(new java.awt.Color(55, 62, 71));
        jScrollPane1.setViewportView(txtHistorial);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, 220));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 340, 280));

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/darkmode1.png"))); // NOI18N
        btnDark.setBorderPainted(false);
        btnDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkActionPerformed(evt);
            }
        });
        jPanel1.add(btnDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 18));

        Cerrar.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 0, 0));
        Cerrar.setText(" •");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 40));

        txtFormula.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtFormula.setForeground(new java.awt.Color(55, 62, 71));
        txtFormula.setText("±ax^2 ± bx ± c");
        jPanel1.add(txtFormula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, 30));

        txtX1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtX1.setForeground(new java.awt.Color(55, 62, 71));
        txtX1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtX1.setText("X");
        jPanel1.add(txtX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 30, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, 10));

        txtX22.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtX22.setForeground(new java.awt.Color(55, 62, 71));
        txtX22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtX22.setText("X^2");
        jPanel1.add(txtX22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 30, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, 10));

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 160, 50));

        txtResultado1.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtResultado1.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtResultado1.setToolTipText("");
        jPanel1.add(txtResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 160, 50));

        X1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        X1.setForeground(new java.awt.Color(55, 62, 71));
        X1.setText("X1 = ");
        X1.setToolTipText("");
        jPanel1.add(X1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 50, 50));

        txtX0.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtX0.setForeground(new java.awt.Color(55, 62, 71));
        txtX0.setText("X0 = ");
        txtX0.setToolTipText("");
        jPanel1.add(txtX0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 50, 50));

        txtx2.setBackground(new java.awt.Color(244, 253, 251));
        txtx2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtx2.setForeground(new java.awt.Color(55, 62, 71));
        txtx2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtx2.setToolTipText("");
        txtx2.setBorder(null);
        txtx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtx2ActionPerformed(evt);
            }
        });
        txtx2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtx2KeyPressed(evt);
            }
        });
        jPanel1.add(txtx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 50, 30));

        txtN.setBackground(new java.awt.Color(244, 253, 251));
        txtN.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtN.setForeground(new java.awt.Color(55, 62, 71));
        txtN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtN.setToolTipText("");
        txtN.setBorder(null);
        txtN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNKeyPressed(evt);
            }
        });
        jPanel1.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 50, 30));

        txtx.setBackground(new java.awt.Color(244, 253, 251));
        txtx.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtx.setForeground(new java.awt.Color(55, 62, 71));
        txtx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtx.setToolTipText("");
        txtx.setBorder(null);
        txtx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtxKeyPressed(evt);
            }
        });
        jPanel1.add(txtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 50, 30));

        btnHitorial.setBackground(new java.awt.Color(244, 253, 251));
        btnHitorial.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        btnHitorial.setForeground(new java.awt.Color(244, 253, 251));
        btnHitorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/history_112375.png"))); // NOI18N
        btnHitorial.setBorder(null);
        btnHitorial.setBorderPainted(false);
        btnHitorial.setContentAreaFilled(false);
        btnHitorial.setDefaultCapable(false);
        btnHitorial.setFocusPainted(false);
        btnHitorial.setFocusable(false);
        btnHitorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHitorial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/history_112375.png"))); // NOI18N
        btnHitorial.setRequestFocusEnabled(false);
        btnHitorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/history_112375.png"))); // NOI18N
        btnHitorial.setVerifyInputWhenFocusTarget(false);
        btnHitorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitorialActionPerformed(evt);
            }
        });
        btnHitorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnHitorialKeyTyped(evt);
            }
        });
        jPanel1.add(btnHitorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 430));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnResultado.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(255, 255, 255));
        btnResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-3.png"))); // NOI18N
        btnResultado.setText("=");
        btnResultado.setBorder(null);
        btnResultado.setFocusPainted(false);
        btnResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnResultado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        btnResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnResultadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnResultadoKeyTyped(evt);
            }
        });
        jPanel2.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 50));

        btnC.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnC.setForeground(new java.awt.Color(55, 62, 71));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnC.setText("C");
        btnC.setBorder(null);
        btnC.setFocusPainted(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 340, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed
        darkMode();
    }//GEN-LAST:event_btnDarkActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        String aux1 = txtx2.getText();
        String aux2 = txtx.getText();
        String aux3 = txtN.getText();
        boolean isNumeric;
        if ((isNumeric = aux1.matches("[+-]?\\d*(\\.\\d+)?") == true) && (isNumeric = aux2.matches("[+-]?\\d*(\\.\\d+)?") == true) && (isNumeric = aux3.matches("[+-]?\\d*(\\.\\d+)?") == true)) {
            cuadratica();
        } else {
            txtResultado.setText("ERROR");
            txtResultado1.setText("ERROR");
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnResultadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResultadoKeyReleased

    }//GEN-LAST:event_btnResultadoKeyReleased

    private void btnResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResultadoKeyTyped

    }//GEN-LAST:event_btnResultadoKeyTyped

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtResultado1.setText("");
        txtResultado.setText("");
        txtx.setText("");
        txtN.setText("");
        txtx2.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void txtx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtx2ActionPerformed

    private void btnHitorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitorialActionPerformed
        String aux = "";
        historialVisible();
        txtHistorial.setText(historial.desplegarLista(aux));
    }//GEN-LAST:event_btnHitorialActionPerformed

    private void btnHitorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHitorialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHitorialKeyTyped

    private void txtNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtNKeyPressed

    private void txtxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtxKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtxKeyPressed

    private void txtx2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtx2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtx2KeyPressed

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    public void inicioPanel3() {
        jPanel3.setVisible(false);
    }

    public void historialVisible() {
        if (!historialVisible) {
            jPanel3.setVisible(true);
            historialVisible = true;
        } else {
            jPanel3.setVisible(false);
            historialVisible = false;
        }
    }

    public void cuadratica() {
        Pila<String> a = new Pila();
        Pila<String> b = new Pila();
        Pila<String> c = new Pila();

        a.push(txtx2.getText());
        b.push(txtx.getText());
        c.push(txtN.getText());

        double A = Double.valueOf(a.pop());
        double B = Double.valueOf(b.pop());
        double C = Double.valueOf(c.pop());
        double determinante = Math.pow(B, 2) - (4 * A * C);
        if (determinante > 0) {
            double x0 = ((B * (-1)) + Math.sqrt(determinante)) / (2 * A);
            double x1 = ((B * (-1)) - Math.sqrt(determinante)) / (2 * A);

            String aux = "\n" + txtx2.getText() + "x^2 + " + txtx.getText() + "x + " + txtN.getText();
            txtResultado1.setText(String.valueOf(String.format("%.2f", x0)));
            txtResultado.setText(String.valueOf(String.format("%.2f", x1)));
            aux += "=" + "\nx0 = " + txtResultado1.getText() + "\nx1 = " + txtResultado.getText();
            historial.insertarNodo(aux);
            aux = "";
        } else {
            txtResultado.setText("ERROR");
            txtResultado.setText("ERROR");
        }
    }

    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    public void setButton2Dark(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn2_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn2_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn1_dark-touch.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    }

    public void setButton1Dark(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn1_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn1_dark-touch.png")));
        btn.setForeground(Color.decode("#18d4a3"));
    }

    public void setButton2(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-2.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png")));
        btn.setForeground(Color.decode("#363d46"));
    }

    public void setButton1(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png")));
        btn.setForeground(Color.decode("#363d46"));
    }

    public void darkMode() {
        if (!modoOscuro) {
            jPanel1.setBackground(Color.decode("#212b41"));
            jPanel2.setBackground(Color.decode("#2e3951"));
            txtResultado.setForeground(Color.decode("#0db387"));
            txtResultado1.setForeground(Color.decode("#0db387"));
            jSeparator4.setForeground(Color.decode("#0db387"));
            jSeparator4.setBackground(Color.decode("#0db387"));
            txtN.setForeground(Color.decode("#0db387"));
            txtx.setForeground(Color.decode("#0db387"));
            txtx2.setForeground(Color.decode("#0db387"));
            txtN.setBackground(Color.decode("#212b41"));
            txtx.setBackground(Color.decode("#212b41"));
            txtx2.setBackground(Color.decode("#212b41"));
            txtX0.setForeground(Color.decode("#0db387"));
            X1.setForeground(Color.decode("#0db387"));
            txtX22.setForeground(Color.decode("#0db387"));
            txtX1.setForeground(Color.decode("#0db387"));
            txtFormula.setForeground(Color.decode("#0db387"));
            jSeparator1.setForeground(Color.decode("#96a8a0"));
            jSeparator2.setForeground(Color.decode("#96a8a0"));
            jSeparator3.setForeground(Color.decode("#96a8a0"));
            jSeparator1.setBackground(Color.decode("#96a8a0"));
            jSeparator2.setBackground(Color.decode("#96a8a0"));
            jSeparator3.setBackground(Color.decode("#96a8a0"));
            jPanel3.setBackground(Color.decode("#2e3951"));
            jPanel4.setBackground(Color.decode("#2e3951"));
            txtHistorial.setBackground(Color.decode("#2e3951"));
            txtHistorial.setForeground(Color.decode("#0db387"));
            laHistorial.setForeground(Color.decode("#0db387"));
            setButton1Dark(btnC);
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn2_dark.png")));
            btnResultado.setForeground(Color.decode("#212b41"));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode2.png")));
            btnHitorial.setIcon(new ImageIcon(getClass().getResource("/Imagenes/historyDark.png")));
            modoOscuro = true;
        } else {
            jPanel1.setBackground(Color.decode("#f4fdfb"));
            txtN.setBackground(Color.decode("#f4fdfb"));
            txtx.setBackground(Color.decode("#f4fdfb"));
            txtx2.setBackground(Color.decode("#f4fdfb"));
            jPanel2.setBackground(Color.decode("#ffffff"));
            txtResultado.setForeground(Color.decode("#353c45"));
            txtResultado1.setForeground(Color.decode("#353c45"));
            txtFormula.setForeground(Color.decode("#353c45"));
            txtN.setForeground(Color.decode("#353c45"));
            txtX1.setForeground(Color.decode("#353c45"));
            txtx.setForeground(Color.decode("#353c45"));
            txtX22.setForeground(Color.decode("#353c45"));
            txtx2.setForeground(Color.decode("#353c45"));
            txtX0.setForeground(Color.decode("#353c45"));
            X1.setForeground(Color.decode("#353c45"));
            jSeparator1.setForeground(Color.decode("#353c45"));
            jSeparator2.setForeground(Color.decode("#353c45"));
            jSeparator3.setBackground(Color.decode("#353c45"));
            jSeparator1.setBackground(Color.decode("#353c45"));
            jSeparator2.setBackground(Color.decode("#353c45"));
            jSeparator3.setForeground(Color.decode("#353c45"));
            jPanel3.setBackground(Color.decode("#ffffff"));
            jPanel4.setBackground(Color.decode("#ffffff"));
            txtHistorial.setBackground(Color.decode("#ffffff"));
            txtHistorial.setForeground(Color.decode("#353c45"));
            laHistorial.setForeground(Color.decode("#353c45"));
            jSeparator4.setForeground(Color.decode("#353c45"));
            jSeparator4.setBackground(Color.decode("#353c45"));
            setButton1(btnC);
            btnHitorial.setIcon(new ImageIcon(getClass().getResource("/Imagenes/history_112375.png")));
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-3.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png")));
            btnResultado.setForeground(Color.decode("#ffffff"));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode1.png")));
            modoOscuro = false;
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables Eventos">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel X1;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDark;
    private javax.swing.JButton btnHitorial;
    private javax.swing.JButton btnResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel laHistorial;
    private javax.swing.JLabel txtFormula;
    private javax.swing.JTextPane txtHistorial;
    private javax.swing.JTextField txtN;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JLabel txtResultado1;
    private javax.swing.JLabel txtX0;
    private javax.swing.JLabel txtX1;
    private javax.swing.JLabel txtX22;
    private javax.swing.JTextField txtx;
    private javax.swing.JTextField txtx2;
    // End of variables declaration//GEN-END:variables
}
// </editor-fold>
