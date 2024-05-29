import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class exportar_dis {
    @SuppressWarnings("static-access")
    public void exportarDiseñador(LinkedList<estudiante_dis> prestamos_dis)
    {
        JOptionPane jo = new JOptionPane();
        try {
            File archivo = new File("prestamos diseño.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for (estudiante_dis dis : prestamos_dis) {
                exportar.write("cedula" + " : " + dis.getCedula() + "\n");
                exportar.write("nombre" + " : " + dis.getNombre()+ "\n");
                exportar.write("apellido" + " : " + dis.getApellido()+"\n");
                exportar.write("telefono" + " : " + dis.getTelefono()+ "\n");
                exportar.write("modalidad" +" : " + dis.getModalidad()+"\n");
                exportar.write("asignaturas" +" : " + dis.getAsignaturas()+"\n");
                exportar.write("serial" +" : " + dis.getSerial()+"\n");
                exportar.write("\n");

            }
            exportar.close();
            jo.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            jo.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }
}
