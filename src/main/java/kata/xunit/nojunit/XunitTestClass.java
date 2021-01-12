package kata.xunit.nojunit;

import java.util.HashMap;

public class XunitTestClass {
    public HashMap<String, Runnable> testMethods = new HashMap<>();

    public void registerTestMethod() {
        this.registerTestMethod("single_test_method", this::single_test_method);
    }

    public void registerTestMethod(String methodName, Runnable method) {
        testMethods.put(methodName, method);
    }

    public void single_test_method() {

    }
}
