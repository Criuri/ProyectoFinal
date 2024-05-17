import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ingeniero {
    public void menu(){
        LinkedList<estudiante_ing> prestamos = new LinkedList<>();

        boolean entrada = true;
        while (entrada){
            int opt=0;
            StringBuilder mensaje = new StringBuilder();
                mensaje.append("Bienvenido estudiante de ingenieria, elija una opcion para continuar").append("\n");
                mensaje.append("1. Registro de prestamo").append("\n");
                mensaje.append("2. Modificar registro de prestamo").append("\n");
                mensaje.append("3. Devolucion de dispositivo").append("\n");
                mensaje.append("4. Mostrar registros de prestamo").append("\n");
                mensaje.append("5. Salir al menu inicial").append("\n");
                opt = (Integer.parseInt(JOptionPane.showInputDialog(null, mensaje.toString())));
            
                switch (opt) {
                    case 1:
                        registro_ing r= new registro_ing();
                        r.registro(prestamos);
                        break;
                    
                    case 2:
                        modificar_ing mod = new modificar_ing();
                        mod.modificar(prestamos);
                        break;
                
                    case 3:
                        devolucion_ing d= new devolucion_ing();
                        d.devolucion(prestamos);
                        break;

                    case 4:
                        mostrar_ing m=new mostrar_ing();
                        m.mostrarPrestamos(prestamos);
                        break;
                    
                    case 5:
                    entrada = false;
                    break;
                    
                    default:
                        System.out.println("Opcion no valida, porfavor valide");
                        break;
                }
        }
    }
}

