import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class importar_ing {
    public LinkedList<estudiante_ing> importarIngenieros(String Archivo,LinkedList<estudiante_ing> prestamos) {
        try {
            BufferedReader importar = new BufferedReader(new FileReader(Archivo));
            String Linea= "";
            while ((Linea = importar.readLine()) != null) {
                String[] Lineas = Linea.split(":");
                String Atributo = Lineas[0].toLowerCase().trim();
                String valor = Lineas[1];
                switch (Atributo) {
                    case "cedula":
                        String cedula = valor.trim();
                        String nombre = importar.readLine().split(":")[1].trim();
                        String apellido = importar.readLine().split(":")[1].trim();
                        String telefono = importar.readLine().split(":")[1].trim();
                        int semestre = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        float promedio = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        String serial = importar.readLine().split(":")[1].trim();
                        estudiante_ing est = new estudiante_ing(cedula,nombre,apellido,telefono,semestre,promedio,serial);
                        prestamos.add(est);
                        // Leer la línea en blanco entre empleados
                        importar.readLine();
                        break;

                    default:
                        break;
                }
            }
            importar.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Se importo con exito.");
        return prestamos;
    }
}
