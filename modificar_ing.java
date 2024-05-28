import java.util.LinkedList;

import javax.swing.JOptionPane;

public class modificar_ing {
    public LinkedList<estudiante_ing> modificar(LinkedList<estudiante_ing> prestamos){
        validaciones_mod vm = new validaciones_mod();
        StringBuilder mensaje = new StringBuilder();
        String dgt;
        if(prestamos.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
            return null;
        } else {
        String cs = JOptionPane.showInputDialog("Para modificar la información, ingrese la cédula del estudiante o el serial del equipo:");
        estudiante_ing est=null;

        for (estudiante_ing e: prestamos){
            if(e.getCedula().equals(cs) || e.getSerial().equals(cs)){
                est=e;
            }
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
                dgt=JOptionPane.showInputDialog("ingrese el semestre que esta cursando", est.getSemestre());
                if(!vm.digitosmod(dgt)){
                    JOptionPane.showMessageDialog(null, "el semestre ingresado contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                } else if (Integer.parseInt(dgt) > 10 || Integer.parseInt(dgt)==0) {
                    JOptionPane.showMessageDialog(null, "el semestre ingresado no es posible, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setSemestre(Integer.parseInt(dgt));
            dgt=null;

            do{
                dgt=JOptionPane.showInputDialog("ingrese el promedio", est.getPromedio());
                if(!vm.flotantemod(dgt)){
                    JOptionPane.showMessageDialog(null, "el promedio ingresado contiene letras o caracteres especiales, favor valide");
                    dgt = null;
                } else if (Float.parseFloat(dgt) > 5) {
                    JOptionPane.showMessageDialog(null, "el promedio ingresado no es posible, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setPromedio(Float.parseFloat(dgt));
            dgt=null;

            do{
                dgt=JOptionPane.showInputDialog("Ingrese el serial de el equipo", est.getSerial());
                if(!vm.lydmod(dgt)){
                    JOptionPane.showMessageDialog(null, "el serial ingresado caracteres especiales, favor valide");
                    dgt = null;
                }
            } while (dgt == null);
            est.setSerial(dgt);
            dgt=null;

            JOptionPane.showMessageDialog(null, "Informacion de prestamo modificado exitosamente");

            mensaje.append("Cedula: ").append(est.getCedula()).append("\n");
            mensaje.append("Nombre: ").append(est.getNombre()).append("\n");
            mensaje.append("Apellido: ").append(est.getApellido()).append("\n");
            mensaje.append("Telefono: ").append(est.getTelefono()).append("\n");
            mensaje.append("Semestre: ").append(est.getSemestre()).append("\n");
            mensaje.append("Promedio: ").append(est.getPromedio()).append("\n");
            mensaje.append("Serial: ").append(est.getSerial()).append("\n");
            mensaje.append("\n");
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Estudiante modificado", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Prestamo no encontrado.");
        }
        return prestamos;
    }
    }
}
