package com.example.payslip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.payslip.model.Attendance;
import com.example.payslip.model.Employee;
import com.example.payslip.model.Payslip;

@RestController
@RequestMapping("/payslip")
public class PayslipController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Payslip generatePayslip(@PathVariable int id) {

        // Call Employee Service
        Employee employee = restTemplate.getForObject(
                "http://localhost:8081/employee/" + id,
                Employee.class
        );

        // Call Attendance Service
        Attendance attendance = restTemplate.getForObject(
                "http://localhost:8082/attendance/" + id,
                Attendance.class
        );

        // Salary Calculation
        int workingDays = 30;

        double perDaySalary =
                employee.getSalary() / workingDays;

        double finalSalary =
                perDaySalary * attendance.getPresentDays();

        // Return Final Payslip
        return new Payslip(
                employee.getId(),
                employee.getName(),
                employee.getSalary(),
                attendance.getPresentDays(),
                finalSalary
        );
    }
}
