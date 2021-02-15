public class week2task8 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}

abstract class A {
    int numa = 10;
    public void showA() {}
    public int getNuma() {
        return numa;
    }
}

abstract class B extends A {
    int numb = 20;
    public void showB() {}
    public int getNumb() {
        return numb;
    }
}

class C extends B {
    int numc = 30;
    public  void showA() {
        System.out.println("A类中的numa:" + super.getNuma());
    }

    public void showB() {
        System.out.println("B类中的numb:" + super.getNumb());
    }

    public void showC() {
        System.out.println("C类中numc:" + numc);
    }
}