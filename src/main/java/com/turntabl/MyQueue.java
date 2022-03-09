package com.turntabl;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    /*
      First in First out (FIFO)

       */
    public static void main(String[] args) {
        queues();
    }

    private static void queues(){
        Queue<Person> bankClients = new LinkedList<>();
        bankClients.add(new Person("Steve", 34));
        bankClients.add(new Person("Amin", 43));
        bankClients.add(new Person("Chelsea", 37));

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

