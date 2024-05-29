import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class importar_portatil {
    public LinkedList<portatil> importarPortatil(String Archivo,LinkedList<portatil> portatiles) {
        try {
            BufferedReader importar = new BufferedReader(new FileReader(Archivo));
            String Linea= "";
            while ((Linea = importar.readLine()) != null) {
                String[] Lineas = Linea.split(":");
                String Atributo = Lineas[0].toLowerCase().trim();
                String valor = Lineas[1];
                switch (Atributo) {
                    case "serial":
                        String serial = valor.trim();
                        String marca = importar.readLine().split(":")[1].trim();
                        float tamaño = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        float precio = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        String sistema = importar.readLine().split(":")[1].trim();
                        String procesador = importar.readLine().split(":")[1].trim();
                        int estado = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        portatil port = new portatil(serial,marca,tamaño,precio,sistema,procesador,estado);
                        portatiles.add(port);
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
        return portatiles;
    }
}
