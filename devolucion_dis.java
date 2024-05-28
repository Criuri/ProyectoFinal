import java.util.LinkedList;

import javax.swing.JOptionPane;

public class devolucion_dis {
    public LinkedList<estudiante_dis> devolucion(LinkedList<estudiante_dis> prestamos_dis){
        int s;
    if(prestamos_dis.isEmpty()){
        JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
        return null;
    } else {
    String cs = JOptionPane.showInputDialog("Ingrese la cédula del estudiante o el serial del dispositivo del prestamo a eliminar:");
        estudiante_dis est=null;

        try {
            s= Integer.parseInt(cs);
            for (estudiante_dis e: prestamos_dis){
                if(e.getCedula().equals(cs) || e.getSerial() == s){
                    est=e;
                } 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido.");
            return prestamos_dis;
        }

        if (est !=null){
            prestamos_dis.remove(est);
            JOptionPane.showMessageDialog(null, "Estudiante eliminado exitosamente."); 
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    return prestamos_dis;
    }
}
}
