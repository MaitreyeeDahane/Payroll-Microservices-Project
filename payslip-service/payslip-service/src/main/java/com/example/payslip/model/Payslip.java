package com.example.payslip.model;


public class Payslip {

    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private int presentDays;
    private double finalSalary;

    public Payslip() {

    }

    public Payslip(int employeeId,
                   String employeeName,
                   double basicSalary,
                   int presentDays,
                   double finalSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.presentDays = presentDays;
        this.finalSalary = finalSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public void setPresentDays(int presentDays) {
        this.presentDays = presentDays;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }
}