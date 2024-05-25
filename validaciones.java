import javax.swing.JOptionPane;

public class validaciones {
    public String digitos(String mensaje){
        String dgt;
        do{
            dgt=JOptionPane.showInputDialog(mensaje);
            for (char c: dgt.toCharArray()){
                if(!Character.isDigit(c)){
                    JOptionPane.showMessageDialog(null, "el valor ingresado contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                    break;
                }
            }
        } while (dgt == null);
        return dgt;
    }

    public String flotante(String mensaje){
        String dgt;
        do{
            dgt=JOptionPane.showInputDialog(mensaje);
            for (char c: dgt.toCharArray()){
                if(!Character.isDigit(c) && c != '.'){
                    JOptionPane.showMessageDialog(null, "el valor ingresado contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                    break;
                }
            }
        } while (dgt == null);
        return dgt;
    }

    public String letras(String mensaje){
        String dgt;
        do{
            dgt=JOptionPane.showInputDialog(mensaje);
            for (char c: dgt.toCharArray()){
                if(!Character.isLetter(c)){
                    JOptionPane.showMessageDialog(null, "el valor ingresado contiene numeros o caracteres especiales, favor valide");
                    dgt = null;
                    break;
                }
            }
        } while (dgt == null);
        return dgt;
    }

    public String letrasydigitos(String mensaje){
        String dgt;
        do{
            dgt=JOptionPane.showInputDialog(mensaje);
            for (char c: dgt.toCharArray()){
                if(!Character.isLetterOrDigit(c)){
                    JOptionPane.showMessageDialog(null, "el valor ingresado contiene numeros o caracteres especiales, favor valide");
                    dgt = null;
                    break;
                }
            }
        } while (dgt == null);
        return dgt;
    }
}


