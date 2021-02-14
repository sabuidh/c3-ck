public class week2task5 {
    public static void main(String[] args) {
        String s = "hello";
        Monkey mk = new Monkey();
        people pp = new people(s);
        mk.speak();
        pp.speak();
        pp.think();
    }
}

class Monkey {
    String s;
    public void Monkey () {}
    public void Monkey(String s) {
        this.s=s;
    }
    public void speak() {
        System.out.println("咿咿呀呀......");
    }
}

class people extends Monkey {
    public void people () {}
    public people (String s) {
        super();
    }
    @Override
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    protected void think() {
        System.out.println("别说话！认真思考！");
    }
}