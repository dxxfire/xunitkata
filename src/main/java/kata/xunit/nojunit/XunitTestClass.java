package kata.xunit.nojunit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XunitTestClass {
    public List<XunitTestMethod> testMethodList = new ArrayList<>();

    public void registerTestMethod(String methodName, Runnable method) {
        testMethodList.add(new XunitTestMethod(methodName, method));
    }

    public void run() {
        for (XunitTestMethod method: testMethodList) {
            boolean runStatus = true;
            try {
                method.getMethod().run();
            } catch (RuntimeException e) {
                runStatus = false;
                method.setErrorMsg(e.getMessage());
            } finally {
                method.setRunStatus(runStatus);
            }
        }
    }
}
