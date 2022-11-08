package com.elkDemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


@RestController
public class ELKController {
    private static final Logger LOG = Logger.getLogger(ELKController.class.getName());



    @RequestMapping(value = "/elk")
    public String helloWorld() {
        String response = "Welcome to JavaInUse" + new Date();
        LOG.log(Level.INFO, response);
        return response;
    }

}
