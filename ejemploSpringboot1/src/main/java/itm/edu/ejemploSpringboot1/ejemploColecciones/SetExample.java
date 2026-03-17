package itm.edu.ejemploSpringboot1.ejemploColecciones;

import org.springframework.core.metrics.StartupStep;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicado no permitido

        System.out.println(fruits);
        boolean exists = fruits.contains("Apple"); // Acceso rapido para saber si existen

        // Crear un linkedHashSet
        LinkedHashSet<String> fruitsLinkedSet = new LinkedHashSet<>();

        // Agregar elementos
        fruitsLinkedSet.add("Apple");
        fruitsLinkedSet.add("Banana");
        fruitsLinkedSet.add("Orange");
        fruitsLinkedSet.add("Mango");
        fruitsLinkedSet.add("Banana"); // Duplicado no permitido

        // Imprimir el LinkedHashSet
        System.out.println("Fruits in linkedHashSet: " + fruitsLinkedSet);

        // Verificar si un elemento existe
        boolean hasApple = fruitsLinkedSet.contains("Apple");
        System.out.println("Contains Apple? " + hasApple); // Salida: true

        // Eliminar un elemento
        fruitsLinkedSet.remove("Orange");
        System.out.println("After removing Orange: " + fruitsLinkedSet); // Salida: [Apple, Banana, Mango]

        // Iterar sobre el LinkedHashSet
        System.out.println("Fruits in insertion order:");
        for (String fruit : fruitsLinkedSet) {
            System.out.println(fruit);
        }

    }
}
