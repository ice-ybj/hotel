package org.spring.springboot.controller;

import org.spring.springboot.domain.OrderBook;
import org.spring.springboot.service.OrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderBookRestController {
    @Autowired
    private OrderBookService orderBookService;

    @GetMapping("/api/orderbook")
    public List<OrderBook> findAllOrderCheck(){return orderBookService.findAllOrderBook();}

    @GetMapping("/api/orderbook/{obin}")
    public OrderBook findOrderBookByOBIN(@PathVariable("obin") Long obin){return orderBookService.findOrderBookByOBIN(obin);}

    @PostMapping("/api/orderbook")
    public String addOrderBook(@RequestBody OrderBook orderBook){return orderBookService.addOrderBook(orderBook);}

    @PostMapping("/api/orderbook/{obin}")
    public String deleteOrderBook(@PathVariable("obin") Long obin){return orderBookService.deleteOrderBook(obin);}

    @PostMapping("/api/orderbook/modify/{obin}")
    public String modifyOrderBook(@RequestBody OrderBook orderBook){return orderBookService.modifyOrderBook(orderBook);}
}
