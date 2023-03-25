package io.javabrains.javacollections;

import java.util.HashMap;
import java.util.Map;

    public class MapExample {
        public static void main(String[] args) {
            Map<String, Integer> ageMapping = new HashMap<>();

            // Dodavanje elemenata
            ageMapping.put("Alice", 30);
            ageMapping.put("Bob", 25);
            ageMapping.put("Charlie", 22);

            // Pretraga vrednosti na osnovu ključa
            Integer ageOfBob = ageMapping.get("Bob");
            System.out.println("Bob's age: " + ageOfBob); // Ispisuje 25

            // Ažuriranje vrednosti na osnovu ključa
            ageMapping.put("Alice", 31);
            // Provera da li mapa sadrži određeni ključ ili vrednost
            System.out.println("Contains key 'Alice': " + ageMapping.containsKey("Alice")); // Ispisuje true
            System.out.println("Contains value 22: " + ageMapping.containsValue(22)); // Ispisuje true

            // Brisanje para ključ-vrednost na osnovu ključa
            ageMapping.remove("Charlie");

            // Iteracija kroz sve parove ključ-vrednost
            for (Map.Entry<String, Integer> entry : ageMapping.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Dohvatanje skupa svih ključeva, skupa svih vrednosti ili skupa svih parova ključ-vrednost
            System.out.println("Keys: " + ageMapping.keySet());
            System.out.println("Values: " + ageMapping.values());
            System.out.println("Entries: " + ageMapping.entrySet());
        }
    }


