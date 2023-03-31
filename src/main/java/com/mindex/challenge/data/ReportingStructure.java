package com.mindex.challenge.data;


public class ReportingStructure {

    private Employee employee;

    private int numberOfReports;

    public ReportingStructure(Employee employee, int numberOfReports) {
        this.employee = employee;
        this.numberOfReports = numberOfReports;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getNumberOfReports() {
        return numberOfReports;
    }

    public void setEmployee(final Employee employee) {
        this.employee = employee;
    }

    public void setNumberOfReports(final int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

}
