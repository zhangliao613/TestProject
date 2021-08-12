package design.Template;

/**
 * @author iyeed-coder
 * @date 2021/8/12 14:49
 */
public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {

        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {

        return 0.045;
    }

}
