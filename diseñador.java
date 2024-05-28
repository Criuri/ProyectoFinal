import java.util.LinkedList;

import javax.swing.JOptionPane;

public class diseñador {
    public void menu_dis(){
        LinkedList<estudiante_dis> prestamos_dis = new LinkedList<>();
        validaciones v=new validaciones();
        boolean entrada = true;
        while (entrada){
            StringBuilder mensaje = new StringBuilder();
            int opt=0;
                mensaje.append("Bienvenido estudiante de Diseño, elija una opcion para continuar").append("\n");
                mensaje.append("1. Registro de prestamo").append("\n");
                mensaje.append("2. Modificar registro de prestamo").append("\n");
                mensaje.append("3. Devolucion de dispositivo").append("\n");
                mensaje.append("4. Mostrar registros de prestamo").append("\n");
                mensaje.append("5. Salir al menu inicial").append("\n");
                opt = (Integer.parseInt(v.menu(mensaje)));
            
                switch (opt) {
                    case 1:
                    registro_dis r = new registro_dis();
                        r.registro(prestamos_dis);
                        break;
                    
                    case 2:
                    modificar_dis m = new modificar_dis();
                    m.modificar(prestamos_dis);
                        break;
                
                    case 3:
                    devolucion_dis d= new devolucion_dis();
                    d.devolucion(prestamos_dis);
                        break;

                    case 4:
                    mostrar_dis mos=new mostrar_dis();
                    mos.mostrarPrestamos(prestamos_dis);

                        break;
                    
                    case 5:
                    entrada = false;
                    break;
                    
                    default:
                    JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }
    }
}
