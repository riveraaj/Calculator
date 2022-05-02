package Basica;

import ListaCircular.Lista;
import Operaciones.Operaciones;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 * @author Jonathan Rivera Vasquez Steven Ramirez Valdez
 * @version 1.0
 * @since 4/05/2022
 */
public class Calculadora extends javax.swing.JInternalFrame {

    //<editor-fold defaultstate="collapsed" desc="Variables globales">
    boolean modoOscuro;
    private JComponent Barra;
    private Dimension DimensionBarra;
    Operaciones oP;
    Lista<String> historial;
    boolean historialVisible;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Calculadora() {
        initComponents();
        inicioPanel3();
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = null;
        QuitarLaBarraTitulo();
        modoOscuro = false;
        oP = new Operaciones();
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
        btnAbsoluto = new javax.swing.JButton();
        btnResiduo = new javax.swing.JButton();
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

        setBorder(null);
        setTitle("Calculadora Basica");
        setPreferredSize(new java.awt.Dimension(340, 540));
        setVerifyInputWhenFocusTarget(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
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
        jPanel1.setMinimumSize(new java.awt.Dimension(330, 140));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(255, 255, 255));
        txtOperacion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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

        btnAbsoluto.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnAbsoluto.setForeground(new java.awt.Color(55, 62, 71));
        btnAbsoluto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnAbsoluto.setText("| x |");
        btnAbsoluto.setBorder(null);
        btnAbsoluto.setBorderPainted(false);
        btnAbsoluto.setFocusPainted(false);
        btnAbsoluto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbsoluto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnAbsoluto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnAbsoluto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsolutoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAbsoluto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btnResiduo.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btnResiduo.setForeground(new java.awt.Color(55, 62, 71));
        btnResiduo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnResiduo.setText("%");
        btnResiduo.setBorder(null);
        btnResiduo.setFocusPainted(false);
        btnResiduo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResiduo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png"))); // NOI18N
        btnResiduo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-1.png"))); // NOI18N
        btnResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResiduoActionPerformed(evt);
            }
        });
        jPanel2.add(btnResiduo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

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
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

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
        jPanel2.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 50, 50));

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
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 50, 50));

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
        jPanel2.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 50, 50));

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
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 50, 50));

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
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 50));

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
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

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
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, 50));

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
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

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
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 50));

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
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 50));

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
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 50));

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
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 50, 50));

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
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

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
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

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
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 50, 50));

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
        jPanel2.add(btnSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 50));

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
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 340, 360));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed
        darkMode();
    }//GEN-LAST:event_btnDarkActionPerformed

    private void btnAbsolutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsolutoActionPerformed
        try {
            addOperacion("|x|");
            oP.actionPerformed("|x|", txtResultado);
            String aux = "\n" + txtOperacion.getText();
            txtOperacion.setText("");
            txtOperacion.setText(txtResultado.getText());
            aux += "=" + txtResultado.getText();
            historial.insertarNodo(aux);
            aux = "";
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAbsolutoActionPerformed

    private void btnResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResiduoActionPerformed
        addOperacion("%");
        oP.actionPerformed("%", txtResultado);
    }//GEN-LAST:event_btnResiduoActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        addOperacion("÷");
        oP.actionPerformed("÷", txtResultado);
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        addOperacion("×");
        oP.actionPerformed("×", txtResultado);
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        addOperacion("-");
        oP.actionPerformed("-", txtResultado);
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        try {
            oP.actionPerformed("=", txtResultado);
            String aux = "\n" + txtOperacion.getText();
            txtOperacion.setText("");
            txtOperacion.setText(txtResultado.getText());
            aux += "=" + txtResultado.getText();
            historial.insertarNodo(aux);
            aux = "";
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnResultadoKeyTyped

    }//GEN-LAST:event_btnResultadoKeyTyped

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        addOperacion("0");
        oP.actionPerformed("0", txtResultado);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        addOperacion("+");
        oP.actionPerformed("+", txtResultado);
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addOperacion("9");
        oP.actionPerformed("9", txtResultado);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addOperacion("4");
        oP.actionPerformed("4", txtResultado);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addOperacion("6");
        oP.actionPerformed("6", txtResultado);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addOperacion("1");
        oP.actionPerformed("1", txtResultado);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addOperacion("2");
        oP.actionPerformed("2", txtResultado);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addOperacion("3");
        oP.actionPerformed("3", txtResultado);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addOperacion("8");
        oP.actionPerformed("8", txtResultado);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        addOperacion(".");
        oP.actionPerformed(".", txtResultado);
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addOperacion("7");
        oP.actionPerformed("7", txtResultado);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addOperacion("5");
        oP.actionPerformed("5", txtResultado);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        oP.actionPerformed("AC", txtResultado);
        txtResultado.setText("");
        txtOperacion.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoActionPerformed
        addOperacion("±");
        oP.actionPerformed("±", txtResultado);
    }//GEN-LAST:event_btnSignoActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void btnHitorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitorialActionPerformed
        String aux = "", aux2;
        historialVisible();
        aux2 = historial.desplegarLista(aux);
        txtHistorial.setText(aux2);
    }//GEN-LAST:event_btnHitorialActionPerformed

    private void btnHitorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHitorialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHitorialKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void txtResultadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnResultado.doClick();
        }
    }//GEN-LAST:event_txtResultadoKeyPressed
    //</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc="Metodos">
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

    public void darkMode() {
        if (!modoOscuro) {
            jPanel1.setBackground(Color.decode("#212b41"));
            jPanel2.setBackground(Color.decode("#2e3951"));
            jPanel3.setBackground(Color.decode("#2e3951"));
            jPanel4.setBackground(Color.decode("#2e3951"));
            txtHistorial.setBackground(Color.decode("#2e3951"));
            txtOperacion.setForeground(Color.decode("#0db387"));
            txtResultado.setForeground(Color.decode("#0db387"));
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
            setButton2Dark(btnPunto);
            setButton1Dark(btnSuma);
            setButton1Dark(btnDivision);
            setButton1Dark(btnAbsoluto);
            setButton1Dark(btnC);
            setButton1Dark(btnMultiplicacion);
            setButton1Dark(btnResta);
            setButton1Dark(btnResiduo);
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn3_dark.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn2_dark.png")));
            btnHitorial.setIcon(new ImageIcon(getClass().getResource("/Imagenes/historyDark.png")));
            btnResultado.setForeground(Color.decode("#212b41"));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode2.png")));

            modoOscuro = true;
        } else {
            jPanel1.setBackground(Color.decode("#f4fdfb"));
            jPanel2.setBackground(Color.decode("#ffffff"));
            jSeparator1.setForeground(Color.decode("#353c45"));
            jSeparator1.setBackground(Color.decode("#353c45"));
            txtOperacion.setForeground(Color.decode("#353c45"));
            jPanel3.setBackground(Color.decode("#ffffff"));
            jPanel4.setBackground(Color.decode("#ffffff"));
            txtHistorial.setBackground(Color.decode("#ffffff"));
            txtHistorial.setForeground(Color.decode("#353c45"));
            txtResultado.setForeground(Color.decode("#353c45"));
            laHistorial.setForeground(Color.decode("#353c45"));
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
            setButton1(btnAbsoluto);
            setButton1(btnC);
            setButton1(btnMultiplicacion);
            setButton1(btnResta);
            setButton1(btnResiduo);
            btnResultado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-3.png")));
            btnResultado.setPressedIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1.png")));
            btnResultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/btn-1-touch.png")));
            btnResultado.setForeground(Color.decode("#ffffff"));
            btnHitorial.setIcon(new ImageIcon(getClass().getResource("/Imagenes/history_112375.png")));
            btnDark.setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode1.png")));
            modoOscuro = false;
        }
    }
    //</editor-fold>      

    //<editor-fold defaultstate="collapsed" desc="Variables Eventos">
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
    private javax.swing.JButton btnAbsoluto;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDark;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnHitorial;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResiduo;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSigno;
    private javax.swing.JButton btnSuma;
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
//</editor-fold>
