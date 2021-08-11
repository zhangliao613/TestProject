package design.Strategy;

/**
 * @author iyeed-coder
 * @date 2021/8/11 15:55
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }

}