import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaGlobalVariable {
    @Test
            public void propertiesTest() throws IOException {
        //public static void main(String args[]) throws IOException {
        Properties prog = new Properties();
        FileInputStream fis = new FileInputStream("/home/ankur/Documents/Selenium 4.0/SeleniumUdemy/src/test/java/Global.properties");
        prog.load(fis);
        System.out.println(prog.getProperty("url"));
        System.out.println(prog.getProperty("browser"));
        prog.setProperty("browser","firefox");
        System.out.println(prog.getProperty("browser"));
        FileOutputStream fos = new FileOutputStream("/home/ankur/Documents/Selenium 4.0/SeleniumUdemy/src/test/java/Global.properties");
        prog.store(fos, null);
    }
    //}
}
