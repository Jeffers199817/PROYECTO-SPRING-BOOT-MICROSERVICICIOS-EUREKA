package com.milenyum.meter_converter.controller;

import com.milenyum.meter_converter.service.IConferterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")

public class ConverterController {

    @Autowired
    private IConferterService convServ;

    @GetMapping("/meters/{meters}")
    public String convertCentimerters (@PathVariable Double meters){
        return "Metro: " + meters + "  " + " a Centimetros: " + convServ.convertCentimeters(meters);
    }
}
