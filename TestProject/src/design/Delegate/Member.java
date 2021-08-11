package design.Delegate;

/**
 * @author iyeed-coder
 * @date 2021/8/1114:54
 */
/**
 * @program: pattern
 * @description: 被委托者角色
 * @author: chengqj
 * @create: 2018-07-31 19:47
 **/
public class Member implements ITarge{
    @Override
    public void doTarge(String commond) {
        System.out.println("member A :" + commond);

    }
}

