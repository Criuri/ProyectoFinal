import java.util.LinkedList;

import javax.swing.JOptionPane;

public class portatil_del {
    public LinkedList<portatil> eliminacion(LinkedList<portatil> portatiles){
    if(portatiles.isEmpty()){
        JOptionPane.showMessageDialog(null, "La lista de tabletas está vacía.");
        return null;
    } else{
    String cs = JOptionPane.showInputDialog("Ingrese el serial del dispositivo eliminar:");
        portatil port=null;

        try {
            for (portatil e: portatiles){
                if(e.getSerial().equals(cs)){
                    port=e;
                } 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido.");
            return portatiles;
        }

        if (port !=null){
            portatiles.remove(port);
            JOptionPane.showMessageDialog(null, "Estudiante eliminado exitosamente."); 
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    return portatiles;
    }
}
}
