/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcfelipe;

import java.math.BigDecimal;
/**
 *
 * @author felip
 */
public class Calculos {
    
    String txtNum1;
    String txtNum2;
    BigDecimal num1 = BigDecimal.ZERO;
    BigDecimal num2 = BigDecimal.ZERO;
    BigDecimal resultado = BigDecimal.ZERO;
    
    public BigDecimal Calcular(char escolha){
        
        switch (escolha) {
            case '+':
                resultado = num1.add(num2);
                return resultado;
            case '/':
                resultado = num1.divide(num2);
                return resultado;
            case 'x':
                resultado = num1.multiply(num2);
                return resultado;
            case '-':
                resultado = num1.subtract(num2);
                return resultado;
            case '%':
                resultado = num1.divide(BigDecimal.valueOf(100)).multiply(num2);
                return resultado;
            case ' ':
                resultado = BigDecimal.ZERO;
                return resultado;
        }
        return resultado;
    }
    
    public void Inserir(javax.swing.JTextField jTextField1, char escolha, String click){
        
        if(resultado != BigDecimal.ZERO){
            num1 = resultado;
            jTextField1.setText("");
        }
        
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText().trim().isEmpty() ? click : jTextField1.getText().trim() + click;
            jTextField1.setText(txtNum1);
            num1 = new BigDecimal(txtNum1);
        }else{
            txtNum2 = jTextField1.getText().trim().isEmpty() ? click : jTextField1.getText().trim() + click;
            jTextField1.setText(txtNum2);
            num2 = new BigDecimal(txtNum2);
        }
    }

    public void InserirPonto(javax.swing.JTextField jTextField1, char escolha, String click){
     
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText().trim().isEmpty() ? "." : jTextField1.getText().trim() + ".";
            jTextField1.setText(txtNum1);
            num1 = new BigDecimal(txtNum1);
        }else{
            txtNum2 = jTextField1.getText().trim().isEmpty() ? "." : jTextField1.getText().trim() + ".";
            jTextField1.setText(txtNum2);
            num2 = new BigDecimal(txtNum2);
        }
    }
    
}