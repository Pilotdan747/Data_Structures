package ch02;

import java.awt.Rectangle;

public class UseFigs {
    public static void main(String[] args) {
	Circle myCircle = new Circle(5);
	System.out.println(myCircle.perimeter());
	System.out.println(myCircle.area());
	Rectangle myRectangle = new Rectangle(7, 8);
	System.out.println(((FigureGeometry) myRectangle).perimeter());
	System.out.println(((FigureGeometry) myRectangle).area());
    }
}