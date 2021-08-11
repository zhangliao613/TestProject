package design.Strategy;

/**
 * @author iyeed-coder
 * @date 2021/8/11 15:55
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    public double calcPrice(double booksPrice);
}
