package kata.xunit.nojunit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class XunitTestClassTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        XunitTestClass xunitTestClass = new XunitTestClass();
        assertAll(() -> assertEquals(0, xunitTestClass.testMethods.size()));
    }

   public static void test2() {
        XunitTestClass xunitTestClass = new XunitTestClass();
        xunitTestClass.registerTestMethod();
        assertAll(() -> assertEquals(1, xunitTestClass.testMethods.size()));
    }
}