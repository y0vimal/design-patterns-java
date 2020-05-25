package org.vimal.java.abstractfactorypattern;

public class ReaderFactory {
        public Reader getReader(String readerType){
            if(readerType.equalsIgnoreCase("excel") || readerType.equalsIgnoreCase("csv")){
                AbstractFactory abstractFactory = new SimpleFileReader();
                return  abstractFactory.getReader(readerType);
            }else if(readerType.equalsIgnoreCase("xml") || readerType.equalsIgnoreCase("json")){
                AbstractFactory abstractFactory = new WebFileReader();
                return  abstractFactory.getReader(readerType);
            }else return null;
    }

}
