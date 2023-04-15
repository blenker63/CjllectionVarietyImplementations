import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.addEmployee(new Employee("Иванов", "Иван", "Иванович", 1, 11_000));
        employeeManagement.addEmployee(new Employee("Петров", "Петр", "Петрович", 2, 15000));
        employeeManagement.addEmployee(new Employee("Сидоров", "Сидор", "Сидорович", 3, 13000));
        employeeManagement.addEmployee(new Employee("Васильев", "Василий", "Иванович", 4, 16000));
        employeeManagement.addEmployee(new Employee("Соловьев", "Степан", "Васильевич", 2, 22000));
        employeeManagement.addEmployee(new Employee("Степанов", "Григорий", "Михайлович", 5, 17000));
//        employeeManagement.addEmployee(new Employee("Степанов", "Григорий", "Михайлович", 5, 17000)); // проверка на уже имеющегося сотрудника
        System.out.println("Данные сотрудников");
        employeeManagement.printAllEmployee();
        System.out.println("Количество сотрудников -  " + employeeManagement.getCurrentSize());
        System.out.println("Сумма затрат на з/плату в месяц -  " + employeeManagement.sumSalary() + " рублей.");
        employeeManagement.employeeMaxSalary();
        employeeManagement.employeeMinSalary();
        System.out.println("Среднее значение з/плат - " + employeeManagement.averageSalary() + " рублей.");
        System.out.println("Список сотрудников");
        employeeManagement.employeeList();
        System.out.println("Удаление сотрудников");
        employeeManagement.removeEmployee("Иванов", "Иван", "Иванович");
//        employeeManagement.removeEmployee("Иванов", "Иван2", "Иванович"); // проверка на несуществующего сотрудника
        System.out.println("Данные сотрудников2");
        employeeManagement.printAllEmployee();
        System.out.println("Поиск сотрудников");
        employeeManagement.getEmployee("Степанов", "Григорий", "Михайлович");
    }
}