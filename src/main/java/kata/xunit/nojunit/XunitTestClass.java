package kata.xunit.nojunit;

import java.util.HashMap;
import java.util.Map;

public class XunitTestClass {
    public HashMap<String, Runnable> testMethods = new HashMap<>();

    public void registerTestMethod(String methodName, Runnable method) {
        testMethods.put(methodName, method);
    }

    public void run() {
        for (Map.Entry<String, Runnable> entry : testMethods.entrySet()) {
            Runnable method = entry.getValue();
            method.run();
        }
    }
}
