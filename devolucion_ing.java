import java.util.LinkedList;
import javax.swing.JOptionPane;

public class devolucion_ing {
public LinkedList<estudiante_ing> devolucion(LinkedList<estudiante_ing> prestamos){
    if(prestamos.isEmpty()){
        JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
        return null;
    }
    String cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante a eliminar:");
        estudiante_ing est=null;

        for (estudiante_ing e: prestamos){
            if(e.getCedula().equals(cedula)){
                est=e;
            }
        }

        if (est !=null){
            prestamos.remove(est);
            JOptionPane.showMessageDialog(null, "Estudiante eliminado exitosamente."); 
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    return prestamos;
}
}