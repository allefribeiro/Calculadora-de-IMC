/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Allef
 */
public class Principal {
    public static void main(String[] args) {
        float peso;
        float altura;
        float imc;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        peso = sc.nextFloat();
        
        System.out.println("Digite sua altura: ");
        altura = sc.nextFloat();
    
        imc = peso/(altura*altura);
        
        System.out.println("Seu imc e: " + imc);
        
        if( imc <= 18.5)
        {
            System.out.println("Muito abaixo do peso");
        }
        
        if( imc >= 18.6 && imc <= 24.9)
        {
            System.out.println("Peso ideal");
        }
        
        if( imc >= 25 && imc <= 29.9)
        {
            System.out.println("Sobrepeso");
        }
        
        if(imc >= 30 && imc <= 34.9)
        {
            System.out.println("Obesidade grau 1");
        }
        
        if(imc >= 35 && imc <= 39.9)
        {
            System.out.println("Obesidade grau 2");
        }
        
        if(imc >= 40)
        {
            System.out.println("Obesidade grau 3");
        }
    }
}