import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
    private int num1, num2, num3;

    public Numeros(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getnum1() {
        return num1;
    }

    public int getnum2() {
        return num2;
    }

    public int getnum3() {
        return num3;
    }


    public void Calculadora (int numero){

                Scanner scanner = new Scanner(System.in);

                System.out.println("Ingrese el primer número:");
                double num1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                double num2 = scanner.nextDouble();

                System.out.println("Ingrese el operador (+, -, *, /):");
                char operador = scanner.next().charAt(0);

                double resultado = 0;
                boolean operacionValida = true;

                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 *= num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Error: División por cero no es permitida.");
                            operacionValida = false;
                        }
                        break;
                    default:
                        System.out.println("Operador no válido.");
                        operacionValida = false;
                        break;
                }

                if (operacionValida) {
                    System.out.println("El resultado es: " + resultado);
                }

                scanner.close();
            }


class Catedratico {
    private String nombre;
    private String apellido;
    private String nota;
    private int numero;

    public Catedratico(int numero, String nombre1, String apellido, String clase) {
        this.nombre = nombre1;
        this.apellido = apellido;
        this.nota = clase;
        this.numero = numero;
    }

    public String getNombre1() {
        return nombre;
    }

    public String getEdad() {
        return apellido;
    }

    public String getClase() {
        return nota;
    }
    
}

static class Alumno {
    private String nombre;
    private int edad;
    private String nota;

    public Alumno(String nombre, int edad, String nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota='" + nota + '\'' +
                '}';
    }
}

static class ListaAlumnos {
    private static ArrayList<Alumno> alumnos;
    public Numeros.ListaAlumnos ListaAlumnos;

    public ListaAlumnos() {
        alumnos = new ArrayList<>();
    }

    public static void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public static void mostrarListaAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
}





