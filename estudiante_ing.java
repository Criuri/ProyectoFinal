public class estudiante_ing{
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int Semestre;
    private float Promedio;
    private String Serial;
    public estudiante_ing(String cedula ,String nombre, String apellido,String telefono, int semestre, float promedio, String serial) {

        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Semestre = semestre;
        Promedio = promedio;
        Serial = serial;

    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public int getSemestre() {
        return Semestre;
    }
    public void setSemestre(int semestre) {
        Semestre = semestre;
    }
    public float getPromedio() {
        return Promedio;
    }
    public void setPromedio(float promedio) {
        Promedio = promedio;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
}
