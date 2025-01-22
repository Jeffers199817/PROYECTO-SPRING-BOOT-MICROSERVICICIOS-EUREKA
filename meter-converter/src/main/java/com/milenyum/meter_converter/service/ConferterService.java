package com.milenyum.meter_converter.service;

import org.springframework.stereotype.Service;

@Service
public class ConferterService implements IConferterService{



    @Override
    public double convertCentimeters(double meters) {
        return  meters*100;
    }
}
