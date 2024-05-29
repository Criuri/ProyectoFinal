import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class exportar_tabletas {
    @SuppressWarnings("static-access")
    public void exportarTabletas(LinkedList<tableta> tabletas)
    {
        JOptionPane jo = new JOptionPane();
        try {
            File archivo = new File("inventario tabletas.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for (tableta tbt : tabletas) {
                exportar.write("serial" + " : " + tbt.getSerial() + "\n");
                exportar.write("marca" + " : " + tbt.getMarca()+ "\n");
                exportar.write("tamaño" + " : " + tbt.getTamaño()+"\n");
                exportar.write("precio" + " : " + tbt.getPrecio()+ "\n");
                exportar.write("almacenamiento" +" : " + tbt.getAlmacenamiento()+"\n");
                exportar.write("peso" +" : " + tbt.getPeso()+"\n");
                exportar.write("estado" +" : " + tbt.getEstado()+"\n");
                exportar.write("\n");
            }
            exportar.close();
            jo.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            jo.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }
}
