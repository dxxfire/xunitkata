package kata.xunit.nojunit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Step1Test extends XunitTestClass {
    public void first_test_method() {
        System.out.println("first_test_method run");
    }
    public void second_test_method() {
        System.out.println("second_test_method run");
    }

    public static void main(String[] args) {
        Step1Test step1Test = new Step1Test();
        test1(step1Test);
        test2(step1Test);
        test3(step1Test);
        step1Test.run();
    }

    public static void test1(Step1Test testClass) {
        assertAll(() -> assertEquals(0, testClass.testMethods.size()));
    }

    public static void test2(Step1Test testClass) {
        testClass.registerTestMethod("first_test_method", testClass::first_test_method);
        assertAll(() -> assertEquals(1, testClass.testMethods.size()));
    }

    public static void test3(Step1Test testClass) {
        testClass.registerTestMethod("second_test_method", testClass::second_test_method);
        assertAll(() -> assertEquals(2, testClass.testMethods.size()));
    }

}