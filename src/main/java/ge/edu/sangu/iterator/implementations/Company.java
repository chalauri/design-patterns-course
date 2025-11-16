package ge.edu.sangu.iterator.implementations;

import ge.edu.sangu.iterator.dto.Employee;
import ge.edu.sangu.iterator.interfaces.Aggregate;
import ge.edu.sangu.iterator.interfaces.Iterator;

import java.util.List;

public class Company implements Aggregate<Employee> {

    private final List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}
