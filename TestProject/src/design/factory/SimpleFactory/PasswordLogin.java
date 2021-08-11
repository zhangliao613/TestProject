package design.factory.SimpleFactory;

/**
 * @author iyeed-coder
 * @date 2021/8/1111:30
 */
public class PasswordLogin implements Login {

    @Override
    public boolean verify(String name, String password) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        return true;
    }

}
