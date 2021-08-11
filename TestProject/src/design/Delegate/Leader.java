package design.Delegate;

/**
 * @author iyeed-coder
 * @date 2021/8/1114:55
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @program: pattern
 * @description: 委托者
 * @author: chengqj
 * @create: 2018-07-31 19:46
 **/
public class Leader implements ITarge{
    private Map<String,ITarge> members = new HashMap<>();
    public Leader(){
        members.put("加密",new Member());
    }
    @Override
    public void doTarge(String commond) {
        members.get(commond).doTarge(commond);
    }
}

