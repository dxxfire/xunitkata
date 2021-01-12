package kata.xunit.nojunit;

import java.util.Objects;

public class XunitTestMethod {
    private String name;
    private Runnable method;
    private boolean runStatus = true;

    public XunitTestMethod(String name, Runnable method) {
        this.name = name;
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Runnable getMethod() {
        return method;
    }

    public void setMethod(Runnable method) {
        this.method = method;
    }

    public boolean isRunStatus() {
        return runStatus;
    }

    public void setRunStatus(boolean runStatus) {
        this.runStatus = runStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        XunitTestMethod that = (XunitTestMethod) o;
        return runStatus == that.runStatus &&
                Objects.equals(name, that.name) &&
                Objects.equals(method, that.method);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, method, runStatus);
    }
}
