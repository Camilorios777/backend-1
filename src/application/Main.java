package application;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // 2. Definición de constantes [cite: 37, 39]
    final static int CURRENT_YEAR = 2026;

    public static void main(String[] args) {

        // Mensaje de saludo [cite: 38]
        final String GREETING_MESSAGE = "Welcome to the Java student system";

        // 3. Arreglo de estudiantes y años de nacimiento [cite: 40, 41, 42]
        String[] namesStudents = {"Laura", "Pablo", "Maria", "Juan", "Ana"};
        int[] birthYears = {2000, 2004, 2008, 1991, 1997};

        // 4. Lista de edades (usando Integer para la lista) [cite: 43, 44]
        List<Integer> agesStudentList = new ArrayList<>();

        // 5. Implementación de lógica [cite: 47]
        showMessage(GREETING_MESSAGE);

        // Llenar la lista de edades [cite: 55, 56]
        fillAgesList(agesStudentList, birthYears);

        // Listar estudiantes [cite: 57, 58]
        listStudents(namesStudents, agesStudentList);
    }

    // --- MÉTODOS ---

    // Muestra mensajes en pantalla [cite: 49, 50, 51]
    static void showMessage(String message) {
        System.out.println(message);
    }

    // Retorna la edad calculada [cite: 52, 53, 54]
    static int calculateAge(int birthYear) {
        return CURRENT_YEAR - birthYear;
    }

    // Método para llenar la lista calculando edades [cite: 55, 56]
    static void fillAgesList(List<Integer> agesList, int[] birthYears) {
        for (int year : birthYears) {
            agesList.add(calculateAge(year));
        }
    }

    // Método para mostrar el resultado final [cite: 57, 58]
    static void listStudents(String[] names, List<Integer> ages) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Student: " + names[i] + " - Age: " + ages.get(i));
        }
    }
}