package org.spring.springboot.controller;

import org.spring.springboot.domain.Good;
import org.spring.springboot.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodRestController {
    @Autowired
    private GoodService goodService;

    @GetMapping("/api/good")
    public List<Good> findAllGood(){return goodService.findAllGood();}

    @GetMapping("/api/good/{gin}")
    public Good findGoodByGIN(@PathVariable("gin") Long gin){return goodService.findGoodByGIN(gin);}

    @PostMapping("/api/good")
    public String addGood(@RequestBody Good good){return goodService.addGood(good);}

    @PostMapping("/api/good/{gin}")
    public String deleteGood(@PathVariable("gin") Long gin){return goodService.deleteGood(gin);}

    @PostMapping("/api/good/modify/{gin}")
    public String modifyGood(@RequestBody Good good){return goodService.modifyGood(good);}
}
