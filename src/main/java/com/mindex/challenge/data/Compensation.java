package com.mindex.challenge.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Compensation {

    private static final Logger LOG = LoggerFactory.getLogger(Compensation.class);

    @DBRef
    private Employee employee;

    private double salary;

    private LocalDate effectiveDate;

    public Compensation() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEffectiveDate(String effectiveDate) {
        try {
            this.effectiveDate = LocalDate.parse(effectiveDate);
        } catch (DateTimeParseException e) {
            LOG.error("Could not parse [{}], setting effectiveDate to current date", effectiveDate);
            this.effectiveDate = LocalDate.now();
        }
    }

}
