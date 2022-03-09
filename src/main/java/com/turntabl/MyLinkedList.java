package com.turntabl;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class MyLinkedList {
    public static void main(String[] args) {
        linkedList();
    }

    private static void linkedList(){
        LinkedList<Person> bankClients = new LinkedList<>();
        bankClients.add(new Person("Steve", 34));
        bankClients.add(new Person("Amin", 43));
        bankClients.add(new Person("Chelsea", 37));
        bankClients.addFirst(new Person("Linda", 20));

        System.out.println(bankClients);
        /*
        peek prints the first element in a list
         */
        System.out.println(bankClients.peek());
        /*
        poll prints and print the first element
        same as remove only that it throws an exception when the list is empty
         */
        System.out.println(bankClients.poll());
        System.out.println(bankClients.size());
        System.out.println(bankClients.remove());
        System.out.println(bankClients.size());

        ListIterator<Person> personListIterator = bankClients.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        ListIterator<Person> personListIterator1 = bankClients.listIterator();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
