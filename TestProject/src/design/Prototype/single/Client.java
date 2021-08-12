package design.Prototype.single;

/**
 * @author iyeed-coder
 * @date 2021/8/11 17:39
 */
public class Client {
    public static void main(String[]args){
        try{
            Prototype p1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("p1", p1);
            //获取原型来创建对象
            Prototype p3 = PrototypeManager.getPrototype("p1").clone();
            p3.setName("张三");
            System.out.println("第一个实例：" + p3);
            System.out.println("p1与p3是否同一个对象：" + (p1.getClass()==p3.getClass()));
            
            //有人动态的切换了实现
            Prototype p2 = new ConcretePrototype2();
            PrototypeManager.setPrototype("p1", p2);
            
            //重新获取原型来创建对象
            Prototype p4 = PrototypeManager.getPrototype("p1").clone();
            p4.setName("李四");
            System.out.println("第二个实例：" + p4);
            System.out.println("p1与p4是否同一个对象：" + (p1.getClass()==p4.getClass()));
            System.out.println("p2与p4是否同一个对象：" + (p2.getClass()==p4.getClass()));
            
            //有人注销了这个原型
            PrototypeManager.removePrototype("p1");
            
            //再次获取原型来创建对象
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第三个实例：" + p5);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
