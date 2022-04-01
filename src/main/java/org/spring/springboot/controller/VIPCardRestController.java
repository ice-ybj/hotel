package org.spring.springboot.controller;

import org.spring.springboot.domain.VIPCard;
import org.spring.springboot.service.VIPCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VIPCardRestController {
    @Autowired
    private VIPCardService vipCardService;

    @GetMapping("/api/VIP")
    public List<VIPCard> findAllVIP(){
        return vipCardService.findAllVIP();
    }

    @GetMapping("/api/VIP/{vip}")
    public VIPCard findVIPByVIP(@PathVariable("vip") Long vip){return vipCardService.findVIPByVIP(vip);}

    @PostMapping("/api/VIP")
    public String addVIP(@RequestBody VIPCard vipCard){return vipCardService.addVIP(vipCard);}

    @PostMapping("/api/VIP/{vip}")
    public String deleteVIP(@PathVariable("vip") Long vip){return vipCardService.deleteVIP(vip);}

    @PostMapping("/api/VIP/modify/{vip}")
    public String modifyVIP(@RequestBody VIPCard vipCard){return vipCardService.modifyVIP(vipCard);}

}
