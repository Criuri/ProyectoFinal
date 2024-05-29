import java.util.LinkedList;

import javax.swing.JOptionPane;

public class tablets_reg {
    public LinkedList<tableta> registro_tab(LinkedList<tableta> tabletas){
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
                            importar_tableta imp=new importar_tableta();
                            imp.importarTableta("inventario tabletas.txt", tabletas);
                        entrada = false;
                        break;
                    
                    case 2:

                    mensaje ="ingrese el numero de tabletas a ingresar";
        cant = Integer.parseInt(v.digitos(mensaje));

        for (int i = 0; i < cant; i++) {
            tableta t = new tableta(null, null, 0, 0, null, 0, 0);
            do {
                mensaje = "Ingrese el serial";
                se=v.digitos(mensaje);
                if(v.serialdup_t(tabletas, se)){
                    JOptionPane.showMessageDialog(null, "El serial ya existe.");
                    se = null;
                }
            } while (se==null);
            t.setSerial(se);
            
            mensaje="Ingrese la Marca";
            t.setMarca(v.letras(mensaje));

            mensaje="Ingrese el tamaño en pulgadas";
            t.setTamaño(Float.parseFloat(v.flotante(mensaje)));

            mensaje = "Ingrese el precio";
            t.setPrecio(Float.parseFloat(v.flotante(mensaje)));

            boolean entrada2 = true;
        while (entrada2){
            int opt2=0;
            StringBuilder mensaje2 = new StringBuilder();
                mensaje2.append("Elija el almacenamiento del dispositivo").append("\n");
                mensaje2.append("1. 256 GB").append("\n");
                mensaje2.append("2. 512 GB").append("\n");
                mensaje2.append("3. 1 TB").append("\n");
                mensaje2.append("4. No establecer almacenamiento").append("\n");
                opt = (Integer.parseInt(v.opt(mensaje2)));
            
                switch (opt2) {
                    case 1:
                        t.setAlmacenamiento("256 GB");
                        entrada2 = false;
                        break;
                    
                    case 2:
                        t.setAlmacenamiento("512 GB");
                        entrada2 = false;
                        break;
                
                    case 3:
                        t.setAlmacenamiento("1 TB");
                        entrada2 = false;
                        break;

                    case 4:
                        t.setAlmacenamiento("No Establecido");
                        entrada2 = false;
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }
            mensaje = "Ingrese el peso";
            t.setPeso(Float.parseFloat(v.flotante(mensaje)));

            do {
                mensaje="Ingrese 1 si se encuentra disponible, o 2 si esta ocupada";
                ce=Integer.parseInt(v.digitos(mensaje));
                if(ce <1|| ce>2){
                    JOptionPane.showMessageDialog(null, "opcion no valida");
                    ce=0;
                }
            } while (ce==0);  
            t.setEstado(ce);

            tabletas.add(t);
    }
                    entrada = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }

    return tabletas;
    }
}
