package com.example.attendance.model;


public class Attendance {

    private int employeeId;
    private int presentDays;

    // Default Constructor
    public Attendance() {

    }

    // Parameterized Constructor
    public Attendance(int employeeId, int presentDays) {
        this.employeeId = employeeId;
        this.presentDays = presentDays;
    }

    // Getters and Setters

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