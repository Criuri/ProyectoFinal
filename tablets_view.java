import java.util.LinkedList;

import javax.swing.JOptionPane;

public class tablets_view {
    public void mostar(LinkedList<tableta> tabletas){
        StringBuilder mensaje = new StringBuilder();
        if(tabletas.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de tabletas está vacía.");

        } else {
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
    }
    }
}
