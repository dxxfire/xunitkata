package kata.xunit.nojunit;

import xunit.sample.CalculateUtilTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Step2Test {
    public static void main(String[] args) {
        CalculateUtilTest test = new CalculateUtilTest();
        test.run();
        XunitTestMethod method1 =  test.testMethodList.get(0);
        XunitTestMethod method2 =  test.testMethodList.get(1);
        assertAll(() -> assertEquals(false, method1.getRunStatus()));
        assertAll(() -> assertEquals("Unexpected value", method1.getErrorMsg()));
        assertAll(() -> assertEquals(true, method2.getRunStatus()));
    }
}
