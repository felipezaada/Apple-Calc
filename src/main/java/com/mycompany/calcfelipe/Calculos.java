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
    String verifJ;
    String historico;
    String erro = "ERRO!";
    boolean resultadoV = false;
    boolean divZero = false;
    double resultadoF;
    double parteDecimal;
    BigDecimal num1 = BigDecimal.ZERO;
    BigDecimal num2 = BigDecimal.ZERO;
    BigDecimal resultado = BigDecimal.ZERO;
    
    public BigDecimal Calcular(char escolha, javax.swing.JTextField jTextField2, javax.swing.JTextField jTextField1){
        
        switch (escolha) {
            case '+':
                resultado = num1.add(num2);
                break;
            case '/':
                if(num2.doubleValue() == 0){
                    divZero = true;
                    resultadoV = false;
                    break;
                }
                resultadoF = num1.doubleValue() / num2.doubleValue();
                parteDecimal =  resultadoF - Math.floor(resultadoF);
                if(parteDecimal != 00){
                    resultado = num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP);
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
            case '\0':
                resultado = num1;
                break;
        }     
        
        if(divZero == false && escolha != '\0'){
            historico = jTextField2.getText();
            historico = historico + (num1 + " " + escolha + " " + num2 + " = " + resultado + "    /    ");
            jTextField2.setText(historico);
            resultadoV = true;
            return resultado;
        }
        
        if(divZero == true){
            jTextField1.setText(erro);
            resultadoV = false;
        }
        
        return resultado;
        
    }
    
    public void Inserir(javax.swing.JTextField jTextField1, char escolha, String click){   
        
        if(divZero == true && escolha != '\0'){
            jTextField1.setText(erro);
        }
        
        if(jTextField1.getText().equals(resultado.toString())){
            click = "";
        }
        
        if (resultadoV == true && !jTextField1.getText().equals(erro)) {
            num1 = resultado;
            resultadoV = false;
        }
        
        if(escolha == '\0' && !jTextField1.getText().equals(erro)){
            txtNum1 = jTextField1.getText().trim().isEmpty() ? click : jTextField1.getText().trim() + click;
            jTextField1.setText(txtNum1);
            num1 = new BigDecimal(txtNum1);
        }else if(escolha != '\0' && !jTextField1.getText().equals(erro)){
            txtNum2 = jTextField1.getText().trim().isEmpty() ? click : jTextField1.getText().trim() + click;
            jTextField1.setText(txtNum2);
            num2 = new BigDecimal(txtNum2);
        }
        
    }

    public void InserirPonto(javax.swing.JTextField jTextField1, char escolha, String click){
        
        verifJ = jTextField1.getText();
        
        if(jTextField1.getText().equals(resultado.toString()) || verifJ.contains(String.valueOf('.')) || jTextField1.getText().equals(erro)){
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