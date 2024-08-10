package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Clase Persona con atributos nombre y apellido
public class Persona {

  // Atributos
  private String nombre;
  private String apellido;

  // Constructor
  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  // Método toString para imprimir los objetos Persona
  @Override
  public String toString() {
    return nombre + " " + apellido;
  }

  public static void main(String[] args) {

    // Creación de 5 objetos Persona con nombres y apellidos en español
    Persona p1 = new Persona("Juan", "Gómez");
    Persona p2 = new Persona("María", "López");
    Persona p3 = new Persona("Carlos", "Martínez");
    Persona p4 = new Persona("Ana", "Fernández");
    Persona p5 = new Persona("Luis", "Rodríguez");

    // Lista para almacenar los objetos Persona
    List<Persona> personas = new ArrayList<>();
    personas.add(p1);
    personas.add(p2);
    personas.add(p3);
    personas.add(p4);
    personas.add(p5);

    // Ordenar y mostrar la lista por nombre
    // Aquí utilizamos Collections.sort con un Comparator que compara los nombres de
    // las personas.
    // El Comparator.comparing(Persona::getNombre) se usa para generar un comparador
    // que ordena
    // los objetos Persona en función del nombre (atributo nombre).
    Collections.sort(personas, Comparator.comparing(Persona::getNombre));
    System.out.println("Ordenado por nombre:");
    for (Persona persona : personas) {
      System.out.println(persona);
    }

    // Ordenar y mostrar la lista por apellido
    // Ahora utilizamos el método sort de la lista, que es una alternativa directa a
    // Collections.sort.
    // Este también utiliza un Comparator para ordenar los objetos Persona según el
    // apellido.
    personas.sort(Comparator.comparing(Persona::getApellido));
    System.out.println("\nOrdenado por apellido:");
    for (Persona persona : personas) {
      System.out.println(persona);
    }

    // Ordenar y mostrar la lista inversamente por apellido
    // Aquí utilizamos nuestro propio método bubbleSort que ordena la lista en
    // función del apellido
    // de manera descendente. Este método es un ejemplo de implementación manual de
    // un algoritmo de
    // ordenamiento (Bubble Sort).
    bubbleSort(personas, "apellido", false);
    System.out.println("\nOrdenado por apellido (descendente):");
    for (Persona persona : personas) {
      System.out.println(persona);
    }
  }

  // Método Bubble Sort generalizado
  // Este método implementa el algoritmo de Bubble Sort y recibe tres parámetros:
  // - list: la lista de objetos Persona a ordenar.
  // - attribute: el atributo por el cual se ordenará ("nombre" o "apellido").
  // - ascending: booleano que indica si el ordenamiento será ascendente (true) o
  // descendente (false).
  public static void bubbleSort(List<Persona> list, String attribute, boolean ascending) {
    int n = list.size();
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        boolean swap = false;

        // Comparamos según el atributo especificado (nombre o apellido)
        if (attribute.equalsIgnoreCase("nombre")) {
          // Comparación por nombre
          if (ascending) {
            // Si el orden es ascendente, intercambiamos si el nombre actual es mayor que el
            // siguiente
            if (list.get(j).getNombre().compareTo(list.get(j + 1).getNombre()) > 0) {
              swap = true;
            }
          } else {
            // Si el orden es descendente, intercambiamos si el nombre actual es menor que
            // el siguiente
            if (list.get(j).getNombre().compareTo(list.get(j + 1).getNombre()) < 0) {
              swap = true;
            }
          }
        } else if (attribute.equalsIgnoreCase("apellido")) {
          // Comparación por apellido
          if (ascending) {
            // Si el orden es ascendente, intercambiamos si el apellido actual es mayor que
            // el siguiente
            if (list.get(j).getApellido().compareTo(list.get(j + 1).getApellido()) > 0) {
              swap = true;
            }
          } else {
            // Si el orden es descendente, intercambiamos si el apellido actual es menor que
            // el siguiente
            if (list.get(j).getApellido().compareTo(list.get(j + 1).getApellido()) < 0) {
              swap = true;
            }
          }
        }

        // Intercambiamos los elementos si es necesario
        if (swap) {
          Persona temp = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, temp);
        }
      }
    }
  }
}
