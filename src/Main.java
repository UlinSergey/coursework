import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {

    private static final Employee[] employees = {
            new Employee("Иванов Иван Иванович", 5000, 3),
            new Employee("Максимов Максим Максимович", 4000, 1),
            new Employee("Алексадров Александр Александрович", 2000, 2),
            new Employee("Артемов Артем Артемович", 1000, 1),
            new Employee("Викторов Виктор Викторович", 3000, 2),
    };

    public static void main (String[] args){
        System.out.println("++++++++++++++++");
        System.out.println("----------------");
        printEmployeees();
        System.out.println("++++++++++++++++");
        System.out.println("----------------");
        System.out.println(calculateTotalSalarySum());
        System.out.println("++++++++++++++++");
        System.out.println("----------------");
        System.out.println(findEmployeeWithSalary());
        System.out.println("++++++++++++++++");
        System.out.println("----------------");
        System.out.println(calculateAverageSalarySum());
        System.out.println("++++++++++++++++");
        System.out.println("----------------");
        printEmployeees();
    }

    private static int printEmployeees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        return 0;
    }

    private static int calculateTotalSalarySum() {
        int sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        return sum;
    }

    private static Employee findEmployeeWithSalary() {
        Employee result = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < result.getSalary()) {
                result = employee;
            }
        }
        return result;

    }

    private static float calculateAverageSalarySum(){
        return (float) calculateTotalSalarySum() / employees.length;
    }

    private static void printFullNames(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
