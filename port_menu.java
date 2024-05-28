import java.util.LinkedList;

import javax.swing.JOptionPane;

public class port_menu {
    public LinkedList<portatil> menuport(LinkedList<portatil> portatiles){
        validaciones v=new validaciones();
        boolean entrada = true;
        while (entrada){
            int opt=0;
            StringBuilder mensaje = new StringBuilder();
                mensaje.append("Elija una opcion para continuar").append("\n");
                mensaje.append("1. Registro de equipo").append("\n");
                mensaje.append("2. Eliminar equipo").append("\n");
                mensaje.append("3. Mostrar equipos").append("\n");
                mensaje.append("4. Salir al menu de dispositivos").append("\n");
                opt = (Integer.parseInt(v.menu(mensaje)));
            
                switch (opt) {
                    case 1:
                        portatil_reg pr=new portatil_reg();
                        pr.registro_port(portatiles);
                        break;
                    
                    case 2:
                        portatil_del pd=new portatil_del();
                        pd.eliminacion(portatiles);
                        break;
                
                    case 3:
                        portatil_view pv=new portatil_view();
                        pv.mostar(portatiles);
                        break;

                    case 4:
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
