package Operaciones;

import javax.swing.JLabel;

/**
 * @author Jonathan Rivera Vasquez
 * @version 1.0
 * @since 4/05/2022
 */
public class Operaciones {

    //<editor-fold defaultstate="collapsed" desc="Variables globales">
    double temp, temp1, result, a;
    static double m1, m2;
    int x, y, z, k;
    char ch;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Contructor">
    public Operaciones() {
        x = y = z = k = 0;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void actionPerformed(String s, JLabel auxLabel) {
        if (s.equals("1")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "1");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "2");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "3");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "4");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "5");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "6");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "7");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "8");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "9");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                auxLabel.setText(auxLabel.getText() + "0");
            } else {
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("AC")) {
            auxLabel.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        if (s.equals("log")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.log10(Double.parseDouble(auxLabel.getText()));
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        if (s.equals("≈˅")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.floor(Double.parseDouble(auxLabel.getText()));
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        if (s.equals("Exp")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.exp(Double.parseDouble(auxLabel.getText()));
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        if (s.equals("x^2")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.pow(Double.parseDouble(auxLabel.getText()), 2);
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        if (s.equals("±")) {
            if (x == 0) {
                auxLabel.setText("-" + auxLabel.getText());
                x = 1;
            } else {
                auxLabel.setText(auxLabel.getText());
            }
        }
        if (s.equals(".")) {
            if (y == 0) {
                auxLabel.setText(auxLabel.getText() + ".");
                y = 1;
            } else {
                auxLabel.setText(auxLabel.getText());
            }
        }
        if (s.equals("+")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
                temp = 0;
                ch = '+';
            } else {
                temp = Double.parseDouble(auxLabel.getText());
                auxLabel.setText("");
                ch = '+';
                y = 0;
                x = 0;
            }
            auxLabel.requestFocus();
        }
        if (s.equals("-")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
                temp = 0;
                ch = '-';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(auxLabel.getText());
                auxLabel.setText("");
                ch = '-';
            }
            auxLabel.requestFocus();
        }
        if (s.equals("÷")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
                temp = 1;
                ch = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(auxLabel.getText());
                ch = '/';
                auxLabel.setText("");
            }
            auxLabel.requestFocus();
        }
        if (s.equals("%")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
                temp = 1;
                ch = '%';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(auxLabel.getText());
                ch = '%';
                auxLabel.setText("");
            }
        }
        if (s.equals("×")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
                temp = 1;
                ch = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(auxLabel.getText());
                ch = '*';
                auxLabel.setText("");
            }
            auxLabel.requestFocus();
        }
        if (s.equals("Sqrt")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.sqrt(Double.parseDouble(auxLabel.getText()));
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        if (s.equals("SIN")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.sin(Double.parseDouble(auxLabel.getText()));
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        if (s.equals("COS")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.cos(Double.parseDouble(auxLabel.getText()));
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        if (s.equals("|x|")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                double aux = Double.parseDouble(auxLabel.getText());
                if (aux < 0) {
                    result = Double.parseDouble(auxLabel.getText()) * (-1.0);
                    auxLabel.setText(String.valueOf(result));
                } else if (aux > 0) {
                    result = Double.parseDouble(auxLabel.getText());
                    auxLabel.setText(String.valueOf(result));
                } else if (aux == 0) {
                    result = Double.parseDouble(auxLabel.getText()) * (0);
                    auxLabel.setText(String.valueOf(String.format("%.2f", result)));
                }
            }
        }
        if (s.equals("TAN")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.tan(Double.parseDouble(auxLabel.getText()));
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        if (s.equals("=")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                temp1 = Double.parseDouble(auxLabel.getText());
                switch (ch) {
                    case '+' ->
                        result = temp + temp1;
                    case '-' ->
                        result = temp - temp1;
                    case '/' ->
                        result = temp / temp1;
                    case '*' ->
                        result = temp * temp1;
                    case '%' ->
                        result = temp % temp1;
                }
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", result));
                z = 1;
            }
        }
        if (s.equals("≈˄")) {
            if (auxLabel.getText().equals("")) {
                auxLabel.setText("");
            } else {
                a = Math.ceil(Double.parseDouble(auxLabel.getText()));
                auxLabel.setText("");
                auxLabel.setText(auxLabel.getText() + String.format("%.2f", a));
            }
        }
        auxLabel.requestFocus();
    }
}
//</editor-fold>
