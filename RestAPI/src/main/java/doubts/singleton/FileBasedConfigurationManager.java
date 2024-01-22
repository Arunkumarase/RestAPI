package doubts.singleton;

import java.util.HashMap;
import java.util.Map;

public abstract class FileBasedConfigurationManager {
    protected final Map<String, String> properties = new HashMap<>();
    public static FileBasedConfigurationManager getInstance() {
        System.out.println("in abstract class");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected static void resetInstance() {
        System.out.println("in abstract class");
    }
}
