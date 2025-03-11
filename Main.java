/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

/**
 * Program ini mendemonstrasikan konsep kelas abstrak dan pewarisan di Java.
 * @author Olla
 */

//  Kelas abstrak Shape sebagai superclass
abstract class Shape {
    protected String color;

    public Shape(String color) { // Konstruktor untuk menginisialisasi warna
        this.color = color;
    }

    public abstract double getArea(); // Metode abstrak untuk luas
}

// Kelas Triangle sebagai subclass dari Shape
class Triangle extends Shape {
    private final float base;
    private final float height;

    public Triangle(String color, float base, float height) {
        super(color); // Panggil konstruktor superclass
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Kelas Circle sebagai subclass dari Shape
class Circle extends Shape {
    private final float radius;

    public Circle(String color, float radius) {
        super(color); // Panggil konstruktor superclass
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Kelas utama dengan main() untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Buat objek Triangle dan Circle
        Triangle triangle = new Triangle("Red", 14, 28);
        Circle circle = new Circle("Blue", 7);

        // Tampilkan informasi Triangle
        System.out.println("Triangle Color: " + triangle.color);
        System.out.println("Triangle Area: " + triangle.getArea());

        // Tampilkan informasi Circle
        System.out.println("Circle Color: " + circle.color);
        System.out.println("Circle Area: " + circle.getArea());
    }
}
