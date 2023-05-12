package com.example.restComSpring1.service;

public class MathOperations {

    public Double suma(Double n1, Double n2){
        return n1 + n2;
    }

    public Double subtracao(Double n1, Double n2){
        return n1 - n2;
    }

    public Double mult(Double n1, Double n2){
        return n1 * n2;
    }

    public Double divisao(Double n1, Double n2){
        return n1 / n2;
    }

    public Double media(Double n1, Double n2){
        return (n1 + n2) / 2;
    }

    public Double raiz(Double n1){
        return Math.sqrt(n1);
    }

}
