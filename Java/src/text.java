public class text {
    public static void main(String[] args) {
        Car car=new Car(4,1150); //初始化的时候设置小车轮子数和重量
        car.setLoader(5); //输入已载人数
        Truck truck=new Truck(6,15000); //初始化的时候设置卡车轮子数和重量
        truck.setLoader(1); //输入已载人数
        truck.setPayload(7000); //输入已载重量
        car.getInfo();
        System.out.println("------------------------------");
        truck.getInfo();
    } }
class Vehicle {
    private int wheels; //车轮子数
    private double weight; //车重
    Vehicle(){
    }
    Vehicle(int wheels,double weight){
        this.wheels=wheels;
        this.weight=weight;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void getInfo(){
        System.out.println("车轮的个数是："+wheels+" 车重："+weight);
    } }
class Car extends Vehicle {
    private int loader; //载人数
    Car(int wheels,double weight){
        super(wheels,weight);
    }
    public int getLoader() {
        return loader;
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        if(loader<=5){
            System.out.println("这是一辆小车,能载 5 人"+",实载"+loader+"人");
        }
        else{
            System.out.println("这是一辆小车,能载 5 人"+",实载"+loader+"人"+",你超员了！！！");
        }
    } }
class Truck extends Vehicle {
    private int loader; //载人数
    private double payload; //载重量
    public Truck(int wheels, double weight) {
        super(wheels, weight);
    }
    public int getLoader() {
        return loader;
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    public double getPayload() {
        return payload;
    }
    public void setPayload(double payload) {
        this.payload = payload;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        if(loader<=3){
            System.out.println("这是一辆卡车,能载 3 人"+",实载"+loader+"人");
        }
        else{
            System.out.println("这是一辆小车,能载 3 人"+",实载"+loader+"人"+",你超员了！！！");
        }
        if(payload<=5000){
            System.out.println("这是一辆卡车,核载 5000kg"+",你已装载"+payload+"kg");
        }else {
            System.out.println("这是一辆卡车,核载5000kg"+",你已装载"+payload+"kg"+",你超载了！！！");
        }
    }
}
