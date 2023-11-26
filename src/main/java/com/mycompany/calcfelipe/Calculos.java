/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcfelipe;

import java.math.BigDecimal;
import java.text.DecimalFormat;
/**
 *
 * @author felip
 */
public class Calculos {
    
    String txtNum1;
    String txtNum2;
    String verifJ;
    double resultadoF;
    double parteDecimal;
    BigDecimal num1 = BigDecimal.ZERO;
    BigDecimal num2 = BigDecimal.ZERO;
    BigDecimal resultado = BigDecimal.ZERO;
    
    public BigDecimal Calcular(char escolha){
        
        switch (escolha) {
            case '+':
                resultado = num1.add(num2);
                break;
            case '/':
                resultadoF = num1.doubleValue() / num2.doubleValue();
                parteDecimal =  resultadoF - Math.floor(resultadoF);
                if(parteDecimal != 0){
                    resultado = num1.divide(num2, 3, BigDecimal.ROUND_HALF_UP);
                }else{
                    resultado = num1.divide(num2, 0, BigDecimal.ROUND_HALF_UP);
                }
                break;
            case 'x':
                resultado = num1.multiply(num2);
                break;
            case '-':
                resultado = num1.subtract(num2);
                break;
            case '%':
                resultado = num1.divide(BigDecimal.valueOf(100)).multiply(num2);
                break;
            case ' ':
                resultado = BigDecimal.ZERO;
                break;
        }     

        return resultado;
        
    }
    
    public void Inserir(javax.swing.JTextField jTextField1, char escolha, String click){   
        
        if(jTextField1.getText().equals(resultado.toString())){
            click = "";
        }
        
        if (resultado != BigDecimal.ZERO) {
            num1 = resultado;
        }
        
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText().trim().isEmpty() ? click : jTextField1.getText().trim() + click;
            jTextField1.setText(txtNum1);
            num1 = new BigDecimal(txtNum1);
        }else if(escolha != '\0'){
            txtNum2 = jTextField1.getText().trim().isEmpty() ? click : jTextField1.getText().trim() + click;
            jTextField1.setText(txtNum2);
            num2 = new BigDecimal(txtNum2);
        }
        
    }

    public void InserirPonto(javax.swing.JTextField jTextField1, char escolha, String click){
        
        verifJ = jTextField1.getText();
        
        if(verifJ.contains(String.valueOf('.'))){
            click = "";
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
   
}