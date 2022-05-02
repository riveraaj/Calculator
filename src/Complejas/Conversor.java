package Complejas;

/**
 * @author Jonathan Rivera Vasquez
 * @version 1.0
 * @since 4/05/2022
 */
public class Conversor {

    // <editor-fold defaultstate="collapsed" desc="Metodos">
    public String parsear(String expr) {
        String res = "";
        expr = depurar(expr);
        String[] arrayInfix = expr.split(" ");

        Pila< String> E = new Pila();
        Pila< String> P = new Pila();
        Pila< String> S = new Pila();

        for (int i = arrayInfix.length - 1; i >= 0; i--) {
            E.push(arrayInfix[i]);
        }

        try {

            while (!E.isEmpty()) {
                switch (pref(E.peek())) {

                    case 1 ->
                        P.push(E.pop());

                    case 3, 5, 4 -> {
                        while (pref(P.peek()) >= pref(E.peek())) {
                            S.push(P.pop());
                        }
                        P.push(E.pop());
                    }
                    case 2 -> {
                        while (!P.peek().equals("(")) {
                            S.push(P.pop());
                        }
                        P.pop();
                        E.pop();
                    }
                    default ->
                        S.push(E.pop());
                }
            }

            String infix = expr.replace(" ", "");
            String postfix = S.toString().replaceAll("[\\]\\[,]", "");

            res = postfix;
        } catch (Exception ex) {
            System.out.println("Error en la expresión algebraica");
            System.err.println(ex);
        }
        return res;
    }

    private static String depurar(String s) {
        s = s.replaceAll("\\s+", "");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && i != 0) {
                if (s.charAt(i - 1) == '0' || s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2'
                        || s.charAt(i - 1) == '3' || s.charAt(i - 1) == '4' || s.charAt(i - 1) == '5'
                        || s.charAt(i - 1) == '6' || s.charAt(i - 1) == '7' || s.charAt(i - 1) == '8' || s.charAt(i - 1) == '9') {
                    s = s.substring(0, i) + "*" + s.substring(i, s.length());
                }

            }

        }
        s = "(" + s + ")";
        String simbols = "+-×÷√()^";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (simbols.contains("" + s.charAt(i))) {
                str += " " + s.charAt(i) + " ";
            } else {
                str += s.charAt(i);
            }
        }
        return str.replaceAll("\\s+", " ").trim();
    }

    private static int pref(String op) {
        int prf = 99;
        if (op.equals("^")) {
            prf = 5;
        }
        if (op.equals("×") || op.equals("÷") || op.equals("√")) {
            prf = 4;
        }
        if (op.equals("+") || op.equals("-")) {
            prf = 3;
        }
        if (op.equals(")")) {
            prf = 2;
        }
        if (op.equals("(")) {
            prf = 1;
        }
        return prf;
    }

    public String evaluar(String expr) {
        if (expr.equals("")) {
            return "";
        }

        String[] post = expr.split(" ");

        Pila< String> E = new Pila();
        Pila< String> P = new Pila();

        for (int i = post.length - 1; i >= 0; i--) {
            E.push(post[i]);
        }

        String operadores = "+-×÷√^";
        while (!E.isEmpty()) {
            if (operadores.contains("" + E.peek())) {
                String a = P.pop();
                String b = (!P.isEmpty()) ? P.pop() : "0";

                P.push(evaluar(E.pop(), a, b) + "");
            } else {
                P.push(E.pop());
            }
        }

        return P.peek();
    }

    private static float evaluar(String op, String n2, String n1) {
        float num1 = Float.valueOf(n1);
        float num2 = Float.valueOf(n2);
        if (op.equals("+")) {
            return (num1 + num2);
        }
        if (op.equals("-")) {
            return (num1 - num2);
        }
        if (op.equals("×")) {
            return (num1 * num2);
        }
        if (op.equals("÷")) {
            return (num1 / num2);
        }
        if (op.equals("^")) {
            return (float) (Math.pow(num1, num2));
        }
        if (op.equals("√")) {
            return (float) Math.sqrt(num1);
        }
        return 0;
    }

}
// </editor-fold>
