package design.factory.FactoryMethod;

/**
 * @author iyeed-coder
 * @date 2021/8/1114:08
 */
public class ExportHtmlFactory implements ExportFactory{

    @Override
    public ExportFile factory(String type) {
        // TODO Auto-generated method stub
        if("standard".equals(type)){

            return new ExportStandardHtmlFile();

        }else if("financial".equals(type)){

            return new ExportFinancialHtmlFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }

}
