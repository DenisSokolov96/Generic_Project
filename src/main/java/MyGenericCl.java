public class MyGenericCl<MyType> implements IMyGenericCl<MyType> {

    public MyType t;
    public MyType getA() {
        return t;
    }
    public void setA(MyType t) {
        this.t = t;
    }
}
