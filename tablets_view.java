import java.util.LinkedList;

import javax.swing.JOptionPane;

public class tablets_view {
    public void mostar(LinkedList<tableta> tabletas){
        validaciones v=new validaciones();
        
        if(tabletas.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de tabletas está vacía.");

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
                            tableta tbt=null;
                            try {
                                for (tableta e: tabletas){
                                    if(e.getSerial().equals(cs)){
                                        tbt=e;
                                    } 
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "El valor ingresado no es valido.");
                                return;
                            }
                            StringBuilder mensaje = new StringBuilder();
                            if (tbt!=null){
                                mensaje.append("Serial: ").append(tbt.getSerial()).append("\n");
                                mensaje.append("Marca: ").append(tbt.getMarca()).append("\n");
                                mensaje.append("Tamaño: ").append(tbt.getTamaño()).append("\n");
                                mensaje.append("Precio: ").append(tbt.getPrecio()).append("\n");
                                mensaje.append("Almacenamiento: ").append(tbt.getAlmacenamiento()).append("\n");
                                mensaje.append("Peso: ").append(tbt.getPeso()).append("\n");
                                mensaje.append("Estado: ").append(tbt.getEstado()).append("\n");
                                mensaje.append("\n");
                                JOptionPane.showMessageDialog(null, mensaje.toString(), "Dispositivo encontrado", JOptionPane.INFORMATION_MESSAGE);

                            } else if (tbt==null) {
                                mensaje.append("Prestamo no encontrado, favor valide:");
                                JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de dispositivos", JOptionPane.INFORMATION_MESSAGE);
                            }


                        break;

                        case 2:
                        StringBuilder mensaje3 = new StringBuilder();
                        for (tableta t: tabletas){
                            mensaje3.append("Serial: ").append(t.getSerial()).append("\n");
                            mensaje3.append("Marca: ").append(t.getMarca()).append("\n");
                            mensaje3.append("Tamaño: ").append(t.getTamaño()).append("\n");
                            mensaje3.append("Precio: ").append(t.getPrecio()).append("\n");
                            mensaje3.append("Almacenamiento: ").append(t.getAlmacenamiento()).append("\n");
                            mensaje3.append("Peso: ").append(t.getPeso()).append("\n");
                            mensaje3.append("Estado: ").append(t.getEstado()).append("\n");
                            mensaje3.append("\n");
                        }
                        JOptionPane.showMessageDialog(null, mensaje3.toString(), "Lista de prestamos", JOptionPane.INFORMATION_MESSAGE);

                        break;

                    case 3:
                        exportar_tabletas tb= new exportar_tabletas();
                        tb.exportarTabletas(tabletas);

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
