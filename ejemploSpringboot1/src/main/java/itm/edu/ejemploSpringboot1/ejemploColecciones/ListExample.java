package itm.edu.ejemploSpringboot1.ejemploColecciones;

import org.springframework.core.metrics.StartupStep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicaciones permitidas

        // Cambio git
        System.out.println(fruits); // Salida: [Apple, Banana, Apple]
        System.out.println(fruits.get(1)); // Acceso por indice: Banana

        ArrayList<String> fruitsArray = new ArrayList<>();
        fruitsArray.add("Apple");
        fruitsArray.add("Banana");
        fruitsArray.add("Orange");

        // Acceso por indice
        System.out.println("First fruit: " + fruitsArray.get(0));
        // Acceso a todos
        System.out.println(fruitsArray);

        // Insercion al final
        fruitsArray.add("Mango");

        // Eliminar el ultimo elemento
        fruitsArray.remove(fruitsArray.size() - 1);

        // Recorrer el array
        for (String fruit : fruitsArray){
            System.out.println(fruit);
        }

        //lista doblemente ligada

        // Crear una LinkedList
        LinkedList<String> fruitsListaLigada = new LinkedList<>();

        // Agregar elementos a la LinkedList
        fruitsListaLigada.add("Apple");
        fruitsListaLigada.add("Banana");
        fruitsListaLigada.add("Orange");
        fruitsListaLigada.add("Mango");

        // Imprimir la lista original
        System.out.println("Original LinkedList: " + fruitsListaLigada);

        // Agregar un elemento en una posición específica
        fruitsListaLigada.add(2, "Pineapple"); // Agrega "Pineapple" en la posición 2
        System.out.println("After adding Pineapple: " + fruitsListaLigada);

        // Eliminar un elemento
        fruitsListaLigada.remove("Banana"); // Elimina "Banana"
        System.out.println("After removing Banana: " + fruitsListaLigada);

        // Acceder a un elemento por índice
        String firstFruit = fruitsListaLigada.get(0);
        System.out.println("First fruit: " + firstFruit); // Salida: Apple

        // Recorrer la LinkedList usando un bucle for-each
        System.out.println("Fruits in the list:");
        for (String fruit : fruitsListaLigada) {
            System.out.println(fruit);
        }

        // Verificar si la lista contiene un elemento
        boolean hasMango = fruitsListaLigada.contains("Mango");
        System.out.println("Contains Mango? " + hasMango); // Salida: true

        // Obtener el tamaño de la LinkedList
        int size = fruitsListaLigada.size();
        System.out.println("Size of the list: " + size); // Salida: 4


    }
}
