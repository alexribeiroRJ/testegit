/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testegit;

import java.util.Scanner;

/**
 *
 * @author aaa20
 */
public class Testegit {

    public static void main(String[] args) {
       
        int n1;
        int n2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe um número ");
        n1 = ler.nextInt();
        
        System.out.println("Informe outro número ");
        n2 = ler.nextInt();
        
        int resultado = n1 + n2;
        
        System.out.println("O resultado é: " + resultado);
        
    }
}
