import java.util.LinkedList;

import javax.swing.JOptionPane;

public class portatil_view {
    public void mostar(LinkedList<portatil> portatiles){
        validaciones v=new validaciones();
        if(portatiles.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de portatiles está vacía.");

        } else {

            boolean entrada = true;
            while (entrada){
                int opt=0;
                StringBuilder mensaje2 = new StringBuilder();
                    mensaje2.append("Elija una opcion para proceder").append("\n");
                    mensaje2.append("1. Buscar una tableta en especifico").append("\n");
                    mensaje2.append("2. Mostrar todo el inventario de tabletas registradas").append("\n");
                    mensaje2.append("3. Exportar el inventario de tabletas").append("\n");
                    mensaje2.append("4. regresar al menu").append("\n");
                    opt = (Integer.parseInt(v.opt(mensaje2)));
                
                    switch (opt) {
                        case 1:

                        String cs = JOptionPane.showInputDialog("Para buscar la información de un dispositivo en concreto, ingrese el serial del dispositivo:");
                        portatil port=null;
                        try {
                            for (portatil e: portatiles){
                                if(e.getSerial().equals(cs)){
                                    port=e;
                                } 
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido.");
                            return;
                        }
                        StringBuilder mensaje = new StringBuilder();
                        if (port!=null){
                            
                            mensaje.append("Serial: ").append(port.getSerial()).append("\n");
                            mensaje.append("Marca: ").append(port.getMarca()).append("\n");
                            mensaje.append("Tamaño: ").append(port.getTamaño()).append("\n");
                            mensaje.append("Precio: ").append(port.getPrecio()).append("\n");
                            mensaje.append("Sistema: ").append(port.getSistema()).append("\n");
                            mensaje.append("Procesador: ").append(port.getProcesador()).append("\n");
                            mensaje.append("Estado: ").append(port.getEstado()).append("\n");
                            mensaje.append("\n");
                            JOptionPane.showMessageDialog(null, mensaje.toString(), "Equiopo encontrado", JOptionPane.INFORMATION_MESSAGE);
                
                        } else if (port==null) {
                            mensaje.append("Prestamo no encontrado, favor valide:");
                            JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de equipos", JOptionPane.INFORMATION_MESSAGE);
                        }

                        case 2:

                        StringBuilder mensaje3 = new StringBuilder();
                        for (portatil p: portatiles){
                            mensaje3.append("Serial: ").append(p.getSerial()).append("\n");
                            mensaje3.append("Marca: ").append(p.getMarca()).append("\n");
                            mensaje3.append("Tamaño: ").append(p.getTamaño()).append("\n");
                            mensaje3.append("Precio: ").append(p.getPrecio()).append("\n");
                            mensaje3.append("Siatema ").append(p.getSistema()).append("\n");
                            mensaje3.append("Procesador ").append(p.getProcesador()).append("\n");
                            mensaje3.append("Estado: ").append(p.getEstado()).append("\n");
                            mensaje3.append("\n");
                        }
                        JOptionPane.showMessageDialog(null, mensaje3.toString(), "Lista de prestamos", JOptionPane.INFORMATION_MESSAGE);

                        break;

                    case 3:
                        exportar_portatiles ex= new exportar_portatiles();
                        ex.exportarPortatiles(portatiles);

                        break;

                    case 4:

                        entrada = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "el valor ingresado es invalido, favor valide");
                        break;
                }
        }
    }
    }
}
