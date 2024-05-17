import java.util.LinkedList;

import javax.swing.JOptionPane;

public class modificar_ing {
    public LinkedList<estudiante_ing> modificar(LinkedList<estudiante_ing> prestamos){
        if(prestamos.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de prestamos está vacía.");
            return null;
        }
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante a modificar:");
        estudiante_ing est=null;

        for (estudiante_ing e: prestamos){
            if(e.getCedula().equals(cedula)){
                est=e;
            }
        }

        if (est !=null){
            est.setCedula(JOptionPane.showInputDialog("Ingrese la cedula", est.getCedula()));
            est.setNombre(JOptionPane.showInputDialog("Ingrese nombre", est.getNombre()));
            est.setApellido(JOptionPane.showInputDialog("Ingrese el apellido", est.getApellido()));
            est.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono", est.getTelefono()));
            est.setSemestre(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el semestre que esta cursando", est.getSemestre())));
            est.setPromedio(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese el promedio ", est.getPromedio())));
            est.setSerial(JOptionPane.showInputDialog("Ingrese el serial de el equipo", est.getSerial()));

        } else{
            JOptionPane.showMessageDialog(null, "Prestamo no encontrado.");
        }



        return prestamos;
    }
}
