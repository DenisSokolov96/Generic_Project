import org.apache.log4j.Logger;
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
