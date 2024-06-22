import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("1. Calculadora");
        System.out.println("2. Catedratico");
        System.out.println("3. Estudiante");

int opcion = scanner.nextInt();

Numeros numeros = new Numeros(0, 0, 0);

switch (opcion) {
    case 1:
        int num1 = 0;
        numeros.Calculadora(num1);
        break;
    case 2:
        System.out.println("Ingrese el nombre del catedratico");
        String nombre1 = scanner.next();
        System.out.println("Ingrese la edad del catedratico:");
        String apellido = scanner.next();
        System.out.println("Ingrese la clase que da el catedratico:");
        String clase = scanner.next();
        break;
        
    case 3:
        Numeros.ListaAlumnos listaAlumnos = new Numeros.ListaAlumnos();
        new Scanner(System.in);
        Numeros.ListaAlumnos Numeros = new Numeros.ListaAlumnos();
        while (true) {
            System.out.println("Ingrese el nombre del alumno (o 'salir' para terminar):");
            String nombre = scanner.next();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingrese la edad del alumno:");
            int edad = Integer.parseInt(scanner.next());

            System.out.println("Ingrese la nota del alumno:");
            String nota = scanner.next();

            Numeros.Alumno alumno = new Numeros.Alumno(nombre, edad, nota);
            Numeros.ListaAlumnos.agregarAlumno(alumno);
        }

        // Mostrar la lista de alumnos
        System.out.println("Lista de alumnos:");
        Numeros.ListaAlumnos.mostrarListaAlumnos();
        scanner.close();

        break;
}
    }
}