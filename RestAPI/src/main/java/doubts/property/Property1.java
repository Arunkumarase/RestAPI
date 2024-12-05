package doubts.property;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Property1 {

    Map<String, String> propertyMap = new HashMap<>();

    public void load(FileReader fileReader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine())!=null) {
            String[] keyValue = line.split("=");
            propertyMap.put(keyValue[0],keyValue[1]);
        }
    }

    public void setProperty(String key, String value) {
        propertyMap.put(key,value);
    }

    public void getProperty(String key) {
        System.out.println(propertyMap.get(key));
    }


}
