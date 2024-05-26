import java.util.LinkedList;

import javax.swing.JOptionPane;

public class mostrar_ing {
    public void mostrarPrestamos(LinkedList<estudiante_ing> prestamos){
        StringBuilder mensaje = new StringBuilder();
        if(prestamos.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
            return;
        }
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
            for (estudiante_ing stu : prestamos) {
                mensaje.append("Cedula: ").append(stu.getCedula()).append("\n");
                mensaje.append("Nombre: ").append(stu.getNombre()).append("\n");
                mensaje.append("Apellido: ").append(stu.getApellido()).append("\n");
                mensaje.append("Telefono: ").append(stu.getTelefono()).append("\n");
                mensaje.append("Semestre: ").append(stu.getSemestre()).append("\n");
                mensaje.append("Promedio: ").append(stu.getPromedio()).append("\n");
                mensaje.append("Serial: ").append(stu.getSerial()).append("\n");
                mensaje.append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de Prestamos", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
