import java.util.ArrayList;

public class GestorAlumnos {
    // Aquí se implementarán los métodos para gestionar los alumnos
    //1. esta es nuestra base de datos en memoria
    private ArrayList<Alumno> listaAlumnos;
    //2. constructor
    public GestorAlumnos() {
        this.listaAlumnos = new ArrayList<>();
    }

    //METODOS CRUD
    //Crear METE UN ALUMNO A LA BOLSA
    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
        System.out.println("Alumno agregado: " + alumno.nombre);
    }
    //Leer (list) MUESTRA TODOS LOS ALUMNOS
    public void listarAlumnos() {
        System.out.println("Lista de Alumnos:");
        for (Alumno a : listaAlumnos) {
            System.out.println(a);
        }
    }
    //eliminar alumno por codigo
    public void eliminarAlumno(String codigo) {
        listaAlumnos.removeIf(a -> a.codigo.equals(codigo));
        System.out.println("Alumno con codigo " + codigo + " eliminado.");
    }

    //nuevo metodo actualizar alumno
    //recibe el codigo del alumno a actualizar y los nuevos datos
    public void editarAlumno(String codigo, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
            boolean encontrado = false;
        for (Alumno a : listaAlumnos) {
            if (a.codigo.equals(codigo)) {
                a.nombre = nuevoNombre;
                a.apellido = nuevoApellido;
                a.edad = nuevaEdad;
                System.out.println("Datos actualizados correctamente para el código: " + codigo + " actualizado.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Alumno con codigo " + codigo + " no encontrado.");
        }
    }
}
