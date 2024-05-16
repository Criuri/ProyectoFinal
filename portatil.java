public class portatil {
    private String Serial;
    private String Marca;
    private float Tamaño;
    private float Precio;
    private String Sistema;
    private String Procesador;
    public portatil (String serial ,String marca, float tamaño,float precio, String sistema, String procesador) {

        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        Sistema = sistema;
        Procesador = procesador;

    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public float getTamaño() {
        return Tamaño;
    }
    public void setTamaño(float tamaño) {
        Tamaño = tamaño;
    }
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float precio) {
        Precio = precio;
    }
    public String getSistema() {
        return Sistema;
    }
    public void setSistema(String sistema) {
        Sistema = sistema;
    }
    public String getProcesador() {
        return Procesador;
    }
    public void setProcesador(String procesador) {
        Procesador = procesador;
    }
}
