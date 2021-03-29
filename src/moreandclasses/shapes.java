package moreandclasses;

import java.util.Scanner;

public class shapes {
    abstract class Shape {
        int width;
        abstract void area();
    }
    //your code goes here
    class Square extends Shape {
        public Square(int w){
            width = w;
        }
        public void area(){
            width = width*width;
            System.out.println(width);
        }
    }

    static class Circle extends Shape {
        public Circle(int w){
            width = w;
        }
        public void area() {
            double areaCircle = (double)Math.PI*(int)width*(int)width;
            System.out.println(areaCircle);
        }
    }


    public static class Shapes {
        public static void main(String[ ] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            Square a = new Square(x);
            Circle b = new Circle(y);
            a.area();
            b.area();
        }
    }
}
