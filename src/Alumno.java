public class Alumno {
    String nombre;
    String apellido;
    String codigo;
    int edad;

    //constructor
    public Alumno(String nombre, String apellido, String codigo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.edad = edad;
    }
    // metodo para mostrar informacion del alumno
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigo='" + codigo + '\'' +
                ", edad=" + edad +
                '}';
    }

}