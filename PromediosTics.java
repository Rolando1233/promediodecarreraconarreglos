import java.util.Scanner;

public class PromediosTics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recibe en un arreglo el promedio de cada alumno en un grupo
        System.out.print("Ingrese el número de grupos: ");
        int numGrupos = sc.nextInt();
        double[] promediosGrupos = new double[numGrupos];

        for (int i = 0; i < numGrupos; i++) {
            System.out.print("Ingrese la cantidad de alumnos en el grupo " + (i + 1) + ": ");
            int numAlumnos = sc.nextInt();
            double[] promediosAlumnos = new double[numAlumnos];

            for (int j = 0; j < numAlumnos; j++) {
                System.out.print("Ingrese el promedio del alumno  " + ( j + 1 ) + ":" );
                promediosAlumnos[j] = sc.nextDouble();
            }

            // Obtiene el promedio por grupo
            double promedioGrupo = calcularPromedio(promediosAlumnos);
            promediosGrupos[i] = promedioGrupo;
        }

        // Del arreglo "grupos", obtener el promedio general
        double promedioGeneral = calcularPromedio(promediosGrupos);

        // Imprimir arreglos de promedios de grupo
        System.out.println("Promedios de grupos:");
        for (int i = 0; i < numGrupos; i++) {
            System.out.println("Grupo " + (i + 1) + ": " + promediosGrupos[i]);
        }

        System.out.println("Promedio General de la Carrera de TICS: " + promedioGeneral);
    }

    // Función para calcular el promedio de un arreglo de números
    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
}