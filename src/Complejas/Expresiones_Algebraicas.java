package Complejas;

import ListaCircular.Lista;
import Operaciones.Operaciones;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 * @author Jonathan Rivera Vasquez
 * @version 1.0
 * @since 4/05/2022
 */
public class Expresiones_Algebraicas extends javax.swing.JInternalFrame {

    // <editor-fold defaultstate="collapsed" desc="Variables Globales">
    boolean modoOscuro;
    private JComponent Barra;
    private Dimension DimensionBarra;
    Operaciones oP;
    Conversor oConversor;
    Lista<String> historial;
    boolean historialVisible;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Expresiones_Algebraicas() {
        initComponents();
        inicioPanel3();
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = null;
        QuitarLaBarraTitulo();
        modoOscuro = false;
        oP = new Operaciones();
        oConversor = new Conversor();
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
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btnDark = new javax.swing.JButton();
        Cerrar = new javax.swing.JLabel();
        btnHitorial = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
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
        btn0 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnParaCerrar = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnParaInicio = new javax.swing.JButton();
        btnElevadodos = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnX = new javax.swing.JButton();

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

        txtOperacion.setBackground(new java.awt.Color(255, 255, 255));
        txtOperacion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOperacionKeyPressed(evt);
            }
        });
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 30));

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResultadoKeyPressed(evt);
            }
        });
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 50));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDivision.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(55, 62, 71));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnDivision.setText("÷");
        btnDivision.setBorder(null);
        btnDivision.setFocusPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnDivision.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 40, 40));

        btnMultiplicacion.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(55, 62, 71));
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnMultiplicacion.setText("×");
        btnMultiplicacion.setBorder(null);
        btnMultiplicacion.setFocusPainted(false);
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 40, 40));

        btnResta.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        btnResta.setForeground(new java.awt.Color(55, 62, 71));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setBorder(null);
        btnResta.setFocusPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 40, 40));

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
        jPanel2.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 40, 40));

        btnSuma.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(55, 62, 71));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(null);
        btnSuma.setFocusPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 40, 40));

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
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 40, 40));

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
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 40, 40));

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
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 40, 40));

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
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 40, 40));

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
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 40, 40));

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
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 40, 40));

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
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 40, 40));

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
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 40, 40));

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
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 40, 40));

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
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 40, 40));

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
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 40, 40));

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
        jPanel2.add(btnSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 40, 40));

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
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 40, 40));

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
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 40, 40));

        btnParaCerrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnParaCerrar.setForeground(new java.awt.Color(55, 62, 71));
        btnParaCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnParaCerrar.setText(")");
        btnParaCerrar.setBorder(null);
        btnParaCerrar.setBorderPainted(false);
        btnParaCerrar.setFocusPainted(false);
        btnParaCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnParaCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnParaCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnParaCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnParaCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 40, 40));

        btnRaiz.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(55, 62, 71));
        btnRaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnRaiz.setText("√");
        btnRaiz.setBorder(null);
        btnRaiz.setFocusPainted(false);
        btnRaiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRaiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnRaiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        jPanel2.add(btnRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 40, 40));

        btnParaInicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnParaInicio.setForeground(new java.awt.Color(55, 62, 71));
        btnParaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnParaInicio.setText("(");
        btnParaInicio.setBorder(null);
        btnParaInicio.setFocusPainted(false);
        btnParaInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnParaInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnParaInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnParaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaInicioActionPerformed(evt);
            }
        });
        jPanel2.add(btnParaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 40, 40));

        btnElevadodos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnElevadodos.setForeground(new java.awt.Color(55, 62, 71));
        btnElevadodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnElevadodos.setText("χ²");
        btnElevadodos.setBorder(null);
        btnElevadodos.setBorderPainted(false);
        btnElevadodos.setFocusPainted(false);
        btnElevadodos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElevadodos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnElevadodos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnElevadodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevadodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnElevadodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 40, 40));

        btnY.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnY.setForeground(new java.awt.Color(55, 62, 71));
        btnY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnY.setText("y");
        btnY.setBorder(null);
        btnY.setBorderPainted(false);
        btnY.setFocusPainted(false);
        btnY.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnY.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnY.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        jPanel2.add(btnY, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 40, 40));

        btnX.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnX.setForeground(new java.awt.Color(55, 62, 71));
        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnX.setText("x");
        btnX.setBorder(null);
        btnX.setBorderPainted(false);
        btnX.setFocusPainted(false);
        btnX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnX.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnX.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        jPanel2.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 340, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed
        darkMode();
    }//GEN-LAST:event_btnDarkActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        addOperacion("÷");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        addOperacion("×");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        addOperacion("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        String aux1 = oConversor.evaluar(oConversor.parsear(txtOperacion.getText()));
        String aux = "\n" + txtOperacion.getText();
        txtResultado.setText(aux1);
        aux += "=" + txtResultado.getText();
        historial.insertarNodo(aux);
        aux = "";
        txtOperacion.setText("");
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnResultadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResultadoKeyReleased

    }//GEN-LAST:event_btnResultadoKeyReleased

    private void btnResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResultadoKeyTyped

    }//GEN-LAST:event_btnResultadoKeyTyped

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        addOperacion("+");
    }//GEN-LAST:event_btnSumaActionPerformed

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
        txtResultado.setText("");
        txtOperacion.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoActionPerformed
        addOperacion("-");
    }//GEN-LAST:event_btnSignoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        addOperacion("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String ss = txtOperacion.getText();
            ss = ss.substring(0, ss.length() - 1);
            txtOperacion.setText(ss);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnParaCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaCerrarActionPerformed
        addOperacion(")");
    }//GEN-LAST:event_btnParaCerrarActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        addOperacion("√");
        oP.actionPerformed("Sqrt", txtOperacion);
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnParaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaInicioActionPerformed
        addOperacion("(");
    }//GEN-LAST:event_btnParaInicioActionPerformed

    private void btnElevadodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevadodosActionPerformed
        addOperacion("^");
    }//GEN-LAST:event_btnElevadodosActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        String aux = JOptionPane.showInputDialog("Digite el valor de Y > ");
        boolean isNumeric;
        while (true) {
            if (isNumeric = aux.matches("[+-]?\\d*(\\.\\d+)?") == true) {
                addOperacion("×" + aux);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Valor digitado no valido");
            }
        }
    }//GEN-LAST:event_btnYActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed

        while (true) {
            String aux = JOptionPane.showInputDialog("Digite el valor de X > ");
            boolean isNumeric;
            if (isNumeric = aux.matches("[+-]?\\d*(\\.\\d+)?") == true) {
                addOperacion("×" + aux);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Valor digitado no valido");
            }
        }
    }//GEN-LAST:event_btnXActionPerformed

    private void btnHitorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitorialActionPerformed
        String aux = "";
        historialVisible();
        txtHistorial.setText(historial.desplegarLista(aux));
    }//GEN-LAST:event_btnHitorialActionPerformed

    private void btnHitorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHitorialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHitorialKeyTyped

    private void txtResultadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtResultadoKeyPressed

    private void txtOperacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOperacionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtOperacionKeyPressed
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

    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    public void addOperacion(String simbolo) {
        txtOperacion.setText(txtOperacion.getText() + simbolo);
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
            txtResultado.setForeground(Color.decode("#0db387"));
            jPanel3.setBackground(Color.decode("#2e3951"));
            jPanel4.setBackground(Color.decode("#2e3951"));
            txtHistorial.setBackground(Color.decode("#2e3951"));
            txtHistorial.setForeground(Color.decode("#0db387"));
            laHistorial.setForeground(Color.decode("#0db387"));
            jSeparator1.setForeground(Color.decode("#0db387"));
            jSeparator1.setBackground(Color.decode("#0db387"));
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
            setButton1Dark(btnDelete);
            setButton2Dark(btnPunto);
            setButton1Dark(btnSuma);
            setButton1Dark(btnDivision);
            setButton1Dark(btnParaCerrar);
            setButton1Dark(btnParaInicio);
            setButton1Dark(btnElevadodos);
            setButton1Dark(btnRaiz);
            setButton1Dark(btnC);
            setButton1Dark(btnX);
            setButton1Dark(btnY);
            setButton1Dark(btnMultiplicacion);
            setButton1Dark(btnResta);
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
            txtResultado.setForeground(Color.decode("#353c45"));
            jPanel3.setBackground(Color.decode("#ffffff"));
            jPanel4.setBackground(Color.decode("#ffffff"));
            txtHistorial.setBackground(Color.decode("#ffffff"));
            txtHistorial.setForeground(Color.decode("#353c45"));
            laHistorial.setForeground(Color.decode("#353c45"));
            jSeparator1.setForeground(Color.decode("#353c45"));
            jSeparator1.setBackground(Color.decode("#353c45"));
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
            setButton1(btnSuma);
            setButton1(btnDivision);
            setButton1(btnC);
            setButton1(btnMultiplicacion);
            setButton1(btnResta);
            setButton1(btnDelete);
            setButton1(btnRaiz);
            setButton1(btnElevadodos);
            setButton1(btnParaCerrar);
            setButton1(btnParaInicio);
            setButton1(btnX);
            setButton1(btnY);
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-3.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png")));
            btnResultado.setForeground(Color.decode("#ffffff"));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode1.png")));
            modoOscuro = false;
            btnHitorial.setIcon(new ImageIcon(getClass().getResource("/Imagenes/history_112375.png")));
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables Eventos">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
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
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnElevadodos;
    private javax.swing.JButton btnHitorial;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnParaCerrar;
    private javax.swing.JButton btnParaInicio;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSigno;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel laHistorial;
    private javax.swing.JTextPane txtHistorial;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
// </editor-fold>
