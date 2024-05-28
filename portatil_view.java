import java.util.LinkedList;

import javax.swing.JOptionPane;

public class portatil_view {
    public void mostar(LinkedList<portatil> portatiles){
        StringBuilder mensaje = new StringBuilder();
        if(portatiles.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de portatiles está vacía.");

        } else {
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
    }
    }
}
