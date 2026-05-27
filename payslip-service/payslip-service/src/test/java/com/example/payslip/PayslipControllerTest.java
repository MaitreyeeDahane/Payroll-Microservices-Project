package com.example.payslip;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.payslip.model.Attendance;
import com.example.payslip.model.Employee;

public class PayslipControllerTest {

    @Test
    public void testSalaryCalculation() {

        Employee employee =
                new Employee(1,
                        "Maitreyee",
                        30000);

        Attendance attendance =
                new Attendance(1,
                        25);

        int workingDays = 30;

        double actualSalary =
                (employee.getSalary() / workingDays)
                        * attendance.getPresentDays();

        double expectedSalary = 25000;

        assertEquals(expectedSalary, actualSalary);
    }
}