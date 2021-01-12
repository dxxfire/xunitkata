package kata.xunit.nojunit;

import java.util.Objects;

public class XunitTestMethod {
    private String name;
    private Runnable method;
    private boolean runStatus = true;
    private String errorMsg;

    public XunitTestMethod(String name, Runnable method) {
        this.name = name;
        this.method = method;
    }

    public Runnable getMethod() {
        return method;
    }

    public boolean getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(boolean runStatus) {
        this.runStatus = runStatus;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
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
