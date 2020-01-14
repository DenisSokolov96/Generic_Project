public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        MyClassLoader loader = new MyClassLoader();


        Class classGen = loader.findClass("MyGenericCl");
        IMyGenericCl instanceOfClassGen = (IMyGenericCl) classGen.newInstance();

        instanceOfClassGen.setA(123);
        System.out.println(instanceOfClassGen.getA());

        instanceOfClassGen.setA(123.123);
        System.out.println(instanceOfClassGen.getA());

        instanceOfClassGen.setA("Hello world!");
        System.out.println(instanceOfClassGen.getA());

    }
}
