package com.turntabl;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TheBag {
    /**
    Bag has no duplicates
    No known type of element
    sets are not paired
    Implementation TreeSet and HashSet
    TreeSet preserves the order
    HashSet

     */

    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();

        balls.add(new Ball("red"));
        balls.add(new Ball("orange "));
        balls.add(new Ball("pink"));
        balls.remove(new Ball("blue"));

        balls.forEach(System.out::println);
        System.out.println(balls);
        System.out.println(balls.size());
    }

    static class Ball {
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }

}
