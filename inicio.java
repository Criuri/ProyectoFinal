

import javax.swing.JOptionPane;

public class inicio {
    public static void main(String[] args) {
        


        boolean entrada = true;
        while (entrada){
            int opt=0;
            StringBuilder mensaje = new StringBuilder();
                mensaje.append("Bienvenido, seleccione una opcion para continuar").append("\n");
                mensaje.append("1. Estudiante de ingenieria").append("\n");
                mensaje.append("2. Estudiante de diseño").append("\n");
                mensaje.append("3. Inventario total").append("\n");
                mensaje.append("4. Salir").append("\n");
                opt = (Integer.parseInt(JOptionPane.showInputDialog(null, mensaje.toString())));
            
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
                        
                        break;

                    case 4:
                        System.out.println("Hasta luego.");
                        entrada = false;
                        break;
                    default:
                        System.out.println("Opcion no valida, porfavor valide");
                        break;
                }
        }
    }
}