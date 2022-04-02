package org.spring.springboot.controller;

import org.spring.springboot.domain.OrderCheck;
import org.spring.springboot.service.OrderCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderCheckRestController {
    @Autowired
    private OrderCheckService orderCheckService;

    @GetMapping("/api/ordercheck")
    public List<OrderCheck> findAllOrderCheck(){return orderCheckService.findAllOrderCheck();}

    @GetMapping("/api/ordercheck/{ocin}")
    public OrderCheck findOrderCheckByOCIN(@PathVariable("ocin") Long ocin){return orderCheckService.findOrderCheckByOCIN(ocin); }

    @PostMapping("/api/ordercheck")
    public String addOrderCheck(@RequestBody OrderCheck orderCheck){return orderCheckService.addOrderCheck(orderCheck);}

    @PostMapping("/api/ordercheck/{ocin}")
    public String deleteOrderCheck(@PathVariable("ocin") Long ocin){return orderCheckService.deleteOrderCheck(ocin);}

    @PostMapping("/api/ordercheck/modify/{ocin}")
    public String modifyOrderCheck(@RequestBody OrderCheck orderCheck){return orderCheckService.modifyOrderCheck(orderCheck);}
}
