import javax.swing.JOptionPane;
import java.util.LinkedList;

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

    public boolean ceduplicada(LinkedList<estudiante_ing> prestamos, String ce){
        for (estudiante_ing e : prestamos) {
            if (e.getCedula().equals(ce)) {
                return true;
            }
        }
        return false;
    }

    public boolean serialdup(LinkedList<estudiante_ing> prestamos, String se){
        for (estudiante_ing e : prestamos) {
            if (e.getSerial().equals(se)) {
                return true;
            }
        }
        return false;
    }
}


