package ge.edu.sangu.iterator;

import ge.edu.sangu.iterator.dto.Employee;
import ge.edu.sangu.iterator.dto.Item;
import ge.edu.sangu.iterator.implementations.Company;
import ge.edu.sangu.iterator.implementations.Shop;
import ge.edu.sangu.iterator.interfaces.Iterator;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees =
                List.of(new Employee("James", "Brown", new BigDecimal(1_000)),
                        new Employee("Mark", "Sanders", new BigDecimal(4_150)),
                        new Employee("Jimmy", "Evans", new BigDecimal(3_450)),
                        new Employee("Tom", "Hills", new BigDecimal(2_050)));


        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();

        BigDecimal salarySum = BigDecimal.ZERO;
        while (iterator.hasNext()) {
            salarySum = salarySum.add(iterator.next().salary());
        }

        System.out.println("Salary Sum = " + salarySum);


        Item[] items = {
                new Item("Item 1", new BigDecimal(15)),
                new Item("Item 2", BigDecimal.TEN),
                new Item("Item 3", BigDecimal.TWO),
                new Item("Item 4", new BigDecimal(11)),
        };
        Shop shop = new Shop(items);
        Iterator<Item> itemIterator = shop.createIterator();

        BigDecimal itemsPriceSum = BigDecimal.ZERO;
        while (itemIterator.hasNext()) {
            itemsPriceSum = itemsPriceSum.add(itemIterator.next().price());
        }

        System.out.println("Average price of items = " + itemsPriceSum.divide(new BigDecimal(items.length)));

    }
}
