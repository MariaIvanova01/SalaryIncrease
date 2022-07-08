package com.company;

public class Worker extends Person {
    private double salary;

    public Worker(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double bonus) {
        if (getAge() < 30) {
            bonus = (salary * (bonus / 100)) / 2;
            salary = salary + bonus;
        } else {
            bonus = (salary * (bonus / 100));
            salary = salary + bonus;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva%n", getFirstName(), getLastName(), this.salary);
    }
}

