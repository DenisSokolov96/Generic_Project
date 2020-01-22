import java.util.List;

public interface IMyGenericCl <MyType>{
    MyType getA();
    public void setA(MyType t);
    public <T> void fill(List<T> list, T val);
}
