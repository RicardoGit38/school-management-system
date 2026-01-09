public class Main {
    public static void main(String[] args) {

     GestorAlumnos sistema = new GestorAlumnos();

        // 1. CREAR (Datos con errores a propósito)
        System.out.println("--- 1. INGRESANDO ---");
        sistema.agregarAlumno(new Alumno("Juan", "Perez", "A001", 20));
        sistema.listarAlumnos();

        // 2. ACTUALIZAR TODO
        // Vamos a corregir a Juan (A001):
        // Nombre: Juan -> Juan Carlos
        // Apellido: Perez -> Gomez
        // Edad: 20 -> 21
        System.out.println("\n--- 2. CORRIGIENDO DATOS ---");
        sistema.editarAlumno("A001", "Juan Carlos", "Gomez", 21);

        // 3. VER RESULTADO FINAL
        System.out.println("\n--- 3. LISTA DEFINITIVA ---");
        sistema.listarAlumnos();

    }
}
