public class Visitante {
    private String nombre;
    private String Cedula;
    private int edad;

    public Visitante() {
        setEdad(0);
        setNombre("");
        setCedula("");
    }

    public Visitante(String nombre, int edad, String cedula) {
        setEdad(edad);
        setNombre(nombre);
        setCedula(cedula);
    }

    public String getNombre() {
        return nombre;
    }   

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        this.Cedula = cedula;
    }
}