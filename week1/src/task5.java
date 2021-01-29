import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int r;
        r = in.nextInt();
        Circle cr = new Circle(r);
    }
}

class Circle{
    int radius;
    public Circle(){}
    public Circle(int radius){
        this.radius=radius;
        Circle.getArea(radius);
        Circle.getPerimeter(radius);
    }
    public static void getArea(int radius)
    {
        double s;
        s = 3.14*Math.pow(radius,2);
        System.out.println("the area is " + s);
    }
    public static void getPerimeter(int radius)
    {
        double c;
        c = 2*3.14*radius;
        System.out.println("the perimeter is " + c);
    }
}