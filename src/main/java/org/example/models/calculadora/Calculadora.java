package org.example.models.calculadora;

public class Calculadora {
    private String operacion;
    private double resultado;

    public Calculadora(String operacion) {
        this.operacion = operacion;
        this.resultado = calcular();
    }

    private double calcular() {
        double res = 0.0;
        return res;
    }
    
}
