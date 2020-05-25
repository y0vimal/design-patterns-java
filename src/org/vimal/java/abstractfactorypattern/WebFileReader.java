package org.vimal.java.abstractfactorypattern;

public class WebFileReader extends AbstractFactory {
    private Reader reader = null;
    @Override
    public Reader getReader(String readerType) {
        switch (readerType){
            case("xml"):
                reader = new XmlReader();
                break;
            case("json"):
                reader = new JsonReader();
                break;
            default:
                System.out.println("invalid file reader type");
        }
        return reader;
    }
}
