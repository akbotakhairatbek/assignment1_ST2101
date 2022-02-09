package com.company;
public class Main {
    public static void main(String[] args){
        Shape shape;
        Circle circle=new Circle();
        System.out.println(circle);
        System.out.println("Area of the circle: "+circle.getArea());
        System.out.println("Perimeter of the circle: "+circle.getPerimeter());

        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        System.out.println("Area of the rectangle: "+rectangle.getArea());
        System.out.println("Perimeter of the rectangle: "+rectangle.getPerimeter());

        Square square=new Square();
        System.out.println(square);
        System.out.println("Area of the square: "+square.getArea());
        System.out.println("Perimeter of the square: "+square.getPerimeter());
    }
}