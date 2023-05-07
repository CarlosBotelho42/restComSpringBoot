package com.example.restComSpring1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new Exception();
        }
        Double sum = converToDouble(numberOne) + converToDouble(numberTwo);
        return sum;

    }

    private Double converToDouble(String strNumber) {
        if(strNumber == null) return 0D;
        String number = strNumber.replaceAll("," , ".");
        if(isNumeric( number)) return Double.parseDouble(number);
        return 1D;
    }

    private boolean isNumeric(String strNumber) {
        if(strNumber == null) return false;
        String number = strNumber.replaceAll("," , ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
