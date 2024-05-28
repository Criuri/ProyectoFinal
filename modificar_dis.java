import java.util.LinkedList;

import javax.swing.JOptionPane;

public class modificar_dis {
    public LinkedList<estudiante_dis> modificar(LinkedList<estudiante_dis> prestamos_dis){
        validaciones_mod vm = new validaciones_mod();
        StringBuilder mensaje = new StringBuilder();
        String dgt;
        int s;
        if(prestamos_dis.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
            return null;
        } else {
        String cs = JOptionPane.showInputDialog("Para modificar la información, ingrese la cédula del estudiante o el serial del equipo:");
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
            return prestamos_dis;
        }

        if (est !=null){
            do{
                dgt=JOptionPane.showInputDialog("Ingrese la cedula", est.getCedula());
                if(!vm.digitosmod(dgt)){
                    JOptionPane.showMessageDialog(null, "la cedula ingresada contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setCedula(dgt);
            dgt=null;

            do{
                dgt=JOptionPane.showInputDialog("Ingrese nombre", est.getNombre());
                if(!vm.letrasmod(dgt)){
                    JOptionPane.showMessageDialog(null, "el nombre ingresado contiene numeros o caracteres especiales, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setNombre(dgt);
            dgt=null;

            do{
                dgt=JOptionPane.showInputDialog("Ingrese el apellido", est.getApellido());
                if(!vm.letrasmod(dgt)){
                    JOptionPane.showMessageDialog(null, "el apellido ingresado contiene numeros o caracteres especiales, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setApellido(dgt);
            dgt=null;

            do{
                dgt=JOptionPane.showInputDialog("Ingrese el telefono", est.getTelefono());
                if(!vm.digitosmod(dgt)){
                    JOptionPane.showMessageDialog(null, "el telefono ingresado contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setTelefono(dgt);
            dgt=null;

            do{
                dgt=JOptionPane.showInputDialog("Ingrese la modalidad de estudio", est.getModalidad());
                if(!vm.letrasmod(dgt)){
                    JOptionPane.showMessageDialog(null, "la modalidad ingresada contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setModalidad(dgt);
            dgt=null;

            do{
                dgt=JOptionPane.showInputDialog("Ingrese la cantidad de Asignaturas", est.getAsignaturas());
                if(!vm.digitosmod(dgt)){
                    JOptionPane.showMessageDialog(null, "La cantidad de asignaturas contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setAsignaturas(Integer.parseInt(dgt));
            dgt=null;

            do{
                dgt=JOptionPane.showInputDialog("Ingrese el serial de el dispositivo", est.getAsignaturas());
                if(!vm.digitosmod(dgt)){
                    JOptionPane.showMessageDialog(null, "el serial ingresado contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setAsignaturas(Integer.parseInt(dgt));
            dgt=null;

            

            JOptionPane.showMessageDialog(null, "Informacion de prestamo modificado exitosamente");

            mensaje.append("Cedula: ").append(est.getCedula()).append("\n");
            mensaje.append("Nombre: ").append(est.getNombre()).append("\n");
            mensaje.append("Apellido: ").append(est.getApellido()).append("\n");
            mensaje.append("Telefono: ").append(est.getTelefono()).append("\n");
            mensaje.append("Modalidad: ").append(est.getModalidad()).append("\n");
            mensaje.append("Cant.Asignaturas: ").append(est.getAsignaturas()).append("\n");
            mensaje.append("Serial: ").append(est.getSerial()).append("\n");
            mensaje.append("\n");
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Estudiante modificado", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Prestamo no encontrado.");
        }
        return prestamos_dis;
    }
    }
}
