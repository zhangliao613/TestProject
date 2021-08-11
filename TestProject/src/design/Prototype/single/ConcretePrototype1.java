package design.Prototype.single;

/**
 * @author iyeed-coder
 * @date 2021/8/11 17:38
 */
public class ConcretePrototype1 implements Prototype {
    private String name;
    public Prototype clone(){
        ConcretePrototype1 prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }
    public String toString(){
        return "Now in Prototype1 , name = " + this.name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
