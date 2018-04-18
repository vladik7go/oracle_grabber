package com.example.oracle_grabber6.controller;


import com.example.oracle_grabber6.model.TrDevice;
import com.example.oracle_grabber6.repository.DeviceOracleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/devices")
public class DeviceController {

    @Autowired
    private DeviceOracleRepository deviceRepository;

    @RequestMapping(value = "/all")
    public List<TrDevice> getDevices() {
        List<TrDevice> devices = deviceRepository.findAll();
        return devices;
    }

}
