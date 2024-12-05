package doubts.property;

import doubts.property.Property1;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        File file = new File("/spring-workspace/application_property.txt");
        FileReader fileReader = new FileReader(file);
        Property1 property1 = new Property1();
        property1.load(fileReader);
        property1.setProperty("logging.level.sql","DEBUG");
        property1.getProperty("logging.level.sql");
    }
}
