import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.addEmployee("Иванов", "Иван", "Иванович", 1, 11_000);
        employeeManagement.addEmployee("Петров", "Петр", "Петрович", 2, 15000);
        employeeManagement.addEmployee("Сидоров", "Сидор", "Сидорович", 3, 13000);
        employeeManagement.person();
    }
}