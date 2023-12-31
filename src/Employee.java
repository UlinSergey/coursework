import java.util.Objects;
public class Employee {
    private final Integer id;
    private final String fullName;
    private Integer salary;
    private static Integer departmentId;

    private Integer idCounter=1;

    public Employee (String fullName, Integer salary, Integer departmentId){
        this.id=idCounter+1;
        this.fullName=fullName;
        this.salary=salary;
        this.departmentId=departmentId;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public static Integer getDepartmentId() {
        return departmentId;
    }

    public Integer getIdCounter() {
        return idCounter;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public static void setDepartmentId(Integer departmentId) {
        Employee.departmentId = departmentId;
    }

    public void setIdCounter(Integer idCounter) {
        this.idCounter = idCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(fullName, employee.fullName) && Objects.equals(salary, employee.salary) && Objects.equals(idCounter, employee.idCounter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, salary, idCounter);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", idCounter=" + idCounter +
                '}';
    }
}
