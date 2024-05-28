import java.util.LinkedList;

import javax.swing.JOptionPane;

public class mostrar_ing {
    public void mostrarPrestamos(LinkedList<estudiante_ing> prestamos){
        StringBuilder mensaje = new StringBuilder();
        if(prestamos.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
            return;
        } else{
        String cs = JOptionPane.showInputDialog("Para buscar la información de un prestamo en concreto, ingrese la cédula del estudiante o el serial del equipo:");
        estudiante_ing est=null;

        for (estudiante_ing e: prestamos){
            if(e.getCedula().equals(cs) || e.getSerial().equals(cs)){
                est=e;
            }
        }
        if (est!=null){
            mensaje.append("Cedula: ").append(est.getCedula()).append("\n");
            mensaje.append("Nombre: ").append(est.getNombre()).append("\n");
            mensaje.append("Apellido: ").append(est.getApellido()).append("\n");
            mensaje.append("Telefono: ").append(est.getTelefono()).append("\n");
            mensaje.append("Semestre: ").append(est.getSemestre()).append("\n");
            mensaje.append("Promedio: ").append(est.getPromedio()).append("\n");
            mensaje.append("Serial: ").append(est.getSerial()).append("\n");
            mensaje.append("\n");
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Prestamo encontrado", JOptionPane.INFORMATION_MESSAGE);

        } else if (est==null) {
             mensaje.append("Prestamo no encontrado, favor valide:");
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de Prestamos", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
}
