import java.util.LinkedList;

import javax.swing.JOptionPane;

public class registro_ing {
    public LinkedList<estudiante_ing> registro(LinkedList<estudiante_ing> prestamos){
         
        int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad de prestamos "));
        for (int i = 0; i < cant; i++) {
            estudiante_ing e = new estudiante_ing(null, null, null, null, i, i, null);
            e.setCedula(JOptionPane.showInputDialog("Ingrese la cedula"));
            e.setNombre(JOptionPane.showInputDialog("Ingrese nombre"));
            e.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
            e.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
            e.setSemestre(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el semestre que esta cursando")));
            e.setPromedio(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese el promedio ")));
            e.setSerial(JOptionPane.showInputDialog("Ingrese el serial de el equipo"));
            prestamos.add(e);
       
    }
    return prestamos;
    }
}