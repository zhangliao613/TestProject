package design.Prototype.single;

/**
 * @author iyeed-coder
 * @date 2021/8/11 17:38
 */
public interface Prototype{
    public Prototype clone();
    public String getName();
    public void setName(String name);
}