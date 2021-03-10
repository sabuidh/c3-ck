import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class week4task8 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:/csatest/demo.txt");
        if (file.exists()) {
            InputStream input = new FileInputStream(file);
            byte date[] = new byte[1024];
            int foot = 0;
            int context = 0;
            while ((context = input.read()) != -1) {
                date[foot++] = (byte) context;
            }
            String s = new String(date, 0, foot);
            String[] s1 = s.split("csa");
            System.out.println(s1.length);
            input.close();
        }
    }
}
