package itm.edu.ejemploSpringboot1.ejemplosPasados.ejemplosColecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        // Crear un HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();

        // Agregar elementos al Hash
        fruitPrices.put("Apple", 3);
        fruitPrices.put("Banana", 2);
        fruitPrices.put("Orange", 4);

        fruitPrices.put("Orange", 43);
        fruitPrices.put("Banana", 256);

        // Acceso por clave
        System.out.println("Price of Apple: " + fruitPrices.get("Apple"));

        // Verificar si una clave existe
        if (fruitPrices.containsKey("Banana")){
            System.out.println("Price of Banana: " + fruitPrices.get("Banana"));
        }

        // Eliminar un elemento
        fruitPrices.remove("Orange");

        // Iterar sobre el HashMap
        System.out.println("Fruit Prices:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        // Crear un LinkedHashMap
        Map<String, Integer> fruitPricesLinked = new LinkedHashMap<>();

        // Agregar elementos al Hash
        fruitPricesLinked.put("Apple", 3);
        fruitPricesLinked.put("Banana", 2);
        fruitPricesLinked.put("Orange", 4);
        fruitPricesLinked.put("Mango", 5);

        fruitPricesLinked.put("Orange", 43);
        fruitPricesLinked.put("Banana", 256);

        // Acceso por clave
        System.out.println("Price of Apple: " + fruitPricesLinked.get("Apple"));

        // Verificar si una clave existe
        if (fruitPricesLinked.containsKey("Banana")){
            System.out.println("Price of Banana: " + fruitPricesLinked.get("Banana"));
        }

        // Eliminar un elemento
        fruitPricesLinked.remove("Orange");

        // Iterar sobre el linkedHashMap
        System.out.println("Fruit Prices in order of insertion:");
        for (Map.Entry<String, Integer> entry : fruitPricesLinked.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
