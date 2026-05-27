package com.example.payslip.model;



public class Attendance {

    private int employeeId;
    private int presentDays;

    public Attendance() {

    }

    public Attendance(int employeeId, int presentDays) {
        this.employeeId = employeeId;
        this.presentDays = presentDays;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public void setPresentDays(int presentDays) {
        this.presentDays = presentDays;
    }
}
