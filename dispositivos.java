import java.util.LinkedList;

import javax.swing.JOptionPane;

public class dispositivos {
    public void dispo_menu(){
        validaciones v=new validaciones();
        LinkedList<tableta> tabletas = new LinkedList<>();
        LinkedList<portatil> portatiles = new LinkedList<>();

        boolean entrada = true;
        while (entrada){
            StringBuilder mensaje = new StringBuilder();
            int opt=0;
                mensaje.append("Bienvenido , elija una opcion para continuar").append("\n");
                mensaje.append("1. Portatiles").append("\n");
                mensaje.append("2. Tabletas").append("\n");
                mensaje.append("3. Inventario").append("\n");
                mensaje.append("4. Salir al menu inicial").append("\n");
                opt = (Integer.parseInt(v.menu(mensaje)));
            
                switch (opt) {
                    case 1:
                        port_menu pot=new port_menu();
                        pot.menuport(portatiles);
                        break;
                    
                    case 2:
                        tbt_menu tm=new tbt_menu();
                        tm.menutb(tabletas);
                        break;
                
                    case 3:
                        inventario inv=new inventario();
                        inv.mostar_inv(portatiles, tabletas);
                        break;

                    case 4:
                    entrada = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }
        return;
    }
}
