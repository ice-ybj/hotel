package org.spring.springboot.controller;

import org.spring.springboot.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewRestController {
    @Autowired
    private ViewService viewService;

    @GetMapping("/api/view/room/today")
    public Double findroomRevenueToday(){return viewService.findroomRevenueToday();}

    @GetMapping("/api/view/room/yesterday")
    public Double findroomRevenueYesterday(){return viewService.findroomRevenueYesterday();}

    @GetMapping("/api/view/room/month")
    public Double findroomRevenueMonth(){return viewService.findroomRevenueMonth();}

    @GetMapping("/api/view/room")
    public Double findroomRevenue(){return viewService.findroomRevenue();}

    @GetMapping("/api/view/sale/today")
    public Double findsaleRevenueToday(){return viewService.findsaleRevenueToday();}

    @GetMapping("/api/view/sale/yesterday")
    public Double findsaleRevenueYesterday(){return viewService.findsaleRevenueYesterday();}

    @GetMapping("/api/view/sale/month")
    public Double findsaleRevenueMonth(){return viewService.findsaleRevenueMonth();}

    @GetMapping("/api/view/sale")
    public Double findsaleRevenue(){return viewService.findsaleRevenue();}

    @GetMapping("/api/view/saleE/month")
    public Double findsaleExpenseMonth(){return viewService.findsaleExpenseMonth();}

    @GetMapping("/api/view/saleE")
    public Double findsaleExpense(){return viewService.findsaleExpense();}
}
