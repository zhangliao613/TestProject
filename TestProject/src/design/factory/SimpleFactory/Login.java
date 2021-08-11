package design.factory.SimpleFactory;

/**
 * @author iyeed-coder
 * @date 2021/8/1111:30
 */
public interface Login {
    //登录验证
    public boolean verify(String name , String password);
}
