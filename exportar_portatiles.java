import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class exportar_portatiles {
    @SuppressWarnings("static-access")
    public void exportarPortatiles(LinkedList<portatil> portatiles)
    {
        JOptionPane jo = new JOptionPane();
        try {
            File archivo = new File("inventario tableta.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for (portatil port : portatiles) {
                exportar.write("serial" + " : " + port.getSerial() + "\n");
                exportar.write("marca" + " : " + port.getMarca()+ "\n");
                exportar.write("tamaño" + " : " + port.getTamaño()+"\n");
                exportar.write("precio" + " : " + port.getPrecio()+ "\n");
                exportar.write("sistema" +" : " + port.getSistema()+"\n");
                exportar.write("procesador" +" : " + port.getProcesador()+"\n");
                exportar.write("estado" +" : " + port.getEstado()+"\n");
                exportar.write("\n");
            }
            exportar.close();
            jo.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            jo.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }
}
