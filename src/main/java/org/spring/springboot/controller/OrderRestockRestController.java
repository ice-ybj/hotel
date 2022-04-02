package org.spring.springboot.controller;

import org.spring.springboot.domain.OrderRestock;
import org.spring.springboot.service.OrderRestockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderRestockRestController {
    @Autowired
    private OrderRestockService orderRestockService;

    @GetMapping("/api/orderrestock")
    public List<OrderRestock> findAllOrderRestock(){return orderRestockService.findAllOrderRestock();}

    @GetMapping("/api/orderrestock/{orin}")
    public OrderRestock findOrderRestockByORIN(@PathVariable("orin") Long orin){return orderRestockService.findOrderRestockByORIN(orin);}

    @PostMapping("/api/orderrestock")
    public String addOrderRestock(@RequestBody OrderRestock orderRestock){return orderRestockService.addOrderRestock(orderRestock);}

    @PostMapping("/api/orderrestock/{orin}")
    public String deleteOrderRestock(@PathVariable("orin") Long orin){return orderRestockService.deleteOrderRestock(orin);}

    @PostMapping("/api/orderrestock/modify/{orin}")
    public String modifyOrderRestock(@RequestBody OrderRestock orderRestock){return orderRestockService.modifyOrderRestock(orderRestock);}
}
