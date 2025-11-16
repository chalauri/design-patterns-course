# Iterator Pattern Example

This project demonstrates a simple implementation of the Iterator Design Pattern in Java using custom Iterator and Aggregate interfaces. The goal is to provide a unified way to traverse elements of different collections (e.g., List, array) without exposing their underlying representation.

## Key Components

1. DTOs
- **Employee** — simple record holding name, surname, and salary.
- **Item** — simple record holding name and price.

2. Iterator Interfaces
- **Iterator** — defines hasNext() and next() methods.
- **Aggregate** — defines createIterator() method that returns an iterator for the collection.

3. Concrete Aggregates
- **Company** — holds a List<Employee> and provides an EmployeeIterator.
- **Shop** — holds an Item[] array and provides an ItemIterator.

4. Concrete Iterators
- **EmployeeIterator** — iterates over a List<Employee>.
- **ItemIterator** — iterates over an Item[] array.

## Purpose of the Iterator Pattern

The Iterator Pattern allows:
- Traversing a collection without knowing its internal structure.
- Supporting multiple collection types (List, array, etc.) with a uniform API.
- Cleaner and more maintainable traversal logic.

