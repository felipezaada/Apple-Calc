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
    
    String txtNum1;
    String txtNum2;
    double num1;
    double num2;
    double resultado = Double.NaN;
    
    public double Calcular(char escolha){
        
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
            case '%':
                resultado = (num1 / 100) * num2;
                return resultado;
            case ' ':
                resultado = 0;
                return resultado;
        }
        return resultado;
    }
    
    public void Inserir(javax.swing.JTextField jTextField1, char escolha, String click){
        
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + click;
            jTextField1.setText(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + click;
            jTextField1.setText(txtNum2);
        }
            num1 = Double.parseDouble(txtNum1);
            num2 = Double.parseDouble(txtNum2);
        }

    public void InserirPonto(javax.swing.JTextField jTextField1, char escolha, String click){
     
        if(escolha == '\0'){
            txtNum1 = jTextField1.getText();
            txtNum1 = txtNum1 + ".";
            jTextField1.setText(txtNum1);
            num1 = Double.parseDouble(txtNum1);
        }else{
            txtNum2 = jTextField1.getText();
            txtNum2 = txtNum2 + ".";
            jTextField1.setText(txtNum2);
            num2 = Double.parseDouble(txtNum2);
        }
    }
   
}