import java.util.List;

public class MyGenericCl<MyType> implements IMyGenericCl<MyType> {

    public MyType t;
    public MyType getA() {
        return t;
    }
    public void setA(MyType t) {
        this.t = t;
    }

    public <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}
