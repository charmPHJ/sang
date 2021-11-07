
public class Main {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.name = "정사각형";
        s1.length = 5;

        Triangle t1 = new Triangle();
        t1.name = "삼각형";
        t1.base = 3;
        t1.height = 4;



        Circle c1 = new Circle();
        c1.name = "원";
        c1.radius = 4;

        Shape[] shapes = { s1 , t1 , c1 };

        for (int i = 0; i< shapes.length; i++ ){
            Shape tmp = shapes[i];
            System.out.printf("%s의 넓이 >> %.2f\n", tmp.name, tmp.area());

        }
    }
}

class Shape{
    String name;

    public double area(){
        return 0;
    }
}

class Square extends Shape{
    int length;

    public double area() {
        return length * length;
    }
}

class Triangle extends Shape{
    int base;
    int height;

    public double area() {
        return base * height / 2.0;
    }
}

class Circle extends Shape{
    int radius;
    public double area() {
        return Math.PI *radius * radius;
    }
}