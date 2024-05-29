import java.util.LinkedList;

import javax.swing.JOptionPane;

public class mostrar_ing {
    public void mostrarPrestamos(LinkedList<estudiante_ing> prestamos){

        validaciones v=new validaciones();
        if(prestamos.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
            return;
        } else{

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
                    estudiante_ing est=null;
            
                    for (estudiante_ing e: prestamos){
                        if(e.getCedula().equals(cs) || e.getSerial().equals(cs)){
                            est=e;
                        }
                    }
                    StringBuilder mensaje = new StringBuilder();
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
                        break;
                    
                    case 2:
                    StringBuilder mensaje1 = new StringBuilder();
                    for (estudiante_ing ing: prestamos){
                        mensaje1.append("Cedula: ").append(ing.getCedula()).append("\n");
                        mensaje1.append("Nombre: ").append(ing.getNombre()).append("\n");
                        mensaje1.append("Apellido: ").append(ing.getApellido()).append("\n");
                        mensaje1.append("Telefono: ").append(ing.getTelefono()).append("\n");
                        mensaje1.append("Semestre: ").append(ing.getSemestre()).append("\n");
                        mensaje1.append("Promedio: ").append(ing.getPromedio()).append("\n");
                        mensaje1.append("Serial: ").append(ing.getSerial()).append("\n");
                        mensaje1.append("\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje1.toString(), "Lista de prestamos", JOptionPane.INFORMATION_MESSAGE);

                        break;

                    case 3:
                        exportar_ing exp= new exportar_ing();
                        exp.exportarIngenieros(prestamos);
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
