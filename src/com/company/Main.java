/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Moskaliuk Ivanna KNUTE
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        double finish = Math.PI;
        double deltaX = 0.01;
        double y = 0.0;   // день народження 10 червня
        double rectangle;
        double area = 0;

        for (double x = 0; x < finish; x += deltaX) {

            if (Math.sin(x) <= y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }
            area += rectangle;
        }
        System.out.println(area);
    }
}
