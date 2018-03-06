package org.bravo.perfinance.controller;

import org.bravo.perfinance.config.AppConfig;
import org.bravo.perfinance.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PerfinanceController {

    @Autowired
    private AppConfig appConfig;

    @RequestMapping(value = Constants.PERFINANCE_IS_RUNNING, method = RequestMethod.GET)
    public ResponseEntity<String> isApplicationRunning(){
        return new ResponseEntity<>("Perfinance app is Running in port " + appConfig.getPort(), HttpStatus.OK);
    }

}
