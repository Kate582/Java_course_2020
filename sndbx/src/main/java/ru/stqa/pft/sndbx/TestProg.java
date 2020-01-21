package ru.stqa.pft.sndbx;

public class TestProg {

	public static void main(String[] args) {
		hello("world");
		hello("user");

		Square s = new Square(3);
		System.out.println("Площадь для квадрата " + s.l + " = " + s.area());

		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		System.out.println("Расстояние между " + "(" + p1.x + "," + p1.y + ")" + "и" + "(" + p2.x + "," + p2.y + ")" + " = " + p1.distance(p2));
	}

	public static void hello(String str) {
		System.out.println("Hello, " + str + "!");
	}

}