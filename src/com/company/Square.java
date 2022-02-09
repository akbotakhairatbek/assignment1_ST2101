package com.company;
public class Square extends Rectangle {
    Square(){
        super();
    }
    public Square(double side) {
        setLength(side);
        setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        setLength(side);
        setWidth(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side) {
        setWidth(side);
    }
    @Override
    public void setLength(double side) {
        setLength(side);
    }
    public double getArea() {
        return getSide()*getSide();
    }

    public double getPerimeter() {
        return 4*getSide();
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + " which is a subclass of " + super.toString();
    }
}