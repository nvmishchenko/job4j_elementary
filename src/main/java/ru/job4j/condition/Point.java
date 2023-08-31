package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double squareRoot = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return  squareRoot;
    }
    public static void main(String[] args) {
        double result = Point.distance(3, 2, 5, 6);
        System.out.println("result (3, 2) to (5, 6) " + result);
    }
}
