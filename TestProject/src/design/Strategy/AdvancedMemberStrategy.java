package design.Strategy;

/**
 * @author iyeed-coder
 * @date 2021/8/11 15:56
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
