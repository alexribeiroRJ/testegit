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
       //variáveis
        int n1;
        int n2;
        //Criando um Scanner
        Scanner ler = new Scanner(System.in);
        //Gravando algarismos em variáveis criadas
        System.out.println("Informe um número ");
        n1 = ler.nextInt();
        
        System.out.println("Informe outro número ");
        n2 = ler.nextInt();
        //Gravando a variável a partir de uma operação
        int resultado = n1 + n2;
        //Resultado
        System.out.println("O resultado é: " + resultado);
        
    }
}
