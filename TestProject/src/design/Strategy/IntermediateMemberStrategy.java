package design.Strategy;

/**
 * @author iyeed-coder
 * @date 2021/8/11 15:55
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }

}
