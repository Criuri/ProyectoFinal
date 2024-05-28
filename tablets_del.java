import java.util.LinkedList;

import javax.swing.JOptionPane;

public class tablets_del {
    public LinkedList<tableta> eliminacion(LinkedList<tableta> tabletas){
    if(tabletas.isEmpty()){
        JOptionPane.showMessageDialog(null, "La lista de tabletas está vacía.");
        return null;
    } else{
    String cs = JOptionPane.showInputDialog("Ingrese el serial del dispositivo eliminar:");
        tableta tbt=null;

        try {
            for (tableta e: tabletas){
                if(e.getSerial().equals(cs)){
                    tbt=e;
                } 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido.");
            return tabletas;
        }

        if (tbt !=null){
            tabletas.remove(tbt);
            JOptionPane.showMessageDialog(null, "Estudiante eliminado exitosamente."); 
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    return tabletas;
    }
}
}
