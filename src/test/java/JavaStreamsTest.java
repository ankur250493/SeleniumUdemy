import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStreamsTest {

    @Test
   public void regular() {
       ArrayList<String> names = new ArrayList<String>();

       names.add("test");
       names.add("jn");
       names.add("tedjv st");
       names.add("jvcmkdf");
       names.add("jjxn vjdf");
       int count=0;
       for (int i=0;i<names.size();i++){
           String actualNames = names.get(i);
           if(actualNames.startsWith("j")){
               count++;
           }
       }
       System.out.println(count);
   }
    @Test
    public void streams() {
        ArrayList<String> names = new ArrayList<String>();

        names.add("test");
        names.add("jn");
        names.add("tedjv st");
        names.add("jvcmkdf");
        names.add("jjxn vjdf");


       long c = names.stream().filter(s -> s.startsWith(("j"))).count();
        System.out.println(c);

        Stream.of("vfnh","vbfid","fvnd","evn").filter(s -> s.startsWith(("j"))).count();
    }

}
