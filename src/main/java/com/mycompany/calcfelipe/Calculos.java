/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcfelipe;

/**
 *
 * @author felip
 */
public class Calculos {
    
    double resultado;
    
    public double Calcular(double num1, double num2, char escolha){

        switch(escolha){
            case '+':
                resultado = num1 + num2;
                return resultado;
            case '/':
                resultado = num1 / num2;
                return resultado;
            case 'x':
                resultado = num1 * num2;
                return resultado;
            case '-':
                resultado = num1 - num2;
                return resultado;
            case ' ':
                resultado = 0; 
                return resultado;
        }
        return resultado;
    }

}
