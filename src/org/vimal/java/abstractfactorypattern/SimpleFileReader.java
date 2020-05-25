package org.vimal.java.abstractfactorypattern;

public class SimpleFileReader extends AbstractFactory {
    private Reader reader = null;
    @Override
    public Reader getReader(String readerType) {
        switch (readerType){
            case("excel"):
                reader = new ExcelReader();
                break;
            case("csv"):
                reader = new CsvReader();
                break;
            default:
                System.out.println("invalid file reader type");
        }
        return reader;
    }
}
