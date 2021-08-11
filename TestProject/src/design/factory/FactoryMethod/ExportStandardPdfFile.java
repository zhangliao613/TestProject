package design.factory.FactoryMethod;

/**
 * @author iyeed-coder
 * @date 2021/8/1114:10
 */
public class ExportStandardPdfFile implements ExportFile {

    @Override
    public boolean export(String data) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        System.out.println("导出标准PDF文件");
        return true;
    }

}

