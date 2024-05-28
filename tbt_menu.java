import java.util.LinkedList;

import javax.swing.JOptionPane;

public class tbt_menu {
    public LinkedList<tableta> menutb(LinkedList<tableta> tabletas){
        validaciones v=new validaciones();
        boolean entrada = true;
        while (entrada){
            int opt=0;
            StringBuilder mensaje = new StringBuilder();
                mensaje.append("Elija una opcion para continuar").append("\n");
                mensaje.append("1. Registro de dipositivo").append("\n");
                mensaje.append("2. Eliminar dispositivo").append("\n");
                mensaje.append("3. Mostrar dispositivos").append("\n");
                mensaje.append("4. Salir al menu de dispositivos").append("\n");
                opt = (Integer.parseInt(v.menu(mensaje)));
            
                switch (opt) {
                    case 1:
                        tablets_reg reg=new tablets_reg();
                        reg.registro_tab(tabletas);
                        break;
                    
                    case 2:
                        tablets_del del=new tablets_del();
                        del.eliminacion(tabletas);
                        break;
                
                    case 3:
                        tablets_view view=new tablets_view();
                        view.mostar(tabletas);
                        break;

                    case 4:
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
