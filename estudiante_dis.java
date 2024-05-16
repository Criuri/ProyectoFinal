public class estudiante_dis {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Modalidad;
    private int Asignaturas;
    private int Serial;
    public estudiante_dis (String cedula ,String nombre, String apellido,String telefono, String modalidad, int asignaturas, int serial) {

        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Modalidad = modalidad;
        Asignaturas = asignaturas;
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
    public String getModalidad() {
        return Modalidad;
    }
    public void setModalidad(String modalidad) {
        Modalidad = modalidad;
    }
    public int getAsignaturas() {
        return Asignaturas;
    }
    public void setAsignaturas(int asignaturas) {
        Asignaturas = asignaturas;
    }
    public int getSerial() {
        return Serial;
    }
    public void setSerial(int serial) {
        Serial = serial;
    }
    
}
