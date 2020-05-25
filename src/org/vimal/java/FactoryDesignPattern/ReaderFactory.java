package org.vimal.java.FactoryDesignPattern;

public class ReaderFactory {
    private Reader reader = null;

    public Reader getReader(String readerType){
        switch(readerType){
            case("excel"):
                reader = new ExcelReader();
                break;
            case("csv"):
                reader = new CsvReader();
                break;
            case("xml"):
                reader =  new XmlReader();
                break;
            default:
                System.out.println("invalid reader type");

        }
        return reader;
    }

}
