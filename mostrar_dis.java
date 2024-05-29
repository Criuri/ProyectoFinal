import java.util.LinkedList;

import javax.swing.JOptionPane;

public class mostrar_dis {
    public void mostrarPrestamos(LinkedList<estudiante_dis> prestamos_dis){
        validaciones v=new validaciones();
        int s;
        if(prestamos_dis.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");

        } else {
        boolean entrada = true;
        while (entrada){
            int opt=0;
            StringBuilder mensaje2 = new StringBuilder();
                mensaje2.append("Elija una opcion para proceder").append("\n");
                mensaje2.append("1. Buscar un registro de prestamo en especifico").append("\n");
                mensaje2.append("2. Mostrar todos los prestamos registrados").append("\n");
                mensaje2.append("3. Exportar los registros").append("\n");
                mensaje2.append("4. Regresar al menu").append("\n");
                opt = (Integer.parseInt(v.opt(mensaje2)));
            
                switch (opt) {
                    case 1:
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
                    StringBuilder mensaje = new StringBuilder();
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

                    
                        break;

                    case 2:
                    StringBuilder mensaje1 = new StringBuilder();
                    for (estudiante_dis dis: prestamos_dis){
                        mensaje1.append("Cedula: ").append(dis.getCedula()).append("\n");
                        mensaje1.append("Nombre: ").append(dis.getNombre()).append("\n");
                        mensaje1.append("Apellido: ").append(dis.getApellido()).append("\n");
                        mensaje1.append("Telefono: ").append(dis.getTelefono()).append("\n");
                        mensaje1.append("Semestre: ").append(dis.getModalidad()).append("\n");
                        mensaje1.append("Promedio: ").append(dis.getAsignaturas()).append("\n");
                        mensaje1.append("Serial: ").append(dis.getSerial()).append("\n");
                        mensaje1.append("\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje1.toString(), "Lista de prestamos", JOptionPane.INFORMATION_MESSAGE);

                     
                        break;

                    case 3:
                        exportar_dis exp= new exportar_dis();
                        exp.exportarDiseñador(prestamos_dis);
                        entrada = false;
                        break;

                    case 4:

                        entrada = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }
    }
    }
}
