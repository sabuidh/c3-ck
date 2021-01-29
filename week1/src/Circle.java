import java.util.Scanner;

public class Circle {
    int radius;
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

    public static void main(String[] args) {
        Circle cr = new Circle();
        int r;
        r = input();
        getArea(r);
        getPerimeter(r);
    }

    public static int input()
    {
        Scanner in = new Scanner(System.in);
        int r;
        r = in.nextInt();
        return r;
    }
}