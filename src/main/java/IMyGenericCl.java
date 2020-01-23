import java.util.List;

public interface IMyGenericCl <MyType>{
    MyType getA();
    public void setA(MyType t);
    public <E> E getE(E e);
}
