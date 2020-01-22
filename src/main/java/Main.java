import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static StringBuilder str = new StringBuilder();
    public static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        MyClassLoader loader = new MyClassLoader();

        try {
            Class classGen = loader.findClass("MyGenericCl");
            IMyGenericCl instanceOfClassGen = (IMyGenericCl) classGen.newInstance();

            instanceOfClassGen.setA(123);
            str.append(instanceOfClassGen.getA()+"\n");

            instanceOfClassGen.setA(123.123);
            str.append(instanceOfClassGen.getA()+"\n");

            instanceOfClassGen.setA("Hello world!");
            str.append(instanceOfClassGen.getA()+"\n");

            /******************/

            List<Integer> intList = new ArrayList<Integer>();
            intList.add(1);
            intList.add(2);
            str.append("Список до обработки дженерик-методом: " + intList+"\n");
            instanceOfClassGen.fill(intList, "Hello, Denis!");
            str.append("Список после обработки дженерик-методом: "
                    + intList+"\n");

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
