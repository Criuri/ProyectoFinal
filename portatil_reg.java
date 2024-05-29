import java.util.LinkedList;

import javax.swing.JOptionPane;

public class portatil_reg {
    public LinkedList<portatil> registro_port(LinkedList<portatil> portatiles){
         validaciones v=new validaciones();
        String mensaje, se;
        int cant,  ce;

        boolean entrada = true;
        while (entrada){
            int opt=0;
            StringBuilder mensaje1 = new StringBuilder();
                mensaje1.append("Elija una opcion para proceder").append("\n");
                mensaje1.append("1. Importar archivo .txt").append("\n");
                mensaje1.append("2. ingresar de manera manual").append("\n");
                opt = (Integer.parseInt(v.opt(mensaje1)));
            
                switch (opt) {
                    case 1:
                            importar_portatil imp=new importar_portatil();
                            imp.importarPortatil("inventario portatiles.txt", portatiles);
                        entrada = false;
                        break;
                    
                    case 2:

                    mensaje ="ingrese el numero de portatiles a ingresar";
        cant = Integer.parseInt(v.digitos(mensaje));

        for (int i = 0; i < cant; i++) {
            portatil p = new portatil(null, null, 0, 0, null, null, 0);
            do {
                mensaje = "Ingrese el serial";
                se=v.letrasydigitos(mensaje);
                if(v.serialdup_p(portatiles, se)){
                    JOptionPane.showMessageDialog(null, "El serial ya existe.");
                    se = null;
                }
            } while (se==null);
            p.setSerial(se);
            
            mensaje="Ingrese la Marca";
            p.setMarca(v.letras(mensaje));

            mensaje="Ingrese el tamaño en pulgadas";
            p.setTamaño(Float.parseFloat(v.flotante(mensaje)));

            mensaje = "Ingrese el precio";
            p.setPrecio(Float.parseFloat(v.flotante(mensaje)));

            boolean entrada2 = true;
        while (entrada2){
            int opt1=0;
            StringBuilder mensaje2 = new StringBuilder();
                mensaje2.append("Elija el Sistema operativo del equipo").append("\n");
                mensaje2.append("1. Windows 7").append("\n");
                mensaje2.append("2. Windows 10").append("\n");
                mensaje2.append("3. Windows 11").append("\n");
                mensaje2.append("4. linux").append("\n");
                opt = (Integer.parseInt(v.opt(mensaje2)));
            
                switch (opt1) {
                    case 1:
                        p.setSistema("Windows 7");
                        entrada2 = false;
                        break;
                    
                    case 2:
                        p.setSistema("Windows 10");
                        entrada2 = false;
                        break;
                
                    case 3:
                        p.setSistema("Windows 11");
                        entrada2 = false;
                        break;

                    case 4:
                        p.setSistema("linux");
                        entrada2 = false;
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }
        boolean entrada3 = true;
        while (entrada3){
            int opt2=0;
            StringBuilder mensaje2 = new StringBuilder();
                mensaje2.append("Elija el procesadoe del equipo").append("\n");
                mensaje2.append("1. AMD Ryzen").append("\n");
                mensaje2.append("2. Intel® Core™ i5.").append("\n");
                opt = (Integer.parseInt(v.opt(mensaje2)));
            
                switch (opt2) {
                    case 1:
                        p.setProcesador("AMD Ryzen");
                        entrada3 = false;
                        break;
                    
                    case 2:
                        p.setProcesador("Intel® Core™ i5");
                        entrada3 = false;
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }

            do {
                mensaje="Ingrese 1 si se encuentra disponible, o 2 si esta ocupada";
                ce=Integer.parseInt(v.digitos(mensaje));
                if(ce <1|| ce>2){
                    JOptionPane.showMessageDialog(null, "opcion no valida");
                    ce=0;
                }
            } while (ce==0);  
            p.setEstado(ce);

            portatiles.add(p);
    }
                    entrada = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }

    return portatiles;
    }
}
