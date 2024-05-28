

import javax.swing.JOptionPane;

public class inicio {
    public static void main(String[] args) {
        validaciones v=new validaciones();
        boolean entrada = true;
        while (entrada){
            int opt=0;
            StringBuilder mensaje = new StringBuilder();
                mensaje.append("Bienvenido, seleccione una opcion para continuar").append("\n");
                mensaje.append("1. Estudiante de ingenieria").append("\n");
                mensaje.append("2. Estudiante de diseño").append("\n");
                mensaje.append("3. Dispositivos").append("\n");
                mensaje.append("4. Salir").append("\n");
                opt = (Integer.parseInt(v.menu(mensaje)));
            
                switch (opt) {
                    case 1:
                        ingeniero menu =new ingeniero();
                        menu.menu();
                        break;
                    
                    case 2:
                        diseñador menud=new diseñador();
                        menud.menu_dis();
                        break;
                
                    case 3:
                        dispositivos dis=new dispositivos();
                        dis.dispo_menu();
                        break;

                    case 4:
                    JOptionPane.showMessageDialog(null, "Hasta Pronto.");
                        entrada = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }
    }
}