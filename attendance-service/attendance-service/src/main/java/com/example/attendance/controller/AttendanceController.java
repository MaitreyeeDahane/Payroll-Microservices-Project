package com.example.attendance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.attendance.model.Attendance;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @GetMapping("/{id}")
    public Attendance getAttendance(@PathVariable int id) {

        if(id == 1) {
            return new Attendance(1, 25);
        }
        else if(id == 2) {
            return new Attendance(2, 28);
        }
        else {
            return new Attendance(id, 20);
        }
    }
}