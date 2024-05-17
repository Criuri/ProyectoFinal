import java.util.LinkedList;

import javax.swing.JOptionPane;

public class mostrar_ing {
    public void mostrarPrestamos(LinkedList<estudiante_ing> prestamos){
        StringBuilder mensaje = new StringBuilder();
        if(prestamos.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
            return;
        }
        for (estudiante_ing est : prestamos) {
            mensaje.append("Cedula: ").append(est.getCedula()).append("\n");
            mensaje.append("Nombre: ").append(est.getNombre()).append("\n");
            mensaje.append("Apellido: ").append(est.getApellido()).append("\n");
            mensaje.append("Telefono: ").append(est.getTelefono()).append("\n");
            mensaje.append("Semestre: ").append(est.getSemestre()).append("\n");
            mensaje.append("Promedio: ").append(est.getPromedio()).append("\n");
            mensaje.append("Serial: ").append(est.getSerial()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de Prestamos", JOptionPane.INFORMATION_MESSAGE);
    }
}
