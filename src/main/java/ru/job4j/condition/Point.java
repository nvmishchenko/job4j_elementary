package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x3 = x2 - x1;
        double y3 = y2 - y1;
        double squaredX = Math.pow(x3, 2);
        double squaredY = Math.pow(y3, 2);
        double sum = squaredX + squaredY;
        double squareRoot = Math.sqrt(sum);
        return squareRoot;
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 2, 5, 6);
        System.out.println("result (3, 2) to (5, 6) " + result);
    }
}
