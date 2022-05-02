package Principal;

import Basica.Calculadora;
import Cientifica.Calculator;
import Complejas.Cuadraticas;
import Complejas.Expresiones_Algebraicas;
import Convertidor.Longitud;
import Convertidor.Masa;
import Convertidor.Presion;
import Convertidor.Temperatura;
import Recursividad.CambioBase;
import Recursividad.Factorial;
import Recursividad.MCD;
import Recursividad.Potencia;
import Recursividad.RaizN;
import Recursividad.Valor_Mayor;
import Recursividad.Valor_Menor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Jonathan Rivera Vasquez
 * @version 1.0
 * @since 4/05/2022
 */
public class MDI_Principal extends javax.swing.JFrame {

    //<editor-fold defaultstate="collapsed" desc="Variables Globales">
    ImagenPanel fondo;
    Potencia oPotencia;
    Calculadora oCalculadora;
    Temperatura oTemperatura;
    Valor_Mayor oValor_Mayor;
    Valor_Menor oValor_Menor;
    Presion oPresion;
    Longitud oLongitud;
    Masa oMasa;
    Calculator oCalculator;
    Factorial oFactorial;
    MCD oMCD;
    Cuadraticas oCuadraticas;
    CambioBase oCambioBase;
    RaizN oRaizN;
    Expresiones_Algebraicas oExpresiones_Algebraicas;
    String historialCalculadora;
    //</editor-fold>

    public String getHistorialCalculadora() {
        return historialCalculadora;
    }

