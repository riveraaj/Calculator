package Convertidor;

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
public class Longitud extends javax.swing.JInternalFrame {

    //<editor-fold defaultstate="collapsed" desc="Variables Globales">
    private JComponent barra;
    private Dimension dimensionBarra;
    private boolean modoOscuro;
    DecimalFormat df;
    Lista<String> historial;
    boolean historialVisible;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Longitud() {
        initComponents();
        inicioPanel3();
        barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimensionBarra = null;
        modoOscuro = false;
        QuitarLaBarraTitulo();
        df = new DecimalFormat("0.##E0");
        historial = new Lista();
        historialVisible = false;
    }
    //</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        laHistorial = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        btnDark = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtOperacion2 = new javax.swing.JTextField();
        txtOperacion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnHitorial = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnResultado = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnSigno = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBorder(null);
        setFocusCycleRoot(false);
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laHistorial.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        laHistorial.setForeground(new java.awt.Color(55, 62, 71));
        laHistorial.setText("Historial");
        jPanel4.add(laHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(53, 60, 69));
        jSeparator3.setForeground(new java.awt.Color(53, 60, 69));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 10));

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

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" •");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 40));

        jComboBox1.setBackground(new java.awt.Color(244, 253, 251));
        jComboBox1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(55, 62, 71));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metros", "Millas", "Millas náuticas", "Pies", "Pulgadas", "Yardas" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        jComboBox2.setBackground(new java.awt.Color(244, 253, 251));
        jComboBox2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(55, 62, 71));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metros", "Millas", "Millas náuticas", "Pies", "Pulgadas", "Yardas" }));
        jComboBox2.setBorder(null);
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        txtOperacion2.setEditable(false);
        txtOperacion2.setBackground(new java.awt.Color(244, 253, 251));
        txtOperacion2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtOperacion2.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion2.setBorder(null);
        jPanel1.add(txtOperacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 30));

        txtOperacion.setEditable(false);
        txtOperacion.setBackground(new java.awt.Color(244, 253, 251));
        txtOperacion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setBorder(null);
        txtOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperacionKeyPressed(evt);
            }
        });
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 10));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 230));

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
        jPanel2.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 50));

        btn0.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(55, 62, 71));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 50, 50));

        btn9.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(55, 62, 71));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 50));

        btn4.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(55, 62, 71));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 50, 50));

        btn6.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(55, 62, 71));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, 50));

        btn1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(55, 62, 71));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 50, 50));

        btn2.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(55, 62, 71));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 50, 50));

        btn3.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(55, 62, 71));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 50, 50));

        btn8.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(55, 62, 71));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 50));

        btnPunto.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(55, 62, 71));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorder(null);
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 50, 50));

        btn7.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(55, 62, 71));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn7.setText("7");
        btn7.setBorder(null);
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 50));

        btn5.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(55, 62, 71));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, 50));

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
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 50));

        btnSigno.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnSigno.setForeground(new java.awt.Color(55, 62, 71));
        btnSigno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-2.png"))); // NOI18N
        btnSigno.setText("±");
        btnSigno.setBorder(null);
        btnSigno.setFocusPainted(false);
        btnSigno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSigno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnSigno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoActionPerformed(evt);
            }
        });
        jPanel2.add(btnSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 50, 50));

        btnDelete.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(55, 62, 71));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnDelete.setText("←");
        btnDelete.setBorder(null);
        btnDelete.setFocusPainted(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnDelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 340, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed
        darkMode();
    }//GEN-LAST:event_btnDarkActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        conversionLongitud();
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResultadoKeyTyped

    }//GEN-LAST:event_btnResultadoKeyTyped

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        addOperacion("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addOperacion("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addOperacion("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addOperacion("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addOperacion("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addOperacion("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addOperacion("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addOperacion("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        addOperacion(".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addOperacion("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addOperacion("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtOperacion2.setText("");
        txtOperacion.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoActionPerformed
        addOperacion("-");
    }//GEN-LAST:event_btnSignoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String ss = txtOperacion.getText();
            ss = ss.substring(0, ss.length() - 1);
            txtOperacion.setText(ss);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnHitorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitorialActionPerformed
        String aux = "";
        historialVisible();
        txtHistorial.setText(historial.desplegarLista(aux));
    }//GEN-LAST:event_btnHitorialActionPerformed

    private void btnHitorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHitorialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHitorialKeyTyped

    private void txtOperacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtOperacionKeyPressed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos">
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

    public void conversionLongitud() {
        String box2 = (String) jComboBox1.getSelectedItem();
        String box1 = (String) jComboBox2.getSelectedItem();

        if (box1.equals("Metros") && box2.equals("Millas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double mi = (double) (me * 0.00062137);
            if (mi < 0) {
                txtOperacion2.setText(String.format("%.2f", mi));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", mi)));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Metros") && box2.equals("Millas náuticas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double k = (double) (me * 0.00053996);
            if (k < 0) {
                txtOperacion2.setText(String.format("%.2f", k));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", k)));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Metros") && box2.equals("Metros")) {
            double me = Double.parseDouble(txtOperacion.getText());
            if (me < 0) {
                txtOperacion2.setText(String.format("%.2f", me));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Metros: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", me)));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Metros: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Metros") && box2.equals("Pies")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 3.2808);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Metros") && box2.equals("Pulgadas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 39.3701);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Metros") && box2.equals("Yardas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 1.0936);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMetros: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        }

        if (box1.equals("Millas") && box2.equals("Metros")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double mi = (double) (me * 1609.34);
            txtOperacion2.setText(String.valueOf(String.format("%.2f", mi)));
            String aux = "\nMillas: " + txtOperacion.getText() + " a Metros: ";
            aux += txtOperacion2.getText();
            historial.insertarNodo(aux);
            aux = "";
        } else if (box1.equals("Millas") && box2.equals("Millas náuticas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double k = (double) (me * 0.868976);
            if (k < 0) {
                txtOperacion2.setText(String.format("%.2f", k));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", k)));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas") && box2.equals("Millas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            if (me < 0) {
                txtOperacion2.setText(String.format("%.2f", me));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", me)));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas") && box2.equals("Pies")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 5280);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas") && box2.equals("Pulgadas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 63360);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas") && box2.equals("Yardas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 1760);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMillas: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        }

        if (box1.equals("Millas náuticas") && box2.equals("Metros")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double mi = (double) (me * 1852);
            if (mi < 0) {
                txtOperacion2.setText(String.format("%.2f", mi));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Metros: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", mi)));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Metros: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas náuticas") && box2.equals("Millas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double k = (double) (me * 1.1508);
            if (k < 0) {
                txtOperacion2.setText(String.format("%.2f", k));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", k)));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas náuticas") && box2.equals("Millas náuticas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            if (me < 0) {
                txtOperacion2.setText(String.format("%.2f", me));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", me)));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas náuticas") && box2.equals("Pies")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 6076.12);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas náuticas") && box2.equals("Pulgadas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 72913.39);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Millas náuticas") && box2.equals("Yardas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 2025.37);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nMillas náuticas: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        }

        if (box1.equals("Pulgadas") && box2.equals("Metros")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double mi = (double) (me * 0.0254);
            txtOperacion2.setText(String.valueOf(String.format("%.2f", mi)));
            String aux = "\nPulgada: " + txtOperacion.getText() + " a Metros: ";
            aux += txtOperacion2.getText();
            historial.insertarNodo(aux);
            aux = "";
        } else if (box1.equals("Pulgadas") && box2.equals("Millas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double k = (double) (me * 0.0000157828);
            if (k < 0) {
                txtOperacion2.setText(String.format("%.2f", k));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", k)));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pulgadas") && box2.equals("Pulgadas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            if (me < 0) {
                txtOperacion2.setText(String.format("%.2f", me));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Pulgada: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", me)));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Pulgada: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pulgadas") && box2.equals("Millas náuticas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 0.0000137149);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pulgadas") && box2.equals("Pies")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 0.083333);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pulgadas") && box2.equals("Yardas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 0.027778);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nPulgada: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        }

        if (box1.equals("Pies") && box2.equals("Metros")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double mi = (double) (me * 0.3048);
            if (mi < 0) {
                txtOperacion2.setText(String.format("%.2f", mi));
                String aux = "\nPies: " + txtOperacion.getText() + " a Metros: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", mi)));
                String aux = "\nPies: " + txtOperacion.getText() + " a Metros: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pies") && box2.equals("Millas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double k = (double) (me * 0.00018939);
            if (k < 0) {
                txtOperacion2.setText(String.format("%.2f", k));
                String aux = "\nPies: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", k)));
                String aux = "\nPies: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pies") && box2.equals("Pies")) {
            double me = Double.parseDouble(txtOperacion.getText());
            if (me < 0) {
                txtOperacion2.setText(String.format("%.2f", me));
                String aux = "\nPies: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", me)));
                String aux = "\nPies: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pies") && box2.equals("Millas náuticas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 0.00016458);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nPies: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nPies: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pies") && box2.equals("Pulgadas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 12);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nPies: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nPies: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Pies") && box2.equals("Yardas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 0.333333);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nPies: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nPies: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        }

        if (box1.equals("Yardas") && box2.equals("Metros")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double mi = (double) (me * 0.9144);
            if (mi < 0) {
                txtOperacion2.setText(String.format("%.2f", mi));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Metros: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", mi)));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Metros: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Yardas") && box2.equals("Millas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double k = (double) (me * 0.00056818);
            if (k < 0) {
                txtOperacion2.setText(String.format("%.2f", k));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", k)));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Millas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Yardas") && box2.equals("Yardas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            if (me < 0) {
                txtOperacion2.setText(String.format("%.2f", me));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", me)));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Yardas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Yardas") && box2.equals("Millas náuticas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 0.00049374);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Millas náuticas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Yardas") && box2.equals("Pulgadas")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 36);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Pulgadas: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        } else if (box1.equals("Yardas") && box2.equals("Pies")) {
            double me = Double.parseDouble(txtOperacion.getText());
            double p = (double) (me * 3);
            if (p < 0) {
                txtOperacion2.setText(String.format("%.2f", p));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            } else {
                txtOperacion2.setText(String.valueOf(String.format("%.2f", p)));
                String aux = "\nYardas: " + txtOperacion.getText() + " a Pies: ";
                aux += txtOperacion2.getText();
                historial.insertarNodo(aux);
                aux = "";
            }
        }
    }

    public void addOperacion(String simbolo) {
        txtOperacion.setText(txtOperacion.getText() + simbolo);
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
            txtOperacion.setBackground(Color.decode("#212b41"));
            txtOperacion2.setBackground(Color.decode("#212b41"));
            jSeparator1.setForeground(Color.decode("#96a8a0"));
            jSeparator2.setForeground(Color.decode("#96a8a0"));
            jSeparator1.setBackground(Color.decode("#96a8a0"));
            jSeparator2.setBackground(Color.decode("#96a8a0"));
            jComboBox1.setBackground(Color.decode("#212b41"));
            jComboBox2.setBackground(Color.decode("#212b41"));
            jComboBox1.setForeground(Color.decode("#0db387"));
            jComboBox2.setForeground(Color.decode("#0db387"));
            jPanel3.setBackground(Color.decode("#2e3951"));
            jPanel4.setBackground(Color.decode("#2e3951"));
            txtHistorial.setBackground(Color.decode("#2e3951"));
            txtHistorial.setForeground(Color.decode("#0db387"));
            laHistorial.setForeground(Color.decode("#0db387"));
            jSeparator3.setForeground(Color.decode("#0db387"));
            jSeparator3.setBackground(Color.decode("#0db387"));
            setButton2Dark(btn0);
            setButton2Dark(btn1);
            setButton2Dark(btn1);
            setButton2Dark(btn2);
            setButton2Dark(btn3);
            setButton2Dark(btn4);
            setButton2Dark(btn5);
            setButton2Dark(btn6);
            setButton2Dark(btn7);
            setButton2Dark(btn8);
            setButton2Dark(btn9);
            setButton2Dark(btnSigno);
            setButton2Dark(btnPunto);
            setButton1Dark(btnC);
            setButton1Dark(btnDelete);
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn2_dark.png")));
            btnResultado.setForeground(Color.decode("#212b41"));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode2.png")));
            btnHitorial.setIcon(new ImageIcon(getClass().getResource("/Imagenes/historyDark.png")));
            modoOscuro = true;
        } else {
            jPanel1.setBackground(Color.decode("#f4fdfb"));
            jPanel2.setBackground(Color.decode("#ffffff"));
            txtOperacion.setForeground(Color.decode("#353c45"));
            txtOperacion2.setForeground(Color.decode("#353c45"));
            txtOperacion.setBackground(Color.decode("#f4fdfb"));
            txtOperacion2.setBackground(Color.decode("#f4fdfb"));
            jSeparator1.setForeground(Color.decode("#353c45"));
            jSeparator2.setForeground(Color.decode("#353c45"));
            jSeparator1.setBackground(Color.decode("#353c45"));
            jSeparator2.setBackground(Color.decode("#353c45"));
            jComboBox1.setBackground(Color.decode("#f4fdfb"));
            jComboBox2.setBackground(Color.decode("#f4fdfb"));
            jComboBox1.setForeground(Color.decode("#353c45"));
            jComboBox2.setForeground(Color.decode("#353c45"));
            jPanel3.setBackground(Color.decode("#ffffff"));
            jPanel4.setBackground(Color.decode("#ffffff"));
            txtHistorial.setBackground(Color.decode("#ffffff"));
            txtHistorial.setForeground(Color.decode("#353c45"));
            laHistorial.setForeground(Color.decode("#353c45"));
            jSeparator3.setForeground(Color.decode("#353c45"));
            jSeparator3.setBackground(Color.decode("#353c45"));
            setButton2(btn0);
            setButton2(btn1);
            setButton2(btn1);
            setButton2(btn2);
            setButton2(btn3);
            setButton2(btn4);
            setButton2(btn5);
            setButton2(btn6);
            setButton2(btn7);
            setButton2(btn8);
            setButton2(btn9);
            setButton2(btnSigno);
            setButton2(btnPunto);
            setButton1(btnC);
            setButton1(btnDelete);
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-3.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png")));
            btnResultado.setForeground(Color.decode("#ffffff"));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode1.png")));
            modoOscuro = false;
            btnHitorial.setIcon(new ImageIcon(getClass().getResource("/Imagenes/history_112375.png")));
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Variables Eventos">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDark;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHitorial;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSigno;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel laHistorial;
    private javax.swing.JTextPane txtHistorial;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextField txtOperacion2;
    // End of variables declaration//GEN-END:variables
}
//</editor-fold>
