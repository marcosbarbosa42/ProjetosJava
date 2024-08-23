/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosjava;

import java.util.Scanner;

/**
 *
 * @author datasus
 */
public class NumerosJava {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n , s = 0;
        String resp;
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s = s + n;
            System.out.print("Quer continuar ?[S/N]");
            resp = teclado.next();
            
        }while (resp.equals("S"));
        System.out.println("A soma de todos os valores é "+ s);
    }
}
