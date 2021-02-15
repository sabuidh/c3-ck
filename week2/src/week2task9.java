public class week2task9 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("===============");
        Universe universe = new Sun();
        universe.doAnything();
        Sun sun =(Sun) universe;
        sun.shine();
    }
}

interface Universe {
    public abstract void doAnything();
}

class Star {
    public void shine() {
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}

class Sun extends Star implements Universe {
    @Override
    public void doAnything() {
        System.out.println("太阳吸引着9大行星");
    }

    @Override
    public void shine() {
        System.out.println("光照八分钟，到达地球");
    }
}