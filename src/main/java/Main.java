import org.apache.log4j.Logger;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static StringBuilder str = new StringBuilder();
    public static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        MyClassLoader loader = new MyClassLoader();
        MyClassLoader loader1 = new MyClassLoader();

        try {
            str.append("Generic Class"+"\n");

            Class classGen1 = loader.findClass("MyGenericCl");
            Class classGen2 = loader1.findClass("MyGenericCl");

            IMyGenericCl<Integer> myGenericCl1 = (IMyGenericCl) classGen1.newInstance();
            myGenericCl1.setA(123);

            IMyGenericCl<Double> myGenericCl2 = (IMyGenericCl) classGen2.newInstance();
            myGenericCl2.setA(123.123);

            int res1 = myGenericCl1.getA();
            double res2 = myGenericCl2.getA();

            str.append(res1 + "\n");
            str.append(res2 + "\n");

            /******************/

            str.append("Generic Method"+"\n");

            int a = myGenericCl1.getE(123);
            String s = myGenericCl1.getE("hello");
            str.append(a + "\n");
            str.append(s + "\n");


            /********************/
            log.info("OK");
        }
        catch (ClassNotFoundException e){
            log.error(e.getMessage());
        }
        catch (IllegalAccessException e) {
            log.error(e.getMessage());
        }
        catch (InstantiationException e) {
            log.error(e.getMessage());
        }
        System.out.println(str);

    }
}
