import java.util.Arrays;

public class Department {
    private String depName;
    private int depId;
    private String depAddress;
    private Employee[] employee;

    public Department(String depName, int depId, String depAddress, Employee[] employee) {
        this.depName = depName;
        this.depId = depId;
        this.depAddress = depAddress;
        this.employee = employee;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepAddress() {
        return depAddress;
    }

    public void setDepAddress(String depAddress) {
        this.depAddress = depAddress;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depName='" + depName + '\'' +
                ", depId=" + depId +
                ", depAddress='" + depAddress + '\'' +
                ", employee=" + Arrays.toString(employee) +
                '}';
    }
}
