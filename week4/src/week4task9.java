import java.io.*;

public class week4task9 {
    public static void main(String[] args) throws Exception{
        File inputfile = new File("C:/csatest/demo.txt");
        if(!inputfile.exists()) {
            System.out.println("源文件错误");
            System.exit(1);
        }
        File outfile = new File("C:/csatest2/demo2.txt");
        if(!outfile.getParentFile().exists()) {
            outfile.getParentFile().mkdirs();
        }
        InputStream input = new FileInputStream(inputfile);
        OutputStream output = new FileOutputStream(outfile);
        int contxet = 0;
        byte[] data = new byte[1024];
        while((contxet = input.read(data)) != -1) {
            output.write(data,0,contxet);
        }
        input.close();
    }
}
