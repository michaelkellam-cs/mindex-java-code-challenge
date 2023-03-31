package com.mindex.challenge.data;

import java.time.LocalDate;

public class Compensation {

    private Employee employee;

    private double salary;

    private String effectiveDate;

//    public Compensation(Employee employee, double salary, LocalDate effectiveDate) {
//        this.employee = employee;
//        this.salary = salary;
//        this.effectiveDate = effectiveDate;
//    }

    public Compensation() {

    }

    public Employee getEmployee() {
        return employee;
    }

    public double getSalary() {
        return salary;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

}
