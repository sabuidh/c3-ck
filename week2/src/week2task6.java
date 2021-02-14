import java.util.Scanner;

public class week2task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入你的人数：");
        Car car = new Car(4,1150);
        int cloader = in.nextInt();
        car.setLoader(cloader);
        car.information();

        System.out.println("请输入你的人数以及核载：");
        int tloader = in.nextInt();
        double tpayload = in.nextDouble();
        Truck tk = new Truck(6,15000);
        tk.setLoader(tloader);
        tk.setPayload(tpayload);
        tk.information();
    }
}

class Vehicle {
    int wheels;
    double weight;
    Vehicle(int wheels,double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }
    public void information() {
        System.out.println("车轮的个数是："+wheels+" 车重："+weight);
    }
}

class Car extends Vehicle {
    int loader;
    public int Maxloader=6;
    Car(int wheels,double weight) {
        super(wheels,weight);
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public void information() {
        super.information();
        if(loader>Maxloader)
            System.out.println("这是一辆小车,能载 5 人"+",实载"+loader+"人"+",你超员了！！！");
        else
            System.out.println("这是一辆小车,能载 5 人"+",实载"+loader+"人");
    }
}

class Truck extends Vehicle {
    int loader;
    double payload;
    public int Maxloader=3;
    public int Maxpayload=15000;
    Truck(int wheels,double weight) {
        super(wheels,weight);
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    public void setPayload(double payload) {
        this.payload = payload;
    }
    public void information() {
        super.information();
        if(loader>Maxloader)
            System.out.println("这是一辆小车,能载 3 人"+",实载"+loader+"人"+",你超员了！！！");
        else
            System.out.println("这是一辆卡车,能载 3 人"+",实载"+loader+"人");
        if(payload>Maxpayload)
            System.out.println("这是一辆卡车,核载5000kg"+",你已装载"+payload+"kg"+",你超载了！！！");
        else
            System.out.println("这是一辆卡车,核载 5000kg"+",你已装载"+payload+"kg");
    }
}