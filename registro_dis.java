import java.util.LinkedList;

import javax.swing.JOptionPane;

public class registro_dis {
    public LinkedList<estudiante_dis> registro(LinkedList<estudiante_dis> prestamos_dis){
         validaciones v=new validaciones();
        String mensaje, ce;
        int cant,  se;

        mensaje ="ingrese el numero de prestamos a ingresar";
        cant = Integer.parseInt(v.digitos(mensaje));

        for (int i = 0; i < cant; i++) {
            estudiante_dis d = new estudiante_dis(null, null, null, null, null, i, i);
            do {
                mensaje = "Ingrese la cedula";
                ce=v.digitos(mensaje);
                if(v.ceduplicada_dis(prestamos_dis, ce)){
                    JOptionPane.showMessageDialog(null, "La cédula ya existe. Ingrese una cédula nueva.");
                    ce = null;
                }
            } while (ce==null);
            d.setCedula(ce);
            
            mensaje="Ingrese nombre";
            d.setNombre(v.letras(mensaje));

            mensaje="Ingrese el apellido";
            d.setApellido(v.letras(mensaje));

            mensaje = "Ingrese el telefono";
            d.setTelefono(v.digitos(mensaje));

            mensaje="Ingrese la modalidad de estudio";
            d.setModalidad(v.letras(mensaje));

            mensaje = "Ingrese la cantidad de asignaturas que esta cursando";
            d.setAsignaturas(Integer.parseInt(v.digitos(mensaje)));

            do {
                mensaje="Ingrese el serial de el equipo";
                se=Integer.parseInt(v.digitos(mensaje));
                if(v.serialdup_dis(prestamos_dis, se)){
                    JOptionPane.showMessageDialog(null, "el serial ya esta ocupado. Elija un nuevo serial.");
                    se = 0;
                }
            } while (se==0);
            d.setSerial(se);

            prestamos_dis.add(d);
    }
    return prestamos_dis;
    }
}