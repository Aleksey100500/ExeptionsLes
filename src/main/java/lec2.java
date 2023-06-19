import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class lec2 {
    public static void main(String[] args) throws IOException {
//        String name = null; // .NullPointerException
//        System.out.println(name.length());
//        Object object = new String("123"); //ClassCastException
//        File file = (File) object;
//        System.out.println(file);
//        String number = "123fq"; //NumberFormatException
//        int result = Integer.parseInt(number);
//        System.out.println(result);
//        List<Object> emptyList = Collections.emptyList(); //UnsupportedOperationException
//        emptyList.add(new Object());
//        int number = 1;
//        try {
//            number = 10/0;
//            String test = null;
//            System.out.println(test.length());
//        } catch (ArithmeticException e) {
//            System.out.println("Operation divide by ZERO not supported");
//        } catch (NullPointerException e) {
//            System.out.println("Null pointer Exception");
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
//        System.out.println(number);
        FileReader file = null;
        try {
            file = new FileReader("test");
            file.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Finally start.");
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally closed");
        }

    }
}
