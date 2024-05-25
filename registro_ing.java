import java.util.LinkedList;

import javax.swing.JOptionPane;

public class registro_ing {
    public LinkedList<estudiante_ing> registro(LinkedList<estudiante_ing> prestamos){
         validaciones v=new validaciones();
        String mensaje;
        int cant, sem;

        mensaje ="ingrese el numero de prestamos a ingresar";
        cant = Integer.parseInt(v.digitos(mensaje));

        for (int i = 0; i < cant; i++) {
            estudiante_ing e = new estudiante_ing(null, null, null, null, i, i, null);

            mensaje = "Ingrese la cedula";
            e.setCedula(v.digitos(mensaje));
            
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

            mensaje="Ingrese el serial de el equipo";
            e.setSerial(v.letrasydigitos(mensaje));

            prestamos.add(e);
            
    }
    return prestamos;
    }
}