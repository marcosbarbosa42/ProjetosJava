/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaidade;

import java.util.Scanner;


/**
 *
 * @author datasus
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o ano de nascimento:");
        int nascimento = teclado.nextInt();
        int idade = 2024 - nascimento;
        System.out.println("Sua idade " + idade);
        if(idade>=18){
            System.out.println("MAIOR DE IDADE");
        }else{
            System.out.println("MENOR DE IDADE");
        }
    }
}
