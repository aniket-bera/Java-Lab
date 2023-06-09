import java.io.FileInputStream;
import java.io.IOException;
import  java.io.File;
class Test2 {
    public static  void findFile() throws IOException {
        File f=new File("test.txt");
        FileInputStream s=new FileInputStream(f);
    }
    public static void main(String[] args) {
        try {
            findFile();
        }
        catch(IOException e){
            System.out.println(e);
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
    }
}
