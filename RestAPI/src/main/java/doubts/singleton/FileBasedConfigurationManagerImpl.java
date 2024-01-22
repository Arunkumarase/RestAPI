package doubts.singleton;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    public static FileBasedConfigurationManager getInstance() {
        System.out.println("in impl class");
        return null;
    }


    public static void resetInstance() {
        System.out.println("in impl class");
        // TODO Auto-generated method stub
    }

    public String getConfiguration(String key) {
        properties.get(key);
    }
    public void setConfiguration(String key, String value) {
        properties.put(key,value);
    }

    public void removeConfiguration(String key) {
        properties.remove(key);

    }
}
