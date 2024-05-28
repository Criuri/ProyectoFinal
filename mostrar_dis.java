import java.util.LinkedList;

import javax.swing.JOptionPane;

public class mostrar_dis {
    public void mostrarPrestamos(LinkedList<estudiante_dis> prestamos_dis){
        StringBuilder mensaje = new StringBuilder();
        int s;
        if(prestamos_dis.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");

        } else {
        String cs = JOptionPane.showInputDialog("Para buscar la información de un prestamo en concreto, ingrese la cédula del estudiante o el serial del equipo:");
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
            return;
        }
        
        if (est!=null){
            mensaje.append("Cedula: ").append(est.getCedula()).append("\n");
            mensaje.append("Nombre: ").append(est.getNombre()).append("\n");
            mensaje.append("Apellido: ").append(est.getApellido()).append("\n");
            mensaje.append("Telefono: ").append(est.getTelefono()).append("\n");
            mensaje.append("Modalidad: ").append(est.getModalidad()).append("\n");
            mensaje.append("Cant.Asignaturas: ").append(est.getAsignaturas()).append("\n");
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
