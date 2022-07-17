package model;

import java.util.Objects;

public class Employee {
    private final String surname;
    private String name;
    private String name;
    public Employee(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(String, employee.String) && Objects.equals(patronymicName, employee.patronymicName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, name, String, patronymicName, salary, department);
    }
    @Override
    public String toString(){
        return String.format("ФО: %s %s", surname, name);
    }
}