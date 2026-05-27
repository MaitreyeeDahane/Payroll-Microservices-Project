package com.example.payslip.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.payslip.model.Payslip;

@Controller
public class ViewController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String homePage() {

        return "index";
    }

    @GetMapping("/viewPayslip")
    public String viewPayslip(
            @RequestParam int id,
            Model model) {

        Payslip payslip = restTemplate.getForObject(
                "http://localhost:8083/payslip/" + id,
                Payslip.class
        );

        model.addAttribute("payslip", payslip);

        return "payslip";
    }
}