package com.example.restComSpring1.controller;

import com.example.restComSpring1.service.MathOperations;
import com.example.restComSpring1.util.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private MathOperations math = new MathOperations();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double soma(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("insira um valor numerico!");
        }
        return math.suma(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double subtrai(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("insira um valor numerico!");
        }
        return math.subtracao(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double multiplica(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("insira um valor numerico!");
        }
        return math.mult(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double divisao(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("insira um valor numerico!");
        }
        return math.divisao(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/me/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedOperationException("insira um valor numerico!");
        }
        return math.media(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/raiz/{number}", method=RequestMethod.GET)
    public Double raiz(@PathVariable("number") String numberOne) throws Exception {
        if(!NumberConverter.isNumeric(numberOne)){
            throw new UnsupportedOperationException("insira um valor numerico!");
        }
        return math.raiz(NumberConverter.converToDouble(numberOne));
    }


}

