import org.apache.log4j.Logger;

public class MyGenericCl<MyType> implements IMyGenericCl<MyType> {

    public static final Logger log = Logger.getLogger(MyGenericCl.class);
    public MyType t;
    public MyType getA() {
        return t;
    }
    public void setA(MyType t) {
        this.t = t;
    }

    public <E> E getE(E e) {


        log.info(e + " : " + e.getClass());
        return e;
    }
}
