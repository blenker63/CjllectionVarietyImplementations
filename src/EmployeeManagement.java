import java.util.*;

public class EmployeeManagement {
    private static int counter = 0;
    private int number = 10;

    private final Map<String, Employee> employeeData = new HashMap<>();

    public void addEmployee(Employee employee) {

        if (counter >= number) {
            throw new EmployeeStoragelsFullException("Список переполнен");
        }
        if (employeeData.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException(employee.getFullName() + " - такой сотрудник уже есть");

        }
        employeeData.put(employee.getFullName(), employee);
        counter++;
        System.out.println("Добавлен сотрудник - " + employee);
    }

    public Employee removeEmployee(String surname, String name, String patronymic) {
        var kay = surname + name + patronymic;
        var resultRemove = employeeData.remove(kay);
        if (resultRemove == null) {
            throw new EmployeeNotFoundException(kay + " - Сотрудник не найден");
        }
        System.out.println("Сотрудник удален - " + resultRemove);
        return resultRemove;
    }

    public Employee getEmployee(String surname, String name, String patronymic) {
        var kay = surname + name + patronymic;
        var resultGet = employeeData.get(kay);
        if (resultGet == null) {
            throw new EmployeeNotFoundException(kay + " - Сотрудник не найден");
        }
        System.out.println("Сотрудник найден -  " + resultGet);
        return resultGet;
    }


    public void printAllEmployee() {
        for (Employee value : employeeData.values()) {
            System.out.println(value);
        }
    }

    public int getCurrentSize() {
        return counter;
    }

    public int sumSalary() {
        int sumSalary = 0;
        for (Employee value : employeeData.values()) {
            sumSalary = sumSalary + value.getSalary();
//            return sumSalary;
        }
        return sumSalary;
    }

    public void employeeMaxSalary() {
        int maxSalaryMonth = 0;
        String personMaxSalary = null;
        for (Employee value : employeeData.values()) {
            if (value.getSalary() > maxSalaryMonth) {
                maxSalaryMonth = value.getSalary();
                personMaxSalary = value.getFullName();
            }
        }
        System.out.println("Сотрудник с самой высокой з/платой: " + personMaxSalary + " " + maxSalaryMonth + " рублей");
    }

    public void employeeMinSalary() {
        int minSalaryMonth = 1_000_000;
        String personMinSalary = null;
        Employee employeeMinSalary = null;
        for (Employee value : employeeData.values()) {
            if (value.getSalary() < minSalaryMonth) {
                minSalaryMonth = value.getSalary();
                personMinSalary = value.getFullName();
            }
        }
        System.out.println("Сотрудник с самой низкой з/платой: " + personMinSalary + " " + minSalaryMonth + " рублей");
    }

    public String averageSalary() {
        float average = (float) sumSalary() / counter;
        String averageSalary = String.format("%.2f", average);
        return averageSalary;
    }

    public void employeeList() {
        int id = 0;
        for (Employee value : employeeData.values()) {
            id++;
            System.out.println("№ п/п " + id + "  " + value.getSurname() + "  " + value.getName() + "  "
                    + value.getPatronymic() + ";");
        }
    }
}



