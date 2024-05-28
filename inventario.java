import java.util.LinkedList;

import javax.swing.JOptionPane;

public class inventario {
    public void mostar_inv(LinkedList<portatil> portatiles, LinkedList<tableta> tabletas){
        StringBuilder mensaje1 = new StringBuilder();
        StringBuilder mensaje2 = new StringBuilder();
        StringBuilder mensaje3 = new StringBuilder();
        StringBuilder mensaje4 = new StringBuilder();

        if(portatiles.isEmpty() && tabletas.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay dispositivos");

        } else if(!portatiles.isEmpty() && tabletas.isEmpty()){
            for (portatil port: portatiles){
                mensaje1.append("Serial: ").append(port.getSerial()).append("\n");
                mensaje1.append("Marca: ").append(port.getMarca()).append("\n");
                mensaje1.append("Tamaño: ").append(port.getTamaño()).append("\n");
                mensaje1.append("Precio: ").append(port.getPrecio()).append("\n");
                mensaje1.append("Sistema: ").append(port.getSistema()).append("\n");
                mensaje1.append("Procesador: ").append(port.getProcesador()).append("\n");
                mensaje1.append("Estado: ").append(port.getEstado()).append("\n");
                mensaje1.append("\n");
                JOptionPane.showMessageDialog(null, mensaje1.toString(), "Lista de portatiles", JOptionPane.INFORMATION_MESSAGE);
            }         
        } else if(portatiles.isEmpty() && !tabletas.isEmpty()){
            for (tableta tbt: tabletas){
                mensaje2.append("Serial: ").append(tbt.getSerial()).append("\n");
                mensaje2.append("Marca: ").append(tbt.getMarca()).append("\n");
                mensaje2.append("Tamaño: ").append(tbt.getTamaño()).append("\n");
                mensaje2.append("Precio: ").append(tbt.getPrecio()).append("\n");
                mensaje2.append("Almacenamiento: ").append(tbt.getAlmacenamiento()).append("\n");
                mensaje2.append("Peso: ").append(tbt.getPeso()).append("\n");
                mensaje2.append("Estado: ").append(tbt.getEstado()).append("\n");
                mensaje2.append("\n");
                JOptionPane.showMessageDialog(null, mensaje2.toString(), "Lista de tabletas", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (!portatiles.isEmpty() && !tabletas.isEmpty()) {
            for (portatil port: portatiles){
                mensaje3.append("Serial: ").append(port.getSerial()).append("\n");
                mensaje3.append("Marca: ").append(port.getMarca()).append("\n");
                mensaje3.append("Tamaño: ").append(port.getTamaño()).append("\n");
                mensaje3.append("Precio: ").append(port.getPrecio()).append("\n");
                mensaje3.append("Sistema: ").append(port.getSistema()).append("\n");
                mensaje3.append("Procesador: ").append(port.getProcesador()).append("\n");
                mensaje3.append("Estado: ").append(port.getEstado()).append("\n");
                mensaje3.append("\n");
                JOptionPane.showMessageDialog(null, mensaje3.toString(), "Lista de portatiles", JOptionPane.INFORMATION_MESSAGE);
            }

            for (tableta tbt: tabletas){
                mensaje4.append("Serial: ").append(tbt.getSerial()).append("\n");
                mensaje4.append("Marca: ").append(tbt.getMarca()).append("\n");
                mensaje4.append("Tamaño: ").append(tbt.getTamaño()).append("\n");
                mensaje4.append("Precio: ").append(tbt.getPrecio()).append("\n");
                mensaje4.append("Almacenamiento: ").append(tbt.getAlmacenamiento()).append("\n");
                mensaje4.append("Peso: ").append(tbt.getPeso()).append("\n");
                mensaje4.append("Estado: ").append(tbt.getEstado()).append("\n");
                mensaje4.append("\n");
                JOptionPane.showMessageDialog(null, mensaje4.toString(), "Lista de tabletas", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
