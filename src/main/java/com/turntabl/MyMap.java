package com.turntabl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyMap {
    /**
    Map is a collection of key values pair
     Implementations; HashTable, HashMap, SortedMap
     HashTable & sortedMap; are not synchronized

     */
    public static void main(String[] args) {
        maps();
   }

    private static void maps() {
        Map<Integer, Person> map = new HashMap();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alice"));
        map.put(3, new Person("Lolo"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println("====entrySet====");
        System.out.println(map.entrySet());
        map.remove(2);

        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println(map.getOrDefault(5, new Person("default")));
        System.out.println(map.values());
    }

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
