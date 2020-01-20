public class Main {

    static StringBuilder str = new StringBuilder();

    public static void main(String[] args) {

        MyClassLoader loader = new MyClassLoader();

        try {
            Class classGen = loader.findClass("MyGenericCl");
            IMyGenericCl instanceOfClassGen = (IMyGenericCl) classGen.newInstance();

            instanceOfClassGen.setA(123);
            str.append(instanceOfClassGen.getA()+"\n");

            instanceOfClassGen.setA(123.123);
            str.append(instanceOfClassGen.getA()+"\n");

            instanceOfClassGen.setA("Hello world!"+"\n");
            str.append(instanceOfClassGen.getA());
            System.out.println(str);
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        catch (InstantiationException e) {
            System.out.println(e.getMessage());
        }

    }
}
