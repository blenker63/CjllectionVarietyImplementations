import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    private static int counter = 0;
//    private int id;


    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
//        this.id = ++counter;
//        System.out.println(counter); // проверка счетчика
//        System.out.println(id); // проверка id
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

//    public int getId() {
//        return this.id;
//    }

//    public void setDepartment(int department) {
//        this.department = department;
//    }

//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    @Override
    public String toString() {
        return //"id: " + getId() + "  " +
                "ФИО: '" + getSurname() + '\''
                + getName() + '\''
                + getPatronymic() + '\'' +
                ", отдел - " + getDepartment() +
                ", зарплата, рублей - " + getSalary() //+ ", id - " + getId() + ", counter - " + counter
                + ";";
    }

    }



