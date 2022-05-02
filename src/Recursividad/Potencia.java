package Recursividad;

import ListaCircular.Lista;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 * @author Jonathan Rivera Vasquez
 * @version 1.0
 * @since 4/05/2022
 */
public final class Potencia extends javax.swing.JInternalFrame {

    // <editor-fold defaultstate="collapsed" desc="Variables Globales">
    private JComponent barra;
    private Dimension dimensionBarra;
    private boolean modoOscuro;
    DecimalFormat df;
    Lista<String> historial;
    boolean historialVisible;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Potencia() {
        initComponents();
        inicioPanel3();
        barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimensionBarra = null;
        modoOscuro = false;
        QuitarLaBarraTitulo();
        df = new DecimalFormat("#.00");
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        btnDark = new javax.swing.JButton();
        txtOperacion2 = new javax.swing.JTextField();
        txtOperacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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

        jSeparator1.setBackground(new java.awt.Color(53, 60, 69));
        jSeparator1.setForeground(new java.awt.Color(53, 60, 69));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 10));

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

        txtOperacion2.setBackground(new java.awt.Color(244, 253, 251));
        txtOperacion2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtOperacion2.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOperacion2.setToolTipText("");
        txtOperacion2.setActionCommand("<Not Set>");
        txtOperacion2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtOperacion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperacion2KeyPressed(evt);
            }
        });
        jPanel1.add(txtOperacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 60, 30));

        txtOperacion.setBackground(new java.awt.Color(244, 253, 251));
        txtOperacion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOperacion.setActionCommand("<Not Set>");
        txtOperacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtOperacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperacionActionPerformed(evt);
            }
        });
        txtOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperacionKeyPressed(evt);
            }
        });
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 10));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(244, 253, 251));
        txtResultado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setBorder(null);
        txtResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResultadoKeyPressed(evt);
            }
        });
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 160, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" •");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 40));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 390));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnResultadoKeyTyped(evt);
            }
        });
        jPanel2.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 50, 50));

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
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 340, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed
        darkMode();
    }//GEN-LAST:event_btnDarkActionPerformed

    private void txtOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperacionActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        String aux1 = txtOperacion.getText();
        String aux2 = txtOperacion2.getText();
        String aux = "\n" + txtOperacion.getText() + "^" + txtOperacion2.getText();
        boolean isNumeric;
        if ((isNumeric = aux1.matches("[+-]?\\d*(\\.\\d+)?") == true) && (isNumeric = aux2.matches("[+-]?\\d*(\\.\\d+)?") == true)) {
            int a1 = Integer.parseInt(txtOperacion.getText());
            int a2 = Integer.parseInt(txtOperacion2.getText());
            txtResultado.setText(String.valueOf(String.format("%.2f", potencia(a1, a2))));
            aux += "=" + txtResultado.getText();
            historial.insertarNodo(aux);
            aux = "";
        } else {
            txtResultado.setText("ERROR");
        }

    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResultadoKeyTyped

    }//GEN-LAST:event_btnResultadoKeyTyped

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtOperacion2.setText("");
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnHitorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitorialActionPerformed
        String aux = "";
        historialVisible();
        txtHistorial.setText(historial.desplegarLista(aux));
    }//GEN-LAST:event_btnHitorialActionPerformed

    private void btnHitorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHitorialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHitorialKeyTyped

    private void txtOperacion2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacion2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtOperacion2KeyPressed

    private void txtOperacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtOperacionKeyPressed

    private void txtResultadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtResultadoKeyPressed
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

    public double potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return base;
        } else if (exponente < 0) {
            return potencia(base, exponente + 1) / base;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public void QuitarLaBarraTitulo() {
        barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimensionBarra = barra.getPreferredSize();
        barra.setSize(0, 0);
        barra.setPreferredSize(new Dimension(0, 0));
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
            txtOperacion.setForeground(Color.decode("#0db387"));
            txtOperacion2.setForeground(Color.decode("#0db387"));
            txtResultado.setForeground(Color.decode("#0db387"));
            txtOperacion.setBackground(Color.decode("#212b41"));
            txtOperacion2.setBackground(Color.decode("#212b41"));
            txtResultado.setBackground(Color.decode("#212b41"));
            jSeparator2.setForeground(Color.decode("#96a8a0"));
            jSeparator2.setBackground(Color.decode("#96a8a0"));
            jSeparator1.setForeground(Color.decode("#0db387"));
            jSeparator1.setBackground(Color.decode("#0db387"));
            jPanel3.setBackground(Color.decode("#2e3951"));
            jPanel4.setBackground(Color.decode("#2e3951"));
            txtHistorial.setBackground(Color.decode("#2e3951"));
            txtHistorial.setForeground(Color.decode("#0db387"));
            laHistorial.setForeground(Color.decode("#0db387"));
            btnHitorial.setIcon(new ImageIcon(getClass().getResource("/Imagenes/historyDark.png")));
            setButton1Dark(btnC);
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn2_dark.png")));
            btnResultado.setForeground(Color.decode("#212b41"));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode2.png")));

            modoOscuro = true;
        } else {
            jPanel1.setBackground(Color.decode("#f4fdfb"));
            jPanel2.setBackground(Color.decode("#ffffff"));
            txtOperacion.setForeground(Color.decode("#353c45"));
            txtOperacion2.setForeground(Color.decode("#353c45"));
            txtResultado.setForeground(Color.decode("#353c45"));
            txtOperacion.setBackground(Color.decode("#f4fdfb"));
            txtOperacion2.setBackground(Color.decode("#f4fdfb"));
            txtResultado.setBackground(Color.decode("#f4fdfb"));
            jSeparator2.setForeground(Color.decode("#353c45"));
            jSeparator2.setBackground(Color.decode("#353c45"));
            jPanel3.setBackground(Color.decode("#ffffff"));
            jPanel4.setBackground(Color.decode("#ffffff"));
            txtHistorial.setBackground(Color.decode("#ffffff"));
            txtHistorial.setForeground(Color.decode("#353c45"));
            laHistorial.setForeground(Color.decode("#353c45"));
            jSeparator1.setForeground(Color.decode("#353c45"));
            jSeparator1.setBackground(Color.decode("#353c45"));
            setButton1(btnC);
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-3.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png")));
            btnResultado.setForeground(Color.decode("#ffffff"));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode1.png")));
            modoOscuro = false;
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode1.png")));
        }
    }
// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables Eventos">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDark;
    private javax.swing.JButton btnHitorial;
    private javax.swing.JButton btnResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel laHistorial;
    private javax.swing.JTextPane txtHistorial;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextField txtOperacion2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
// </editor-fold>
