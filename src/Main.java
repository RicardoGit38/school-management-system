public class Main {
    public static void main(String[] args) {
      GestorAlumnos sistema = new GestorAlumnos();

        // 1. Agregamos datos de prueba
        sistema.agregarAlumno(new Alumno("Juan", "Perez", "A001", 20));
        sistema.agregarAlumno(new Alumno("Maria", "Gomez", "A002", 22));
        sistema.agregarAlumno(new Alumno("Carlos", "Ruiz", "A003", 19));

        // 2. Mostramos todos (Deberían salir 3)
        System.out.println("--- ANTES DE ELIMINAR ---");
        sistema.listarAlumnos();

        // 3. ¡ELIMINAMOS A JUAN! (Usando su código A001)
        sistema.eliminarAlumno("A001");

        // 4. Mostramos de nuevo para confirmar (Deberían quedar 2)
        System.out.println("\n--- DESPUÉS DE ELIMINAR ---");
        sistema.listarAlumnos();


    }
}
