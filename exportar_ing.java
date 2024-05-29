import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class exportar_ing {
    @SuppressWarnings("static-access")
    public void exportarIngenieros(LinkedList<estudiante_ing> prestamos)
    {
        JOptionPane jo = new JOptionPane();
        try {
            File archivo = new File("prestamos ingenieria.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for (estudiante_ing ing : prestamos) {
                exportar.write("cedula" + " : " + ing.getCedula() + "\n");
                exportar.write("nombre" + " : " + ing.getNombre()+ "\n");
                exportar.write("apellido" + " : " + ing.getApellido()+"\n");
                exportar.write("telefono" + " : " + ing.getTelefono()+ "\n");
                exportar.write("semestre" +" : " + ing.getSemestre()+"\n");
                exportar.write("promedio" +" : " + ing.getPromedio()+"\n");
                exportar.write("serial" +" : " + ing.getSerial()+"\n");
                exportar.write("\n");
            }
            exportar.close();
            jo.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            jo.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }
}
