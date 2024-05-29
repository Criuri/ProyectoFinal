import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class importar_dis {
    public LinkedList<estudiante_dis> importarDiseñadores(String Archivo,LinkedList<estudiante_dis> prestamos_dis) {
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
                        String modalidad = importar.readLine().split(":")[1].trim();
                        int asignaturas = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        int serial = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        estudiante_dis est = new estudiante_dis(cedula,nombre,apellido,telefono,modalidad,asignaturas,serial);
                        prestamos_dis.add(est);
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
        return prestamos_dis;
    }
}