    public void setHistorialCalculadora(String historialCalculadora) {
        this.historialCalculadora = historialCalculadora;
    }

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public MDI_Principal() {
        fondo = new ImagenPanel();
        initComponents();
        setLocationRelativeTo(null);
        this.setContentPane(fondo);
        iniInicio();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/calculadora.png")));
    }
    //</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuBasica = new javax.swing.JMenuItem();
        jMenuComplejas = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuConvertidor = new javax.swing.JMenu();
        jMenuLongitud = new javax.swing.JMenuItem();
        jMenuMasa = new javax.swing.JMenuItem();
        jMenuIPresion = new javax.swing.JMenuItem();
        jMenuTemperatura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(244, 253, 251));
        jMenuBar1.setBorder(null);
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(27, 27));
        jMenuBar1.setVerifyInputWhenFocusTarget(false);

        jMenu.setBackground(new java.awt.Color(244, 253, 251));
        jMenu.setBorder(null);
        jMenu.setForeground(new java.awt.Color(54, 61, 70));
        jMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu1.png"))); // NOI18N
        jMenu.setAlignmentX(0.0F);
        jMenu.setBorderPainted(false);
        jMenu.setContentAreaFilled(false);
        jMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu.setDelay(0);
        jMenu.setDisabledIcon(null);
        jMenu.setDisabledSelectedIcon(null);
        jMenu.setFocusable(false);
        jMenu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenu.setIconTextGap(0);
        jMenu.setMargin(null);
        jMenu.setMaximumSize(new java.awt.Dimension(32, 32));
        jMenu.setMinimumSize(new java.awt.Dimension(32, 32));
        jMenu.setPreferredSize(new java.awt.Dimension(32, 32));
        jMenu.setRequestFocusEnabled(false);
        jMenu.setVerifyInputWhenFocusTarget(false);

        jMenuBasica.setBackground(new java.awt.Color(244, 253, 251));
        jMenuBasica.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuBasica.setForeground(new java.awt.Color(54, 61, 70));
        jMenuBasica.setText("Calculadora Básica");
        jMenuBasica.setBorder(null);
        jMenuBasica.setBorderPainted(false);
        jMenuBasica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuBasica.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBasicaActionPerformed(evt);
            }
        });
        jMenu.add(jMenuBasica);

        jMenuComplejas.setBackground(new java.awt.Color(244, 253, 251));
        jMenuComplejas.setBorder(null);
        jMenuComplejas.setForeground(new java.awt.Color(54, 61, 70));
        jMenuComplejas.setText("Calculadora Compleja");
        jMenuComplejas.setAlignmentX(0.0F);
        jMenuComplejas.setBorderPainted(false);
        jMenuComplejas.setContentAreaFilled(false);
        jMenuComplejas.setDelay(0);
        jMenuComplejas.setFocusable(false);
        jMenuComplejas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuComplejas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuComplejas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jMenuItem9.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem9.setText("Algebraicas");
        jMenuItem9.setBorder(null);
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuComplejas.add(jMenuItem9);

        jMenuItem10.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem10.setText("Cuadráticas");
        jMenuItem10.setBorder(null);
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuComplejas.add(jMenuItem10);

        jMenu.add(jMenuComplejas);

        jMenuItem1.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem1.setText("Calculadora  Científica");
        jMenuItem1.setBorder(null);
        jMenuItem1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem1);

        jMenu1.setBackground(new java.awt.Color(244, 253, 251));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(54, 61, 70));
        jMenu1.setText("Calculadora Recursiva");
        jMenu1.setAlignmentX(0.0F);
        jMenu1.setBorderPainted(false);
        jMenu1.setContentAreaFilled(false);
        jMenu1.setDelay(0);
        jMenu1.setFocusable(false);
        jMenu1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jMenuItem8.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem8.setText("Cambio de base");
        jMenuItem8.setBorder(null);
        jMenuItem8.setBorderPainted(false);
        jMenuItem8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem2.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem2.setText("Factorial");
        jMenuItem2.setBorder(null);
        jMenuItem2.setBorderPainted(false);
        jMenuItem2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem3.setText("Máximo común divisor");
        jMenuItem3.setBorder(null);
        jMenuItem3.setBorderPainted(false);
        jMenuItem3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem6.setText("Potencia de un número");
        jMenuItem6.setBorder(null);
        jMenuItem6.setBorderPainted(false);
        jMenuItem6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem7.setText("Raíz n-ésima");
        jMenuItem7.setBorder(null);
        jMenuItem7.setBorderPainted(false);
        jMenuItem7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem4.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem4.setText("Valor mayor");
        jMenuItem4.setBorder(null);
        jMenuItem4.setBorderPainted(false);
        jMenuItem4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(244, 253, 251));
        jMenuItem5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(54, 61, 70));
        jMenuItem5.setText("Valor menor");
        jMenuItem5.setBorder(null);
        jMenuItem5.setBorderPainted(false);
        jMenuItem5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenu.add(jMenu1);

        jMenuConvertidor.setBackground(new java.awt.Color(244, 253, 251));
        jMenuConvertidor.setBorder(null);
        jMenuConvertidor.setForeground(new java.awt.Color(54, 61, 70));
        jMenuConvertidor.setText("Convertidor");
        jMenuConvertidor.setAlignmentX(0.0F);
        jMenuConvertidor.setBorderPainted(false);
        jMenuConvertidor.setContentAreaFilled(false);
        jMenuConvertidor.setDelay(0);
        jMenuConvertidor.setFocusable(false);
        jMenuConvertidor.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuConvertidor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuConvertidor.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuConvertidor.setMargin(null);
        jMenuConvertidor.setRequestFocusEnabled(false);
        jMenuConvertidor.setVerifyInputWhenFocusTarget(false);

        jMenuLongitud.setBackground(new java.awt.Color(244, 253, 251));
        jMenuLongitud.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuLongitud.setForeground(new java.awt.Color(54, 61, 70));
        jMenuLongitud.setText("Longitud");
        jMenuLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLongitudActionPerformed(evt);
            }
        });
        jMenuConvertidor.add(jMenuLongitud);

        jMenuMasa.setBackground(new java.awt.Color(244, 253, 251));
        jMenuMasa.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuMasa.setForeground(new java.awt.Color(54, 61, 70));
        jMenuMasa.setText("Masa");
        jMenuMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMasaActionPerformed(evt);
            }
        });
        jMenuConvertidor.add(jMenuMasa);

        jMenuIPresion.setBackground(new java.awt.Color(244, 253, 251));
        jMenuIPresion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuIPresion.setForeground(new java.awt.Color(54, 61, 70));
        jMenuIPresion.setText("Presión");
        jMenuIPresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIPresionActionPerformed(evt);
            }
        });
        jMenuConvertidor.add(jMenuIPresion);

        jMenuTemperatura.setBackground(new java.awt.Color(244, 253, 251));
        jMenuTemperatura.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuTemperatura.setForeground(new java.awt.Color(54, 61, 70));
        jMenuTemperatura.setText("Temperatura");
        jMenuTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTemperaturaActionPerformed(evt);
            }
        });
        jMenuConvertidor.add(jMenuTemperatura);

        jMenu.add(jMenuConvertidor);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Eventos">
    private void jMenuTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTemperaturaActionPerformed
        iniTemperatura();
    }//GEN-LAST:event_jMenuTemperaturaActionPerformed

    private void jMenuBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBasicaActionPerformed
        iniCalculadoraBasica();
    }//GEN-LAST:event_jMenuBasicaActionPerformed

    private void jMenuIPresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIPresionActionPerformed
        iniPresion();
    }//GEN-LAST:event_jMenuIPresionActionPerformed

    private void jMenuLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLongitudActionPerformed
        iniLongitud();
    }//GEN-LAST:event_jMenuLongitudActionPerformed

    private void jMenuMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMasaActionPerformed
        iniMasa();
    }//GEN-LAST:event_jMenuMasaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        iniCientifica();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        iniFactorial();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        iniValor_Mayor();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        iniValor_Menor();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        iniPotencia();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        iniMCD();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        iniExpresiones_Algebraicas();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        iniCuadraticas();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        iniCambioBase();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        iniRaizN();
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MDI_Principal().setVisible(true);
        });
    }
        
    
    public void iniInicio(){
        oCalculadora = new Calculadora();
        this.add(oCalculadora);
        oCalculadora.setVisible(true);
    }
    public void iniCalculadoraBasica() {
        if (oCalculadora == null || oCalculadora.isClosed()) {
            oCalculadora = new Calculadora();
            this.add(oCalculadora);
            oCalculadora.setVisible(true);
        }
    }

    public void iniTemperatura() {
        if (oTemperatura == null || oTemperatura.isClosed()) {
            oTemperatura = new Temperatura();
            this.add(oTemperatura);
            oTemperatura.setVisible(true);
        }
    }

    public void iniPotencia() {
        if (oPotencia == null || oPotencia.isClosed()) {
            oPotencia = new Potencia();
            this.add(oPotencia);
            oPotencia.setVisible(true);
        }
    }

    public void iniExpresiones_Algebraicas() {
        if (oExpresiones_Algebraicas == null || oExpresiones_Algebraicas.isClosed()) {
            oExpresiones_Algebraicas = new Expresiones_Algebraicas();
            this.add(oExpresiones_Algebraicas);
            oExpresiones_Algebraicas.setVisible(true);
        }
    }

    public void iniCuadraticas() {
        if (oCuadraticas == null || oCuadraticas.isClosed()) {
            oCuadraticas = new Cuadraticas();
            this.add(oCuadraticas);
            oCuadraticas.setVisible(true);
        }
    }
    
    public void iniRaizN() {
        if (oRaizN == null || oRaizN.isClosed()) {
            oRaizN = new RaizN();
            this.add(oRaizN);
            oRaizN.setVisible(true);
        }
    }

    public void iniMCD() {
        if (oMCD == null || oMCD.isClosed()) {
            oMCD = new MCD();
            this.add(oMCD);
            oMCD.setVisible(true);
        }
    }

    public void iniFactorial() {
        if (oFactorial == null || oFactorial.isClosed()) {
            oFactorial = new Factorial();
            this.add(oFactorial);
            oFactorial.setVisible(true);
        }
    }

    public void iniPresion() {
        if (oPresion == null || oPresion.isClosed()) {
            oPresion = new Presion();
            this.add(oPresion);
            oPresion.setVisible(true);
        }
    }

    public void iniLongitud() {
        if (oLongitud == null || oLongitud.isClosed()) {
            oLongitud = new Longitud();
            this.add(oLongitud);
            oLongitud.setVisible(true);
        }
    }

    public void iniValor_Mayor() {
        if (oValor_Mayor == null || oValor_Mayor.isClosed()) {
            oValor_Mayor = new Valor_Mayor();
            this.add(oValor_Mayor);
            oValor_Mayor.setVisible(true);
        }
    }

    public void iniCambioBase() {
        if (oCambioBase == null || oCambioBase.isClosed()) {
            oCambioBase = new CambioBase();
            this.add(oCambioBase);
            oCambioBase.setVisible(true);
        }
    }

    public void iniMasa() {
        if (oMasa == null || oMasa.isClosed()) {
            oMasa = new Masa();
            this.add(oMasa);
            oMasa.setVisible(true);
        }
    }

    public void iniCientifica() {
        if (oCalculator == null || oCalculator.isClosed()) {
            oCalculator = new Calculator();
            this.add(oCalculator);
            oCalculator.setVisible(true);
        }
    }

    public void iniValor_Menor() {
        if (oValor_Menor == null || oValor_Menor.isClosed()) {
            oValor_Menor = new Valor_Menor();
            this.add(oValor_Menor);
            oValor_Menor.setVisible(true);
        }
    }

    class ImagenPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/background.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Variables Eventos">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBasica;
    private javax.swing.JMenu jMenuComplejas;
    private javax.swing.JMenu jMenuConvertidor;
    private javax.swing.JMenuItem jMenuIPresion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuLongitud;
    private javax.swing.JMenuItem jMenuMasa;
    private javax.swing.JMenuItem jMenuTemperatura;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
    //</editor-fold>
