package design.factory.SimpleFactory;

/**
 * @author iyeed-coder
 * @date 2021/8/1111:31
 */
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String loginType = "password";
        String name = "name";
        String password = "password";
        Login login = LoginManager.factory(loginType);
        boolean bool = login.verify(name, password);
        if (bool) {
            /**
             * 业务逻辑
             */
        } else {
            /**
             * 业务逻辑
             */
        }
    }
}
