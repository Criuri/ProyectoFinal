import java.util.LinkedList;

import javax.swing.JOptionPane;

public class mostrar_dis {
    public void mostrarPrestamos(LinkedList<estudiante_dis> prestamos_dis){
        StringBuilder mensaje = new StringBuilder();

        if(prestamos_dis.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");

        }
        String cs = JOptionPane.showInputDialog("Para buscar la información de un prestamo en concreto, ingrese la cédula del estudiante o el serial del equipo:");
        estudiante_dis est=null;
        if(cs!=null){
            for (estudiante_dis e: prestamos_dis){
                if(e.getCedula().equals(cs) || e.getSerial() == Integer.parseInt(cs)){
                    est=e;
                } 
            }
            
        } else{ 
            for (estudiante_dis stu : prestamos_dis) {
                mensaje.append("Cedula: ").append(stu.getCedula()).append("\n");
                mensaje.append("Nombre: ").append(stu.getNombre()).append("\n");
                mensaje.append("Apellido: ").append(stu.getApellido()).append("\n");
                mensaje.append("Telefono: ").append(stu.getTelefono()).append("\n");
                mensaje.append("Modalidad: ").append(stu.getModalidad()).append("\n");
            mensaje.append("Cant.Asignaturas: ").append(stu.getAsignaturas()).append("\n");
                mensaje.append("Serial: ").append(stu.getSerial()).append("\n");
                mensaje.append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de Prestamos", JOptionPane.INFORMATION_MESSAGE);
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
            for (estudiante_dis stu : prestamos_dis) {
                mensaje.append("Cedula: ").append(stu.getCedula()).append("\n");
                mensaje.append("Nombre: ").append(stu.getNombre()).append("\n");
                mensaje.append("Apellido: ").append(stu.getApellido()).append("\n");
                mensaje.append("Telefono: ").append(stu.getTelefono()).append("\n");
                mensaje.append("Modalidad: ").append(stu.getModalidad()).append("\n");
            mensaje.append("Cant.Asignaturas: ").append(stu.getAsignaturas()).append("\n");
                mensaje.append("Serial: ").append(stu.getSerial()).append("\n");
                mensaje.append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de Prestamos", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
