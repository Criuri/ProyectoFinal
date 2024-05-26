import java.util.LinkedList;

import javax.swing.JOptionPane;

public class registro_ing {
    public LinkedList<estudiante_ing> registro(LinkedList<estudiante_ing> prestamos){
         validaciones v=new validaciones();
        String mensaje, ce, se;
        int cant, sem;

        mensaje ="ingrese el numero de prestamos a ingresar";
        cant = Integer.parseInt(v.digitos(mensaje));

        for (int i = 0; i < cant; i++) {
            estudiante_ing e = new estudiante_ing(null, null, null, null, i, i, null);
            do {
                mensaje = "Ingrese la cedula";
                ce=v.digitos(mensaje);
                if(v.ceduplicada(prestamos, ce)){
                    JOptionPane.showMessageDialog(null, "La cédula ya existe. Ingrese una cédula nueva.");
                    ce = null;
                }
            } while (ce==null);
            e.setCedula(ce);
            
            mensaje="Ingrese nombre";
            e.setNombre(v.letras(mensaje));

            mensaje="Ingrese el apellido";
            e.setApellido(v.letras(mensaje));

            mensaje = "Ingrese el telefono";
            e.setTelefono(v.digitos(mensaje));

            do {
                mensaje="ingrese el semestre que esta cursando";
                sem=Integer.parseInt(v.digitos(mensaje));
                if(sem > 10 || sem==0){
                    JOptionPane.showMessageDialog(null, "el semestre ingresado no es posible, favor valide");
                    sem=0;
                }
            } while (sem==0);  
            e.setSemestre(sem);
            
            mensaje="ingrese el promedio";
            e.setPromedio(Float.parseFloat(v.flotante(mensaje)));

            
            do {
                mensaje="Ingrese el serial de el equipo";
                se=v.letrasydigitos(mensaje);
                if(v.serialdup(prestamos, se)){
                    JOptionPane.showMessageDialog(null, "el serial ya esta ocupado. Elija un nuevo serial.");
                    se = null;
                }
            } while (se==null);
            e.setSerial(se);

            prestamos.add(e);
            
    }
    return prestamos;
    }
}