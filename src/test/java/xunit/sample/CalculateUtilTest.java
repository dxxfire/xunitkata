package xunit.sample;

import kata.xunit.nojunit.XunitTestClass;

public class CalculateUtilTest extends XunitTestClass {

    void addTest1() {
        CalculateUtil calculateUtil = new CalculateUtil();
        int addedValue = calculateUtil.add(1, 1);
        if (3 != addedValue) {
            throw new RuntimeException("Unexpected value");
        }
    }

    void addTest2() {
        CalculateUtil calculateUtil = new CalculateUtil();
        int addedValue = calculateUtil.add(1, 1);
        if (2 != addedValue) {
            throw new RuntimeException("Unexpected value");
        }
    }

    @Override
    public void run() {
        this.registerTestMethod("addTest1", this::addTest1);
        this.registerTestMethod("addTest2", this::addTest2);
        super.run();
    }
}