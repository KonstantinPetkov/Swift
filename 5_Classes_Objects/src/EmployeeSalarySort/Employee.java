package EmployeeSalarySort;

import java.util.Scanner;

public class Employee {

    public static String name;
    public static String department;
    public static String position;
    public static String email;
    public static float salary;
    public static Employee[] employees = new Employee[1000];
    public static int n;
    public static int age;

    Scanner sc = new Scanner(System.in);

    public Employee() {
        setName(name);
        setDepartment(department);
        setPosition(position);
        setEmail(email);
        addEmployee(this);

        System.out.print("Enter number of employee: ");
        int n = sc.nextInt();

        System.out.print("Enter name of employee: ");
        String name = sc.nextLine();

        System.out.print("Enter department of employee: ");
        String department = sc.nextLine();

        System.out.print("Enter position of employee: ");
        String position = sc.nextLine();

        System.out.print("Enter email of employee: ");
        String email = sc.nextLine();

        System.out.print("Enter salary of employee: ");
        float salary = sc.nextFloat();

        System.out.print("Enter age of employee: ");
        int age = sc.nextInt();
    }

    private static void addEmployee(Employee emp) {
        if (n >= 0 && n < 100) {
            employees[n] = emp;
            n++;
        }
    }

    public void LargestSalary() {
        for (int index = 0; index < n; index++) {
            for (int i = 0; i < n - 1; i++) {
                if (employees[i].getSalary() < employees[i + 1].getSalary()) {
                    Employee tempEmp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = tempEmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}